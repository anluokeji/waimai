<template>
<div>
  <template>
    <el-carousel class="el-ss" :interval="4000" type="card" height="560px">
      <el-carousel-item v-for="a in News" :key="a.id">
        <img  :src="a.picture" alt="">
    <div><span class="j-font">{{a.title}}</span></div>
      </el-carousel-item>
    </el-carousel>
    <el-collapse v-for="N in News"v-model="activeName" :key="N.id" >
      <el-collapse-item    :title="N.title" :name="N.id">
        <div>{{ N.text}}</div>
      </el-collapse-item>
    </el-collapse>
  </template>
</div>
</template>

<script>
import {mapState} from 'vuex'
export default {
  name: "index",
  data() {
    return {
      activeName: '1'
    };
  },
  computed:{
    ...mapState({
      News: state => state.news.news
    })

  },
  mounted() {
    this.$store.dispatch("getnews")
  }
}
</script>

<style scoped>
.el-carousel__item h3 {
  font-size: 14px;
  opacity: 0.75;
  line-height: 200px;
  margin: 0;
}


img{
  height:90%;
  width: 100%;

}
.el-ss{
  margin-top: 30px;
  margin-bottom: 30px;

}
.cc{
  margin-top: 0px;
}
.j-font{
  font-size: 25px;
 position: absolute;
  left: 50%;
}
</style>