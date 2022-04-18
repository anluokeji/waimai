<template>
  <el-descriptions    class="message-el" title="联系我们">

    <el-descriptions-item  v-for="c in Contactss"  :key="c.id" label="行政办公电话">{{c.adphone}}</el-descriptions-item>
    <el-descriptions-item v-for="c in Contactss"  :key="c.id" label="客服服务电话">{{c.cusphone}}</el-descriptions-item>
    <el-descriptions-item  v-for="c in Contactss"  :key="c.id" label="网址">{{c.website}}</el-descriptions-item>
    <el-descriptions-item label="备注">
      <el-tag size="small">公司</el-tag>
    </el-descriptions-item>
    <el-descriptions-item  v-for="c in Contactss"  :key="c.id" :label="c.address">{{c.address}}</el-descriptions-item>

  </el-descriptions>

</template>

<script>
import {mapState} from 'vuex'
export default {
  name: "index",
  computed:{
    ...mapState({
      Contactss: state => state.contact.con
    })
  },
  mounted() {
    this.$store.dispatch('getcontact')
  }

}
</script>

<style scoped>
.message-el{
  margin-top: 20px;
  margin-left: 50px;
}
</style>