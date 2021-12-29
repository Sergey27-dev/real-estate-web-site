<template>
  <v-list>
    <my-header :profile="profile"/>
    <v-main>
      <v-container>
        <h2>Объявления</h2>
        <div>
          Найдено {{advs.length}}
        </div>
        <my-element :advs="advs"/>
      </v-container>
    </v-main>
  </v-list>
</template>

<script>
import MyHeader from "../components/Header.vue"
import MyElement from "../components/Element.vue";
import SearchItem from "../components/SearchItem.vue";

export default {
  components: {
    MyHeader,
    MyElement,
    SearchItem
  },
  data() {
    return {
      profile: frontendData.profile,
      advs: [],
      type: "",
      rooms: "",
      price_ot: "",
      price_do: ""
    }
  },
  created() {

    this.type = this.$route.query.type
    this.rooms = this.$route.query.rooms
    this.price_ot = this.$route.query.price_ot
    this.price_do = this.$route.query.price_do
    this.$http.get('/adv/list-adv',{params: { type: this.type, rooms: this.rooms, price_ot: this.price_ot, price_do: this.price_do}}).then(result =>
        result.json().then(data => {
          this.advs = data
        }))
  },
  name: "ListOfSearch"
}
</script>

<style scoped>

</style>