import VueRouter from 'vue-router'
import Item from '../pages/Item.vue'
import List from '../pages/List.vue'
import MainPage from "../pages/MainPage.vue";
import Vue from "vue";
import NewItem from "../pages/NewItem.vue";
import ListOfSearch from "../pages/ListOfSearch.vue";

Vue.use(VueRouter)
export default new VueRouter({
    routes : [
        { path: '/', component: MainPage },
        { path: '/list', component: List },
        { path: '/item', component: Item },
        { path: '/new', component: NewItem},
        { path: '/search-list', component: ListOfSearch},
        { path: '*', component: MainPage },
    ],

    mode: 'history',

})