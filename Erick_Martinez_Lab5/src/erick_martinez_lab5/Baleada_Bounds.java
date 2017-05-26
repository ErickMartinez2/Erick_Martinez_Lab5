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
public class Baleada_Bounds extends Baleada {

    public ArrayList<String> ingrediente = new ArrayList();
    public double precio;

    public Baleada_Bounds() {
        ingrediente.add("Tortilla");
        ingrediente.add("Mantequilla");
        ingrediente.add("Frijoles");
        ingrediente.add("Huevo");
        ingrediente.add("Platano");
        ingrediente.add("Chorizo");
        precio = 85;
    }
}
