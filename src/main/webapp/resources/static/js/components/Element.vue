<template>
    <v-container>
      <v-row>
        <v-col
            v-for="adv in advs"
            :key="adv.id"
            cols="4"
        >
          <v-card
              :loading="loading"
              class="mx-auto my-12"
              max-width="300"
          >
            <template slot="progress">
              <v-progress-linear
                  color="deep-purple"
                  height="10"
                  indeterminate
              ></v-progress-linear>
            </template>

            <v-img
                height="200"
                src="http://almode.ru/uploads/posts/2021-07/1627040454_32-almode_ru-p-dizainerskie-intereri-kvartir-33.jpg"
            ></v-img>

            <v-card-title>{{adv.name}}</v-card-title>

            <v-card-text>
              <div class="my-4 text-subtitle-1">{{adv.description}}</div>
              <div class="my-4 text-subtitle-1">{{adv.addres}}</div>

              <div>{{adv.floor}}/{{adv.totalFloors}} этаж</div>
            </v-card-text>

            <v-divider class="mx-3"></v-divider>

            <v-card-title>{{adv.price}} р</v-card-title>
          </v-card>
        </v-col>
      </v-row>
    </v-container>

</template>

<script>
export default {
  props: ['advs'],
  name: "Element"
}
</script>

<style scoped>

</style>