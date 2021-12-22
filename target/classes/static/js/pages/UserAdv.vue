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
export default {
  data() {
    return {
      profile: frontendData.profile,
      advs: []
    }

  },

  created() {
    const profile = frontendData.profile
    this.$http.get("/adv/user-adv", {params: {email: profile.email}}).then(result =>
        result.json().then(data => {
          this.advs = data
        })
    )
  },
  name: "UserAdv"
}
</script>

<style scoped>

</style>