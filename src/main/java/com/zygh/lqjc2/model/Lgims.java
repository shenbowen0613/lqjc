package com.zygh.lqjc2.model;

public class Lgims {
    private String no;
    private String housecode;
    private String housename;
    private String archivesno;
    private String deviceno;
    private String checktime;
    private String checkkind;
    private int xaxis;
    private int yaxis;
    private int storey;
    private String data;
    private String reportno;
    private String resultcode;
    private String resultname;
    private String statuscode;
    private String statusname;
    private int dtstate;
    private String crtime;
    private String uptime;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getHousecode() {
        return housecode;
    }

    public void setHousecode(String housecode) {
        this.housecode = housecode;
    }

    public String getHousename() {
        return housename;
    }

    public void setHousename(String housename) {
        this.housename = housename;
    }

    public String getArchivesno() {
        return archivesno;
    }

    public void setArchivesno(String archivesno) {
        this.archivesno = archivesno;
    }

    public String getDeviceno() {
        return deviceno;
    }

    public void setDeviceno(String deviceno) {
        this.deviceno = deviceno;
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime;
    }

    public String getCheckkind() {
        return checkkind;
    }

    public void setCheckkind(String checkkind) {
        this.checkkind = checkkind;
    }

    public int getXaxis() {
        return xaxis;
    }

    public void setXaxis(int xaxis) {
        this.xaxis = xaxis;
    }

    public int getYaxis() {
        return yaxis;
    }

    public void setYaxis(int yaxis) {
        this.yaxis = yaxis;
    }

    public int getStorey() {
        return storey;
    }

    public void setStorey(int storey) {
        this.storey = storey;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getReportno() {
        return reportno;
    }

    public void setReportno(String reportno) {
        this.reportno = reportno;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getResultname() {
        return resultname;
    }

    public void setResultname(String resultname) {
        this.resultname = resultname;
    }

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }

    public int getDtstate() {
        return dtstate;
    }

    public void setDtstate(int dtstate) {
        this.dtstate = dtstate;
    }

    public String getCrtime() {
        return crtime;
    }

    public void setCrtime(String crtime) {
        this.crtime = crtime;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    @Override
    public String toString() {
        return "Lgims{" +
                "no='" + no + '\'' +
                ", housecode='" + housecode + '\'' +
                ", housename='" + housename + '\'' +
                ", archivesno='" + archivesno + '\'' +
                ", deviceno='" + deviceno + '\'' +
                ", checktime='" + checktime + '\'' +
                ", checkkind='" + checkkind + '\'' +
                ", xaxis=" + xaxis +
                ", yaxis=" + yaxis +
                ", storey=" + storey +
                ", data='" + data + '\'' +
                ", reportno='" + reportno + '\'' +
                ", resultcode='" + resultcode + '\'' +
                ", resultname='" + resultname + '\'' +
                ", statuscode='" + statuscode + '\'' +
                ", statusname='" + statusname + '\'' +
                ", dtstate=" + dtstate +
                ", crtime='" + crtime + '\'' +
                ", uptime='" + uptime + '\'' +
                '}';
    }
}
