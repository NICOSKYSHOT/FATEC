package aula23;

import java.awt.*;
import java.awt.event.*;

public class Calculadora extends Frame implements ActionListener {

    Label lblNum1, lblNum2, lblResultado;
    TextField txtNum1, txtNum2, txtResultado;
    Button btnSom, btnSub, btnMult, btnDiv, btnClear, btnPow; 
    
    public Calculadora() {
        setTitle("Calculadora V1.0");
        setSize(300,150);
        setLocation(50,50);
        setBackground(new Color(150, 150, 150));
        setLayout(new GridLayout(3, 4));
        lblNum1 = new Label("Num 1");
        lblNum2 = new Label("Num 2");
        lblResultado = new Label("Resultado");
        txtNum1 = new TextField("Num 1");
        txtNum2 = new TextField("Num 2");
        txtResultado = new TextField("Resultado");
        
        btnSom = new Button("+");
        btnSom.addActionListener(this);
        btnMult = new Button("*");
        btnMult.addActionListener(this);
        btnDiv = new Button("/");
        btnDiv.addActionListener(this);
        btnSub = new Button("-");
        btnSub.addActionListener(this);
        btnPow = new Button("^");
        btnPow.addActionListener(this);
        btnClear = new Button("C");
        btnClear.addActionListener(this);
        
        txtNum1 = new TextField();
        txtNum2 = new TextField();
        txtResultado = new TextField();
        txtResultado.setEditable(false);
        
        add(lblNum1);
        add(txtNum1);
        add(btnSom);
        add(btnSub);
        
        add(lblNum2);
        add(txtNum2);
        add(btnDiv);
        add(btnMult);
        
        add(lblResultado);
        add(txtResultado);
        add(btnClear);
        add(btnPow);
        
        System.out.println("      ,'_  \"`-.      ,-'\"\"`-.		");
        System.out.println("     ('\"/\"-.   \\    /  ,-,.  \\		");
        System.out.println("      `'    \\  ,-'-/    /  `-'		");
        System.out.println("            ,-'-.      /			");
        System.out.println("         __ (\"|\")     f			");
        System.out.println("        (_)`-\"---.    |			");
        System.out.println("         l   ---.     j			");
        System.out.println("          `---'     ,'			");
        System.out.println("              \\    f                       ");
        System.out.println("               )   l			");
        System.out.println("            __f _   Y			");
        System.out.println("         ,'\",-'\"_\"  l			");
        System.out.println("        (,,(,,,' `   Y			");
        System.out.println("             |       l			");
        System.out.println("             |        \\,';,		");
        System.out.println("             l    ,    Y, ;			");
        System.out.println("             (`._(     ),'  Philip Kaulfuss	");
        System.out.println("              `.  `.  (			");
        System.out.println("            ,--',--'   )			");
        System.out.println("           (,,,(,,,---'			");
    }
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.show();
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {  
        float n1 = 0, n2 = 0, result = 0;
        try {
            n1 = Float.parseFloat(txtNum1.getText());
            n2 = Float.parseFloat(txtNum2.getText());
        } catch (NumberFormatException ex) {
            txtResultado.setText("Erro!");
        }
        
        if(e.getSource() == btnClear) {
            txtNum1.getText();
            txtNum2.getText();
            txtResultado.getText();
            txtNum1.setText(" ");
            txtNum2.setText(" ");
            txtResultado.setText(" ");
            
        } else if(e.getSource() == btnSom) {
            result = n1 + n2;
            txtResultado.getText();
            txtResultado.setText(result+"");
        } else if (e.getSource() == btnSub){
            result = n1 - n2;
            txtResultado.getText();
            txtResultado.setText(result+"");
        } else if (e.getSource() == btnDiv){
            result = n1 / n2;
            txtResultado.getText();
            txtResultado.setText(result+"");
        } else if (e.getSource() == btnMult){
            result = n1 * n2;
            txtResultado.getText();
            txtResultado.setText(result+"");
        } else if (e.getSource() == btnPow){
            result = (float) Math.pow(n1, n2);
            txtResultado.getText();
            txtResultado.setText(result+"");
        }
    }   
}