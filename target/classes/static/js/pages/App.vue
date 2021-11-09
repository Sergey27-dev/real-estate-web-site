<template>
  <v-app>
    <my-header/>
    <search-item/>
    <v-main>
      <v-container>
        <h2>Лучшие предложения</h2>
        <div>Подберите подходящую квартиру или дом просмотрев лучшие предложения</div>
        <adv-slider :advs="advs"/>
      </v-container>
    </v-main>
  </v-app>
</template>

<script>
import MyHeader from "../components/Header.vue"
import SearchItem from "../components/SearchItem.vue";
import AdvSlider from "../components/AdvSlider.vue";

export default {
  components: {
    MyHeader,
    SearchItem,
    AdvSlider
  },

  data() {
    return {
      advs: frontendData.adv,  // Сокращенная инфа об объекте
      // logoPath: path.join(__dirname, 'src', 'main', 'webapp', 'resources', 'static', 'logo.png')
    }
  }
}

</script>

<style scoped>

</style>