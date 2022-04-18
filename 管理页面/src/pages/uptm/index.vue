<template>
  <div>  <el-alert
      type="success">
  </el-alert>
    <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
      <el-form-item label="编号" prop="id">
        <el-input :disabled="true" v-model="ruleForm.id"></el-input>
      </el-form-item>
      <el-form-item label="姓名" prop="name">
        <el-input v-model="ruleForm.name"></el-input>
      </el-form-item>

      <el-form-item label="图片路径" prop="picture">
        <el-input type="textarea" v-model="ruleForm.picture"></el-input>
      </el-form-item>
      <el-form-item label="职位详情" prop="job">
        <el-input type="textarea" v-model="ruleForm.job"></el-input>
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
        picture: '',
        job:''

      },
      rules: {
        name: [
          { required: true, message: '请输入姓名', trigger: 'blur' },
          { min: 3, max: 20, message: '长度在 3 到 20 个字符', trigger: 'blur' }
        ],
        picture: [
          { required: true, message: '请填输入图片路径', trigger: 'blur' }
        ],
        job: [
          { required: true, message: '请填输入职位', trigger: 'blur' }
        ],
      }
    };
  },
  methods: {
    submitForm(formName) {
      const _this = this
      this.$refs[formName].validate((valid) => {
        if (valid) {
          axios.put('/team/update',this.ruleForm).then(function (resp){
            console.log(resp)
            if(resp.data.code==200){
              _this.$message("修改成功")
              _this.$router.push("/home/tmgli")
            }else if (resp.data.code!=200){
              alert("修改失败")

              _this.$router.push("/home/uptm")
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
    this.ruleForm.picture= this.$route.query.picture
    this.ruleForm.job= this.$route.query.job
  }
}
</script>

<style scoped>

</style>