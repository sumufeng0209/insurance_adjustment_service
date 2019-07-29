var vm = new Vue({
    "el": "#app",
    data: {
        //分页
        model: {
            total: 100,
            size: 20,
            count: 11
        },

        //页面显示的数据
        pageList: {

        },


        commercialFlag: 1, //用于判断用户是否购买商业险
        /**
         *
         * 预赔的属性
         */

        commerceMoney: null, //如果客户购买了商业险则计算商业险的金额
        motorMoey: 0, //机动车强制三者险合计
        commerceSumMonry: 0, //商业合计
        sumMotorCommerceMone: 0, //机动车强制三者险和商业合计
        typeOfInsurance:null,  //险种的类型
        //垫付理算的字段
        advanceAdjustment:{
            itemId:null,  //选择的险种类型
            advancePrice:null, //垫付金额
            advanceReason:null, //垫付原因
            advanceDetails:null,  //垫付说明
            crossStrengthFeeSum:null, //交强费用合计
            businessFeeSum:null,//商业费用合计
            otherFeeSum:null,//费用总和计
            compensateCaseId:null,  //所属赔案表的字段
        },

        //预赔理算的字段
        payInAdvanceAdjustment:{
            compensateCaseId:null,  //所属赔案编号
            deathAndDisability:null,    //死亡伤残
            medicalExpense:null,  //医疗费用
            propertyLoss:null,      //财产损失
            notDeathAndDisability:null,  //无责死亡伤残
            notMedicalExpense:null,        //无责医疗费用
            notPropertyLoss:null,       //无责财产损失
            crossStrengthSum:null,      //交强合计
            businessSum:null,       //商业合计
            sum:null,           //总合计
            payInAdvancePrice:null ,//预付金额
        },

        /***
         *
         * 全面理算商业险
         */
        comprehensiveCommercial: {
            duty: {
                value: 0,
                name: "----其他",
            },
            noDuty: {
                value: 0,
                name: "----无责其他",
            },
            deathMaim: {
                value: 0,
                name: "----死亡伤残",
            },
            medicalCare: {
                value: 0,
                name: "----医疗费用",
            },
            property: {
                value: 0,
                name: "----财产损失",
            },

            noDutyDeathMaim: {
                value: 0,
                name: "----无责死亡伤残",
            },

            noDutyMedicalCare: {
                value: 0,
                name: "----无责医疗费用",
            },

            noDutyProperty: {
                value: 0,
                name: "-----无责财产损失",
            }
        },

        /*
            全面理算机动车强制险
        **/
        comprehensiveMotorVehicle: {
            duty: {
                value: 0,
                name: "----其他",
            },
            noDuty: {
                value: 0,
                name: "----无责其他",
            },
            deathMaim: {
                value: 0,
                name: "----死亡伤残",
            },
            medicalCare: {
                value: 0,
                name: "----医疗费用",
            },
            property: {
                value: 0,
                name: "----财产损失",
            },
            noDutyDeathMaim: {
                value: 0,
                name: "----无责死亡伤残",
            },
            noDutyMedicalCare: {
                value: 0,
                name: "----无责医疗费用",
            },
            noDutyProperty: {
                value: 0,
                name: "-----无责财产损失",
            }
        },


        /*
            机动车强制险
        **/

        motorVehicle: [{
            deathMaim: {
                value: 0,
                name: "----死亡伤残",
            }
        }, {
            medicalCare: {
                value: 0,
                name: "----医疗费用",
            }
        }, {
            property: {
                value: 0,
                name: "----财产损失",
            }
        }, {
            noDutyDeathMaim: {
                value: 0,
                name: "----无责死亡伤残",
            }
        }, {
            noDutyMedicalCare: {
                value: 0,
                name: "----无责医疗费用",

            }
        }, {
            noDutyProperty: {
                value: 0,
                name: "-----无责财产损失",
            }
        }], //机动车强制险


        /**
         * 其他费用信息的属性
         */
        //其他费用信息
        otherText: "交强待查看费",
        otherMoney: 0, //其他费用
        condition: { //查询条件
            compensate_case_id: "",
            report_a_case_id: "",
            insured_truename: "",
            car_number: "",
            filing_submit_time: "",

        },
        insertOther: 2,
        otherData: null,
        crossCostTotal: 0, //交强待查勘费用合计
        commerceSurvey: 0, //商业查勘费用合计
        sumMoney: 0 //其他费用总和
    },
    methods: {
        //分页
        getIndex:function() {

        },

        //提交垫付理算
        commitAdvance(){
            this.advanceAdjustment.crossStrengthFeeSum=this.crossCostTotal;  //交强费用合计
            this.advanceAdjustment.businessFeeSum=this.commerceSurvey;
            this.advanceAdjustment.otherFeeSum=this.sumMoney;
            this.$http.post("http://localhost:9000/gateway/adjustment/insert/advanceAdjustment/"+1,this.advanceAdjustment,{emulateJSON:true}).then((res)=>{
                console.log(res.body);
                let data = res.body;//流程实例ID
                console.log(this.otherData);
                //垫付理算表的主键ID--> advanceAdjustmentId
                this.$http.post("http://localhost:9000/gateway/case/insert/otherFee",{otherData:JSON.stringify(this.otherData),advanceAdjustmentId: 12},{emulateJSON: true}).then((resl)=>{
                    console.log(resl.body)
                })
                this.$http.post("http://localhost:9000/gateway/schedule/taskAutoDispatch/"+data).then((result)=>{
                    console.log(result.body)
                })
            })

        },

        //提交预赔理算
        commitPrestressing(){
            //this.$http.post("http://localhost:9000/gateway/adjustment/insert/payInAdvanceAdjustment",)
        },
        /***
         金融合计
         */
        totalAmout:function() {
            for (var item in this.comprehensiveCommercial) {
                for (var i in this.comprehensiveMotorVehicle) {
                    if (item == i) {
                        break;
                    }
                }
            }
        },


        /**
         进入全面理算
         */
        getIntoAdjustment:function() {
            for (var item in this.comprehensiveCommercial) {
                this.comprehensiveCommercial[item].value = 0;
            }
            for (var i in this.comprehensiveMotorVehicle) {
                this.comprehensiveMotorVehicle[i].value = 0;
            }

            $("#comprehensive").modal("show");
            this.resetOther();
        },



        //初始化商业险的信息
        init:function() {
            this.commerceMoney = [{
                deathMaim: {
                    value: 0,
                    name: "----死亡伤残",
                }
            }, {
                medicalCare: {
                    value: 0,
                    name: "----医疗费用",
                }
            }, {
                property: {
                    value: 0,
                    name: "----财产损失",
                }
            }, {
                noDutyDeathMaim: {
                    value: 0,
                    name: "----无责死亡伤残",
                }
            }, {
                noDutyMedicalCare: {
                    value: 0,
                    name: "----无责医疗费用",

                }
            }, {
                noDutyProperty: {
                    value: 0,
                    name: "-----无责财产损失",
                }
            }]
        },

        /**
         进入预赔理算
         */
        compensation:function() {
            $("#mymodel").modal("show")
            this.commercialFlag = 1;
            if (this.commercialFlag == 1) {
                this.init();
            } else {
                this.commerceMoney = null;
            }

        },



        //进入垫付理算
        advanceModel:function() {
            $("#advanceModel").modal("show")
            this.resetOther();
        },

        //新增其他费用
        insertOtherMoney:function() {

            var data = {
                "name": this.otherText,
                "price": this.otherMoney,
                "state": 1
            }
            var flag = false
            for (var i = 0; i < this.otherData.length; i++) {
                if (this.otherData[i].name == this.otherText) {
                    flag = true
                    break;
                }
            }

            if (flag) {
                $("#element").popover('show');
                return;
            } else {
                this.otherData.push(data);
                $("#element").popover('hide')
            }
            if (this.otherText == "商业待查勘费") {
                this.commerceSurvey = data["price"]
            } else {
                this.crossCostTotal = data["price"]
            }
            this.sumMoney = this.crossCostTotal * 1 + this.commerceSurvey * 1

        },
        //重置其他
        resetOther:function() {
            this.otherData = null;
            this.insertOther = 2;
            this.crossCostTotal = 0.00; //交强待查勘费用合计
            this.commerceSurvey = 0.00; //商业查勘费用合计
            this.sumMoney = 0;
            this.otherMoney = 0;
        },
        //删除其他费用
        deleteSurvey:function(name) {
            for (var i = 0; i < this.otherData.length; i++) {
                if (this.otherData[i].name == name) {
                    if (name == "商业待查勘费") {
                        this.crossCostTotal = 0;
                    } else {
                        this.commerceSurvey = 0;
                    }
                    this.sumSurvey = this.crossCostTotal * 1 + this.commerceSurvey * 1
                    this.otherData.splice(i, 1)
                }
            }
        },
        //改变其他费用的信息
        chageSurveyInfo:function(state, name) {
            for (var i = 0; i < this.otherData.length; i++) {
                if (this.otherData[i].name == name) {
                    state == 1 ? this.otherData[i].state = 2 : this.otherData[i].state = 1
                }
            }
        },
        //新增信息的费用关闭
        insertOtherMoneyClose:function() {
            this.insertOther = 2
        },
        //显示
        changeInsertOther: function() {
            this.insertOther = 1;
            if (this.otherData == null) {
                this.otherData = new Array();
            }
        },
    },
    created(){
        this.$http.post("http://localhost:9000/gateway/adjustment/typeof/findAll").then((res)=>{
            this.typeOfInsurance=res.body;
        })
    }
});
