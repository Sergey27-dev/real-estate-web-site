<template>
  <v-list>
    <my-header :profile="profile"/>
    <v-main>
      <v-container>
        <about-us/>
        <div class="desc">
          Данный сайт - это наш курсовой проект и первая серьёзная работа в команде.
        </div>
      </v-container>
    </v-main>
    <my-footer/>
  </v-list>
</template>

<script>
import MyHeader from "../components/Header.vue"
import AboutUs from "../components/AboutUs.vue";
import MyFooter from "../components/Footer.vue"

export default {
  components: {
    MyHeader,
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
  name: "Us"
}
</script>

<style scoped>
.desc
{

}
</style>