<template>

    <v-card outlined>
        <v-card-title>
            작지발행화면 # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: '작지발행화면ViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/작지발행화면/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

