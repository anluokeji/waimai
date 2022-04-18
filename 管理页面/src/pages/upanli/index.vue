<template>
  <div>  <el-alert
      type="success">
  </el-alert>
    <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
      <el-form-item label="编号" prop="id">
        <el-input :disabled="true" v-model="ruleForm.id"></el-input>
      </el-form-item>
      <el-form-item label="案例名称" prop="alm">
        <el-input v-model="ruleForm.alm"></el-input>
      </el-form-item>

      <el-form-item label="案例图片路径" prop="tplj">
        <el-input type="textarea" v-model="ruleForm.tplj"></el-input>
      </el-form-item>
      <el-form-item label="案例介绍" prop="aljs">
        <el-input type="textarea" v-model="ruleForm.aljs"></el-input>
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
        alm: '',
        tplj: '',
        aljs: '',
      },
      rules: {
        alm: [
          { required: true, message: '请输入案例名称', trigger: 'blur' },
          { min: 3, max: 20, message: '长度在 3 到 20 个字符', trigger: 'blur' }
        ],
        tplj: [
          { required: true, message: '请填写案例图片路径', trigger: 'blur' }
        ],

        aljs: [
          { required: true, message: '请填写案例介绍', trigger: 'blur' }
        ],
      }
    };
  },
  methods: {
    submitForm(formName) {
      const _this = this
      this.$refs[formName].validate((valid) => {
        if (valid) {
          axios.put('/an/update',this.ruleForm).then(function (resp){
            console.log(resp)
            if(resp.data.code==200){
              _this.$message("修改成功")
              _this.$router.push("/home/glianli")
            }else if (resp.data.code!=200){
             alert("修改失败")

              _this.$router.push("/home/upanli")
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
   this.ruleForm.tplj=this.$route.query.tplj
  this.ruleForm.aljs= this.$route.query.aljs
       this.ruleForm.alm=this.$route.query.alm

 }
}
</script>

<style scoped>

</style>