package org.java.entity;

import java.util.Date;

public class ComprehensiveAdjustmentVerify {
    private String verifyId;

    private String empId;

    private Date verifyTime;

    private String isAdopt;

    private String verifyComment;

    private String adjustmentId;

    private Double crossStrengthSum;

    private Double businessSum;

    private Double sum;

    private String instanceId;

    public String getVerifyId() {
        return verifyId;
    }

    public void setVerifyId(String verifyId) {
        this.verifyId = verifyId == null ? null : verifyId.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    public String getIsAdopt() {
        return isAdopt;
    }

    public void setIsAdopt(String isAdopt) {
        this.isAdopt = isAdopt == null ? null : isAdopt.trim();
    }

    public String getVerifyComment() {
        return verifyComment;
    }

    public void setVerifyComment(String verifyComment) {
        this.verifyComment = verifyComment == null ? null : verifyComment.trim();
    }

    public String getAdjustmentId() {
        return adjustmentId;
    }

    public void setAdjustmentId(String adjustmentId) {
        this.adjustmentId = adjustmentId == null ? null : adjustmentId.trim();
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

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId == null ? null : instanceId.trim();
    }
}