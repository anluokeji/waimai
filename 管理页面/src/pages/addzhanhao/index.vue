<template>
  <el-form :model="ruleForms" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">

    <el-form-item label="账号名" prop="username">
      <el-input v-model="ruleForms.username"></el-input>
    </el-form-item>
    <el-form-item label="密码" prop="password">
      <el-input type="textarea" v-model="ruleForms.password"></el-input>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="submitForm('ruleForm')">立即添加</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
import axios from "axios";

export default {
  data() {
    return {
      ruleForms: {
        username: '',
        password: '',
      },
      rules: {
        username: [
          { required: true, message: '请输入账号名称', trigger: 'blur' },
          { min: 3, max: 30, message: '长度在 3 到 30 个字符', trigger: 'blur' }
        ],
        password: [
          { required: true, message: '请填写密码', trigger: 'blur' }
        ],
      }
    };
  },
  methods: {
    submitForm(formName) {
      const _this = this
      this.$refs[formName].validate((valid) => {
        if (valid) {
          axios.post('/user/insert',this.ruleForms).then(function (resp){
            if(resp.data.code==200){
              _this.$message("添加成功")
              _this.$router.push("/home/zhanghao")
            }else  if (resp.data.code!=200){
              alert("添加失败")
              _this.$router.push("/home/addzhaop")
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
  }
}
</script>

<style scoped>

</style>