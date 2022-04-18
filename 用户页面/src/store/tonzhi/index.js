import {reqnotice} from "../../api";

const state = {
    tz: []
};
const mutations = {
    TZ(state,tz){
        state.tz= tz
    }
};
const actions = {
    async  gettonzhi({commit}){
        let req = await reqnotice()
        if(req.code==200){
            commit("TZ",req.data)
        }

    }
};
const getters = {}
export default {
    state,mutations,actions,getters
};
