package com.zygh.lqjc2.model;

public class Lgi {
    private String no;                             //线缆编号
    private String orgcode;                        //所属粮库编号*
    private String orgname;                        //所属粮库名称
    private String housecode;                      //仓房编号*
    private String housename;                      //仓房名称*
    private String archivesno;                     //储粮档案编号*
    private String inspectiontno;                  //温度检测编码*
    private int ht;                                //最高温度
    private int lt;                                //最低温度
    private int at;                                //平均温度
    private int innert;                            //仓内空气温度
    private int outt;                              //仓外空气温度
    private String inspectionhno;                  //湿度检测编码*
    private int hh;                                //最高湿度
    private int lh;                                //最低湿度
    private int ah;                                //平均湿度
    private int inh;                               //仓内空气湿度
    private int outh;                              //仓外空气湿度
    private String inspectionpestno;               //虫害检测编码*
    private String pestkind;                       //害虫种类*
    private int pestdensity;                       //害虫密度（头/公斤）
    private String mainpestname;                   //主要害虫名称*
    private int mainpestdensity;                   //主要害虫密度（头/公斤）
    private String pestgraingrade;                 //虫粮等级*
    private String inspectionairno;                //气体检测编码*
    private int oxygenconcentration;               //氧气浓度
    private int co2concentration;                  //二氧化碳浓度
    private int phosphineconcentration;            //磷化氢浓度
    private int nitrogenconcentration;             //氮气浓度
    private String reportno;                       //报备编号*
    private String resultcode;                     //检测结果编码:001/002/003*
    private String resultname;                     //测测结果名称：测温成功/测温失败/测试异常*
    private String statuscode;                     //分析结果编码：001/002/003*
    private String statusname;                     //分析结果名称：正常/高温/异常*
    private int dtstate;                           //@数据状态：1启用，0停用
    private String crtime;                         //创建时间*
    private String uptime;                         //更新时间*
}
