<template>
  <div>  <el-alert
      type="success">
  </el-alert>
    <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
      <el-form-item label="编号" prop="id">
        <el-input :disabled="true" v-model="ruleForm.id"></el-input>
      </el-form-item>
      <el-form-item label="职位" prop="zw">
        <el-input v-model="ruleForm.zw"></el-input>
      </el-form-item>
      <el-form-item label="薪资" prop="xz">
        <el-input v-model="ruleForm.xz"></el-input>
      </el-form-item>

      <el-form-item label="职位详情" prop="zwxq">
        <el-input type="textarea" v-model="ruleForm.zwxq"></el-input>
      </el-form-item>
      <el-form-item label="工作内容" prop="gznr">
        <el-input type="textarea" v-model="ruleForm.gznr"></el-input>
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
        zw: '',
        xz: '',
        zwxq:'',
        gznr:'',

      },
      rules: {
        zw: [
          { required: true, message: '请输入职位', trigger: 'blur' },
          { min: 3, max: 20, message: '长度在 3 到 20 个字符', trigger: 'blur' }
        ],
        xz: [
          { required: true, message: '请填输入薪资', trigger: 'blur' }
        ],
        zwxq: [
          { required: true, message: '请填输入职位详情', trigger: 'blur' }
        ],
        gznr: [
          { required: true, message: '请填输入工作内容', trigger: 'blur' }
        ],

      }
    };
  },
  methods: {
    submitForm(formName) {
      const _this = this
      this.$refs[formName].validate((valid) => {
        if (valid) {
          axios.put('/recruit/update',this.ruleForm).then(function (resp){
            console.log(resp)
            if(resp.data.code==200){
              _this.$message("修改成功")
              _this.$router.push("/home/zhaop")
            }else if (resp.data.code!=200){
              alert("修改失败")

              _this.$router.push("/home/upzhaop")
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
    this.ruleForm.zw=this.$route.query.zw
    this.ruleForm.xz= this.$route.query.xz
    this.ruleForm.zwxq= this.$route.query.zwxq
    this.ruleForm.gznr= this.$route.query.gznr
  }
}
</script>

<style scoped>

</style>