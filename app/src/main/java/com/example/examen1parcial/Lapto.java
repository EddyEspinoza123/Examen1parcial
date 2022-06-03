package com.example.examen1parcial;

import com.orm.SugarRecord;

// creamos entidades mendiante extends SugarRecord
public class Lapto extends SugarRecord<Lapto> {
    String Marca;
    String Ano;
    String Modelo;
    String Procesador;
    String Precio;
    //constuctor vacio
    public Lapto(String string, String toString, String s){
    }
    //constructor de actividades
    public Lapto(String Marca, String Ano, String Modelo, String Procesador,
                 String Precio){
        this.Marca = Marca;
        this.Ano = Ano;
        this.Modelo = Modelo;
        this.Procesador = Procesador;
        this.Precio = Precio;
    }
    public String getMarca() {
        return Marca;
    }
    public String getAno() {
        return Ano;
    }
    public String getModelo() {
        return Modelo;
    }
    public String getProcesador() { return Procesador;}
    public String getPrecio() { return Precio;}


}
