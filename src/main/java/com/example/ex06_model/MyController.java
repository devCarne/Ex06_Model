package com.example.ex06_model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    @RequestMapping("/")
    public @ResponseBody
    String root() {
        return "Model & View, Form Data 전달받기";
    }

    @RequestMapping("/test1")
    public String test1(Model model) {
        model.addAttribute("name", "홍길동");

        return "test1";
    }

    @RequestMapping("/mv")
    public ModelAndView test2() {
        //데이터와 뷰를 동시에 설정 가능
        ModelAndView mv = new ModelAndView();

        List<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");

        mv.addObject("list", list);
        mv.addObject("ObjectTest", "테스트입니다.");
        mv.addObject("name", "홍길동");
        mv.setViewName("view/myView");

        return mv;
    }

    @RequestMapping("/formTest1")
    public String formTest(HttpServletRequest req, Model model) {
        String id = req.getParameter("id");
        String name = req.getParameter("name");

        model.addAttribute("id", id);
        model.addAttribute("name", name);

        return "formTest1";
    }

    @RequestMapping("/formTest2")
    public String formTest2(@RequestParam("id") String id, @RequestParam("name") String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);

        return "formTest2";
    }

    @RequestMapping("/formTest3")
    public String formTest3(Member member, Model model) {
        return "formTest3";
    }
}
