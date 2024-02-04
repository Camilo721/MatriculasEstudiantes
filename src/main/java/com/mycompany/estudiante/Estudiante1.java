/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiante;

/**
 *
 * @author camilo
 */
public class Estudiante1 {
    
    private int id;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private String generoEstudiante;
    
    
    public Estudiante1 (int id, String nombreEstudiante, String apellidoEstudiante, String generoEstudiante){
        
        this.id= id;
        this.nombreEstudiante= nombreEstudiante;
        this.apellidoEstudiante= apellidoEstudiante;
        this.generoEstudiante= generoEstudiante;
    }

    /**
     * @return the idEstudiante
     */
    public int getIdEstudiante() {
        return id;
    }

    /**
     * @param idEstudiante the idEstudiante to set
     */
    public void setIdEstudiante(int idEstudiante) {
        this.id = idEstudiante;
    }

    /**
     * @return the nombreEstudiante
     */
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    /**
     * @param nombreEstudiante the nombreEstudiante to set
     */
    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    /**
     * @return the apellidoEstudiante
     */
    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    /**
     * @param apellidoEstudiante the apellidoEstudiante to set
     */
    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    /**
     * @return the generoEstudiante
     */
    public String getGeneroEstudiante() {
        return generoEstudiante;
    }

    /**
     * @param generoEstudiante the generoEstudiante to set
     */
    public void setGeneroEstudiante(String generoEstudiante) {
        this.generoEstudiante = generoEstudiante;
    }
    
    
}

 