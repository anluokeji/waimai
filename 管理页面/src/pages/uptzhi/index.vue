<template>
  <div>  <el-alert
      type="success">
  </el-alert>
    <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
      <el-form-item label="编号" prop="id">
        <el-input :disabled="true" v-model="ruleForm.id"></el-input>
      </el-form-item>
      <el-form-item label="通知名" prop="name">
        <el-input v-model="ruleForm.name"></el-input>
      </el-form-item>

      <el-form-item label="通知时间" prop="time">
        <el-input type="textarea" v-model="ruleForm.time"></el-input>
      </el-form-item>
      <el-form-item label="通知内容" prop="text">
        <el-input type="textarea" v-model="ruleForm.text"></el-input>
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
        name: '',
        text: '',
        time:''

      },
      rules: {
        name: [
          { required: true, message: '请输入通知名称', trigger: 'blur' },
          { min: 3, max: 20, message: '长度在 3 到 20 个字符', trigger: 'blur' }
        ],
        time: [
          { required: true, message: '请填输入通知内容', trigger: 'blur' }
        ],
      }
    };
  },
  methods: {
    submitForm(formName) {
      const _this = this
      this.$refs[formName].validate((valid) => {
        if (valid) {
          axios.put('/notice/update',this.ruleForm).then(function (resp){
            console.log(resp)
            if(resp.data.code==200){
              _this.$message("修改成功")
              _this.$router.push("/home/tzhigli")
            }else if (resp.data.code!=200){
              alert("修改失败")

              _this.$router.push("/home/uptzhi")
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
    this.ruleForm.name=this.$route.query.name
    this.ruleForm.time= this.$route.query.time
    this.ruleForm.text= this.$route.query.text
  }
}
</script>

<style scoped>

</style>