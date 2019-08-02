package com.zygh.lqjc2.dao;

import com.zygh.lqjc2.model.Lgims;
import com.zygh.lqjc2.model.Zygh_ql;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LgimsMapper {
    public int insertlgims(List<Lgims> lgimsList);


    public Zygh_ql Selectcang(String cang);
}
