/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zzz.z.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author alarc
 */
@Controller
@RequestMapping("/dashboard")
public class DashboardController {
  @GetMapping("/registraro")
    public String zzz() {
        
        return "registraro";
    }
    
    @GetMapping("/actualizaro")
    public String aaa() {
        
        return "actualizaro";
    }
     @GetMapping("/settings")
    public String asdadsa() {
        
        return "settings";
    }
}