<template>
    <v-sheet
        class="mx-auto"
        elevation="5"
        >
      <v-slide-group
          active-class="success"
          class="pa-4"
          center-active
          show-arrows
      >
        <v-slide-item
              v-for="adv in advs"
              :key="adv.id"
              style="margin: 20px"
              v-slot="{ active, toggle }"
          >
            <router-link :to="{ name: 'itemPage', params: { id: adv.id } } " class="item"><v-card

                @click="toggle"
                class="ma-4"
                max-width="400"
            >
              <v-img
                  class="white--text align-end"
                  height="200px"
                  src="https://cdn.vuetifyjs.com/images/cards/docks.jpg"
              >
                <v-card-title>{{adv.name}}</v-card-title>
              </v-img>
              <v-card-title>{{adv.price}}</v-card-title>


            </v-card></router-link>

          </v-slide-item>

      </v-slide-group>
    </v-sheet>



</template>

<script>

export default {
  props: ['advs'],

  name: "AdvSlider"
}
</script>

<style scoped>
.item{
  text-decoration: none;
}
</style>