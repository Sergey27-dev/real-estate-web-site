<template>
    <v-sheet
        class="mx-auto"
        elevation="8"
        >
      <v-slide-group
          active-class="success"
          class="pa-4"
          show-arrows="always"
      >
          <v-slide-item
              v-for="adv in advs"
              :key="adv.id"
              style="margin: 20px"
              v-slot="{ active, toggle }"
          >
            <v-card
                @click="toggle"
                class="ma-4"
                max-width="400"
            >
              <v-img
                  class="white--text align-end"
                  height="200px"
                  src="https://cdn.vuetifyjs.com/images/cards/docks.jpg"
              >
                <v-card-title>Top 10 Australian beaches</v-card-title>
              </v-img>
              <v-card-title>{{adv.name}}</v-card-title>
              <v-card-title>{{adv.price}}</v-card-title>


            </v-card>
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

</style>