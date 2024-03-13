/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_fixacao;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class TextFieldFrame extends JFrame {
    private JTextField textField1;
    private JPasswordField passwordField;
    private JButton plainJButton;
    
    public TextFieldFrame(){
        super("Tela de Login");
        setLayout( new FlowLayout() );
        textField1 = new JTextField( 10 );
        add( textField1 );
    
        passwordField = new JPasswordField( 10);
        add( passwordField );
        
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        passwordField.addActionListener(handler);
        
        plainJButton = new JButton( "Ok" );
        add(plainJButton);
        
    }
    
     private class TextFieldHandler implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            String textField1Text = textField1.getText();
            String passwordFieldText = new String(passwordField.getPassword());
            
            JOptionPane.showMessageDialog(null, String.format(" olá %s, seu usuario e senha sao:   \n \n TextField1: %s\nPasswordField: %s", textField1Text, textField1Text, passwordFieldText));
        }
    }
     
    
    
}
    
