
import VueRouter from 'vue-router'
import Item from '../pages/Item.vue'
import List from '../pages/List.vue'
import MainPage from "../pages/MainPage.vue";
import Us from "../pages/Us.vue"
import Vue from "vue";

Vue.use(VueRouter)
export default new VueRouter({
    routes : [
        { path: '/', component: MainPage },
        { path: '/list', component: List },
        { path: '/item', component: Item },
        { path: '*', component: MainPage },
        {path: '/us', component: Us}
    ],

    mode: 'history',
})