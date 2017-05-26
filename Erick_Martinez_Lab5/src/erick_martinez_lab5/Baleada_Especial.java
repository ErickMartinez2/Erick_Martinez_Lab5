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
public class Baleada_Especial extends Baleada {

    public ArrayList<String> ingrediente = new ArrayList();
    public double precio;

    public Baleada_Especial() {
        ingrediente.add("Tortilla");
        ingrediente.add("Mantequilla");
        ingrediente.add("Frijoles");
        ingrediente.add("Huevo");
        precio = 35;
    }

}
