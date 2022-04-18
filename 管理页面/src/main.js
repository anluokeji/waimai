import Vue from 'vue'
import App from './App.vue'


Vue.config.productionTip = false

//完整引入
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
Vue.use(ElementUI);
import store from'./store'
import router from './router';
import axios from "axios";
axios.defaults.baseURL = '/api'
Vue.prototype.$http =axios
// //按需引入
// import { Button } from 'element-ui';
// Vue.component('cc-Button', Button);
new Vue({
  render: h => h(App),
store,router,axios

}).$mount('#app')
