import {reqanli} from "../../api";
const state = {
    anli: []
};
const mutations = {
    ANLI(state,anli){
        state.anli= anli
    }
};
const actions = {
    async  getanli({commit}){
        let req = await reqanli()
        if(req.code==200){
            commit("ANLI",req.data)
        }

    }
};
const getters = {}
export default {
    state,mutations,actions,getters
};
