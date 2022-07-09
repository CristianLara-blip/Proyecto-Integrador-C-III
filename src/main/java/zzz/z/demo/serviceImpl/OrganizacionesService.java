/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zzz.z.demo.serviceImpl;

import zzz.z.demo.entity.Organizaciones;
import zzz.z.demo.repository.OrganizacionesRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizacionesService implements Operaciones<Organizaciones> {

    @Autowired
    private OrganizacionesRepository organizacionesRepository;

    @Override
    public Organizaciones create(Organizaciones o) {
        return organizacionesRepository.save(o);
    }

    @Override
    public Organizaciones update(Organizaciones o) {
        return organizacionesRepository.save(o);
    }

    @Override
    public void delete(int id) {
        organizacionesRepository.deleteById(id);
    }

    @Override
    public Organizaciones read(int id) {
        return organizacionesRepository.findById(id).get();
    }

    @Override
    public List<Organizaciones> readAll() {
        return organizacionesRepository.findAll();
    }

}
