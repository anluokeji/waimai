<template>
  <div>  <el-alert
      type="success">
  </el-alert>
    <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
      <el-form-item label="编号" prop="id">
        <el-input :disabled="true" v-model="ruleForm.id"></el-input>
      </el-form-item>
      <el-form-item label="账号名" prop="username">
        <el-input :disabled="true" v-model="ruleForm.username"></el-input>
      </el-form-item>

      <el-form-item label="密码" prop="password">
        <el-input type="textarea" v-model="ruleForm.password"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button :plain="true" type="primary" @click="submitForm('ruleForm')">立即修改</el-button>

      </el-form-item>
    </el-form>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  data() {
    return {
      ruleForm: {
        id:'',
        username: '',
        password: '',


      },
      rules: {

        text: [
          { required: true, message: '请填输入密码', trigger: 'blur' }
        ],

      }
    };
  },
  methods: {
    submitForm(formName) {
      const _this = this
      this.$refs[formName].validate((valid) => {
        if (valid) {
          axios.put('/user/update',this.ruleForm).then(function (resp){
            console.log(resp)
            if(resp.data.code==200){
              _this.$message("修改成功")
              _this.$router.push("/home/zhanghao")
            }else if (resp.data.code!=200){
              alert("修改失败")

              _this.$router.push("/home/upzhanhao")
            }
          })
        } else{
          return false;
        }
      });
    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    }
  },
  created() {
    this.ruleForm.id = this.$route.query.id
    this.ruleForm.username=this.$route.query.username
    this.ruleForm.password= this.$route.query.password

  }
}
</script>

<style scoped>

</style>