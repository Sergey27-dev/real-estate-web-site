import Vue from 'vue'
import VueResource from 'vue-resource'
import App from 'pages/App.vue'
import List from 'pages/List.vue'
import Vuetify from 'vuetify'
import 'vuetify/dist/vuetify.min.css'

Vue.use(Vuetify)
Vue.use(VueResource)

new Vue({
    el: '#app',
    render: a => a(List),
    vuetify: new Vuetify({})
})