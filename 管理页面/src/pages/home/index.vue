<template>
  <el-container style="height: 600px; border: 1px solid #eee">
    <el-aside width="200px"  style="background-color: rgb(238, 241, 246);">
      <el-menu :default-openeds="['1', '7']">
        <el-submenu index="1">
          <template slot="title"> <router-link class="sss" to="/home/glianli">案例信息管理</router-link> </template>
          <el-menu-item-group>
            <el-menu-item index="1-1"> <router-link class="sss" to="/home/addanli">添加案例信息</router-link>   </el-menu-item>
          </el-menu-item-group>
        </el-submenu>
        <el-submenu index="2">
          <template slot="title"><router-link class="sss" to="/home/gsjs">公司介绍信息管理</router-link> </template>
          <el-menu-item-group>
            <el-menu-item index="2-1"><router-link class="sss" to="gsijsxx">添加公司信息</router-link></el-menu-item>
          </el-menu-item-group>
        </el-submenu>
        <el-submenu index="3">
          <template slot="title"><router-link class="sss" to="/home/xwgl">新闻信息管理</router-link> </template>
          <el-menu-item-group>
            <el-menu-item index="3-1"><router-link class="sss" to="/home/addxw">添加新闻信息</router-link> </el-menu-item>
          </el-menu-item-group>
        </el-submenu>
        <el-submenu index="4">
          <template slot="title"><router-link   class="sss" to="/home/lxiwm">联系我们信息管理</router-link> </template>
          <el-menu-item-group>
            <el-menu-item index="4-1"><router-link  class="sss" to="/home/lxiwms">添加联系我们信息</router-link> </el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="4-2"><router-link  class="sss" to="/home/zhaop">招聘信息</router-link></el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="4-3"><router-link   class="sss" to="/home/addzhaop">添加招聘信息</router-link></el-menu-item>
          </el-menu-item-group>
        </el-submenu>
        <el-submenu index="5">
          <template slot="title"><router-link   class="sss" to="/home/zhanghao">账号管理</router-link></template>
          <el-menu-item-group>
            <el-menu-item index="5-1"><router-link   class="sss" to="/home/addzhanghao">添加子账号</router-link> </el-menu-item>
          </el-menu-item-group>
        </el-submenu>

        <el-submenu index="6">
          <template slot="title"><router-link class="sss" to="/home/tmgli">团队信息管理</router-link> </template>
          <el-menu-item-group>
            <el-menu-item index="6-1"><router-link class="sss" to="/home/addtm">添加团队信息</router-link></el-menu-item>
          </el-menu-item-group>
        </el-submenu>
        <el-submenu index="7">
          <template slot="title"><router-link  class="sss" to="/home/tzhigli">重要通知管理</router-link> </template>
          <el-menu-item-group>
            <el-menu-item index="7-1"><router-link class="sss" to="/home/addtzhi">添加重要通知</router-link> </el-menu-item>
          </el-menu-item-group>
        </el-submenu>

      </el-menu>
    </el-aside>

    <el-container>
      <el-header style="text-align: right; font-size: 12px">
        <el-dropdown>
          <i class="el-icon-setting" style="margin-right: 15px"></i>
          <el-dropdown-menu slot="dropdown">
            <el-dropdown-item > <button @click="tuichu" style="list-style: none"> 退出登录</button> </el-dropdown-item>

          </el-dropdown-menu>
        </el-dropdown>
        <span></span>
      </el-header>

    <router-view></router-view>
    </el-container>
  </el-container>


</template>

<script>
export default {
  data() {
    const item = {
      name: '',
      address: '',
      introduce: '',
      data: '',
      handle:''
    };
    return {
      tableData: Array(8).fill(item)
    }
  },
  methods:{
    tuichu(){
      this.$router.push("/login")
    }
  }
};
</script>

<style scoped>
.el-header {
  background-color: #B3C0D1;
  color: #333;
  line-height: 60px;
}

.el-aside {
  color: #333;
}
button{
  margin-right: 5px;
}
.sss{
  text-decoration: none;
  color: black;
}
</style>