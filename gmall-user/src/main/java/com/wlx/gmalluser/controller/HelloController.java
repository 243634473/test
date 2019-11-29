package com.wlx.gmalluser.controller;

import com.wlx.gmalluser.bean.Ele;
import com.wlx.gmalluser.service.EleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    EleService eleService;

    @RequestMapping("/getHello")
    @ResponseBody
    public String getHello(){
        return "hellow word!";
    }

    @RequestMapping("/getAllEle")
    @ResponseBody
    public List<Ele> getAllEle(){
       List<Ele> eleList =  eleService.getAllEle();
        return eleList;
    }
}
