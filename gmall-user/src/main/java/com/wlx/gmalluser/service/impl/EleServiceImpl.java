package com.wlx.gmalluser.service.impl;

import com.wlx.gmalluser.bean.Ele;
import com.wlx.gmalluser.mapper.EleMapper;
import com.wlx.gmalluser.service.EleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EleServiceImpl implements EleService {

    @Autowired
    EleMapper eleMapper;

    @Override
    public List<Ele> getAllEle() {
        List<Ele> elelist =  eleMapper.selectELe();
        return elelist;
    }
}
