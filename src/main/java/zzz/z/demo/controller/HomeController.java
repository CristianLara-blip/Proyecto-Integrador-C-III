package zzz.z.demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {

    @GetMapping("/login")
    public String login(Model model, @AuthenticationPrincipal User user) { 
        return "login";
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("titulo", "Bienvenido a Thymeleaf");
        return "index";
    }
    
     @GetMapping("/register")
    public String register() {
        return "registrar";

    }
    
    @GetMapping("/perfil")
    public String perfil() {
        return "perfil";

    }
    
   

    @GetMapping("/user")
    public String usuarios() {
        return "usuarios/usuarios";

    }
    
     @GetMapping("/subgerencia")
    public String subgerencia() {
        return "subgerencia/subgerencia";

    }
    
    @GetMapping("/mesa")
    public String mesa() {
        return "mesa/mesa";

    }
    
    @GetMapping("/gerencia")
    public String gerencia() {
        return "gerencia/gerencia";

    }
    
    
  
}
