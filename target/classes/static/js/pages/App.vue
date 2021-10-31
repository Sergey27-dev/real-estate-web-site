<template>
  <div>

    <div v-for="data in advs">
      {{data.id}}
      {{data.name}}
      {{data.price}}
    </div>
  </div>

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