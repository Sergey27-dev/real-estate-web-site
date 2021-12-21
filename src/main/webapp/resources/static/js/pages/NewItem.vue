<template>
  <v-app>
    <my-header :profile="profile"/>
    <v-container>
      <v-form
          ref="form"
          v-model="valid"
          lazy-validation
      >
        <v-text-field
            v-model="name"
            label="Название"
            required
        ></v-text-field>

        <v-select
            v-model="type"
            :items="items"
            label="Тип жилья"
            required
        ></v-select>

        <v-text-field
            v-model="price"
            label="Цена"
            required
        ></v-text-field>

        <v-text-field
            v-model="rooms"
            label="Колличество комнат"
            required
        ></v-text-field>

        <v-text-field
            v-model="square"
            label="Площадь"
            required
        ></v-text-field>

        <v-text-field
            v-model="floorm"
            label="Этаж"
            required
        ></v-text-field>

        <v-text-field
            v-model="totalFloors"
            label="Всего этажей"
            required
        ></v-text-field>

        <v-text-field
            v-model="adres"
            label="Адрес"
            required
        ></v-text-field>

        <v-text-field
            v-model="description"
            label="Краткое описание"
            required
        ></v-text-field>

        <v-text-field
            v-model="longDescription"
            label="Описание"
            required
        ></v-text-field>
      </v-form>
      <v-btn @click="save" href="/">
        Создать
      </v-btn>
    </v-container>
  </v-app>


</template>

<script>
import MyHeader from "../components/Header.vue"
export default {
  components: {
    MyHeader
  },
  data() {
    return {
      profile: frontendData.profile,
      items: [
          'Квартира',
          'Дом'
      ],
      name: "",
      type: "",
      price: "",
      rooms: "",
      square: "",
      floorm: "",
      totalFloors: "",
      adres: "",
      description:"",
      longDescription: ""

    }
  },

  watch: {
    formAttr(oldVal, newVal){
      this.name = newVal.name
      this.type = newVal.type
      this.price = newVal.price
      this.rooms = newVal.rooms
      this.square = newVal.square
      this.floor = newVal.floorm
      this.totalFloors = newVal.totalFloors
      this.adres = newVal.adres
      this.description = newVal.description
      this.longDescription = newVal.longDescription


    }
  },
  methods: {
    save() {
      const adv = {
        name: this.name,
        type: this.type,
        price: this.price,
        numberOfRooms: this.rooms,
        square: this.square,
        totalFloors: this.totalFloors,
        floor: this.floorm,
        addres: this.adres,
        description: this.description,
        longDescription: this.longDescription
      }

      this.$resource('/new-adv{/id}').save({}, adv)
    }

  },

  name: "NewItem"
}

</script>

<style scoped>

</style>