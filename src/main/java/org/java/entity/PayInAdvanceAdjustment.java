package org.java.entity;

import java.util.Date;

public class PayInAdvanceAdjustment {
    private String adjustmentId;

    private String empId;

    private Date adjustmentTime;

    private String compensateCaseId;

    private Double deathAndDisability;

    private Double medicalExpense;

    private Double propertyLoss;

    private Double notDeathAndDisability;

    private Double notMedicalExpense;

    private Double notPropertyLoss;

    private Double crossStrengthSum;

    private Double businessSum;

    private Double sum;

    private Double payInAdvancePrice;

    private String instanceId;

    public String getAdjustmentId() {
        return adjustmentId;
    }

    public void setAdjustmentId(String adjustmentId) {
        this.adjustmentId = adjustmentId == null ? null : adjustmentId.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public Date getAdjustmentTime() {
        return adjustmentTime;
    }

    public void setAdjustmentTime(Date adjustmentTime) {
        this.adjustmentTime = adjustmentTime;
    }

    public String getCompensateCaseId() {
        return compensateCaseId;
    }

    public void setCompensateCaseId(String compensateCaseId) {
        this.compensateCaseId = compensateCaseId == null ? null : compensateCaseId.trim();
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

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Double getPayInAdvancePrice() {
        return payInAdvancePrice;
    }

    public void setPayInAdvancePrice(Double payInAdvancePrice) {
        this.payInAdvancePrice = payInAdvancePrice;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId == null ? null : instanceId.trim();
    }
}