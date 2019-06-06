package com.example.david.innova.utilidades;

public class utilidades {
    //tabla user
    public static String id="id";
    public static String dni, telefono,secret;
    public static String nombre,appelido,correo,dir;
    public static String nom_user="user";
    public static String pass_user= "pass";

    public static String t_user = "Usuario";

    public static final String crear_tabla_user = "create table "+t_user+"(id PRIMARY KEY AUTOINCREMENT integer,"+nom_user+" Text,"+pass_user+" Text)";
    public static final String insert_tabla_user = "insert into "+t_user+" values("+id.toString()+" integer,"+nom_user+" Text,"+pass_user+" Text)";


}
