import Vue from 'vue'
import VueRouter from 'vue-router'
Vue.use(VueRouter)
// let originPush =VueRouter.prototype.push;
// let originReplace =VueRouter.prototype.replace;
// export default new VueRouter({
import login from "../pages/login"
import Home from '../pages/home'
import Login from '../pages/login'
import addanli from '../pages/addanli'
import glianli from '../pages/glianli'
import gsjs from '../pages/gsjieshao'
import gsjsxx from '../pages/gsjieshaoxx'
import xwgl from '../pages/xwgl'
import xwgls from '../pages/addxw'
import tmgli from '../pages/tmgli'
import addtm from '../pages/addtm'
import tzhigli from '../pages/tzgli'
import addtzhi from '../pages/addtzhi'
import lxiwm from '../pages/lxiwm'
import lxiwms from '../pages/addlxiwm'
import zhaop from '../pages/zhaop'
import zhaops from  '../pages/addzhaop'
import zhnaghao from '../pages/zhanghao'
import addzhanghao from '../pages/addzhanhao'
import upanli from '../pages/upanli'
import upgsjs from '../pages/upgsjs'
import upxw from '../pages/upxw'
import uplxi from '../pages/uplxiwm'
import upzhaop from '../pages/upzhaop'
import uptm from '../pages/uptm'
import uptzhi from '../pages/uptzhi'
import upzhanhao from '../pages/upzhanhao'
export default  new VueRouter({
    routes:[
        {
            path:"/home",
             component:Home,
            meta:{show:true},
            name:"home",
            children:[
                {
                    path:"/home/upzhanhao",
                    component:upzhanhao,
                    meta:{show:true},
                },
                {
                    path:"/home/uptzhi",
                    component:uptzhi,
                    meta:{show:true},
                },
                {
                    path:"/home/uptm",
                    component:uptm,
                    meta:{show:true},
                },
                {
                    path:"/home/upzhaop",
                    component:upzhaop,
                    meta:{show:true},
                },
                {
                    path:"/home/uplxi",
                    component:uplxi,
                    meta:{show:true},
                },
                {
                    path:"/home/upxw",
                    component:upxw,
                    meta:{show:true},
                },
                {
                    path:"/home/upgsjs",
                    component:upgsjs,
                    meta:{show:true},
                },
                {
                    path:"/home/addzhanghao",
                    component:addzhanghao,
                    meta:{show:true},
                },
                {
                    path:"/home/zhanghao",
                    component:zhnaghao,
                    meta:{show:true},
                },
                {
                    path:"/home/addzhaop",
                    component:zhaops,
                    meta:{show:true},
                },
                {
                    path:"/home/zhaop",
                    component:zhaop,
                    meta:{show:true},
                },
                {
                    path:"/home/lxiwms",
                    component:lxiwms,
                    meta:{show:true},
                },
                {
                    path:"/home/lxiwm",
                    component:lxiwm,
                    meta:{show:true},
                },
                {
                    path:"/home/addtzhi",
                    component:addtzhi,
                    meta:{show:true},
                },
                {
                    path:"/home/tzhigli",
                    component:tzhigli,
                    meta:{show:true},
                },
                {
                    path:"/home/addtm",
                    component:addtm,
                    meta:{show:true},
                },
                {
                    path:"/home/tmgli",
                    component:tmgli,
                    meta:{show:true},
                },
                {
                    path:"/home/addxw",
                    component:xwgls,
                    meta:{show:true},
                },
                {
                    path:"/home/xwgl",
                    component:xwgl,
                    meta:{show:true},
                },
                {
                    path:"/home/addanli",
                    component:addanli,
                    meta:{show:true},
                },
                {
                    path:"/home/glianli",
                    component:glianli,
                    meta:{show:true},
                },
                {
                    path:"/home/upanli",
                    component:upanli,
                    meta:{show:true},
                },
                {
                    path:"/home/gsjs",
                    component:gsjs,
                    meta:{show:true},
                },
                {
                    path:"/home/gsijsxx",
                    component:gsjsxx,
                    meta:{show:true},
                },
                {
                    path:'/home',
                    redirect:'/home/glianli'
                }
            ]
        }
        ,  {
            path:"/login",
            component:Login,
            meta:{show:true},
            name:"homes"
        },
        {
            path:"/",
            redirect:"login"
        }
    ]
})
//     routes:[
//         {
//             path:"/home",
//             component:Home,
//             meta:{show:true}
//         },
//         {
//             path:"/About",
//             component:About,
//             meta:{show:true},
//             children:[{
//                 path:"/About/Abouts",
//                 component:Abouts,
//                 meta:{show:true}
//             }
//             ,{
//                 path:"/About/Tm",
//                     component:Tm,
//                     meta:{show:true}
//                 },
//                 {
//                     path:"/About/Honor",
//                     component:Hnonr,
//                     meta:{show:true}
//                 },
//                 {
//                     path:'/About',
//                     redirect:"/About/Abouts"
//                 }
//                ]
//         },
//         {
//             path:"/Journalism",
//             component:Journalism,
//             meta:{show:true}
//         }
//         , {
//             path:"/Contact",
//             component:Contact,
//             meta:{show:true},
//
//             children:[{
//                 path: "/Contact/Message",
//                 component:Messages,
//                 meta:{show:true}
//             },{
//                 path:"/Contact/Recruitment",
//                 component:Recruitment,
//                 meta:{show:true},
//             }, {
//                 path:'/Contact',
//                 redirect:"/Contact/Message"
//             }
//             ]
//
//         },
//
//         {
//             path:'*',
//             redirect:"/home"
//         }
//     ]
// })