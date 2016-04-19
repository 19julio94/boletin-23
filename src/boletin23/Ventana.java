
package boletin23;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author JP
 */
public class Ventana {
    public void crear(){
    JFrame marco = new JFrame("BOLETIN 23"); 
    
    JPanel panel1= new JPanel();
    JPanel panel2= new JPanel();
   
    JLabel LNome= new JLabel("Nome");
    JLabel LPass= new JLabel("Password");
    
    JTextField nome= new JTextField(24);
    JPasswordField contrasinal= new JPasswordField(24);
    
    JButton premer = new JButton("Premer");
    JButton limpar = new JButton("Limpar");
    
    String [] list ={"elementolista1","elementolista2","elementolista3"};
    JList lista = new JList(list);
    JButton boton = new JButton("Boton");
    JTextArea area = new JTextArea(6,12);
    
    
    
    marco.setSize(600,600);
    panel1.setSize(300, 300);
    panel2.setSize(300, 300);
    
    LNome.setBounds(50, 10, 150, 100);
    LPass.setBounds(50, 85, 150, 100);
    nome.setBounds(150, 50, 100, 30);
    premer.setBounds(50, 210, 85, 30);
    contrasinal.setBounds(150, 125, 100, 30);
    limpar.setBounds(150, 210, 85, 30);
    
    
    lista.setBounds(30, 340, 110, 50);
    boton.setBounds(150, 340, 80, 40);
    area.setBounds(250, 340, 80, 40);
    
    
    panel1.add(LNome);
    panel1.add(nome);
    panel1.add(LPass);
    panel1.add(contrasinal);
    panel1.add(premer);
    panel1.add(limpar);

    panel1.setLayout(null);
    panel2.setLayout(null);
    panel2.add(lista);
    panel2.add(boton);
    panel2.add(area);
    
    marco.add(panel1);
    marco.add(panel2);
 
    marco.setLocationRelativeTo(null);
    
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.setVisible(true);
    
    
    
    
    
    
    
    
    
    }
}
