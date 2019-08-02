package com.zygh.lqjc2.controller;


import com.zygh.lqjc2.model.Lgims;
import com.zygh.lqjc2.model.Wdz;
import com.zygh.lqjc2.model.Zygh_ql;
import com.zygh.lqjc2.service.LgimsService;
import com.zygh.lqjc2.tool.Lqcj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LgimsController {

    @Autowired
    private LgimsService lgimsService;

    @GetMapping("/cjlq")
    public Wdz insertlgims(String cang) throws InterruptedException {
        Zygh_ql  json=  lgimsService.Selectcang(cang);
        Wdz wdz=null;
        if(json!=null){
            wdz=Lqcj.get4data(json);
        }
        return wdz;
    }
}
