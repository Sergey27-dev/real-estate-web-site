<template>
  <v-container>
      <v-row class="ma-4">
        <v-tabs
            align-with-title
        >
          <v-tab>Снять</v-tab>
          <v-tab>Купить</v-tab>
          <v-tab>Запрос</v-tab>
        </v-tabs>

        <v-select
            outlined
            v-model = "type"
            label="Тип жилья"
            :items="types"
        ></v-select>
        <v-text-field

            outlined
            label="Количество комнат"
            
            v-model="rooms"
        ></v-text-field>

        <v-text-field
            outlined
            label="Цена от"
            v-model="price_ot"
        ></v-text-field>

        <v-text-field
            outlined
            label="Цена до"
            v-model="price_do"
        ></v-text-field>

        <v-btn class="ma-2" @click="search">Найти</v-btn>

      </v-row>

  </v-container>

</template>

<script>
export default {
  data(){
    return {
      types: [
          'Квартира', 'Дом'
      ],

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
.search
{
  margin: 5px 5px;
}
</style>