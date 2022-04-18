<template>

  <el-row>
    <el-col  :span="14"><div class="grid-content bg-purple">
      <span style="font-size: 50px">案例展示</span>
      <div class="homeline"></div>
      <el-carousel class="Product-carousel" height="500px">
        <el-carousel-item  v-for="a in Anli" :key="a.id">
          <img class="Cooperatingsizeimg" :src="a.tplj" >
        </el-carousel-item>
      </el-carousel>
    </div></el-col>
    <el-col  class="el-ps" :offset="1" :span="9">
      <div class="grid-content bg-purple-light">
    <ul v-for="A in Anli" :key="A.id" >
      <li class="li-p"><span>{{A.alm}}</span>
        <el-button @click="drawer = true" type="info" style="position: absolute;left: 0%">
          更多详情
        </el-button>

        <el-drawer
            title=""
            :visible.sync="drawer"
            :with-header="false">
          <span>{{A.aljs}}</span>
        </el-drawer></li>



      </ul>
    </div></el-col>
  </el-row>
</template>

<script>
import {mapState} from 'vuex';

export default {
  name: "index",
  components: {

  },
  computed:{
    ...mapState({
      Anli: state => state.anlis.anli
    })
  },
  mounted() {
    this.$store.dispatch('getanli')
  },
  data() {
    return {
      drawer: false,
    };
  }
}
</script>

<style scoped>
.li-p{
  font-size: 1.3vm;
}
.homeline {
  width: 100%;
  height: 5px;
  border-top: 1px solid black;
}
img{
  width: 100%;
  height: 500px;
}
. bg-purple{
  margin-top: 20px;
  margin-bottom: 10px;
  height: 600px;
}
ul{
  list-style: none;
}
li{
height: 30px;
  margin: 50px 0;
}
.el-ps{
  margin-top: 60px;
}

</style>