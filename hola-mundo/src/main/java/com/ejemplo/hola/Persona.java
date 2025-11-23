package com.ejemplo.hola;

public class Persona {
    //Atributos (Características de la persona)
    private String nombre;
    private int edad;
    private double altura;
    private boolean estudiante;
    private char genero;

    //Constructor (se ejecuta al crear el objeto)
    public Persona(String nombre, int edad, double altura, boolean estudiante, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.estudiante = estudiante;
        this.genero = genero;
    }
    //Getters (Método para acceder y leer los atributos)
    public String getNombre() {
        return this.nombre;
    }
    public int getedad() {
        return this.edad;
    }
    public double getAltura() {
        return this.altura;
    }
    public boolean getestudiante() {
        return this.estudiante;
    }
    public char getGenero() {
        return this.genero;
    }

    //Setters (Métodos para modificar los atributos)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setEstudiante(boolean estudiante) {
        this.estudiante = estudiante;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
}
