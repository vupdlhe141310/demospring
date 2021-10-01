package com.firstgroup.GUI;


import com.firstgroup.BLL.SinhvienService;
import com.firstgroup.DAL.entity.Sinhvien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SinhvienController {
    @Autowired private SinhvienService service;

    @GetMapping("/student")
    public  String showListing(Model model){
        List<Sinhvien> listSV = service.listAll();
        model.addAttribute("listSV",listSV);
        return "student";
    }
}
