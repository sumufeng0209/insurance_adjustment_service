package org.java.entity;

import java.util.Date;

public class ComprehensiveAdjustment {
    private String adjustmentId;

    private String compensateCaseId;

    private String isTotalLoss;

    private Double liabilityOdds;

    private Double newCarPrice;

    private Double residualValue;

    private Double deathAndDisability;

    private Double medicalExpense;

    private Double propertyLoss;

    private Double notDeathAndDisability;

    private Double notMedicalExpense;

    private Double notPropertyLoss;

    private Double otherFee;

    private Double notOtherFee;

    private String empId;

    private Double crossStrengthSum;

    private Double businessSum;

    private Double adjustmentSum;

    private Double crossStrengthFeeSum;

    private Double businessFeeSum;

    private Double otherFeeSum;

    private Double actualPrice;

    private Date adjustmentTime;

    private String explanationOfCalculation;

    private String instanceId;

    public String getAdjustmentId() {
        return adjustmentId;
    }

    public void setAdjustmentId(String adjustmentId) {
        this.adjustmentId = adjustmentId == null ? null : adjustmentId.trim();
    }

    public String getCompensateCaseId() {
        return compensateCaseId;
    }

    public void setCompensateCaseId(String compensateCaseId) {
        this.compensateCaseId = compensateCaseId == null ? null : compensateCaseId.trim();
    }

    public String getIsTotalLoss() {
        return isTotalLoss;
    }

    public void setIsTotalLoss(String isTotalLoss) {
        this.isTotalLoss = isTotalLoss == null ? null : isTotalLoss.trim();
    }

    public Double getLiabilityOdds() {
        return liabilityOdds;
    }

    public void setLiabilityOdds(Double liabilityOdds) {
        this.liabilityOdds = liabilityOdds;
    }

    public Double getNewCarPrice() {
        return newCarPrice;
    }

    public void setNewCarPrice(Double newCarPrice) {
        this.newCarPrice = newCarPrice;
    }

    public Double getResidualValue() {
        return residualValue;
    }

    public void setResidualValue(Double residualValue) {
        this.residualValue = residualValue;
    }

    public Double getDeathAndDisability() {
        return deathAndDisability;
    }

    public void setDeathAndDisability(Double deathAndDisability) {
        this.deathAndDisability = deathAndDisability;
    }

    public Double getMedicalExpense() {
        return medicalExpense;
    }

    public void setMedicalExpense(Double medicalExpense) {
        this.medicalExpense = medicalExpense;
    }

    public Double getPropertyLoss() {
        return propertyLoss;
    }

    public void setPropertyLoss(Double propertyLoss) {
        this.propertyLoss = propertyLoss;
    }

    public Double getNotDeathAndDisability() {
        return notDeathAndDisability;
    }

    public void setNotDeathAndDisability(Double notDeathAndDisability) {
        this.notDeathAndDisability = notDeathAndDisability;
    }

    public Double getNotMedicalExpense() {
        return notMedicalExpense;
    }

    public void setNotMedicalExpense(Double notMedicalExpense) {
        this.notMedicalExpense = notMedicalExpense;
    }

    public Double getNotPropertyLoss() {
        return notPropertyLoss;
    }

    public void setNotPropertyLoss(Double notPropertyLoss) {
        this.notPropertyLoss = notPropertyLoss;
    }

    public Double getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(Double otherFee) {
        this.otherFee = otherFee;
    }

    public Double getNotOtherFee() {
        return notOtherFee;
    }

    public void setNotOtherFee(Double notOtherFee) {
        this.notOtherFee = notOtherFee;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public Double getCrossStrengthSum() {
        return crossStrengthSum;
    }

    public void setCrossStrengthSum(Double crossStrengthSum) {
        this.crossStrengthSum = crossStrengthSum;
    }

    public Double getBusinessSum() {
        return businessSum;
    }

    public void setBusinessSum(Double businessSum) {
        this.businessSum = businessSum;
    }

    public Double getAdjustmentSum() {
        return adjustmentSum;
    }

    public void setAdjustmentSum(Double adjustmentSum) {
        this.adjustmentSum = adjustmentSum;
    }

    public Double getCrossStrengthFeeSum() {
        return crossStrengthFeeSum;
    }

    public void setCrossStrengthFeeSum(Double crossStrengthFeeSum) {
        this.crossStrengthFeeSum = crossStrengthFeeSum;
    }

    public Double getBusinessFeeSum() {
        return businessFeeSum;
    }

    public void setBusinessFeeSum(Double businessFeeSum) {
        this.businessFeeSum = businessFeeSum;
    }

    public Double getOtherFeeSum() {
        return otherFeeSum;
    }

    public void setOtherFeeSum(Double otherFeeSum) {
        this.otherFeeSum = otherFeeSum;
    }

    public Double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(Double actualPrice) {
        this.actualPrice = actualPrice;
    }

    public Date getAdjustmentTime() {
        return adjustmentTime;
    }

    public void setAdjustmentTime(Date adjustmentTime) {
        this.adjustmentTime = adjustmentTime;
    }

    public String getExplanationOfCalculation() {
        return explanationOfCalculation;
    }

    public void setExplanationOfCalculation(String explanationOfCalculation) {
        this.explanationOfCalculation = explanationOfCalculation == null ? null : explanationOfCalculation.trim();
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId == null ? null : instanceId.trim();
    }
}