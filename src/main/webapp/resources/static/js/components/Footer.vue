<template>
  <v-footer
      class="justify-center align-content-center align-center"
  >
    <v-container>
      <v-row>
        <v-col cols="2" class="mr-3 ml-10">
          <div>ПОЛЕЗНЫЕ ССЫЛКИ</div>
          <v-divider/>
          <v-btn
              color="black"
              text
              rounded
              href="/us"
              class="my-1 mr-1"
          >
            О нас
          </v-btn>
          <v-btn
              color="black"
              text
              rounded
              href="https://wa.me/79131490558"
              class="my-1 mr-1"
          >
            Техподдержка
          </v-btn>
          <v-btn
              color="black"
              text
              rounded
              href="/list"
              class="my-1 mr-1"
          >
            Купить
          </v-btn>
          <v-btn
              color="black"
              text
              rounded
              href="/list"
              class="my-1 mr-1"
          >
            Аренда
          </v-btn>

        </v-col>
        <v-col cols="3" class="mr-1">
          <div>ОПЛАТА</div>
          <v-divider/>
          <div class="pay">Продвижение объявлений на сайте можно оплатить любым удобным способом</div>
        </v-col>
        <v-col cols="3" class="mr-1">
          <div>КОНТАКТЫ</div>
          <v-divider/>
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
        </v-col>
        <v-col cols="3">
          <div>СОЦИАЛЬНЫЕ СЕТИ</div>
          <v-divider/>
          <div class="socialMedia">
            <a href="https://www.youtube.com/" class="socialMedia__item">
              <v-img
                  max-width="30"
                  max-height="30"
                  src="https://img.icons8.com/ios/50/000000/youtube-play.png"
              />
            </a>
            <a href="https://www.instagram.com/" class="socialMedia__item">
              <v-img
                  max-width="30"
                  max-height="30"
                  src="https://img.icons8.com/ios/50/000000/instagram-new--v1.png"/>
            </a>
            <a href="https://vk.com" class="socialMedia__item">
              <v-img
                  max-width="30"
                  max-height="30"
                  src="https://img.icons8.com/ios-filled/50/000000/vk-circled.png"/>
            </a>
          </div>
          <v-img height="120"
                 :src="require(`/src/images/logo.png`)" />
          <div class="text-right">&copy; {{ new Date().getFullYear() }}</div>
        </v-col>
      </v-row>
    </v-container>
  </v-footer>

</template>

<script>
export default {
  name: "Footer",
  data(){
    return {

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
.socialMedia
{

  margin-top: 20px;
  display: flex;
  justify-content: space-around;
}

.pay
{
  margin-top: 10px;
}
</style>