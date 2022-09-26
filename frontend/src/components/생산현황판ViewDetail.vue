<template>

    <v-card outlined>
        <v-card-title>
            생산현황판 # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: '생산현황판ViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/생산현황판/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

