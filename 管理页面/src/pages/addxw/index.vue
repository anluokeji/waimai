<template>
  <el-form :model="ruleForms" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">

    <el-form-item label="新闻名" prop="title">
      <el-input v-model="ruleForms.title"></el-input>
    </el-form-item>
    <el-form-item label="新闻图片路径" prop="picture">
      <el-input type="textarea" v-model="ruleForms.picture"></el-input>
    </el-form-item>
    <el-form-item label="新闻内容"  prop="text">
      <el-input type="textarea" v-model="ruleForms.text"></el-input>
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
        title: '',
        text: '',
        picture:'',
      },
      rules: {
        title: [
          { required: true, message: '请输入新闻名称', trigger: 'blur' },
          { min: 3, max: 30, message: '长度在 3 到 30 个字符', trigger: 'blur' }
        ],
        text: [
          { required: true, message: '请填写新闻介绍', trigger: 'blur' }
        ],
        picture: [
          { required: true, message: '请填写图片路径', trigger: 'blur' }
        ],
      }
    };
  },
  methods: {
    submitForm(formName) {
      const _this = this
      this.$refs[formName].validate((valid) => {
        if (valid) {
          axios.post('/news/insert',this.ruleForms).then(function (resp){
            if(resp.data.code==200){
              _this.$message("添加成功")
              _this.$router.push("/home/xwgl")
            }else  if (resp.data.code!=200){
              alert("添加失败")
              _this.$router.push("/home/addxw")
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