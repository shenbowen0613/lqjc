package com.zygh.lqjc2.service.serviceImp;


import com.zygh.lqjc2.dao.LgimsMapper;
import com.zygh.lqjc2.model.Lgims;
import com.zygh.lqjc2.model.Zygh_ql;
import com.zygh.lqjc2.service.LgimsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LgimsServiceImp implements LgimsService {

    @Autowired
    private LgimsMapper lgimsMapper;

    public int insertlgims(List<Lgims> lgimsList){
        return lgimsMapper.insertlgims(lgimsList);
    }

    @Override
    public Zygh_ql Selectcang(String cang) {
        return lgimsMapper.Selectcang(cang);
    }
}
