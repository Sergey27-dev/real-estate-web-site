<template>
    <v-container>
      <v-row>
        <v-col
            v-for="adv in advs"
            :key="adv.id"
            cols="12"
        >
          <v-card
              :loading="loading"
              class="mx-auto"
          >
            <template slot="progress">
              <v-progress-linear
                  color="deep-purple"
                  height="10"
                  indeterminate
              ></v-progress-linear>
            </template>

            <div class="partsOfItems">
              <div class="partOfItem">
                <v-img
                    height="205"
                    width="300"
                    src="http://almode.ru/uploads/posts/2021-07/1627040454_32-almode_ru-p-dizainerskie-intereri-kvartir-33.jpg"
                ></v-img>
              </div>

              <div class="partOfItem">
                <v-card-title><router-link class="item" to="/item">{{adv.name}}</router-link></v-card-title>

                <v-card-text>
                  <div class="my-4 text-subtitle-1">{{adv.description}}</div>
                  <div class="my-4 text-subtitle-1">{{adv.addres}}</div>

                  <div>{{adv.floor}}/{{adv.totalFloors}} этаж</div>
                </v-card-text>
              </div>
              <div class="partOfItem"></div>
              <div class="partOfItem">
                <v-card-title>{{adv.price}} р</v-card-title>
              </div>
            </div>

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
.partsOfItems
{
  display: flex;
  justify-content: flex-start;
}
.partOfItem
{
  width: 25%;
}

.item
{
  color: black;
  text-decoration: none;
}
</style>