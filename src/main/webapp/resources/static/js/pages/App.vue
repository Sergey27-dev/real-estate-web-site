<template>
  <v-app>
    <router-view>

    <v-content>
      <div>
        <router-view></router-view>
      </div>
    </v-content>
    <my-footer/>

    </router-view>

  </v-app>

</template>

<script>


export default {
  name: 'App'
}

</script>
<style scoped></style>