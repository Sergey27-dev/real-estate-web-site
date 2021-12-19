<template>
  <v-app>
    <my-header :profile="profile"/>
    <search-item/>
    <v-main>
      <button type="button" class = "btn btn-outline-light" @click="$router.push('/list')">Перейти к List</button>
      <button type="button" class = "btn btn-outline-light" @click="$router.push('/item')">Перейти к item</button>

        <div v-if="!profile">
          <v-btn href="/list">Перейти к List</v-btn>
        </div>
      <router-link to="/list">Перейти к Foo</router-link>
      <v-container>
        <h2>Лучшие предложения</h2>
        <div>Подберите подходящую квартиру или дом просмотрев лучшие предложения</div>
        <adv-slider :advs="advs"/>
      </v-container>
      <v-divider style="margin: 50px" />
      <v-container>
        <div class="mb-4"><h3>О нас</h3></div>
        <about-us/>
      </v-container>
    </v-main>
    <my-footer/>
  </v-app>
</template>

<script>

import MyHeader from "../components/Header.vue"
import SearchItem from "../components/SearchItem.vue";
import AdvSlider from "../components/AdvSlider.vue";
import AboutUs from "../components/AboutUs.vue";
import MyFooter from "../components/Footer.vue"

export default {
  components: {
    MyHeader,
    SearchItem,
    AdvSlider,
    AboutUs,
    MyFooter
  },

  data() {
    return {
      advs: frontendData.adv, // Сокращенная инфа об объекте
      profile: frontendData.profile
      // logoPath: path.join(__dirname, 'src', 'main', 'webapp', 'resources', 'static', 'logo.png')
    }
  }
}

</script>
<style scoped></style>