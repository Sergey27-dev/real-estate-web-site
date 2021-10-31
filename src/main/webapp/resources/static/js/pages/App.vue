<template>
  <v-app>
    <v-app-bar app>
      <v-app-bar-nav-icon>


      </v-app-bar-nav-icon>

    </v-app-bar>

    <v-main>
      <v-container>
        <div>

          <div v-for="data in advs">
            {{data.id}}
            {{data.name}}
            {{data.price}}
          </div>
        </div>
      </v-container>

    </v-main>


  </v-app>


</template>

<script>
export default {
  data() {
    return {
      advs: frontendData.adv  // Сокращенная инфа об объекте
    }
  }
}

</script>

<style scoped>

</style>