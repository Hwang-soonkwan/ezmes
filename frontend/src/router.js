
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import WorkOrderManager from "./components/listers/WorkOrderCards"
import WorkOrderDetail from "./components/listers/WorkOrderDetail"
import WorkerStandardInformationManager from "./components/listers/WorkerStandardInformationCards"
import WorkerStandardInformationDetail from "./components/listers/WorkerStandardInformationDetail"

import 작지발행화면View from "./components/작지발행화면View"
import 작지발행화면ViewDetail from "./components/작지발행화면ViewDetail"
import ProductionManagementManager from "./components/listers/ProductionManagementCards"
import ProductionManagementDetail from "./components/listers/ProductionManagementDetail"

import 작지변경요청화면View from "./components/작지변경요청화면View"
import 작지변경요청화면ViewDetail from "./components/작지변경요청화면ViewDetail"
import EquipmentManager from "./components/listers/EquipmentCards"
import EquipmentDetail from "./components/listers/EquipmentDetail"
import WorkerManager from "./components/listers/WorkerCards"
import WorkerDetail from "./components/listers/WorkerDetail"

import 기준정보View from "./components/기준정보View"
import 기준정보ViewDetail from "./components/기준정보ViewDetail"

import 생산현황판View from "./components/생산현황판View"
import 생산현황판ViewDetail from "./components/생산현황판ViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/workOrders',
                name: 'WorkOrderManager',
                component: WorkOrderManager
            },
            {
                path: '/workOrders/:id',
                name: 'WorkOrderDetail',
                component: WorkOrderDetail
            },
            {
                path: '/workerStandardInformations',
                name: 'WorkerStandardInformationManager',
                component: WorkerStandardInformationManager
            },
            {
                path: '/workerStandardInformations/:id',
                name: 'WorkerStandardInformationDetail',
                component: WorkerStandardInformationDetail
            },

            {
                path: '/작지발행화면',
                name: '작지발행화면View',
                component: 작지발행화면View
            },
            {
                path: '/작지발행화면/:id',
                name: '작지발행화면ViewDetail',
                component: 작지발행화면ViewDetail
            },
            {
                path: '/productionManagements',
                name: 'ProductionManagementManager',
                component: ProductionManagementManager
            },
            {
                path: '/productionManagements/:id',
                name: 'ProductionManagementDetail',
                component: ProductionManagementDetail
            },

            {
                path: '/작지변경요청화면',
                name: '작지변경요청화면View',
                component: 작지변경요청화면View
            },
            {
                path: '/작지변경요청화면/:id',
                name: '작지변경요청화면ViewDetail',
                component: 작지변경요청화면ViewDetail
            },
            {
                path: '/equipment',
                name: 'EquipmentManager',
                component: EquipmentManager
            },
            {
                path: '/equipment/:id',
                name: 'EquipmentDetail',
                component: EquipmentDetail
            },
            {
                path: '/workers',
                name: 'WorkerManager',
                component: WorkerManager
            },
            {
                path: '/workers/:id',
                name: 'WorkerDetail',
                component: WorkerDetail
            },

            {
                path: '/기준정보',
                name: '기준정보View',
                component: 기준정보View
            },
            {
                path: '/기준정보/:id',
                name: '기준정보ViewDetail',
                component: 기준정보ViewDetail
            },

            {
                path: '/생산현황판',
                name: '생산현황판View',
                component: 생산현황판View
            },
            {
                path: '/생산현황판/:id',
                name: '생산현황판ViewDetail',
                component: 생산현황판ViewDetail
            },


    ]
})
