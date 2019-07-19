package org.java.entity;

import java.util.Date;

public class AdvanceAdjustment {
    private String adjustmentId;

    private String empId;

    private Date adjustmentTime;

    private String compensateCaseId;

    private String itemId;

    private Double advancePrice;

    private String advanceReason;

    private String advanceDetails;

    private Double crossStrengthFeeSum;

    private Double businessFeeSum;

    private Double otherFeeSum;

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

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public Double getAdvancePrice() {
        return advancePrice;
    }

    public void setAdvancePrice(Double advancePrice) {
        this.advancePrice = advancePrice;
    }

    public String getAdvanceReason() {
        return advanceReason;
    }

    public void setAdvanceReason(String advanceReason) {
        this.advanceReason = advanceReason == null ? null : advanceReason.trim();
    }

    public String getAdvanceDetails() {
        return advanceDetails;
    }

    public void setAdvanceDetails(String advanceDetails) {
        this.advanceDetails = advanceDetails == null ? null : advanceDetails.trim();
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

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId == null ? null : instanceId.trim();
    }
}