/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.michi;

import com.mycompany.Modelo.ModeloTO;

/**
 *
 * @author INTEL
 */
public class Michi {
    public static void main(String args[]){
        ModeloTO vista= new ModeloTO();
        ModelGame model = new ModelGame();
        ViewGame view = new ViewGame();
        Controllergame controlador = new Controllergame(view, model);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
        
    }
}
