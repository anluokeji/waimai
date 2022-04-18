<template>
  <el-form :model="ruleForms" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">

    <el-form-item label="公司名称" prop="gsm">
      <el-input v-model="ruleForms.gsm"></el-input>
    </el-form-item>
    <el-form-item label="公司介绍" prop="gsjs">
      <el-input type="textarea" v-model="ruleForms.gsjs"></el-input>
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
        gsm: '',
        gsjs: '',
        tp:'',
      },
      rules: {
        gsm: [
          { required: true, message: '请输入公司名称', trigger: 'blur' },
          { min: 3, max: 30, message: '长度在 3 到 30 个字符', trigger: 'blur' }
        ],
        gsjs: [
          { required: true, message: '请填写公司介绍', trigger: 'blur' }
        ],
      }
    };
  },
  methods: {
    submitForm(formName) {
      const _this = this
      this.$refs[formName].validate((valid) => {
        if (valid) {
          axios.post('/company/insert',this.ruleForms).then(function (resp){
            if(resp.data.code==200){
              _this.$message("添加成功")
              _this.$router.push("/home/gsjs")
            }else  if (resp.data.code!=200){
              alert("添加失败")
              _this.$router.push("/home/gsjsxx")
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