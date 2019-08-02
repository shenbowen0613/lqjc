package com.zygh.lqjc2.model;

import java.util.List;

public class Wdz {

    private List<Lgims> lgimsList;//四层温list

    private String hight;       //最高温

    private String lowt;        //最低温

    private String avgt;        //平均温

    private String innert;      //仓内温度

    private String inh;         //仓内湿度

    public List<Lgims> getLgimsList() {
        return lgimsList;
    }

    public void setLgimsList(List<Lgims> lgimsList) {
        this.lgimsList = lgimsList;
    }

    public String getHight() {
        return hight;
    }

    public void setHight(String hight) {
        this.hight = hight;
    }

    public String getLowt() {
        return lowt;
    }

    public void setLowt(String lowt) {
        this.lowt = lowt;
    }

    public String getAvgt() {
        return avgt;
    }

    public void setAvgt(String avgt) {
        this.avgt = avgt;
    }

    public String getInnert() {
        return innert;
    }

    public void setInnert(String innert) {
        this.innert = innert;
    }

    public String getInh() {
        return inh;
    }

    public void setInh(String inh) {
        this.inh = inh;
    }

    @Override
    public String toString() {
        return "Wdz{" +
                "lgimsList=" + lgimsList +
                ", hight='" + hight + '\'' +
                ", lowt='" + lowt + '\'' +
                ", avgt='" + avgt + '\'' +
                ", innert='" + innert + '\'' +
                ", inh='" + inh + '\'' +
                '}';
    }
}
