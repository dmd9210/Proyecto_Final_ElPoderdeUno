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
    
    private String idMatricula,Nombre,ApellidoP,ApellidoM,Correo,Edad,Genero,Telefono,NivelEstudio;

    
    public Participante() {

}

    public Participante(String idMatricula, String Nombre, String ApelliodP,String ApellidoM,String Correo,String Edad,String Genero,String Telefono,String NivelEstudio){
    
        this.idMatricula=idMatricula;
        this.Nombre=Nombre;
        this.ApellidoP=ApellidoP;
        this.ApellidoM=ApellidoM;
        this.Correo=Correo;
        this.Edad=Edad;
        this.Genero=Genero;
        this.Telefono=Telefono;
        this.NivelEstudio=NivelEstudio;
    }
    public String getIdMatricula() {
        return idMatricula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getEdad() {
        return Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getNivelEstudio() {
        return NivelEstudio;
    }

    public void setIdMatricula(String idMatricula) {
        this.idMatricula = idMatricula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setNivelEstudio(String NivelEstudio) {
        this.NivelEstudio = NivelEstudio;
    }

    
    
}