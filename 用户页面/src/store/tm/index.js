import {reqtm} from "../../api";

const state = {
    tms: []
};
const mutations = {
    TEAM(state,tm){
        state.tms= tm
    }
};
const actions = {
    async  gettm({commit}){
        let req = await reqtm()
        if(req.code==200){
            commit("TEAM",req.data)
        }

    }
};
const getters = {}
export default {
    state,mutations,actions,getters
};
