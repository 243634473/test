package com.wlx.gmalluser.bean;

import java.util.Date;

public class Ele {
    private String Total;
    private Date CreateTime;
    private String SuccessTotal;
    private String ReField1;
    private String ReField2;
    private String ReField3;
    private String ReField4;
    private String ReField5;
    private String id;

    public Ele() {
    }

    @Override
    public String toString() {
        return "Ele{" +
                "Total='" + Total + '\'' +
                ", CreateTime=" + CreateTime +
                ", SuccessTotal='" + SuccessTotal + '\'' +
                ", ReField1='" + ReField1 + '\'' +
                ", ReField2='" + ReField2 + '\'' +
                ", ReField3='" + ReField3 + '\'' +
                ", ReField4='" + ReField4 + '\'' +
                ", ReField5='" + ReField5 + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }

    public String getSuccessTotal() {
        return SuccessTotal;
    }

    public void setSuccessTotal(String successTotal) {
        SuccessTotal = successTotal;
    }

    public String getReField1() {
        return ReField1;
    }

    public void setReField1(String reField1) {
        ReField1 = reField1;
    }

    public String getReField2() {
        return ReField2;
    }

    public void setReField2(String reField2) {
        ReField2 = reField2;
    }

    public String getReField3() {
        return ReField3;
    }

    public void setReField3(String reField3) {
        ReField3 = reField3;
    }

    public String getReField4() {
        return ReField4;
    }

    public void setReField4(String reField4) {
        ReField4 = reField4;
    }

    public String getReField5() {
        return ReField5;
    }

    public void setReField5(String reField5) {
        ReField5 = reField5;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
