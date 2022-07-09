/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zzz.z.demo.serviceImpl;

import zzz.z.demo.entity.Usuario;
import zzz.z.demo.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alarc
 */
@Service
public class LoginService {
    @Autowired
private LoginRepository repo;
  
  public Usuario login(String username, String password) {
  Usuario user = repo.findByUsernameAndPassword(username, password);
   return user;
  }
}
