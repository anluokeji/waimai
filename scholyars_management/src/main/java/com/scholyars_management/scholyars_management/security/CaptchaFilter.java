package com.scholyars_management.scholyars_management.security;

import com.anluo.scholyars_common.longin.Const;
import com.scholyars_management.scholyars_management.security.LoginFailureHandler;
import com.anluo.scholyars_common.utils.CaptchaException;
import com.scholyars_management.scholyars_management.util.RedisUtil;


import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 图片验证码校验过滤器，在登录过滤器前
 */
@Slf4j
@Component
public class CaptchaFilter extends OncePerRequestFilter {
    private final String loginUrl = "/login";
    @Autowired
    RedisUtil redisUtil;
    @Autowired
    LoginFailureHandler loginFailureHandler;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String url = request.getRequestURI();
        if(loginUrl.equals(url)&&request.getMethod().equals("POST")){
            log.info("获取到login链接，正在校验验证码--"+url);
            try {
                validate(request);
            } catch (CaptchaException e) {
                e.printStackTrace();
                log.info(e.getMessage());
                // 交给登录失败处理器处理
              // loginFailureHandler.onAuthenticationFailure(request, response, e);
            }
        }

    }

    private void validate(HttpServletRequest request) throws CaptchaException {
        String code = request.getParameter("code");
        String token = request.getParameter("token");
        if (StringUtils.isBlank(code) || StringUtils.isBlank(token)){
            if (StringUtils.isBlank(code) || StringUtils.isBlank(token)) {
                throw new CaptchaException("验证码不能为空");
            }
            if(!code.equals(redisUtil.hget(Const.captcha_KEY, token))) {
                throw new CaptchaException("验证码不正确");
            }
            // 一次性使用
            redisUtil.hdel(Const.captcha_KEY, token);
        }
        }
    }


