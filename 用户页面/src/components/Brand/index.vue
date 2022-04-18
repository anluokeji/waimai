<template>
  <el-carousel id="car"class="home-carousel" height="500px">
    <el-carousel-item v-for="item in 4" :key="item">
      <img class="home-img" src="../../pages/home/images/home1.png" alt="">
    </el-carousel-item>
  </el-carousel>
</template>

<script>



export default {

};
</script>

<style scoped>
img{
  width: 100%;
}
.home-carousel{
  width: 100%;
  margin-right: 100%;
}
.home-img{
  width: 100%;
  height: 500px;
}

</style>