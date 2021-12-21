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
                <v-card-title><router-link :to="{ name: 'itemPage', params: { id: adv.id } } " class="item">{{adv.name}}</router-link></v-card-title>

                <v-card-text>
                  <div class="my-4 text-subtitle-1">{{adv.description}}</div>
                  <div class="my-4 text-subtitle-1">{{adv.addres}}</div>

                  <div>{{adv.floor}}/{{adv.totalFloors}} этаж</div>
                </v-card-text>
              </div>
              <div class="partOfItem"></div>
              <div class="partOfItem">
                <v-card
                    height="40"
                    width="130"
                    class="price"
                >
                  <v-card-text style="padding: 10px">
                    <div class="price__text">{{adv.price}} р</div>
                  </v-card-text>
                </v-card>
              </div>
            </div>

          </v-card>
        </v-col>
      </v-row>
    </v-container>

</template>

<script>
export default {
  props: {
    advs: {
      type: Array,
      default: () => []
    }
  },

  name: "Element"
}
</script>

<style scoped>
.price {
  margin: 10px 0;
  text-align: center;
  background-color: black;
}
.price__text {
  color: white;
  font-weight: 400;
  font-size: 18px;
}

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

.item:hover
{
  text-decoration: underline;
}
</style>