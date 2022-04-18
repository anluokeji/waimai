import request from "./request";


export const reqhome = ()=>{
    return request({url:"/company/select",method:"get"})
}
export const reqnews = ()=>{
    return request({url:"/news/select",method:"get"})
}
export const reqanli = ()=>{
    return request({url:"/an/select",method:"get"})
}
export const reqcontact = ()=>{
    return request({url:"/contact/select",method:"get"})
}
export const reqtm = ()=>{
    return request({url:"/team/select",method:"get"})
}
export const reqnotice = ()=>{
    return request({url:"/notice/select",method:"get"})
}
export const reqzhaop = ()=>{
    return request({url:"/recruit/select",method:"get"})
}

// 删
export const deleteanli = (params)=>{
    request({url:"/an/delete",method:"delete",data:params})
}