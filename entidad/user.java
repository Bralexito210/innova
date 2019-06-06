package com.example.david.innova.entidad;

public class user {
    private Integer dni,id, telefono,secret;
    private String nombre,appelido,correo,dir;
    private String nom_user,pass_user;

    public user(String nom_user, String pass_user) {
        this.nom_user = nom_user;
        this.pass_user = pass_user;
    }
    public user() {
    }

    public user(Integer dni, Integer id, Integer telefono, Integer secret, String nombre, String appelido, String correo, String dir, String nom_user, String pass_user) {
        this.dni = dni;
        this.id = id;
        this.telefono = telefono;
        this.secret = secret;
        this.nombre = nombre;
        this.appelido = appelido;
        this.correo = correo;
        this.dir = dir;
        this.nom_user = nom_user;
        this.pass_user = pass_user;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppelido() {
        return appelido;
    }

    public void setAppelido(String appelido) {
        this.appelido = appelido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNom_user() {
        return nom_user;
    }

    public void setNom_user(String nom_user) {
        this.nom_user = nom_user;
    }

    public String getPass_user() {
        return pass_user;
    }

    public void setPass_user(String pass_user) {
        this.pass_user = pass_user;
    }

    public Integer getSecret() {
        return secret;
    }

    public void setSecret(Integer secret) {
        this.secret = secret;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
}
