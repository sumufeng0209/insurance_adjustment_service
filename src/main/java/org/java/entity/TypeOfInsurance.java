package org.java.entity;

public class TypeOfInsurance {
    private String insuranceId;

    private String insuranceName;

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId == null ? null : insuranceId.trim();
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName == null ? null : insuranceName.trim();
    }
}