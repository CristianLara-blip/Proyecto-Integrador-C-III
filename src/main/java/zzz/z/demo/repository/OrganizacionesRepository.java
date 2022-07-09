
package zzz.z.demo.repository;


import zzz.z.demo.entity.Organizaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */
@Repository
public interface OrganizacionesRepository extends JpaRepository<Organizaciones, Integer>{
    
}
