import Vue from 'vue'
import VueResource from 'vue-resource'
import App from 'pages/App.vue'
import router from "router/router";
import Vuetify from 'vuetify'
import 'vuetify/dist/vuetify.min.css'

Vue.use(Vuetify)
Vue.use(VueResource)

new Vue({
    el: '#app',
    vuetify: new Vuetify({}),
    router,
    render: a => a(App),

})