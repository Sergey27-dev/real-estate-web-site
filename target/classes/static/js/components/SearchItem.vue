<template>
  <v-container>
      <v-row class="search">
        <v-select
            label="Квартира"
        ></v-select>
        <v-select
            label="Количество комнат"
        ></v-select>
        <v-text-field
            label="Цена"
        ></v-text-field>
        <v-btn>Найти</v-btn>
      </v-row>

  </v-container>



</template>

<script>
export default {
  name: "SearchItem"
}
</script>

<style scoped>
.search {
  padding: 20px;
}
</style>