import {reqlogin} from "../../api";


console.log(reqhome())
const state = {
    homes: []
};
const mutations = {
    HOME(state,home){
        state.homes= home
    }
};
const actions = {
    async  gethome({commit}){
        let req = await reqhome()
        if(req.code==200){
            commit("HOME",req.data)
        }

    }
};
const getters = {}
export default {
    state,mutations,actions,getters
};
