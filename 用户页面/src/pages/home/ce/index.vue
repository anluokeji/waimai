<template>
  <el-row>
    <el-col :span="8"><div class="grid-content bg-purple"> <span style="font-size: 50px">xx资质</span>
    <div class="homeline"></div>
      <img class="Cooperatingsizeimg2" src="../images/img.png" alt="">
    </div> </el-col>
    <el-col :offset="1" style=" margin-top: 20px;margin-bottom: 20px" :span="10"><div class="grid-content bg-purple-light"><span style="font-size: 30px;">重要通知</span>
      <div class="grid-content bg-purple-light">
        <ul v-for="tz in TZIS" :key="tz.id" >
          <li class="li-p"><span>{{tz.name}}</span> <span style="position: absolute;right: 10%;top:100px;font-size: 1vh">{{tz.time}}</span>
            <el-button @click="drawer = true" type="info" style="position: absolute;right: 0%">
              更多详情
            </el-button>

            <el-drawer
                title=""
                :visible.sync="drawer"
                :with-header="false">
              <span>{{tz.text}}</span>
            </el-drawer></li>



        </ul>
      </div>
    </div>
    </el-col>
<!--    <el-col style=" margin-top: 55px"  :offset="1" :span="4">-->
<!--      <ul v-for="tz in TZIS" :key="tz.id"><li> <span style="font-size: 1.5vh">{{tz.time}}</span>-->
<!--            <el-button @click="drawer = true" type="info" style="position: relative;left: 25%">-->
<!--              更多详情-->
<!--            </el-button>-->

<!--            <el-drawer-->
<!--                title=""-->
<!--                :visible.sync="drawer"-->
<!--                :with-header="false">-->
<!--              <span>{{tz.text}}</span>-->
<!--            </el-drawer>-->

<!--      </li></ul>-->

<!--    </el-col>-->
  </el-row>
<!--  <table>-->
<!--    <tr v-for="tt in 5">-->
<!--      <td class="po Information-tr">关于不法分子冒名实施违法证券活动的声明-->
<!--        <p class="oo Information-font">2022-2-22</p>-->
<!--      </td>-->

<!--    </tr>-->

<!--  </table>-->
</template>

<script>
import {mapState} from "vuex";

export default {
  name: "index",
  data() {
    return {
      drawer: false,
    };
  },
  computed:{
    ...mapState({
      TZIS: state => state.tzi.tz
    })
  },
  mounted() {
    this.$store.dispatch('gettonzhi')
  }

}
</script>

<style scoped type="text/css">
.el-col {
  border-radius: 4px;
}
.grid-content {
  border-radius: 4px;
  min-height: 36px;
}
.row-bg {
  padding: 10px 0;
  background-color: #f9fafc;
}
.homeline {
  width: 300px;
  height: 5px;
  border-top: 1px solid black;
}
img {
  width: 100%;
}
ul{
  list-style: none;
}
li{
  margin-top: 30px;
}
</style>