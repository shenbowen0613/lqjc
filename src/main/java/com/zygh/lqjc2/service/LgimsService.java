package com.zygh.lqjc2.service;


import com.zygh.lqjc2.model.Lgims;
import com.zygh.lqjc2.model.Zygh_ql;

import java.util.List;

public interface LgimsService {
    public int insertlgims(List<Lgims> lgimsList);

    public Zygh_ql Selectcang(String cang);
}
