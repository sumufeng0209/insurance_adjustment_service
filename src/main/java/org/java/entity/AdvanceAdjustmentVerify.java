package org.java.entity;

import java.util.Date;

public class AdvanceAdjustmentVerify {
    private String verifyId;

    private String adjustmentId;

    private String empId;

    private Date adjustmentTime;

    private String isAdopt;

    private String adjustmentComment;

    private String instanceId;

    public String getVerifyId() {
        return verifyId;
    }

    public void setVerifyId(String verifyId) {
        this.verifyId = verifyId == null ? null : verifyId.trim();
    }

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

    public String getIsAdopt() {
        return isAdopt;
    }

    public void setIsAdopt(String isAdopt) {
        this.isAdopt = isAdopt == null ? null : isAdopt.trim();
    }

    public String getAdjustmentComment() {
        return adjustmentComment;
    }

    public void setAdjustmentComment(String adjustmentComment) {
        this.adjustmentComment = adjustmentComment == null ? null : adjustmentComment.trim();
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId == null ? null : instanceId.trim();
    }
}