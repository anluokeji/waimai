<template>
<div>
  <el-card class="box-card">
    <div slot="header" class="clearfix">
      <span>公司简介</span>
    </div>
    <el-col  :span="24"><div class="grid-content bg-purple-dark">
      <p v-for="H in Home" style=" width: 700px;

  word-wrap: break-word;
 " :key="Home.id">{{H.gsjs}}</p>

    </div></el-col>

  </el-card>
</div>
</template>

<script>
import {mapState} from 'vuex'
export default {
  name: "index",
  computed:{
    ...mapState({
      Home: state => state.home.homes
    })
  },
  mounted() {
    this.$store.dispatch('gethome')
  }

}
</script>

<style scoped>
.text {
  font-size: 14px;
}

.item {
  margin-bottom: 18px;
}

.clearfix:before,
.clearfix:after {
  display: table;
  content: "";
}
.clearfix:after {
  clear: both
}

.box-card {
  width:100%;
  margin-top: 20px;
}
p{
font-size: 2.5vh;
}
</style>