<template>
<div>
  <el-row style="text-align: center;color: white;background-color: black">
    <el-col :span="18"><div class="grid-content bg-purple"></div></el-col>
    <el-col :span="4"><div class="grid-content bg-purple-light"><ul><li><span>扫一扫关注我们</span></li></ul></div></el-col>
  </el-row>
</div>
</template>

<script>
export default {
  name: "index"
}
</script>

<style scoped>
.el-col {
  border-radius: 4px;
}
.bg-purple-dark {
  background: black;
}
.bg-purple {
  background: black;
}
.bg-purple-light {
  background: black;
}
.grid-content {
  border-radius: 4px;
  min-height: 36px;
}
.row-bg {
  padding: 10px 0;
  background-color: black;
}
.row-fa{
  background-color: black;
}
ul  {
  list-style: none;
}
</style>