<template>
<div class="Header"><el-menu  class="el-menu-demo" mode="horizontal" >
  <el-menu-item ><img class="Headerimg" src="./images/shouye.png" alt=""></el-menu-item>

  <el-menu-item index="1"  class="item1"> <router-link   to="/home">首页 </router-link></el-menu-item>


    <el-menu-item index="2"> <router-link   to="/About">关于我们  </router-link></el-menu-item>


  <el-menu-item index="3"> <router-link   to="/Journalism">新闻资讯  </router-link></el-menu-item>


  <el-menu-item index="4">  <router-link   to="/Contact">联系我们 </router-link></el-menu-item>


</el-menu>

  <div class="line"></div>
</div>
</template>

<script>
export default {
  name: "index"
}
</script>

<style scoped>
.el-menu-demo{
  width: 100%;

}
.Headerimg{
  width: 100px;
  height: 50px;
}
.item1{
  margin-left: 200px;
}
</style>