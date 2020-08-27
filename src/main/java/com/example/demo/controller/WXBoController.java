package com.example.demo.controller;

import com.example.demo.model.Bo.WXBo;
import com.example.demo.repository.WXBoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class WXBoController {
    @Autowired
    WXBoRepository wxBoRepository;
    @GetMapping("/")
    public ModelAndView index() {
        Optional<WXBo> model = wxBoRepository.findById(1);
        WXBo           wxBo1 =new WXBo();
        wxBo1   = model.get();
        ModelAndView modelAndView =new ModelAndView("index");
        modelAndView.addObject("wxcount", wxBo1.getWxcount());
        return modelAndView;

    }
    @RequestMapping("addOne")
    public void addOne(WXBo wxBo ) {
        Optional<WXBo> model = wxBoRepository.findById(1);
        WXBo           wxBo1 =new WXBo();
        wxBo1   = model.get();
        wxBo1.setWxcount(wxBo1.getWxcount() + 1);
        wxBoRepository.save(wxBo1);
    }

}
