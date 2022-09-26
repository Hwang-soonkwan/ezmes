 /*eslint-disable*/
import Vue from "vue";
import App from "./App.vue";
import vuetify from "./plugins/vuetify";
import Managing from "./components";
import router from './router';
Vue.config.productionTip = false;

const axios = require("axios").default;

// backend host url
axios.backend = null; //"http://localhost:8088";

// axios.backendUrl = new URL(axios.backend);
axios.fixUrl = function(original){

  if(!axios.backend && original.indexOf("/")==0) return original;

  var url = null;

  try{
    url = new URL(original);
  }catch(e){
    url = new URL(axios.backend + original);
  }

  if(!axios.backend) return url.pathname;

  url.hostname = axios.backendUrl.hostname;
  url.port = axios.backendUrl.port;

  return url.href;
}

const templateFiles = require.context("./components", true);
Vue.prototype.$ManagerLists = [];
templateFiles.keys().forEach(function(tempFiles) {
  if (!tempFiles.includes("Manager.vue") && tempFiles.includes("vue")) {
    Vue.prototype.$ManagerLists.push(
      tempFiles.replace("./", "").replace(".vue", "")
    );
  }
});
Vue.use(Managing);
const pluralCaseList = []

pluralCaseList.push( {plural: "workOrders", pascal: "WorkOrder"} )
pluralCaseList.push( {plural: "workerStandardInformations", pascal: "WorkerStandardInformation"} )

pluralCaseList.push( {plural: "작지발행화면", pascal: "작지발행화면"} )
pluralCaseList.push( {plural: "productionManagements", pascal: "ProductionManagement"} )

pluralCaseList.push( {plural: "작지변경요청화면", pascal: "작지변경요청화면"} )
pluralCaseList.push( {plural: "equipment", pascal: "Equipment"} )
pluralCaseList.push( {plural: "workers", pascal: "Worker"} )

pluralCaseList.push( {plural: "기준정보", pascal: "기준정보"} )

pluralCaseList.push( {plural: "생산현황판", pascal: "생산현황판"} )

Vue.prototype.$ManagerLists.forEach(function(item, idx) {
  pluralCaseList.forEach(function(tmp) {
    if(item.toLowerCase() == tmp.pascal.toLowerCase()) {
      var obj = {
        name: item,
        plural: tmp.plural
      }
      Vue.prototype.$ManagerLists[idx] = obj
    }
  })
})

new Vue({
  vuetify,
  router,
  render: h => h(App)
}).$mount("#app");
