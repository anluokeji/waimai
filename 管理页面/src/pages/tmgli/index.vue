<template>
  <el-main >

    <el-table height="1000px" :data="tableData">
      <el-table-column prop="id" label="编号" width="50">
      </el-table-column>
      <el-table-column prop="name" label="姓名" width="100">

      </el-table-column>
      <el-table-column prop="picture" label="图片路径" width="100">
      </el-table-column>
      <el-table-column prop="job" label="职位" width="400">
      </el-table-column>
      <el-table-column prop="handla" label="操作" width="200" >
        <template slot-scope="scope">
          <el-button @click="handleClick(scope.row)" type="text" size="small">修改</el-button>
          <el-button type="text" @click="dgsjs(scope.row)" size="small">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
  </el-main>
</template>

<script>
import axios from "axios";

export default {
  name: "index",

  data(){
    return{
      tableData:null

    }
  },
  methods:{

    dgsjs(row){
      const _this =this
      axios.delete("/team/delete/"+row.id).then(function (resp){
        if(resp.data.code==200){
          _this.$message("删除成功")
          _this.$router.push("/home")
        }else if (resp.data.code!=200){
          alert("删除失败")
          _this.$router.push("/home/tmgli")
        }
      })
    },
    handleClick(row) {
      this.$router.push({
        path:"/home/uptm",
        query:{
          id:row.id,
          name:row.name,
          picture:row.picture,
          job:row.job,
        }
      })
    }
  },
  created(){
    const _this = this
    axios.get("/team/select").then(function (resp){
      _this.tableData =resp.data.data
    })
    // async removeUserById (id) {
    //   const confirmResult = await this.$confirm(
    //       '此操作将永久删除该用户, 是否继续?',
    //       '提示',
    //       {
    //         confirmButtonText: '确定',
    //         cancelButtonText: '取消',
    //         type: 'warning'
    //       }
    //   ).catch(err => err)
    //   if (confirmResult !== 'confirm') {
    //     return this.$message.info('已取消删除')
    //   }
    //   const { data: res } = await this.$http.delete('/an/delete'+id)
    //   console.log(res)
    //   if (res.code !== 200) return this.$message.error('删除失败！')
    //  if (res.code ==200) return  this.$message.success('删除成功！')
    // },
  }
};
</script>

<style scoped>
table{
  border-collapse: collapse;
  width: 100%;
}
table,tr,td{
  border: 1px solid;
}
td{
  height: 30px;
}
</style>