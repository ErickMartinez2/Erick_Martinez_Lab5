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
public class Baleada_Reloaded extends Baleada {

    public ArrayList<String> ingrediente = new ArrayList();
    public double precio;

    public Baleada_Reloaded() {
        ingrediente.add("Tortilla");
        ingrediente.add("Mantequilla");
        ingrediente.add("Frijoles");
        ingrediente.add("Huevo");
        ingrediente.add("Platano");
        precio = 55;
    }

    public ArrayList<String> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(ArrayList<String> ingrediente) {
        this.ingrediente = ingrediente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Baleada Reloaded";
    }
}
