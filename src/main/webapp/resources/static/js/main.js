import Vue from 'vue'
import VueResource from 'vue-resource'
import App from 'pages/App.vue'

import Vuetify from 'vuetify'
import 'vuetify/dist/vuetify.min.css'

import router from './router/router.js';
import VueRouter from "vue-router";

Vue.use(Vuetify)
Vue.use(VueResource)
Vue.use(VueRouter)

new Vue({
    el: '#app',
    router,
    render: a => a(App),
    vuetify: new Vuetify({})
})