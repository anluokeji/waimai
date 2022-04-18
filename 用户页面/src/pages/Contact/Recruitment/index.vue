<template>
<div ><h2 style="margin-top: 20px">招聘</h2>
  <el-collapse v-for="zps in zhaops" :key="zps.id"  v-model="activeNames" @change="handleChange">
  <el-collapse-item   :title="zps.zw" :name="ii">
    <div>薪资:{{zps.xz}}</div>
    <div style=" width: 700px;
  word-wrap: break-word;
 " >职位详情:{{zps.zwxq}}</div>
    <div style=" width: 700px;

  word-wrap: break-word;
 " >工作内容:{{zps.gznr}} <br>
    </div>
  </el-collapse-item>
</el-collapse></div>
</template>

<script>
import {mapState} from "vuex";

export default {
  name: "index",
  computed:{
    ...mapState({
      zhaops: state => state.zhaops.zps
    })
  },
  mounted() {
    this.$store.dispatch('getzhaop')
  },

  data() {
  return {
    activeNames: ['1']
  };
},
methods: {
  handleChange(val) {
    console.log(val);
  }
}
}
</script>

<style scoped>

</style>