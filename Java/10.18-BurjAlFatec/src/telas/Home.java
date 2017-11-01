package telas;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

public class Home extends JFrame
{
/**
	 * 
	 */
private static final long serialVersionUID = 1L;

private JButton btLogin, btSair;
	 
	 private PreparedStatement statement;
	 private ResultSet resultSet;
	 private JTable table;
	 private JScrollPane scrollTable;
	 
	 public static void main(String args[]){
		 
	 JFrame frame = new Home();
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
	 }
	 
	 public Home() {
	 inicializarComponentes();
	 abrirLogin();
	 }
	 
	 public void inicializarComponentes() {
	 setLayout(null);
	 
	 btLogin = new JButton("Login");
	 btLogin.setToolTipText("Login");
	 btLogin.setBounds(5,5,100,25);
	 
	 btSair = new JButton("Sair");
	 btSair.setToolTipText("Sair");
	 btSair.setBounds(120,5,100,25);
	 
	 table = new JTable();
	 table.setBounds(5,35,300,300);
	 scrollTable = new JScrollPane(table);
	 scrollTable.setBounds(5,35,600,400);
	 
	 add(btLogin);
	 add(btSair);
	 add(scrollTable);
	 setTitle("Home");
	 setBounds(200, 200, 620, 500);
	 setResizable(false);

	 }
	 
	 
	 public void abrirLogin() {
	 btLogin.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent e) {
		// Login.show();
	 }
	 });
	 }
	}