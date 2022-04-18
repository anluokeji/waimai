import {reqnews} from "../../api";
const state = {
    news: []
};
const mutations = {
    NEWS(state,news){
        state.news= news
    }
};
const actions = {
    async  getnews({commit}){
        let req = await reqnews()
        if(req.code==200){
            commit("NEWS",req.data)
        }

    }
};
const getters = {}
export default { 
    state,mutations,actions,getters
};
