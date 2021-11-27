<template>
    <v-app-bar max-height="80px">
      <v-icon class="icon">near_me</v-icon>
      <v-app-bar-nav-icon>


      </v-app-bar-nav-icon>
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