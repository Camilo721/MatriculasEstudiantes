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
    private int idProfesor;
    private int idMateria;
    private int cantidadEstudiantes;
    
    public Grupo(int id, int idProfesor, int idMateria, int cantidadEstudiantes){
        
        this.id= id;
        this.idProfesor= idProfesor;
        this.idMateria= idMateria;
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
     * @return the idProfesor
     */
    public int getIdProfesor() {
        return idProfesor;
    }

    /**
     * @param idProfesor the idProfesor to set
     */
    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    /**
     * @return the idMateria
     */
    public int getIdMateria() {
        return idMateria;
    }

    /**
     * @param idMateria the idMateria to set
     */
    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
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
