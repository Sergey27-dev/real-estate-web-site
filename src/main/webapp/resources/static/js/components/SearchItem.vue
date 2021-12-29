<template>
  <v-container>
    <div class="serc"><v-row align="center" class="ma-4">
      <v-tabs
          v-model="tab"
          dark
          align="center"
          show-arrows
      >
        <v-tabs-slider color="white"></v-tabs-slider>

        <v-tab
            v-for="sech in searchItem"
            :key="sech"
        >
          {{ sech }}
        </v-tab>
      </v-tabs>

      <!--<v-tabs-items v-model="tab">
        <v-tab-item v-for="item in items" :key="item.tab">
          <v-card flat>
            <v-card-text>{{ item.content }}</v-card-text>
          </v-card>
        </v-tab-item>
      </v-tabs-items>-->

      <v-select
          outlined
          background-color="white"
          v-model = "type"
          label="Тип жилья"
          :items="types"
      ></v-select>
      <v-text-field
          background-color="white"
          outlined
          label="Количество комнат"
          v-model="rooms"
      ></v-text-field>
      <v-text-field
          background-color="white"
          outlined
          label="Цена от"
          v-model="price_ot"
      ></v-text-field>

      <v-text-field
          background-color="white"
          outlined
          label="Цена до"
          v-model="price_do"
      ></v-text-field>

    </v-row>
      <v-btn align="right" class="ma-2" @click="search">Найти</v-btn>
    </div>


  </v-container>

</template>

<script>
export default {
  data(){
    return {
      types: [
          'Квартира', 'Дом'
      ],
      searchItem:['Снять','Купить','Запрос'],
      room: [
          '1','2','3','4'
      ],
      type: "",
      rooms: "",
      price_ot: "",
      price_do: ""

    }
  },

  watch: {
    searchAttr(oldVal, newVal){
      this.type = newVal.type
      this.rooms = newVal.rooms
      this.price_ot = newVal.price_ot
      this.price_do = newVal.price_do
    }
  },

  methods: {
    search() {

      this.$router.push({path: "/search-list", query: {type: this.type, rooms: this.rooms, price_ot: this.price_ot,
      price_do: this.price_do}})
    }
  },

  name: "SearchItem"
}
</script>

<style scoped>

</style>