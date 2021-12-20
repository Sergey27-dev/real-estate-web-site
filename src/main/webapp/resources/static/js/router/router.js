
import VueRouter from 'vue-router'
import Item from '../pages/Item.vue'
import List from '../pages/List.vue'
import MainPage from "../pages/MainPage.vue";
import NotFound from "../pages/404.vue";
import Vue from "vue";

Vue.use(VueRouter)
export default new VueRouter({
    routes : [
        {
            path: '/',
            name: 'main',
            component: MainPage
        },
        {
            path: '/list',
            name: 'list',
            component: List
        },
        {
            path: '/list/:id',
            name: 'itemPage',
            component: Item
        },
        { path: '*',
            component: NotFound
        },
    ],

    mode: 'history',
})