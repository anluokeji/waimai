<template>
  <div id="app" class="app">
<div class="coo">
       <Header></Header>
  <Brand style="margin-top: 20px"></Brand>

  <router-view>  <Home></Home></router-view>
    <Footer></Footer>
  <Footerss></Footerss>
  <Footers></Footers>
<Footersss></Footersss>
    <Suspension></Suspension>
  </div>

  </div>
</template>

<script>
import Header from './components/Header'
import Footer from './components/Footer'
import Home from './pages/home'
import Suspension from './components/Suspension'
import Brand from './components/Brand'
import Footers from './components/Footers'
import Footerss from './components/Footerss'
import Footersss from './components/Footersss'
export default {
  name: 'App',
  components: {
Header,Footer,Suspension,Home,Brand,Footers,Footerss,Footersss
  },
}
</script>

<style type="text/css">
*{
  margin: 0;
  padding: 0;
}
.app{
  width:100%;

}
</style>
