
<template>

    <div class="login-container">
      <el-form
          :model="form"
          :rules="rules"
          ref="forms"

          class="login-form"
      >
        <h1 class="title-zc">xx管理登录页面</h1>
        <el-form-item label="账号" prop="username">
          <el-input v-model.trim="form.username"></el-input>
        </el-form-item>

        <el-form-item label="密码" prop="password">
          <el-input
              type="password"
              v-model.trim="form.password"
              autocomplete="off"
          ></el-input>
        </el-form-item>

        <el-form-item>

          <button type="submit" @click="login">提交</button>
        </el-form-item>
      </el-form>
    </div>


</template>
<script>
// import {login} from "../../api/login";

export default {
  data() {
    return {
      form: {
        username: "",
        password: "",
      },
      rules: {
        username: [{ required: true, message: "请输入账号", trigger: "blur" }],
        password: [{ required: true, message: "请输入密码", trigger: "blur" }],
      },
    };
  },
  methods: {

      login(){
        // if (this.form.username==='admin'&&this.form.password==='666666'){
        //   localStorage.setItem('token', 'Bearer xxxx')
        //   this.$router.push('/home')
        // }else{
        //   alert("用户名或密码错误")
        // }
        this.$refs.forms.validate(async valid =>{
          if (!valid) return;
        const {data:res}=  await this.$http.post("/user/login",this.form)
          console.log(res)
          if (res.code==200){
            alert("登录成功")
              this.$router.push('/home')
          }else if(res.code!=200){
            alert("用户名或密码错误")
          }
        })
      }
  },
};
</script>
<style scoped>
.login-container {
  position: absolute;
  width: 100%;
  height: 100%;
  overflow: hidden;
  background-size: 100% 100%;
  background-repeat: no-repeat;
}
.login-form {
  width: 400px;
  margin: 150px auto;
  padding: 30px;
  background-color: #E6E6E6;
  border-radius: 20px;
}
.title-zc {
  text-align: center;
}
</style>
