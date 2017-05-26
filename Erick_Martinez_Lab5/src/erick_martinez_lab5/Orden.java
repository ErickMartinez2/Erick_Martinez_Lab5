/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erick_martinez_lab5;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Orden {
    public int numero;
    public Cliente c;
    public String hora;
    public Date fecha;

    public Orden() {
    }

    public Orden(int numero, Cliente c, String hora, Date fecha) {
        this.numero = numero;
        this.c = c;
        this.hora = hora;
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
