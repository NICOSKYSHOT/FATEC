package ex_bd;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;
class GuiCadastroProdutos extends JFrame
{
 JLabel label1, label2, label3;
 JButton btGravar, btAlterar, btExcluir, btNovo, btLocalizar, btCancelar, btSair;
 static JTextField tfCodigo, tfNome, tfPreco;
 private ProdutosDAO produtos;

 public static void main(String args[])
 {
 JFrame janela = new GuiCadastroProdutos();
 janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 janela.setVisible(true);
 }
 public GuiCadastroProdutos() {
 inicializarComponentes();
 definirEventos();
 }
 public void inicializarComponentes() {
 setLayout(new FlowLayout(FlowLayout.LEFT));
 setTitle("Cadastro de Produtos");
 setBounds(200, 200, 610, 120);
 label1 = new JLabel("Codigo ");
 label2 = new JLabel("Nome");
 label3 = new JLabel("Preco");
 tfCodigo = new JTextField(10);
 tfNome = new JTextField(35);
 tfPreco = new JTextField(10);
 btGravar = new JButton(null,new ImageIcon("/home/carlosbezerra/2017/ProjetosJava/AulasFatecZS/imagens/mais.png"));
 btGravar.setToolTipText("Gravar");
 btAlterar = new JButton(null,new ImageIcon("/home/carlosbezerra/2017/ProjetosJava/AulasFatecZS/imagens/alterar.gif"));
 btAlterar.setToolTipText("Alterar");
 btExcluir = new JButton(null,new ImageIcon("/home/carlosbezerra/2017/ProjetosJava/AulasFatecZS/imagens/excluir.gif"));
 btExcluir.setToolTipText("Excluir");
 btLocalizar = new JButton(null,new ImageIcon("/home/carlosbezerra/2017/ProjetosJava/AulasFatecZS/imagens/localizar.png"));
 btLocalizar.setToolTipText("Localizar");
 btNovo = new JButton(null,new ImageIcon("/home/carlosbezerra/2017/ProjetosJava/AulasFatecZS/imagens/novo.gif"));
 btNovo.setToolTipText("Novo");
 btCancelar = new JButton(null,new ImageIcon("/home/carlosbezerra/2017/ProjetosJava/AulasFatecZS/imagens/cancelar.gif"));
 btCancelar.setToolTipText("Cancelar");
 btSair = new JButton(null,new ImageIcon("/home/carlosbezerra/2017/ProjetosJava/AulasFatecZS/imagens/sair.png"));
 btSair.setToolTipText("Sair");
 add(label1);
 add(tfCodigo);
 add(label2);
 add(tfNome);
 add(label3);
 add(tfPreco);
 add(btNovo);
 add(btLocalizar);
 add(btGravar);
 add(btAlterar);
 add(btExcluir);
 add(btCancelar);
 add(btSair);
 setResizable(false);
 setBotoes(true, true, false, false, false, false);
 produtos = new ProdutosDAO();
 if (!produtos.bd.getConnection())
 {
 JOptionPane.showMessageDialog(null, "Falha na conexao, o sistema sera fechado!");
 System.exit(0);
 }
 }
 public void definirEventos()
 {
 btSair.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent e)
 {produtos.bd.close();
 System.exit(0); }
 });

 btNovo.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent e)
 {limpaCampos();
 setBotoes(false, false, true, false, false, true);}
 });

 btCancelar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 limpaCampos();
 }
 });
 btGravar.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent e)
 {
 if(tfCodigo.getText().equals(""))
 {
 JOptionPane.showMessageDialog(null, "O codigo nao pode ser vazio!");
 tfCodigo.requestFocus();
 return;
 }
 if (tfNome.getText().equals(""))
 {
 JOptionPane.showMessageDialog(null, "O campo nome nao pode estar vazio!");
 tfNome.requestFocus();
 return;
 }
 if (tfPreco.getText().equals("")){
 JOptionPane.showMessageDialog(null, "O campo preco nao pode estar vazio!");
 tfPreco.requestFocus();
 return;
 }

 produtos.produto.setCodigo(tfCodigo.getText());
 produtos.produto.setNome(tfNome.getText());
 produtos.produto.setPreco(Double.parseDouble(tfPreco.getText()));
 JOptionPane.showMessageDialog(null, produtos.atualizar(ProdutosDAO.INCLUSAO));
 limpaCampos();
 }
 });
 btAlterar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 produtos.produto.setCodigo(tfCodigo.getText());
 produtos.produto.setNome(tfNome.getText());
 produtos.produto.setPreco(Double.parseDouble(tfPreco.getText()));
 JOptionPane.showMessageDialog(null, produtos.atualizar(ProdutosDAO.ALTERACAO));
 limpaCampos();
 }
 });

 btExcluir.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent e)
 {
 produtos.produto.setCodigo(tfCodigo.getText());
 produtos.localizar();
 int n = JOptionPane.showConfirmDialog(null, produtos.produto.getNome(),
 " Excluir o Produto? ", JOptionPane.YES_NO_OPTION);
 if (n == JOptionPane.YES_OPTION)
 {
 JOptionPane.showMessageDialog(null, produtos.atualizar(ProdutosDAO.EXCLUSAO));
 limpaCampos();
 }
 }
 });
 btLocalizar.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 atualizaCampos();
 }
 });
 }
 public void limpaCampos()
 {
 tfCodigo.setText("");
 tfNome.setText("");
 tfPreco.setText("");
 tfCodigo.requestFocus();
 setBotoes(true, true, false, false, false, false);
 }
 public void atualizaCampos()
 {
 produtos.produto.setCodigo(tfCodigo.getText());
 if(produtos.localizar()){
 tfCodigo.setText(produtos.produto.getCodigo());
 tfNome.setText(produtos.produto.getNome());
 tfPreco.setText(""+produtos.produto.getPreco());
 setBotoes(true, true, false, true, true, true);
 }
 else{
 JOptionPane.showMessageDialog(null, "Produto não encontrado!");
 limpaCampos();
 }
 }
 public void setBotoes(boolean bNovo, boolean bLocalizar, boolean bGravar,
 boolean bAlterar, boolean bExcluir, boolean bCancelar) {
 btNovo.setEnabled(bNovo);
 btLocalizar.setEnabled(bLocalizar);
 btGravar.setEnabled(bGravar);
 btAlterar.setEnabled(bAlterar);
 btExcluir.setEnabled(bExcluir);
 btCancelar.setEnabled(bCancelar);
 }
}
