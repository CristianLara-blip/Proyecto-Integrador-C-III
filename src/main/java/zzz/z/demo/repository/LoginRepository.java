/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zzz.z.demo.repository;

import zzz.z.demo.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alarc
 */
@Repository
    public interface LoginRepository extends JpaRepository<Usuario, Long>{
Usuario findByUsernameAndPassword(String username, String password);
}
