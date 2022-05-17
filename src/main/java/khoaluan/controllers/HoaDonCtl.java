package khoaluan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = {"api/"})
public class HoaDonCtl {

}
