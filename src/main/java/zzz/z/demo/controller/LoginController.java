/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zzz.z.demo.controller;

import zzz.z.demo.entity.Usuario;
import zzz.z.demo.serviceImpl.LoginService;
import java.util.Objects;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @Autowired
    private LoginService userService;
    
     @GetMapping("/login")
          
    public ModelAndView login() {
     ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new Usuario());
        return mav;
    }
 
    @PostMapping("/login")
    public String login(@ModelAttribute("user") Usuario user ) {
    
     Usuario oauthUser = userService.login(user.getUsername(), user.getPassword());
    
 
     System.out.print(oauthUser);
     if(Objects.nonNull(oauthUser))
     {
  
     return "redirect:/dashboard";
    
    
     } else {
     return "redirect:/login";
    
    
     }
 
}
    
    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
    
  
        return "redirect:/home";
    }
      @GetMapping("/home")
     public String zz() {
        return "home";
    }
   
      @GetMapping("/dashboard")
     public String dashboard() {
        return "dashboard";
    }
     
        @GetMapping("/success")
     public String adsasd() {
        return "success";
    }
     
}
