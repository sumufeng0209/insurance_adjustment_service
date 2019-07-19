var vm = new Vue({
    "el": "#app",
    "data": {

        //分页
        model: {
            size: 20,
            count: 11,
            total: 1000,
        },

        insertOther: 2, //判断是否显示新增其他费用
        surveyFeeText: "商业待查勘费", //显示文本 
        surveyData: null, //其他查询出来的数据
        surveyMoney: 0, //其他的费用
        crossCostTotal: 0.00, //交强待查勘费用合计
        commerceSurvey: 0.00, //商业查勘费用合计
        sumSurvey: 0, //交强和商业查勘费用合计
        motorthreeMoney: { //机动车强制三者责任险
            noDuty: 0, //无责其他
            duty: 0, //其他
            deathMaim: 0, //死亡伤残
            medicalCare: 0, //医疗费用
            property: 0, //财产损失
            noDutyDeathMaim: 0, //无责死亡伤残
            noDutyMedicalCare: 0, //无责医疗费用
            noDutyProperty: 0 //无责财产损失
        },
        motorMoey: 0, //机动车强制三者险合计
        commerceSumMonry: 0, //商业合计
        sumMotorCommerceMone: 0, //机动车强制三者险和商业合计 
        sumMotor: 0, //交强赔款合计
        sumCommerce: 0, //商业赔款合计
        sumMoney: 0, //总价
        flagCommerce: 2, //判断用户是否购买商业险 1代表购买了商业险
        commerceMoney: [
            { noDuty: 0, name: "----无责其他" },
            { duty: 0, name: "----其他" },
            { deathMaim: 0, name: "----死亡伤残" },
            { medicalCare: 0, name: "----医疗费用" },
            { property: 0, name: "----财产损失" },
            { noDutyDeathMaim: 0, name: "----无责死亡伤残" },
            { noDutyMedicalCare: 0, name: "----无责医疗费用" },
            { noDutyProperty: 0, name: "-----无责财产损失" }
        ], //如果客户购买了商业险则计算商业险的金额
        commitData: {

        },
        condition: {
            compensate_case_id: "",
            report_a_case_id: "",
            insured_truename: "",
            car_number: "",
            report_a_case_time: "",

        }


    },
    "methods": {
        getIndex:function(val) {

        },

        //进入页面重置
        clear: function() {
            this.resetOther();
            this.restFilingInfo();
            this.sumMotor = 0; //交强赔款合计
            this.sumCommerce = 0; //商业赔款合计
            this.sumMoney = 0; //总价
        },

        /**
         * 其他费用的methods
         * 
         */
        changeInsertOther: function() {
            this.insertOther = 1;
            if (this.surveyData == null) {
                this.surveyData = new Array();
            }
        },
        insertOtherMoneyClose: function() {
            this.insertOther = 2;

        },
        insertOtherMoney: function() {
            var data = {
                "name": this.surveyFeeText,
                "price": this.surveyMoney,
                "state": 1
            }

            this.surveyMoney = ''
            var flag = false
            for (var i = 0; i < this.surveyData.length; i++) {
                if (this.surveyData[i].name == this.surveyFeeText) {
                    flag = true
                    break;
                }
            }

            if (flag) {
                $("#element").popover('show');
                return;
            } else {
                this.surveyData.push(data);

                $("#element").popover('hide')
            }
            if (this.surveyFeeText == "商业待查勘费") {
                this.crossCostTotal = data["price"]
            } else {
                this.commerceSurvey = data["price"]
            }
            this.sumSurvey = this.crossCostTotal * 1 + this.commerceSurvey * 1

        },
        chageSurveyInfo: function(state, name) {
            for (var i = 0; i < this.surveyData.length; i++) {
                if (this.surveyData[i].name == name) {
                    state == 1 ? this.surveyData[i].state = 2 : this.surveyData[i].state = 1
                }
            }
        },
        deleteSurvey: function(name) {
            for (var i = 0; i < this.surveyData.length; i++) {
                if (this.surveyData[i].name == name) {
                    if (name == "商业待查勘费") {
                        this.crossCostTotal = 0;
                    } else {
                        this.commerceSurvey = 0;
                    }
                    this.sumSurvey = this.crossCostTotal * 1 + this.commerceSurvey * 1
                    this.surveyData.splice(i, 1)
                }
            }
        },

        //其他费用重置
        resetOther: function() {
            this.surveyData = null;
            this.insertOther = 2;
            this.crossCostTotal = 0.00; //交强待查勘费用合计
            this.commerceSurvey = 0.00; //商业查勘费用合计
            this.sumSurvey = 0; //交强和商业查勘费用合计
            this.surveyMoney = 0; //其他的费用
        },
        /**其他费用的方法结算 */
        /**立案信息methods */
        motorCaculate: function() {
            this.motorMoey = 0;
            this.commerceSumMonry = 0;
            for (var i in this.motorthreeMoney) {
                this.motorMoey += this.motorthreeMoney[i] * 1
            }
            this.returnCommerceMonry();
            this.sumMotorCommerceMone = this.motorMoey + this.commerceSumMonry;
        },

        //立案信息重置
        restFilingInfo:function() {
            for (var i in this.motorthreeMoney) {
                this.motorthreeMoney[i] = 0;
            }
            for (var i in this.commerceMoney) {
                for (var j in this.commerceMoney[i]) {
                    if (j != "name") {
                        this.commerceMoney[i][j] = 0;
                    }

                }
            }
            this.motorMoey = 0;
            this.sumMotorCommerceMone = 0;
            this.commerceSumMonry = 0;
        },
        /**立案信息完结 */
        sumCaculate: function() {
            this.sumMotor = this.motorMoey * 1 + this.crossCostTotal * 1;
            this.sumCommerce = this.commerceSumMonry * 1 + this.commerceSurvey * 1;
            this.sumMoney = this.sumMotor * 1 + this.sumCommerce * 1;
        },

        returnCommerceMonry: function() {
            for (var i in this.commerceMoney) {
                for (var j in this.commerceMoney[i]) {
                    if (j != "name") {
                        this.commerceSumMonry += this.commerceMoney[i][j] * 1;
                    }

                }
            }

        },
        commit: function() {
            this.motorCaculate();
            this.sumCaculate();
            if (flagCommerce == 1) {
                for (var i in this.motorthreeMoney) {
                    for (var k in this.commerceMoney) {
                        if (typeof(this.commerceMoney[k][i]) != "undefined") {
                            console.log(this.commerceMoney[k][i])
                            this.commitData[i] = this.motorthreeMoney[i] * 1 + this.commerceMoney[k][i] * 1
                        }
                    }
                }
            } else {
                this.commitData = this.motorthreeMoney;
            }

            this.commitData.filing_cross_strength_sum = this.motorMoey //立案交强费用合计
            this.commitData.filing_business_sum = this.commerceSumMonry //立案商业合计
            this.commitData.filing_sum = this.sumMotorCommerceMone //立案总合计
            this.commitData.cross_strength_fee_sum = this.crossCostTotal //交强查勘费
            this.commitData.business_fee_sum = this.commerceSurvey //商业查勘费
            this.commitData.other_fee_sum = this.sumSurvey //查勘费综合
            this.commitData.cross_strength_indemnity_sum = this.sumMotor //交强总费用
            this.commitData.business_indemnity_sum = this.sumCommerce //商业总费用
            this.commitData.indemnity_sum = this.sumMoney //全部总费用
            console.log(this.commitData)
        }
    },
    computed: {
        getsumMotor: function() {
            return this.sumMotor;
        },
        getsumCommerce: function() {
            return this.sumCommerce;
        },
        getsumMoney: function() {
            return this.sumMoney;
        }
    },
})