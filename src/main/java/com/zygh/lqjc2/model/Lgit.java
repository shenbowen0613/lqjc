package com.zygh.lqjc2.model;

public class Lgit {
    private String no;				//线缆编号
    private String orgcode;			//所属粮库编号
    private String orgname;			//所属粮库名称
    private String housecode;		//仓房编号
    private String housename;		//仓房名称
    private String archivesno;		//储粮档案编号
    private String deviceno;		//设备编号
    private int ht;				//最高温度
    private int lt;				//最低温度
    private int at;				//平均温度
    private int innert;			//仓内空气温度
    private int outt;			//仓外空气温度
    private String checktime;		//检测时间：YYYYMMDDHHmmss
    private String operatorname;	//检测人名称
    private String reportno;		//报备编号
    private String resultcode;		//检测结果编码:001/002/003
    private String resultname;		//测测结果名称：测温成功/测温失败/测试异常
    private String statuscode;		//分析结果编码：001/002/003
    private String statusname;		//分析结果名称：正常/高温/异常
    private int dtstate;			//@数据状态：1启用，0停用
    private String crtime;			//创建时间
    private String uptime;			//更新时间

    @Override
    public String toString() {
        return "Lgit{" +
                "no='" + no + '\'' +
                ", orgcode='" + orgcode + '\'' +
                ", orgname='" + orgname + '\'' +
                ", housecode='" + housecode + '\'' +
                ", housename='" + housename + '\'' +
                ", archivesno='" + archivesno + '\'' +
                ", deviceno='" + deviceno + '\'' +
                ", ht=" + ht +
                ", lt=" + lt +
                ", at=" + at +
                ", innert=" + innert +
                ", outt=" + outt +
                ", checktime='" + checktime + '\'' +
                ", operatorname='" + operatorname + '\'' +
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

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
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

    public int getHt() {
        return ht;
    }

    public void setHt(int ht) {
        this.ht = ht;
    }

    public int getLt() {
        return lt;
    }

    public void setLt(int lt) {
        this.lt = lt;
    }

    public int getAt() {
        return at;
    }

    public void setAt(int at) {
        this.at = at;
    }

    public int getInnert() {
        return innert;
    }

    public void setInnert(int innert) {
        this.innert = innert;
    }

    public int getOutt() {
        return outt;
    }

    public void setOutt(int outt) {
        this.outt = outt;
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
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
}
