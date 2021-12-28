import VueRouter from 'vue-router'
import Item from '../pages/Item.vue'
import List from '../pages/List.vue'
import MainPage from "../pages/MainPage.vue";
import Us from "../pages/Us.vue";
import NotFound from "../pages/404.vue";
import Vue from "vue";
import NewItem from "../pages/NewItem.vue";
import ListOfSearch from "../pages/ListOfSearch.vue";
import UserAdv from "../pages/UserAdv.vue";

Vue.use(VueRouter)
export default new VueRouter({
    routes : [
        { 
            path: '/new', 
            component: NewItem
        },
        { 
            path: '/search-list', 
            component: ListOfSearch
        },
        { 
            path: '/my-adv', 
            component: UserAdv},
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
        {
            path: '/us',
            name: 'us',
            component: Us
        },
        { path: '*',
            component: NotFound
        }

    ],

    mode: 'history',

})