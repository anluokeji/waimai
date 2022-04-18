<template>
  <div>  <el-alert
      type="success">
  </el-alert>
    <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
      <el-form-item label="编号" prop="id">
        <el-input :disabled="true" v-model="ruleForm.id"></el-input>
      </el-form-item>
      <el-form-item label="行政电话" prop="adphone">
        <el-input v-model="ruleForm.adphone"></el-input>
      </el-form-item>

      <el-form-item label="客服服务电话" prop="cusphone">
        <el-input type="textarea" v-model="ruleForm.cusphone"></el-input>
      </el-form-item>
      <el-form-item label="公司地址" prop="address">
        <el-input type="textarea" v-model="ruleForm.address"></el-input>
      </el-form-item>
      <el-form-item label="网址" prop="website">
        <el-input type="textarea" v-model="ruleForm.website"></el-input>
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
        adphone: '',
        cusphone: '',
        address:'',
    website:''

      },
      rules: {
        adphone: [
          { required: true, message: '请输入电话(必须是数字)', trigger: 'blur' },
          { min: 3, max: 20, message: '长度在 3 到 20 个字符', trigger: 'blur' }
        ],
        cusphone: [
          { required: true, message: '请填输入新闻内容(必须是数字)', trigger: 'blur' }
        ],
        address: [
          { required: true, message: '请填输入新闻图片路径', trigger: 'blur' }
        ],
        website: [
          { required: true, message: '请填输入网址', trigger: 'blur' }
        ],
      }
    };
  },
  methods: {
    submitForm(formName) {
      const _this = this
      this.$refs[formName].validate((valid) => {
        if (valid) {
          axios.put('/contact/update',this.ruleForm).then(function (resp){
            console.log(resp)
            if(resp.data.code==200){
              _this.$message("修改成功")
              _this.$router.push("/home/lxiwm")
            }else if (resp.data.code!=200){
              alert("修改失败")

              _this.$router.push("/home/uplxi")
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
    this.ruleForm.adphone=this.$route.query.adphone
    this.ruleForm.cusphone= this.$route.query.cusphone
    this.ruleForm.address= this.$route.query.address
    this.ruleForm.website= this.$route.query.website
  }
}
</script>

<style scoped>

</style>