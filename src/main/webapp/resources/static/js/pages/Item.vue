<template>
  <v-list>
    <my-header :profile="profile"/>
    <v-main>
      <v-container>
        <v-container>
          <v-img   max-height="300"
                   max-width="500"
                   src="https://mykaleidoscope.ru/uploads/posts/2021-03/1616731497_9-p-krasivie-dorogie-kvartiri-11.jpg" >
            <template v-slot:placeholder >
              <v-row
                  class="fill-height ma-0"
                  align="center"
                  justify="center"
              >
                <v-progress-circular
                    indeterminate
                    color="grey lighten-5"
                ></v-progress-circular>
              </v-row>
            </template>
          </v-img>
          <v-col cols="2" sm="6">
            <h2 class="pa-ma-40 ">О квартире</h2>
            <v-divider></v-divider>

            <p >Сообщение: 3432432</p>
            <p>Адресс: Малютина 5</p>
            <p>Этаж: 5 / 5</p>
            <p>Площадь: 56 м2</p>
            <p>Площадь: 56 м2</p>
            <p>Площадь: 56 м2</p>
            <v-hover>
              <v-card

                  height="30"

              >
                <v-card-text>
                  50000000 р
                </v-card-text>
              </v-card>
            </v-hover>

            <v-divider class="mx-3"></v-divider>

            <h2>Описание</h2>
            <p class="text-justify">
              Morbi mattis ullamcorper velit. Donec orci lectus, aliquam ut, faucibus non, euismod id, nulla. Fusce convallis metus id felis luctus adipiscing. Aenean massa. Vestibulum purus quam, scelerisque ut, mollis sed, nonummy id, metus.

              Nulla consequat massa quis enim. Praesent venenatis metus at tortor pulvinar varius. Donec venenatis vulputate lorem. Phasellus accumsan cursus velit. Pellentesque ut neque.
            </p>
          </v-col>
           </v-container>
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
  name: "Item"
}
</script>

<style scoped>

</style>