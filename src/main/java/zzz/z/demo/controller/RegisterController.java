/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zzz.z.demo.controller;

import zzz.z.demo.entity.Usuario;

import zzz.z.demo.serviceImpl.UsuarioService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author alarc
 */
@Controller
@RequestMapping("/reg")
public class RegisterController {

    @Autowired
    private UsuarioService usuarioservice;

    @GetMapping("/form")
    public String createCate(Model model) {
        model.addAttribute("titulo", "Registrar Usuario");
        model.addAttribute("usuario", new Usuario());
        return "register";
    }

    @PostMapping("/add")
    public String saveCate(@Valid @ModelAttribute Usuario cat, BindingResult result, Model model, RedirectAttributes attributes) {
        usuarioservice.create(cat);
        //model.addAttribute("categorias", categoriaService.readAll());
        return "redirect:/success";
    }
}
