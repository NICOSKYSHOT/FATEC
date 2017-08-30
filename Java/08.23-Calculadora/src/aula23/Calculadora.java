package aula23;

import java.awt.*;
import java.awt.event.*;

public class Calculadora extends Frame implements ActionListener {

    Label lbln1, lbln2, lblr;
    TextField txtN1, txtN2, txtR;
    Button btn1, btn2, btn3, btn4, btn5, btn6; 
    
    public Calculadora() {
        setTitle("Calculadora");
        setSize(500,350);
        setLocation(50,50);
        setBackground(new Color(200, 250, 150));
        
        setLayout(new GridLayout(3, 4));
        lbln1 = new Label("Numero 1");
        lbln2 = new Label("Numero 2");
        lblr = new Label("Resultado");
        txtN1 = new TextField("Numero 1");
        txtN2 = new TextField("Numero 2");
        txtR = new TextField("Resultado");
        
        btn1 = new Button("+");
        btn1.addActionListener(this);
        btn3 = new Button("*");
        btn3.addActionListener(this);
        btn4 = new Button("/");
        btn4.addActionListener(this);
        btn2 = new Button("-");
        btn2.addActionListener(this);
        btn6 = new Button("^");
        btn6.addActionListener(this);
        btn5 = new Button("C");
        btn5.addActionListener(this);
        
        txtN1 = new TextField();
        txtN2 = new TextField();
        txtR = new TextField();
        txtR.setEditable(false);
        
        add(lbln1);
        add(txtN1);
        add(btn1);
        add(btn2);
        
        add(lbln2);
        add(txtN2);
        add(btn4);
        add(btn3);
        
        add(lblr);
        add(txtR);
        add(btn5);
        add(btn6);
    }
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {  
        float n1 = 0, n2 = 0, r = 0;
        
        try {
            n1 = Float.parseFloat(txtN1.getText());
            n2 = Float.parseFloat(txtN2.getText());
        } catch (NumberFormatException ex) {
            txtR.setText("Erro!");
        }
        
        if(e.getSource() == btn5) {
            txtN1.getText();
            txtN2.getText();
            txtR.getText();
            txtN1.setText(" ");
            txtN2.setText(" ");
            txtR.setText(" ");
            
        } else if(e.getSource() == btn1) {
            r = n1 + n2;
            txtR.getText();
            txtR.setText(r + "");
        } else if (e.getSource() == btn2){
            r = n1 - n2;
            txtR.getText();
            txtR.setText(r + "");
        } else if (e.getSource() == btn4){
            r = n1 / n2;
            txtR.getText();
            txtR.setText(r + "");
        } else if (e.getSource() == btn3){
            r = n1 * n2;
            txtR.getText();
            txtR.setText(r + "");
        } else if (e.getSource() == btn6){
            r = (float) Math.pow(n1, n2);
            txtR.getText();
            txtR.setText(r + "");
        }
    }   
}