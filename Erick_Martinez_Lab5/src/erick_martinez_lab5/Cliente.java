/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erick_martinez_lab5;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Cliente {
    public String nombre;
    public String numero;
    public int dinero;
    public String direccion;
    public ArrayList<Baleada> baleada = new ArrayList();

    public Cliente() {
    }

    public Cliente(String nombre, String numero, int dinero, String direccion) {
        this.nombre = nombre;
        this.numero = numero;
        this.dinero = dinero;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Baleada> getBaleada() {
        return baleada;
    }

    public void setBaleada(ArrayList<Baleada> baleada) {
        this.baleada = baleada;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
