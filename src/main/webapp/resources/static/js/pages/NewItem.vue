<template>
  <v-app>
    <my-header :profile="profile"/>
    <v-container class="tcfc">
      <v-form
          ref="form"
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
    </v-container>
      <upload-images @changed = "handleImages" type="file" class="uploder"/>
      <v-btn @click="save" href="/" class="ma-7">
        Создать
      </v-btn>

    <my-footer/>
  </v-app>


</template>

<script>
import MyFooter from "../components/Footer.vue"
import MyHeader from "../components/Header.vue"
import UploadImages from "vue-upload-drop-images"

export default {
  components: {
    MyHeader,
    UploadImages,
    MyFooter

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
      longDescription: "",
      file: null

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
    // handleImages(files) {
    //   this.file = files
    //   console.log(files)
    //   console.log(this.file)
    // },

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
        longDescription: this.longDescription,
      }

      this.$resource('/new-adv').save({},adv).then(result => {
        console.log(result)
      })


      // const formData = new FormData()
      // formData.append("file", this.file)
      // this.$http.post('/new-adv/photo', {file: this.file}).then(result => {
      //   console.log(result)
      // }, errorCollback => {
      //   console.log(errorCollback)
      // })



    }

  },

  name: "NewItem"
}

</script>

<style scoped>
.tcfc
{
  width: 500px;
}

.uploder
{
  max-height: 300px;
}
</style>