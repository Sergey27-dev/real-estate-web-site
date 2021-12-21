<template>
  <v-list>
    <my-header :profile="profile"/>
    <v-main>
      <v-container>
        <h2>Объявления</h2>
        <my-element :advs="advs"/>
      </v-container>
    </v-main>
  </v-list>
</template>

<script>
import MyHeader from "../components/Header.vue"
import MyElement from "../components/Element.vue";

export default {
  components: {
    MyHeader,
    MyElement
  },
  data() {
    return {
      profile: frontendData.profile,
      advs: [],
      type: "",
      rooms: "",
      price: "",
    }
  },
  created() {

    this.type = this.$route.query.type
    this.rooms = this.$route.query.rooms
    this.price = this.$route.query.price
    this.$http.get('/adv/list-adv',{params: { type: this.type, rooms: this.rooms, price: this.price}}).then(result =>
        result.json().then(data => {
          this.advs = data
        }))
  },
  name: "ListOfSearch"
}
</script>

<style scoped>

</style>