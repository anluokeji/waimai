package com.scholyars_management.scholyars_management.contrller;
import cn.hutool.core.map.MapUtil;
import cn.hutool.http.server.HttpServerRequest;
import com.anluo.scholyars_common.longin.Const;
import com.anluo.scholyars_common.utils.JsonResult;
import com.scholyars_management.scholyars_management.util.RedisUtil;
import com.google.code.kaptcha.Producer;
import io.jsonwebtoken.impl.Base64Codec;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;

@Slf4j
@SpringBootConfiguration
@RestController
public class AuthController {
    @Autowired
    private Producer producer;
//    @Autowired(required=true)
//    HttpServerRequest httpServerRequest;
    @Autowired
    RedisUtil redisUtil;
    /**
     * 验证图片
     */

@GetMapping("/api/captcha")
    public  JsonResult captcha(HttpServerRequest request, HttpServletResponse response) throws IOException {
    String code = producer.createText();
    String key= UUID.randomUUID().toString();

    BufferedImage image = producer.createImage(code);
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    ImageIO.write(image,"jpg",outputStream);
    Base64Codec encoder = new Base64Codec();
    String str = "data:image/jpeg;base64,";
    String base64Img = str + encoder.encode(outputStream.toByteArray());

    redisUtil.hset(Const.CAPTCHA_KEY, key, code, 120);
    log.info("验证码 -- {} - {}", key, code);
    return JsonResult.succ(
            MapUtil.builder()
                    .put("token", key)
                    .put("base64Img", base64Img)
                    .build()
    );
}

}
