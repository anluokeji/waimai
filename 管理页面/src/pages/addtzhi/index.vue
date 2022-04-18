<template>
  <el-form :model="ruleForms" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">

    <el-form-item label="通知名" prop="name">
      <el-input v-model="ruleForms.name"></el-input>
    </el-form-item>
    <el-form-item label="通知时间" prop="time">
      <el-input :disabled="true"
                   suffix-icon="el-icon-date" v-model="ruleForms.time"></el-input>
    </el-form-item>
    <el-form-item label="通知内容"  prop="text">
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
        name: '',
        time: '',
        text:'',
      },
      rules: {
        name: [
          { required: true, message: '请输入通知名', trigger: 'blur' },
          { min: 3, max: 30, message: '长度在 3 到 30 个字符', trigger: 'blur' }
        ],
        text: [
          { required: true, message: '请填写通知内容', trigger: 'blur' }
        ],
      }
    };
  },
  methods: {
    submitForm(formName) {
      const _this = this
      this.$refs[formName].validate((valid) => {
        if (valid) {
          axios.post('/notice/insert',this.ruleForms).then(function (resp){
            if(resp.data.code==200){
              _this.$message("添加成功")
              _this.$router.push("/home/tzhigli")
            }else  if (resp.data.code!=200){
              alert("添加失败")
              _this.$router.push("/home/addtzhi")
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