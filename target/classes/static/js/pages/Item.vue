<template>
  <v-list>
    <my-header :profile="profile"/>
    <v-main>
      <v-container>
        <v-container>
          <v-img   max-height="300"
                   max-width="500"
                   src="https://mykaleidoscope.ru/uploads/posts/2021-03/1616731497_9-p-krasivie-dorogie-kvartiri-11.jpg">
            <template v-slot:placeholder>
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
            <v-hover>
              <v-card
                  height="40"
                  width="130"
                  class="price"
              >
                <v-card-text style="padding: 10px">
                  <div class="price__text">50000000 р</div>
                </v-card-text>
              </v-card>
            </v-hover>

            <div class="infoOfApp">
              <div class="infoOfApp__left">
                <div class="infoOfApp__item">Сообщение: 3432432</div>
                <div class="infoOfApp__item">Адресс: Малютина 5</div>
                <div class="infoOfApp__item">Этаж: 5 / 5</div>
              </div>
              <div class="infoOfApp__right">
                <div class="infoOfApp__item">Площадь: 56 м2</div>
                <div class="infoOfApp__item">Площадь: 56 м2</div>
                <div class="infoOfApp__item">Площадь: 56 м2</div>
              </div>
            </div>


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
.price {
  margin: 10px 0;
  text-align: center;
  background-color: black;
}
.price__text {
  color: white;
  font-weight: 400;
  font-size: 18px;
}

.infoOfApp
{
  background-color: white;
  display: flex;
  justify-content: flex-start;
}

.infoOfApp__left, .infoOfApp__right
{
  max-width: 50%;
  margin-right: 50px;
}

.infoOfApp__item
{
  margin: 5px 5px;
}
</style>