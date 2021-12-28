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
          outlined
          background-color="white"
          label="Цена"
          v-model="price"
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
      price: ""

    }
  },

  watch: {
    searchAttr(oldVal, newVal){
      this.type = newVal.type
      this.rooms = newVal.rooms
      this.price = newVal.price
    }
  },

  methods: {
    search() {
      this.$router.push({path: "/search-list", query: {type: this.type, rooms: this.rooms, price: this.price}})
    }
  },

  name: "SearchItem"
}
</script>

<style scoped>

</style>