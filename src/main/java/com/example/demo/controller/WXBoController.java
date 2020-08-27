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
        Optional<WXBo> mode2 = wxBoRepository.findById(2);
        Optional<WXBo> mode3 = wxBoRepository.findById(3);
        Optional<WXBo> mode4 = wxBoRepository.findById(4);
        WXBo           wxBo1 =new WXBo();
        WXBo           wxBo2 =new WXBo();
        WXBo           wxBo3 =new WXBo();
        WXBo           wxBo4 =new WXBo();
        wxBo1   = model.get();
        wxBo2   = model.get();
        wxBo3   = model.get();
        wxBo4   = model.get();
        ModelAndView modelAndView =new ModelAndView("index");
        modelAndView.addObject("wxcount1", wxBo1.getWxcount());
        modelAndView.addObject("wxcount2", wxBo2.getWxcount());
        modelAndView.addObject("wxcount3", wxBo3.getWxcount());
        modelAndView.addObject("wxcount4", wxBo4.getWxcount());
        return modelAndView;

    }
    @RequestMapping("add1")
    public void add1(WXBo wxBo ) {
        Optional<WXBo> model = wxBoRepository.findById(1);
        WXBo           wxBo1 =new WXBo();
        wxBo1   = model.get();
        wxBo1.setWxcount(wxBo1.getWxcount() + 1);
        wxBoRepository.save(wxBo1);
    }
    @RequestMapping("add2")
    public void add2(WXBo wxBo ) {
        Optional<WXBo> model = wxBoRepository.findById(2);
        WXBo           wxBo1 =new WXBo();
        wxBo1   = model.get();
        wxBo1.setWxcount(wxBo1.getWxcount() + 1);
        wxBoRepository.save(wxBo1);
    }
    @RequestMapping("add3")
    public void add3(WXBo wxBo ) {
        Optional<WXBo> model = wxBoRepository.findById(2);
        WXBo           wxBo1 =new WXBo();
        wxBo1   = model.get();
        wxBo1.setWxcount(wxBo1.getWxcount() + 1);
        wxBoRepository.save(wxBo1);
    }
    @RequestMapping("add4")
    public void add4(WXBo wxBo ) {
        Optional<WXBo> model = wxBoRepository.findById(2);
        WXBo           wxBo1 =new WXBo();
        wxBo1   = model.get();
        wxBo1.setWxcount(wxBo1.getWxcount() + 1);
        wxBoRepository.save(wxBo1);
    }
}
