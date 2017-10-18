package ex_bd;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
public class MostraProdutos extends JFrame
{
private JButton btConsultar, btSair;
 private BD bd;
 private PreparedStatement statement;
 private ResultSet resultSet;
 private JTable table;
 private JScrollPane scrollTable;
 public static void main(String args[])
 {
 JFrame frame = new MostraProdutos();
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
 public MostraProdutos() {
 inicializarComponentes();
 definirEventos();
 }
 public void inicializarComponentes() {
 setLayout(null);
 btConsultar = new JButton("Consultar");
 btConsultar.setToolTipText("Consultar");
 btConsultar.setBounds(5,5,100,25);
 btSair = new JButton("Sair");
 btSair.setToolTipText("Sair");
 btSair.setBounds(120,5,100,25);
 table = new JTable();
 table.setBounds(5,35,300,300);
 scrollTable = new JScrollPane(table);
 scrollTable.setBounds(5,35,600,400);
 add(btConsultar);
 add(btSair);
 add(scrollTable);
 setTitle("Mostrar Produtos");
 setBounds(200, 200, 620, 500);
 setResizable(false);
 bd = new BD();
 }
 public void definirEventos() {
 btConsultar.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent e) {
 if (!bd.getConnection())
 {
 JOptionPane.showMessageDialog(null, "Falha ao conectar, o sistema sera fechado!");
 System.exit(0);
 }
 try{
 statement = bd.connection.prepareStatement("select * from produtos");
 resultSet = statement.executeQuery();
 DefaultTableModel tableModel = new DefaultTableModel(new String[]{},0)
 { };
 int qtdeColunas = resultSet.getMetaData().getColumnCount();
 for (int indice = 1; indice <=qtdeColunas ; indice++)
 tableModel.addColumn(resultSet.getMetaData().getColumnName(indice));
 table = new JTable(tableModel);
 DefaultTableModel dtm = (DefaultTableModel) table.getModel();
 while (resultSet.next()) {
 try {
 String[] dados = new String[qtdeColunas];
 for (int i = 1; i <= qtdeColunas; i++) {
 dados[i-1] = resultSet.getString(i);
 }
 dtm.addRow(dados);
 System.out.println();
 } catch (SQLException erro) {
 }
 scrollTable.setViewportView(table);
 }
 resultSet.close();
 statement.close();
 bd.close();
 } catch (Exception erro) {
 JOptionPane.showMessageDialog(null, "Comando SQL invalido !" + erro.toString());
 }
 }
 });
 }
}