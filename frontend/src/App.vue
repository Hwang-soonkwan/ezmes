

<template>
    <v-app id="inspire">
        <div>
            <v-app-bar app clipped-left flat>
                <v-toolbar-title>
                    <span class="second-word font uppercase"
                        style="font-weight:700;"
                    >
                        <v-app-bar-nav-icon
                            @click="openSideBar()"
                            style="z-index:1;
                            height:56px;
                            width:30px;
                            margin-right:10px;
                            font-weight:300;
                            font-size:55px;"
                        >
                            <div style="line-height:100%;">≡</div>
                        </v-app-bar-nav-icon>
                        ezmes
                    </span>
                </v-toolbar-title>
                <span v-if="urlPath!=null" 
                    class="mdi mdi-home" 
                    key="" 
                    to="/" 
                    @click="goHome()"
                    style="margin-left:10px; font-size:20px; cursor:pointer;"
                    ></span> 
                <v-spacer></v-spacer>

            </v-app-bar>

            <v-navigation-drawer app clipped flat v-model="sideBar">
                <v-list>


                    <v-list-item
                        class="px-2"
                        key="workOrders"
                        to="/workOrders"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        WorkOrder
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="workerStandardInformations"
                        to="/workerStandardInformations"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        WorkerStandardInformation
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="작지발행화면"
                        to="작지발행화면"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        작지발행화면
                    </v-list-item>

                    <v-list-item
                        class="px-2"
                        key="productionManagements"
                        to="/productionManagements"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        ProductionManagement
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="작지변경요청화면"
                        to="작지변경요청화면"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        작지변경요청화면
                    </v-list-item>

                    <v-list-item
                        class="px-2"
                        key="equipment"
                        to="/equipment"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        Equipment
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="workers"
                        to="/workers"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        Worker
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="기준정보"
                        to="기준정보"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        기준정보
                    </v-list-item>

                    <v-list-item
                        class="px-2"
                        key="생산현황판"
                        to="생산현황판"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        생산현황판
                    </v-list-item>


                </v-list>
            </v-navigation-drawer>
        </div>

        <v-main>
            <v-container v-if="urlPath" class="py-8 px-6 mt-10" fluid>
                <router-view></router-view>
            </v-container>
            <v-container v-else class="py-8 px-6 mt-10" fluid>
                <v-row>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="workOrders"
                                    to="/workOrders"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px; border:solid 2px;"
                                >
                                    WorkOrder
                                </v-btn>
                            </v-card-actions>
                        </v-card>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="workerStandardInformations"
                                    to="/workerStandardInformations"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px; border:solid 2px;"
                                >
                                    WorkerStandardInformation
                                </v-btn>
                            </v-card-actions>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="작지발행화면"
                                    to="/작지발행화면"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px;"
                                >
                                    작지발행화면
                                </v-btn>
                            </v-card-actions>
                        </v-card>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="productionManagements"
                                    to="/productionManagements"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px; border:solid 2px;"
                                >
                                    ProductionManagement
                                </v-btn>
                            </v-card-actions>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="작지변경요청화면"
                                    to="/작지변경요청화면"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px;"
                                >
                                    작지변경요청화면
                                </v-btn>
                            </v-card-actions>
                        </v-card>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="equipment"
                                    to="/equipment"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px; border:solid 2px;"
                                >
                                    Equipment
                                </v-btn>
                            </v-card-actions>
                        </v-card>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="workers"
                                    to="/workers"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px; border:solid 2px;"
                                >
                                    Worker
                                </v-btn>
                            </v-card-actions>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="기준정보"
                                    to="/기준정보"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px;"
                                >
                                    기준정보
                                </v-btn>
                            </v-card-actions>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="생산현황판"
                                    to="/생산현황판"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px;"
                                >
                                    생산현황판
                                </v-btn>
                            </v-card-actions>
                        </v-card>
                </v-row>
            </v-container>
        </v-main>
    </v-app>
</template>

<script>

export default {
    name: "App",

    data: () => ({
        useComponent: "",
        drawer: true,
        components: [],
        sideBar: true,
        urlPath: null,
    }),
    
    async created() {
      var path = document.location.href.split("#/")
      this.urlPath = path[1];

    },

    mounted() {
        var me = this;
        me.components = this.$ManagerLists;
    },

    methods: {
        openSideBar(){
            this.sideBar = !this.sideBar
        },
        changeUrl() {
            var path = document.location.href.split("#/")
            this.urlPath = path[1];
        },
        goHome() {
            this.urlPath = null;
        },
    }
};
</script>
<style>
</style>
