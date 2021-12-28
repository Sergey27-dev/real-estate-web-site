<template>
  <v-app>
    <my-header :profile="profile"/>

    <div class="image"><search-item/></div>
    <v-main>

      <v-container>
        <h2>Лучшие предложения</h2>
        <div>Подберите подходящую квартиру или дом просмотрев лучшие предложения</div>
        <v-hover><adv-slider :advs="advs"/></v-hover>
      </v-container>
      <v-divider style="margin: 50px" />
      <v-container>
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
      images: [
        "https://dizainexpert.ru/wp-content/uploads/2019/09/kvartira-v-svetlyx-tonax-i-sovremennom-stile-varianty.jpg",
        "https://manrule.ru/images/article/orig/2020/12/sovremennyj-dizajn-odnokomnatnyh-kvartir.jpg",
        "http://almode.ru/uploads/posts/2021-07/1627040454_32-almode_ru-p-dizainerskie-intereri-kvartir-33.jpg",
        "https://remont-pod-kluch-sevastopol.ru/media/964/9640.jpg",

      ],
      advs: frontendData.adv, // Сокращенная инфа об объекте
      profile: frontendData.profile
      // logoPath: path.join(__dirname, 'src', 'main', 'webapp', 'resources', 'static', 'logo.png')
    }
  }
}

</script>
<style scoped>

.image
{
  height: 500px;

  background-position: center;
  background-image: url(https://archello.s3.eu-central-1.amazonaws.com/images/2017/07/03/CapdAilFranceapart2010-10.1507275926.0821.jpg)
}

</style>