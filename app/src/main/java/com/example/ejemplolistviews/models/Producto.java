package com.example.ejemplolistviews.models;

public class Producto {
    private int id;
    private String nombre;
    private  float precio;
    private String barcade;
    private int imagen;

    public Producto(int id, String nombre, float precio, String barcade, int imagen) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.barcade = barcade;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getBarcade() {
        return barcade;
    }

    public void setBarcade(String barcade) {
        this.barcade = barcade;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
