package com.ruslan.productosfxml.modelo;


import java.util.Date;


public class Producto {
    private Long id;
    private String nombre;
    private double precio;
    private Date fechaRegistro;
    private Categoria categoria;


    //Constructor vacio
    public Producto() {
    }
    //Constructor con todos los atributos
    public Producto(Long id, String nombre, double precio, Date fechaRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fechaRegistro = fechaRegistro;
    }
    //Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }



    @Override
    public String toString() {
        return nombre;
    }
}
