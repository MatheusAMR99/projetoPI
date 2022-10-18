package model;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Resilia
 */
public class ModelValidacao {

    public ArrayList<String> mensagemErro = new ArrayList<>();

    public ArrayList<String> getMensagemErro() {
        return mensagemErro;
    }

    public void validarNumero(JTextField txt) {
        try {
            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            }
            int valorConvertido = Integer.parseInt(txt.getText());
            txt.setBackground(Color.WHITE);
        } catch (NumberFormatException e) {
            mensagemErro.add("Falha ao converter o valor do campo "+txt.getName()+"em inteiro");
            txt.setBackground(Color.RED);
        }
        catch (IllegalArgumentException e) {
            mensagemErro.add("digite um valor para o campo "+txt.getName());
            txt.setBackground(Color.RED);
        }

    }
    public void validarNumeroFormatado(JFormattedTextField txt) {
        try {
            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            }
            int valorConvertido = Integer.parseInt(txt.getText());
            txt.setBackground(Color.WHITE);
        } catch (NumberFormatException e) {
            mensagemErro.add("Falha ao converter o valor do campo "+txt.getName()+"em inteiro");
            txt.setBackground(Color.RED);
        }
        catch (IllegalArgumentException e) {
            mensagemErro.add("digite um valor para o campo "+txt.getName());
            txt.setBackground(Color.RED);
        }

    }
    public void validarString(JTextField txt) {
        try {
            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            }
            txt.setBackground(Color.WHITE);
        } catch (Exception e) {
            mensagemErro.add("Insira o valor no campo "+txt.getName());
                txt.setBackground(Color.red);
        }
      

    }
    public void validarStringFormatado(JFormattedTextField txt) {
        
        try {
            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            }
            txt.setBackground(Color.WHITE);
        } catch (Exception e) {
            mensagemErro.add("Insira o valor no campo "+txt.getName());
                txt.setBackground(Color.red);
        }
      

    }

    public void validarTeclasNumericas(KeyEvent evt, JTextField txt){
        
        //Permitir somente caracteres numéricos
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Digite somente números");
            txt.grabFocus();
            txt.setText("");
        }
    }
}
