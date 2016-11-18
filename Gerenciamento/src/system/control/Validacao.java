/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.control;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author oliveira kiala
 */
public class Validacao extends JTextField {
   
public  Validacao(){
              }

public static boolean validarString(String texto) {
        String valor = texto;
        boolean valido = true;

        for (int i = 0; i < valor.length(); i++) {
            Character caractere = valor.charAt(i);
            if (!Character.isDigit(caractere)) {
                //é String
                valido = false;
            }
        }
        //é numero
        return valido == true;
    }
        }

            
    
