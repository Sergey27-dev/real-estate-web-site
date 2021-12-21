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
<!--        <v-select-->
<!--            outlined-->
<!--            v-model = "rooms"-->
<!--            :items="room"-->
<!--            multiple-->
<!--            label="Количество комнат"-->
<!--        ></v-select>-->
        <v-text-field
            outlined
            label="Количество комнат"
            v-model="rooms"
        ></v-text-field>

        <v-text-field
            outlined
            label="Цена"
            v-model="price"
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
.search
{
  margin: 5px 5px;
}
</style>