package com.exam.sbb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    int increaseNo = -1;

    @RequestMapping("/sbb")
    //아래 함수의 리턴값을 그대로 브라우저에 표시
    //아래 함수의 리턴값을 문자열(String)화 해서 브라우저에 표시
    @ResponseBody
    public String index(){
        return "안녕하세요~";
    }

    @GetMapping("/plus")
    @ResponseBody
    public int showPlus(int a, int b){
        return a+b;
    }

    @GetMapping("/minus")
    @ResponseBody
    public int showMinus(@RequestParam(defaultValue = "0")int a, int b){
        return a-b;
    }

    @GetMapping("/increase")
    @ResponseBody
    public int showIncrease(){
        increaseNo++;
        return increaseNo;
    }
}
