import {reqcontact} from "../../api";

console.log(reqcontact())
const state = {
    con: []
};
const mutations = {
    CONTACT(state,cont){
        state.con= cont
    }
};
const actions = {
    async  getcontact({commit}){
        let req = await reqcontact()
        if(req.code==200){
            commit("CONTACT",req.data)
        }

    }
};
const getters = {}
export default {
    state,mutations,actions,getters
};
