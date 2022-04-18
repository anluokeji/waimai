import {reqzhaop} from "../../api";

console.log(reqzhaop())
const state = {
    zps: []
};
const mutations = {
    ZP(state,zp){
        state.zps= zp
    }
};
const actions = {
    async  getzhaop({commit}){
        let req = await reqzhaop()
        if(req.code==200){
            commit("ZP",req.data)
        }

    }
};
const getters = {}
export default {
    state,mutations,actions,getters
};
