<template>
    <v-app-bar max-height="80px">
      <a href="http://localhost:9000"><v-img
          class="mx-2"
          src="logo.svg"
          max-height="140"
          max-width="140"
          contain
      ></v-img></a>
      <v-icon class="icon">near_me</v-icon>
      <v-card-text>8 (999) 999 99 99</v-card-text>

      <v-spacer/>
      <v-icon class="icon">favorite</v-icon>
      <div v-if="!profile">
        <v-btn href="/login">Войти</v-btn>
      </div>
      <div v-else>
        <v-btn text="profile" href="/logout">{{profile.name}}</v-btn>
      </div>
    </v-app-bar>

</template>

<script>
export default {
  props: [
    'profile'
  ],

  data(){
    // return{
    //   imgUrl:
    // }
  },

  name: "Header"
}
</script>

<style scoped>
.icon{
  padding: 15px;
}
</style>