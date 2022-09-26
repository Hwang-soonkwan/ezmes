<template>

    <v-data-table
        :headers="headers"
        :items="생산현황판"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: '생산현황판View',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            생산현황판 : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/생산현황판'))

            temp.data._embedded.생산현황판.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.생산현황판 = temp.data._embedded.생산현황판;
        },
        methods: {
        }
    }
</script>

