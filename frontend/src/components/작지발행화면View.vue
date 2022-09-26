<template>

    <v-data-table
        :headers="headers"
        :items="작지발행화면"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: '작지발행화면View',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            작지발행화면 : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/작지발행화면'))

            temp.data._embedded.작지발행화면.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.작지발행화면 = temp.data._embedded.작지발행화면;
        },
        methods: {
        }
    }
</script>

