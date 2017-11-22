/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Diego
 */
public class Participante {
    
    private String idMatricula,nombre,apellidoP,apellidoM,correo,edad,genero,telefono,nivelEstudio;
   

    
    public Participante() {

}

    public Participante(String idMatricula, String nombre, String apellidoP,String apellidoM,String correo,String edad,String genero,String telefono,String nivelEstudio){
    
        this.idMatricula=idMatricula;
        this.nombre=nombre;
        this.apellidoP=apellidoP;
        this.apellidoM=apellidoM;
        this.correo=correo;
        this.edad=edad;
        this.genero=genero;
        this.telefono=telefono;
        this.nivelEstudio=nivelEstudio;
    }
    public String getidMatricula() {
        return idMatricula;
    }

    public String getnombre() {
        return nombre;
    }

    public String getapellidoP() {
        return apellidoP;
    }

    public String getapellidoM() {
        return apellidoM;
    }

    public String getcorreo() {
        return correo;
    }

    public String getedad() {
        return edad;
    }

    public String getgenero() {
        return genero;
    }

    public String gettelefono() {
        return telefono;
    }

    public String getnivelEstudio() {
        return nivelEstudio;
    }

    public void setidMatricula(String idMatricula) {
        this.idMatricula = idMatricula;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setapellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public void setapellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public void setcorreo(String correo) {
        this.correo = correo;
    }

    public void setedad(String edad) {
        this.edad = edad;
    }

    public void setgenero(String genero) {
        this.genero = genero;
    }

    public void settelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setnivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    
    
}