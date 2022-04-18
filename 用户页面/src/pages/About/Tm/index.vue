<template>
  <el-row class="tm-img">
    <el-col :span="6"  v-for="t in  TM" :key="t.id"  :offset="index > 0 ? 1 : 0">
      <el-card   :body-style="{ padding: '0px' }">
        <img :src="t.picture" class="image">
        <div style="padding: 14px;">
          <span >姓名:{{t.name}} <br>
                 职位:{{t.job}}</span>
          <div class="bottom clearfix">
          </div>
        </div>
      </el-card>
    </el-col>
  </el-row>

</template>

<script>
import {mapState} from 'vuex'
export default {
  name:"index",
  computed:{
    ...mapState({
      TM: state => state.team.tms
    })
  },
  mounted() {
    this.$store.dispatch('gettm')
  }
}
</script>

<style scoped>
.tm-img{
  margin-top: 20px;
  margin-left: 50px;
}

.bottom {
  margin-top: 13px;
  line-height: 12px;
}
.image {
  width: 100%;
  display: block;
}

.clearfix:before,
.clearfix:after {
  display: table;
  content: "";
}

.clearfix:after {
  clear: both
}
</style>