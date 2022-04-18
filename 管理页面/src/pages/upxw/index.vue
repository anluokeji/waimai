<template>
  <div>  <el-alert
      type="success">
  </el-alert>
    <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
      <el-form-item label="编号" prop="id">
        <el-input :disabled="true" v-model="ruleForm.id"></el-input>
      </el-form-item>
      <el-form-item label="新闻名" prop="title">
        <el-input v-model="ruleForm.title"></el-input>
      </el-form-item>

      <el-form-item label="新闻介绍" prop="text">
        <el-input type="textarea" v-model="ruleForm.text"></el-input>
      </el-form-item>
      <el-form-item label="新闻图片路径" prop="picture">
        <el-input type="textarea" v-model="ruleForm.picture"></el-input>
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
        title: '',
        text: '',
        picture:''

      },
      rules: {
        title: [
          { required: true, message: '请输入新闻名称', trigger: 'blur' },
          { min: 3, max: 20, message: '长度在 3 到 20 个字符', trigger: 'blur' }
        ],
        text: [
          { required: true, message: '请填输入新闻内容', trigger: 'blur' }
        ],
        picture: [
          { required: true, message: '请填输入新闻图片路径', trigger: 'blur' }
        ],
      }
    };
  },
  methods: {
    submitForm(formName) {
      const _this = this
      this.$refs[formName].validate((valid) => {
        if (valid) {
          axios.put('/news/update',this.ruleForm).then(function (resp){
            console.log(resp)
            if(resp.data.code==200){
              _this.$message("修改成功")
              _this.$router.push("/home/xwgl")
            }else if (resp.data.code!=200){
              alert("修改失败")

              _this.$router.push("/home/upxw")
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
    this.ruleForm.title=this.$route.query.title
    this.ruleForm.picture= this.$route.query.picture
    this.ruleForm.text= this.$route.query.text
  }
}
</script>

<style scoped>

</style>