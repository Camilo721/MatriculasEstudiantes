/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiante;

/**
 *
 * @author camilo
 */
public class Profesor {
    
    private int id;
    private String nombreProfesor;
    private String apellidoProfesor;
    private String generoProfesor;
    private String area;
    
    public Profesor(int id, String nombreProfesor, String apellidoProfesor, String generoProfesor, String area){
        
        this.id= id;
        this.nombreProfesor= nombreProfesor;
        this.apellidoProfesor= apellidoProfesor;
        this.generoProfesor= generoProfesor;
        this.area= area;
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
     * @return the nombreProfesor
     */
    public String getNombreProfesor() {
        return nombreProfesor;
    }

    /**
     * @param nombreProfesor the nombreProfesor to set
     */
    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    /**
     * @return the apellidoProfesor
     */
    public String getApellidoProfesor() {
        return apellidoProfesor;
    }

    /**
     * @param apellidoProfesor the apellidoProfesor to set
     */
    public void setApellidoProfesor(String apellidoProfesor) {
        this.apellidoProfesor = apellidoProfesor;
    }

    /**
     * @return the generoProfesor
     */
    public String getGeneroProfesor() {
        return generoProfesor;
    }

    /**
     * @param generoProfesor the generoProfesor to set
     */
    public void setGeneroProfesor(String generoProfesor) {
        this.generoProfesor = generoProfesor;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }
}
