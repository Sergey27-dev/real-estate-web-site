<template>
  <v-app>
    <my-header :profile="profile"/>
    <v-container>
      <element :advs="advs"/>
    </v-container>
  </v-app>

</template>

<script>
import MyHeader from "../components/Header.vue"
import Element from "../components/Element.vue";

export default {
  components: {
    MyHeader,
    Element
  },
  data() {
    return {
      advs: [],
      type: "",
      rooms: "",
      price: ""
    }
  },
  created() {
    const profile = frontendData.profile
    this.type = this.$route.query.type
    this.rooms = this.$route.query.rooms
    this.price = this.$route.query.price
    this.$http.get('/adv/list-adv',{params: { type: this.type, rooms: this.rooms, price: this.price}}).then(result =>
        result.json().then(data => {
          this.advs.push(data)
        })
    )
  },
  name: "ListOfSearch"
}
</script>

<style scoped>

</style>