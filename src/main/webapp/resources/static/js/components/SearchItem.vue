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
        <div class="search">
          <v-select
              outlined
              label="Тип жилья"
              :items="type"
          ></v-select>
        </div>
        <div class="search">
        <v-select
            outlined
            :items="rooms"
            multiple
            label="Количество комнат"
        ></v-select>
        </div>
        <div class="search">
        <v-text-field
            outlined
            label="Цена"
        ></v-text-field>
        </div>
        <v-btn class="ma-2">Найти</v-btn>
      </v-row>

  </v-container>



</template>

<script>
export default {
  data(){
    return {
      type: [
          'Квартира', 'Дом'
      ],

      rooms: [
          '1','2','3','4'
      ]

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