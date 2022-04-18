<template>
  <el-form :model="ruleForms" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">

    <el-form-item label="行政电话" prop="adphone">
      <el-input  v-model="ruleForms.adphone"></el-input>
    </el-form-item>
    <el-form-item label="客服服务电话" prop="cusphone">
      <el-input type="textarea" v-model="ruleForms.cusphone"></el-input>
    </el-form-item>
    <el-form-item label="公司地址"  prop="address">
      <el-input type="textarea" v-model="ruleForms.address"></el-input>
    </el-form-item>
    <el-form-item label="网址"  prop="website">
      <el-input type="textarea" v-model="ruleForms.website"></el-input>
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
        adphone: '',
        cusphone: '',
        address:'',
        website:'',
      },
      rules: {
        adphone: [
          { required: true, message: '请输入行政电话(必须是数字)', trigger: 'blur' },
        ],
        cusphone: [
          { required: true, message: '请输入客服服务电话(必须是数字)', trigger: 'blur' },
        ],
        address: [
          { required: true, message: '请输入公司地址', trigger: 'blur' }
        ],
        website: [
          { required: true, message: '请输入网址', trigger: 'blur' }
        ],
      }
    };
  },
  methods: {
    submitForm(formName) {
      const _this = this
      this.$refs[formName].validate((valid) => {
        if (valid) {
          axios.post('/contact/insert',this.ruleForms).then(function (resp){
            if(resp.data.code==200){
              _this.$message("添加成功")
              _this.$router.push("/home/lxiwm")
            }else  if (resp.data.code!=200){
              alert("添加失败")
              _this.$router.push("/home/lxiwms")
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