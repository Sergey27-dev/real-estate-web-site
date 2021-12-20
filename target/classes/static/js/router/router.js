import Vue from 'vue'
import VueRouter from 'vue-router'
import App from "../pages/App.vue";
import Auth from "../pages/Auth.vue";

Vue.use(VueRouter)

const routes = [
    // { path: '/', component: App },
    { path: '/jopa', component: Auth }
]

export default new VueRouter({
    mode:'history',
    routes
})