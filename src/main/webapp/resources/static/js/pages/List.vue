<template>
  <v-list>
    <my-header :profile="profile"/>
    <search-item/>
    <v-main>
      <v-container>
        <h2 style="padding-left: 12px">Объявления</h2>
        <my-element :advs="advs"/>
      </v-container>
    </v-main>
    <my-footer/>
  </v-list>
</template>

<script>
import MyHeader from "../components/Header.vue"
import SearchItem from "../components/SearchItem.vue";
import AdvSlider from "../components/AdvSlider.vue";
import AboutUs from "../components/AboutUs.vue";
import MyFooter from "../components/Footer.vue"
import MyElement from "../components/Element.vue";

export default {
  components: {
    MyElement,
    MyHeader,
    SearchItem,
    AdvSlider,
    AboutUs,
    MyFooter
  },
  data() {
    return {
      advs: frontendData.adv, // Сокращенная инфа об объекте
      profile: frontendData.profile,
      //logoPath: path.join(__dirname, 'src', 'main', 'webapp', 'resources', 'static', 'logo.png')
    }
  },
  name: "List"
}


</script>

<style scoped></style>