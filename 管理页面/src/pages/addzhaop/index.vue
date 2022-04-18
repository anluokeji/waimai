<template>
  <el-form :model="ruleForms" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">

    <el-form-item label="职位" prop="zw">
      <el-input v-model="ruleForms.zw"></el-input>
    </el-form-item>
    <el-form-item label="薪资" prop="xz">
      <el-input type="textarea" v-model="ruleForms.xz"></el-input>
    </el-form-item>
    <el-form-item label="职位详情"  prop="zwxq">
      <el-input type="textarea" v-model="ruleForms.zwxq"></el-input>
    </el-form-item>
    <el-form-item label="工作内容"  prop="gznr">
      <el-input type="textarea" v-model="ruleForms.gznr"></el-input>
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
        zw: '',
        xz: '',
        zwxq:'',
        gznr:''
      },
      rules: {
        zw: [
          { required: true, message: '请输入职位', trigger: 'blur' },
          { min: 3, max: 30, message: '长度在 3 到 30 个字符', trigger: 'blur' }
        ],
        xz: [
          { required: true, message: '请填写薪资', trigger: 'blur' }
        ],
        zwxq: [
          { required: true, message: '请填写职位详情', trigger: 'blur' }
        ],
        gznr: [
          { required: true, message: '请填写工作内容', trigger: 'blur' }
        ],
      }
    };
  },
  methods: {
    submitForm(formName) {
      const _this = this
      this.$refs[formName].validate((valid) => {
        if (valid) {
          axios.post('/recruit/insert',this.ruleForms).then(function (resp){
            if(resp.data.code==200){
              _this.$message("添加成功")
              _this.$router.push("/home/zhaop")
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