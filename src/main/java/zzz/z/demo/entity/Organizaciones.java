package zzz.z.demo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

/**
 *
 * @author admin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "organizaciones")
@Entity

public class Organizaciones implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idorganizaciones")
    @Id
    private int id;
    @Column(unique = true)
    private String nombre;
    private String direccion;

}
