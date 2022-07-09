/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zzz.z.demo.serviceImpl;

import zzz.z.demo.entity.Usuario;

import zzz.z.demo.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alarc
 */
@Service
public class UsuarioService implements UsuarioOperaciones<Usuario> {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario create(Usuario u) {

        return usuarioRepository.save(u);
    }

    @Override
    public Usuario update(Usuario u) {
        return usuarioRepository.save(u);
    }

    @Override
    public void delete(int id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario read(int id) {
        return usuarioRepository.findById(id).get();
    }

    @Override
    public List<Usuario> readAll() {
        return usuarioRepository.findAll();
    }

}
