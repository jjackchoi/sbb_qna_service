package com.exam.sbb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/sbb")
    //아래 함수의 리턴값을 그대로 브라우저에 표시
    //아래 함수의 리턴값을 문자열(String)화 해서 브라우저에 표시
    @ResponseBody
    public String index(){
        return "안녕하세요~";
    }

}
