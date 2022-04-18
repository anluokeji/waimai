<template>
  <div>  <el-alert
      type="success">
  </el-alert>
    <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
      <el-form-item label="编号" prop="id">
        <el-input :disabled="true" v-model="ruleForm.id"></el-input>
      </el-form-item>
      <el-form-item label="公司名" prop="gsm">
        <el-input v-model="ruleForm.gsm"></el-input>
      </el-form-item>

      <el-form-item label="公司介绍" prop="gsjs">
        <el-input type="textarea" v-model="ruleForm.gsjs"></el-input>
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
        gsm: '',
        gsjs: '',

      },
      rules: {
        gsm: [
          { required: true, message: '请输入公司名称', trigger: 'blur' },
          { min: 3, max: 20, message: '长度在 3 到 20 个字符', trigger: 'blur' }
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
          axios.put('/company/update',this.ruleForm).then(function (resp){
            console.log(resp)
            if(resp.data.code==200){
              _this.$message("修改成功")
              _this.$router.push("/home/gsjs")
            }else if (resp.data.code!=200){
              alert("修改失败")

              _this.$router.push("/home/upgsjs")
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
    this.ruleForm.gsm=this.$route.query.gsm
    this.ruleForm.gsjs= this.$route.query.gsjs

  }
}
</script>

<style scoped>

</style>