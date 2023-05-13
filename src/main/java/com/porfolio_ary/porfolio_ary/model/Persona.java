/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio_ary.porfolio_ary.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
    @NotNull 
    private String nombre;
    @NotNull
    private String apellido;
    private String acercaDe;
    private String titulo1;
    private String titulo2;
    private String img;
    private String cumple;
    private String telefono;
    private int edad;
    private String email;
    
}
