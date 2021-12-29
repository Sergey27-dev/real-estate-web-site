<template>
  <v-list>
    <my-header :profile="profile"/>
    <v-main>
      <v-container>
        <h2>Объявления</h2>
        <my-element :advs="advs"/>
      </v-container>
    </v-main>


  </v-list>
</template>

<script>
<<<<<<< HEAD
import MyElement from "../components/Element.vue";
import MyHeader from "../components/Header.vue"
export default {
  components: {
    MyHeader,
    MyElement
  },
=======
export default {
>>>>>>> 2f6240ece3d13a10a0e94ac2773e2a5db8e6106e
  data() {
    return {
      profile: frontendData.profile,
      advs: []
    }

  },
<<<<<<< HEAD

  created() {
    const profile = frontendData.profile
    this.$http.get("/adv/user-adv", {params: {email: profile.email}}).then(result =>
        result.json().then(data => {
          this.advs = data
        })
    )
  },
=======
>>>>>>> 2f6240ece3d13a10a0e94ac2773e2a5db8e6106e
  name: "UserAdv"
}
</script>

<style scoped>

</style>