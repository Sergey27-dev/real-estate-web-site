<template>
    <v-app-bar max-height="50px">
      <v-icon class="icon">near_me</v-icon>
      <v-app-bar-nav-icon>

      </v-app-bar-nav-icon>
      <v-card-text>8 (999) 999 99 99</v-card-text>

      <v-spacer/>
      <v-icon class="icon">favorite</v-icon>
      <v-btn>Войти</v-btn>
    </v-app-bar>
</template>

<script>
export default {
  name: "Header"
}
</script>

<style scoped>
.icon{
  padding: 15px;
}

</style>