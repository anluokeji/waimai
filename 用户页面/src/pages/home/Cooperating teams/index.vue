<template>
  <el-row>
    <el-col :span="18"><div class="grid-content bg-purple"><span style="font-size: 50px">投资团队</span><div class="homeline"></div>
      <img class="Cooperatingsizeimg" src="../images/img.png" alt="">
      <p style="font-size: 30px">核心团队</p><p class="Cooperatingsize-color ">2022-2-06</p><span style="font-size: 2.0vw;">  xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx<br>
        xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</span></div></el-col>
    <el-col :span="6"><div class="grid-content bg-purple-light">  </div></el-col>
  </el-row>
</template>

<script>
import {mapState} from 'vuex';

export default {
  name: "index",
  // components: {
  //
  // },
  // computed:{
  //   ...mapState({
  //     Home: state => state.home.homes
  //   })
  // },
  // mounted() {
  //   this.$store.dispatch('gethome')
  // }
}
</script>

<style scoped>
.homeline {
  width: 300px;
  height: 5px;
  border-top: 1px solid black;
}

.Cooperatingsize {
  color: black;
  font-size: 25px;
  font-family: "Microsoft YaHei", 微软雅黑
}

img {
  width: 100%;
}

.Cooperatingsize-color {
  color: grey;
  font-size: 25px;
}


</style>