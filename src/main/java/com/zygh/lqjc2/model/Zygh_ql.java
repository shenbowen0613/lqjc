package com.zygh.lqjc2.model;

public class Zygh_ql {
    private int sysid;
    private String cang;
    private String cang_num;
    private String data;
    private String housecode;

    @Override
    public String toString() {
        return "Zygh_ql{" +
                "sysid=" + sysid +
                ", cang='" + cang + '\'' +
                ", cang_num='" + cang_num + '\'' +
                ", data='" + data + '\'' +
                ", housecode='" + housecode + '\'' +
                '}';
    }

    public int getSysid() {
        return sysid;
    }

    public void setSysid(int sysid) {
        this.sysid = sysid;
    }

    public String getCang() {
        return cang;
    }

    public void setCang(String cang) {
        this.cang = cang;
    }

    public String getCang_num() {
        return cang_num;
    }

    public void setCang_num(String cang_num) {
        this.cang_num = cang_num;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHousecode() {
        return housecode;
    }

    public void setHousecode(String housecode) {
        this.housecode = housecode;
    }
}
