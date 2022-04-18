import Vue from 'vue'
import VueRouter from 'vue-router'
Vue.use(VueRouter)

import Home from '../pages/home'
import About from'../pages/About'
import Contact from '../pages/Contact'
import Journalism from '../pages/Journalism'
import Abouts from '../pages/About/Abouts'
import Tm from '../pages/About/Tm'
import Messages from "../pages/Contact/Message";
import Recruitment from "../pages/Contact/Recruitment"
let originPush =VueRouter.prototype.push;
let originReplace =VueRouter.prototype.replace;
export default new VueRouter({

    routes:[
        {
            path:"/home",
            component:Home,
            meta:{show:true}
        },
        {
            path:"/About",
            component:About,
            meta:{show:true},
            children:[{
                path:"/About/Abouts",
                component:Abouts,
                meta:{show:true}
            }
            ,{
                path:"/About/Tm",
                    component:Tm,
                    meta:{show:true}
                },
                {
                    path:'/About',
                    redirect:"/About/Abouts"
                }
               ]
        },
        {
            path:"/Journalism",
            component:Journalism,
            meta:{show:true}
        }
        , {
            path:"/Contact",
            component:Contact,
            meta:{show:true},

            children:[{
                path: "/Contact/Message",
                component:Messages,
                meta:{show:true}
            },{
                path:"/Contact/Recruitment",
                component:Recruitment,
                meta:{show:true},
            }, {
                path:'/Contact',
                redirect:"/Contact/Message"
            }
            ]

        },

        {
            path:'*',
            redirect:"/home"
        }
    ]
})