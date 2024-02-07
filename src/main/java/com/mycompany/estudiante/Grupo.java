/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiante;

/**
 *
 * @author camilo
 */
public class Grupo {
    
    private int id;
    private int cantidadEstudiantes;
    
    public Grupo(int id, int cantidadEstudiantes){
        
        this.id= id;
        this.cantidadEstudiantes= cantidadEstudiantes;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cantidadEstudiantes
     */
    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    /**
     * @param cantidadEstudiantes the cantidadEstudiantes to set
     */
    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

  
}
