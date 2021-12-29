<template>
    <v-app-bar height="90px" color="white">
      <a href="http://localhost:9000"><v-img
          class="mx-2"
          :src="require(`../../../assets/logo.png`)"
          height="90"
          width="140"
          contain
      ></v-img></a>
      <v-app-bar-nav-icon>
        <v-img
            :src="require('/src/images/logo.png')"
            class="mx-2"
            max-height="140"
            max-width="140"
            contain
        ></v-img>
      </v-app-bar-nav-icon>
      <v-icon class="icon">near_me</v-icon>

      <v-card-text>8 (999) 999 99 99</v-card-text>

      <v-btn plain href="/list">Все объявления</v-btn>

      <v-spacer/>
      <v-icon class="icon">favorite</v-icon>
      <div v-if="!profile">
        <v-btn href="/login">Войти</v-btn>
      </div>
      <div v-else>
        <v-menu
            top
            offset-x
        >
          <template v-slot:activator="{ on, attrs }">
            <v-btn
                color="primary"
                dark
                v-bind="attrs"
                v-on="on"
            >
              {{ profile.name }}
            </v-btn>
          </template>

          <v-list>
            <v-list-item>
              <v-list-item-action>
                <v-btn
                    text
                    color="primary"
                    href="/new"
                >
                  Создать объявление
                </v-btn>
              </v-list-item-action>
            </v-list-item>

            <v-list-item>
              <v-list-item-action>
                <v-btn
                    text
                    color="primary"
                    href="/my-adv"
                >
                  Мои объявления
                </v-btn>
              </v-list-item-action>
            </v-list-item>

            <v-list-item>
              <v-list-item-action>
                <v-btn
                    text
                    color="primary"
                    href="/logout"
                >
                  Выход
                </v-btn>
              </v-list-item-action>
            </v-list-item>

          </v-list>

        </v-menu>
      </div>
    </v-app-bar>

</template>

<script>
export default {
  props: [
    'profile'
  ],

  name: "Header"
}
</script>

<style scoped>
.icon{
  padding: 15px;
}
</style>