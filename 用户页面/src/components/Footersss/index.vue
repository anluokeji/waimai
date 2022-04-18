<template>
  <div>
    <el-row style="text-align: center;color: white;background-color: #545c64">
      <el-col :span="12"><div class="grid-content bg-purple"><span>xxxxxxxxxxxxxxxxxxxxxxxxxx</span></div></el-col>
      <el-col :span="12"><div class="grid-content bg-purple-light"><ul><li><span>xxxxxxxxxxxxxxxxxxxxxxxxxxxxx</span></li></ul></div></el-col>
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
  background: #545c64;
}
.bg-purple {
  background: #545c64;
}
.bg-purple-light {
  background: #545c64;
}
.grid-content {
  border-radius: 4px;
  min-height: 36px;
}
.row-bg {
  padding: 10px 0;
  background-color: #545c64;
}
.row-fa{
  background-color: #545c64;
}
ul  {
  list-style: none;
}
</style>