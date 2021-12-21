<template>
  <v-footer
      class="justify-center align-content-center align-center"

  >
      <v-row>
        <v-col cols="2" class="mr-3 ml-10">
          <div>ПОЛЕЗНЫЕ ССЫЛКИ</div>
          <v-divider/>
          <v-btn
              v-for="link in links"
              :key="link"
              color="black"
              text
              rounded
              class="my-2 mr-2"
          >
            {{ link }}
          </v-btn>
        </v-col>
        <v-col cols="3" class="mr-1">
          <div>ОПЛАТА</div>
          <v-divider/>
          <div>Продвижение объявлений на сайте можно оплатить любым удобным способом</div>
        </v-col>
        <v-col cols="3" class="mr-1">
          <div>КОНТАКТЫ</div>
          <v-divider/>
          <v-container >
            <v-row class="ma-3">
              <v-icon>phone</v-icon>
              <div>8 (999) 999 99 99</div>
            </v-row>
            <v-row class="ma-3">
              <v-icon>phone</v-icon>
              <div>59-59-59</div>
            </v-row>
            <v-row class="ma-3">
              <v-icon>email</v-icon>
              <div>maison@gmail.com</div>
            </v-row>
          </v-container>
        </v-col>
        <v-col cols="3">
          <div>СОЦИАЛЬНЫЕ СЕТИ</div>
          <v-divider/>

        </v-col>
      </v-row>



  </v-footer>

</template>

<script>
export default {
  name: "Footer",
  data(){
    return {
      links: [
          'О нас',
          'Техподдержка',
          'Купить',
          'Аренда'
      ],
      icons: [
          'youtube',
          'facebook',
          'vk'

      ]
    }
  }
}
</script>

<style scoped>

</style>