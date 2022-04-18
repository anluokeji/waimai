import Vue from "vue";
import Vuex from "vuex"
import home from "./home"
import news from './news'
import anlis from './anli'
import contact from './contact'
import team from './tm'
import tzi from './tonzhi'
import zhaops from './zhaop'
Vue.use(Vuex)


export default new Vuex.Store({
    modules:{
        home,news,anlis,contact,team,tzi,zhaops
    }
})