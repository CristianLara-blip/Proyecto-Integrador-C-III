/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zzz.z.demo.serviceImpl;

import java.util.List;

/**
 *
 * @author admin
 * @param <O>
 */
public interface Operaciones <O> {
    O create(O o);
    O update(O o);
    void delete(int id);
    O read(int id);
    List<O> readAll();
}
