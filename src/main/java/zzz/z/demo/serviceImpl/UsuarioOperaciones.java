/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zzz.z.demo.serviceImpl;

import java.util.List;

/**
 *
 * @author alarc
 * @param <U>
 */
public interface UsuarioOperaciones <U>{

    U create(U u);

    U update(U u);

    void delete(int id);

    U read(int id);

    List<U> readAll();
}
