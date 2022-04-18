<template>
<!--  <div class="footers">-->
<!--    <table class="footertable footers1" >-->
<!--      <tr class="tr1">-->
<!--        <td>关于xx</td>-->
<!--        <td>产品中心</td>-->
<!--        <td>xx资讯</td>-->
<!--        <td>服务中心</td>-->
<!--          <td>联系我们</td>-->
<!--        <td>网站声明</td>-->
<!--        <td rowspan="4" colspan="2"><img src="./images/img.png" alt=""></td>-->
<!--      </tr>-->

<!--      <tr>-->
<!--        <td>公司简介</td>-->
<!--        <td>二级市场产品</td>-->
<!--        <td>xx观点</td>-->
<!--        <td>我的服务</td>-->
<!--        <td>联系我们</td>-->
<!--        <td>隐私声明</td>-->

<!--      </tr>-->

<!--      <tr>-->
<!--        <td>核心团队</td>-->
<!--        <td></td>-->
<!--        <td>xx文摘</td>-->
<!--        <td>下载中心</td>-->
<!--        <td>招聘信息 </td>-->
<!--          <td>风险揭示</td>-->
<!--      </tr>-->

<!--      <tr><td>xx荣誉</td>-->
<!--        <td></td>-->
<!--        <td></td>-->
<!--        <td></td>-->
<!--        <td></td>-->
<!--        <td>商标使用权的重要声明</td></tr>-->

<!--      <tr>-->
<!--        <td>发展历程</td>-->
<!--        <td></td>-->
<!--        <td></td>-->
<!--        <td></td>-->
<!--        <td></td>-->
<!--        <td></td>-->
<!--        <td class="erweima" colspan="2">扫一扫关注xx</td>-->
<!--      </tr>-->
<!--    </table>-->
<!--    <div class="fgx">-</div>-->
<!--    <table >-->
<!--      <tr>-->
<!--        <td><svg t="1649912755356" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="3614" width="70" height="70"><path d="M635.733333 388.266667c0-81.066667-68.266667-149.333333-149.333333-149.333334S337.066667 307.2 337.066667 388.266667s68.266667 149.333333 149.333333 149.333333 149.333333-64 149.333333-149.333333z m-247.466666 0c0-55.466667 42.666667-98.133333 98.133333-98.133334s98.133333 42.666667 98.133333 98.133334-42.666667 98.133333-98.133333 98.133333-98.133333-42.666667-98.133333-98.133333z" fill="#0E0F0F" p-id="3615"></path><path d="M477.866667 780.8c4.266667 4.266667 8.533333 4.266667 17.066666 4.266667 4.266667 0 12.8 0 17.066667-4.266667 8.533333-8.533333 238.933333-196.266667 238.933333-405.333333 0-149.333333-119.466667-268.8-268.8-268.8S213.333333 226.133333 213.333333 375.466667c-4.266667 204.8 251.733333 396.8 264.533334 405.333333z m0-622.933333c119.466667 0 217.6 98.133333 217.6 217.6 0 153.6-157.866667 307.2-204.8 349.866666-55.466667-42.666667-226.133333-196.266667-226.133334-349.866666-4.266667-119.466667 93.866667-217.6 213.333334-217.6z" fill="#0E0F0F" p-id="3616"></path><path d="M704 601.6c-12.8 0-25.6 12.8-25.6 25.6s12.8 25.6 25.6 25.6c0 0 76.8 8.533333 85.333333 149.333333H187.733333c8.533333-145.066667 85.333333-149.333333 85.333334-149.333333 17.066667 0 25.6-12.8 25.6-25.6s-12.8-25.6-25.6-25.6c-38.4 0-136.533333 42.666667-136.533334 226.133333 0 12.8 12.8 25.6 25.6 25.6h652.8c12.8 0 25.6-12.8 25.6-25.6 0-187.733333-98.133333-226.133333-136.533333-226.133333z" fill="#0E0F0F" p-id="3617"></path></svg>-->
<!--          <p>地址</p>-->
<!--          <p>xxxxxxxxxxxx</p></td>-->
<!--        <td><svg t="1649732980180" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="3507" width="70" height="70"><path d="M446.272 573.44a509.653333 509.653333 0 0 1-81.92-100.650667c67.786667-30.474667 112.138667-93.461333 112.138667-169.792C476.48 194.592 388.96 106.666667 280.906667 106.666667 170.058667 106.666667 85.333333 188.746667 85.333333 302.997333c0 158.250667 82.56 328.554667 200.618667 439.658667 100.010667 94.122667 258.986667 161.738667 413.461333 174.570667 0.832 0.074667 1.674667 0.106667 2.517334 0.106666h41.162666a30.517333 30.517333 0 0 0 0-61.045333h-39.872c-140.672-11.978667-286.026667-73.930667-375.456-158.090667-106.410667-100.16-181.408-254.837333-181.408-395.2 0-80.106667 56.981333-135.285333 134.549334-135.285333 74.282667 0 134.549333 60.533333 134.549333 135.285333 0 60.309333-40.896 107.989333-103.008 123.349334a30.517333 30.517333 0 0 0-19.786667 43.658666c27.573333 53.312 66.037333 104.426667 111.573334 147.690667 51.264 48.693333 109.941333 86.112 172.053333 108.16a30.506667 30.506667 0 0 0 40.362667-24.064c10.453333-67.093333 61.621333-114.026667 126.442666-114.026667 74.272 0 134.549333 60.544 134.549334 135.285334 0 25.578667-7.04 50.026667-20.149334 71.253333a30.528 30.528 0 0 0 51.925334 32.074667A196.096 196.096 0 0 0 938.666667 723.050667c0-108.394667-87.530667-196.330667-195.573334-196.330667-83.072 0-151.210667 52.384-177.621333 128.864-42.368-19.552-82.773333-47.541333-119.2-82.144z" p-id="3508"></path></svg>-->
<!--          <p>联系电话</p>-->
<!--          <p>xxxxxxxxxxxx</p></td></tr>-->

<!--      <tr class="footers-trss">-->
<!--        <td class="footers-trs"><p>CopyRightxxxxxxxxxxxxxxxxxxxxx</p></td>-->
<!--        <td ><p>xxxxxxxxxxxxxxxxxxx</p></td></tr>-->
<!--    </table>-->
<!--  </div>-->
  <el-row class="oo">
    <el-col :span="6"><div class="grid-content bg-purple">
      <ul>
        <li class="li1"><router-link style="color: white" class="text-d"  to="/About/Abouts">关于xx</router-link></li>
        <li><router-link style="color: grey" class="text-d"  to="/About/Tm">核心团队</router-link></li>
        <li> <router-link style="color: grey" class="text-d"  to="/About/Honor">xx荣誉</router-link></li>
      </ul>
    </div></el-col>
    <el-col :span="4"><div class="grid-content bg-purple">
      <ul>
        <li class="li1"><router-link style="color: white"  to="/home">xx案例</router-link></li>
        <li><router-link style="color: grey"  to="/home">案例介绍</router-link></li>
      </ul>
    </div></el-col>
    <el-col :span="4"><div class="grid-content bg-purple">
      <ul>
        <li class="li1"><router-link style="color: white"   to="/Journalism">新闻资讯</router-link></li>
        <li ><router-link  style="color: grey"  to="/Journalism">新闻介绍</router-link></li>
      </ul>
    </div></el-col>
    <el-col :span="4"><div class="grid-content bg-purple">
      <ul>
        <li class="li1"><router-link class="text-d" style="color: white"  to="/Contact/Message">联系我们</router-link></li>
        <li>  <router-link class="text-d" style="color: grey" to="/Contact/Recruitment">招聘信息</router-link></li>
      </ul>
    </div></el-col>
    <el-col :span="4"><div class="grid-content bg-purple">
      <ul>
        <li class="li1"><img class="f-img" src="./images/img.png" alt=""></li>
      </ul>
    </div></el-col>
  </el-row>


</template>

<script>

export default {
  name: "Footer",
}
</script>

<style scoped lang="css">
.f-img{
  width: 130px;
  height: 130px;
}
.oo{
  background: black;
  height: 150px;
  width: 100%;
}
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
  background-color: #f9fafc;
}
ul{
  list-style: none;
}
li{

  text-align: center;
  margin-top: 10px;
  margin-bottom: 10px;
  color:  #d3dce6;
}
.li1{
  font-size: 20px;
  color: white;
}
/*.footers{*/
/*  margin: 0;*/
/*  padding: 0;*/
/*  background-color:cornflowerblue;*/
/* width: 100%;*/
/*  height: 350px;*/
/*}*/
/*table{*/
/*  width: 1200px;*/
/*  margin-left: 260px;*/
/*}*/
/* td {*/
/*padding-right: 50px;*/
/*}*/
/*.tr1,.erweima{*/
/*  color: white;*/
/*}*/
/*.grid-content{*/
/*  margin-left: 180px;*/
/*  width: 500px;*/
/*}*/
/*.footer-row{*/
/*  height: 100px;*/
/*}*/
/*.footers1{*/
/*  background-color:cornflowerblue;*/
/*}*/
/*span{*/
/*position: absolute;*/
/*  top: 15px*/
/*}*/
/*p{*/
/*  position: relative;*/
/* top: -45px;*/
/*left: 65px;*/
/*}*/
/*.fgx{*/

/*width: 1111px;*/
/*  height: 2px;*/
/*  border-top: 1px solid white ;*/
/*  position: relative;*/
/*  left: 182px;*/
/*}*/
/*.footers-trss{*/
/*  margin-top: 50px;*/
/*}*/
/*.icon{*/
/*  color: black;*/
/*}*/
</style>