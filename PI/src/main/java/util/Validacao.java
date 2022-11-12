package util;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Resilia
 */
public class Validacao {

    public ArrayList<String> mensagemErro = new ArrayList<>();

    public ArrayList<String> getMensagemErro() {
        return mensagemErro;
    }

    Border bordaVermelha = new LineBorder(Color.RED);
    Border bordaPadrao = new LineBorder(Color.getHSBColor(153, 153, 153));
    /**
     * 
     * @param txt
     * @return 
     */
    public boolean validarNumero(JTextField txt) {
        boolean retorno;
        try {
            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            }

            txt.setBackground(Color.WHITE);
            txt.setBorder(bordaPadrao);
            retorno = true;
        } catch (NumberFormatException e) {
            mensagemErro.add("Falha ao converter o valor do campo " + txt.getName() + "em inteiro");
            txt.setBorder(bordaVermelha);
            retorno = false;

        } catch (IllegalArgumentException e) {
            mensagemErro.add("digite um valor para o campo " + txt.getName());
            txt.setBorder(bordaVermelha);
            retorno = false;
        }
        return retorno;
    }

    /**
     * 
     * @param txt
     * @return 
     */
    public boolean validarNumeroFormatado(JFormattedTextField txt) {
        boolean retorno;
        try {
            if (txt.getText()
                    .replace("-", "")
                    .replace("(", "")
                    .replace(")", "")
                    .replace(".", "")
                    .replace("/", "")
                    .trim().equals("")) {
                throw new IllegalArgumentException();
            }
            txt.setBackground(Color.WHITE);
            txt.setBorder(bordaPadrao);
            retorno = true;
        } catch (NumberFormatException e) {
            mensagemErro.add("Falha ao converter o valor do campo " + txt.getName() + "em inteiro");
            txt.setBorder(bordaVermelha);
            retorno = false;

        } catch (IllegalArgumentException e) {
            mensagemErro.add("digite um valor para o campo " + txt.getName());
            txt.setBorder(bordaVermelha);
            retorno = false;
        }
        return retorno;
    }

    /**
     * 
     * @param txt
     * @return 
     */
    public boolean validarString(JTextField txt) {
        boolean retorno;
        try {
            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            }
            txt.setBackground(Color.WHITE);
            txt.setBorder(bordaPadrao);
            retorno = true;
        } catch (Exception e) {
            mensagemErro.add("Insira o valor no campo " + txt.getName());
            //txt.setBackground(Color.red);
            txt.setBorder(bordaVermelha);
            retorno = false;

        }
        return retorno;

    }

    /**
     * 
     * @param evt
     * @param txt 
     */
    public void validarTeclasNumericas(KeyEvent evt, JTextField txt) {

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
