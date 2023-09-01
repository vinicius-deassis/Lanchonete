/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import lanchonete.Carrinho;
import lanchonete.Cliente;
import lanchonete.Pedido;
import lanchonete.Sanduba;
import lanchonete.Sanduiche;

/**
 *
 * @author USER
 */
public class Sanduiches extends javax.swing.JFrame {    
    lanchonete.Carrinho carrinho = new Carrinho();
    private ArrayList<Sanduiche> sandubas;
    public String name,num,bairro,pay;
    
    /**
     * Creates new form Sanduiches
     */
    public Sanduiches(String name,Object bairro, String num, Object pay) {
        this.name = name;
        this.bairro = (String)bairro;
        this.num = num;
        this.pay = (String) pay;
        initComponents();
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonVerCarrinho = new javax.swing.JButton();
        comboPro = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comboSalada = new javax.swing.JComboBox<>();
        comboTam = new javax.swing.JComboBox<>();
        comboMolho = new javax.swing.JComboBox<>();
        comboAcomp = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboPao = new javax.swing.JComboBox<>();
        ButtonAddSanduba = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jBoxSanduba = new javax.swing.JComboBox<>();
        jBoxTamanho = new javax.swing.JComboBox<>();
        buttonAddSanduiche = new javax.swing.JButton();
        buttonVerCarrinho = new javax.swing.JButton();
        buttonFinalizar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButtonVerCarrinho.setText("Ver Carrinho");
        jButtonVerCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerCarrinhoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carne", "Frango", "Salada", "Almondegas", "Calabresa" }));
        comboPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProActionPerformed(evt);
            }
        });

        jLabel6.setText("Tamanho");

        comboSalada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tomate", "Alface", "Pepino" }));
        comboSalada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSaladaActionPerformed(evt);
            }
        });

        comboTam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeno", "Medio", "Grande" }));

        comboMolho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ketchup", "Barbecue", "Maionese" }));
        comboMolho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMolhoActionPerformed(evt);
            }
        });

        comboAcomp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Batata", "Coca", "Nuggets" }));
        comboAcomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAcompActionPerformed(evt);
            }
        });

        jLabel1.setText("Pão");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Proteina");

        jLabel3.setText("Salada");

        jLabel4.setText("Molho");

        jLabel5.setText("Adicional");

        comboPao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Frances", "3 queijos", "Integral" }));
        comboPao.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                comboPaoComponentAdded(evt);
            }
        });
        comboPao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPaoActionPerformed(evt);
            }
        });

        ButtonAddSanduba.setText("Adicionar");
        ButtonAddSanduba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddSandubaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel7.setText("MONTAGEM");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));

        jBoxSanduba.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Almondegas", "Calabresa", "Costela", "Nordestina", "Frango" }));
        jBoxSanduba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoxSandubaActionPerformed(evt);
            }
        });

        jBoxTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Pequena", "Média", "Grande" }));
        jBoxTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoxTamanhoActionPerformed(evt);
            }
        });

        buttonAddSanduiche.setText("Adicionar");
        buttonAddSanduiche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddSanduicheActionPerformed(evt);
            }
        });

        buttonVerCarrinho.setText("Ver Carrinho");
        buttonVerCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVerCarrinhoActionPerformed(evt);
            }
        });

        buttonFinalizar.setText("Finalizar carrinho");
        buttonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFinalizarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel8.setText("SANDUICHES");

        jLabel9.setText("Tamanho");

        jLabel12.setText("Sanduiches");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonAddSanduba)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(201, 201, 201)
                        .addComponent(jLabel8)
                        .addGap(79, 79, 79))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboPao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(comboMolho, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboPro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboSalada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboAcomp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonVerCarrinho)
                                .addGap(18, 18, 18)
                                .addComponent(buttonFinalizar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBoxSanduba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jBoxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonAddSanduiche)
                        .addGap(95, 95, 95))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSalada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBoxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBoxSanduba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMolho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboAcomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddSanduiche))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAddSanduba)
                    .addComponent(buttonVerCarrinho)
                    .addComponent(buttonFinalizar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProActionPerformed

    private void comboSaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSaladaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSaladaActionPerformed

    private void comboAcompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAcompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAcompActionPerformed

    private void comboPaoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_comboPaoComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPaoComponentAdded

    private void ButtonAddSandubaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddSandubaActionPerformed
        Pedido p = new Pedido();
        
        String mol = (String) comboMolho.getSelectedItem();
        String tam = (String)comboTam.getSelectedItem();
        String pao = (String)comboPao.getSelectedItem();
        String pro = (String)comboPro.getSelectedItem();
        String sal = (String)comboSalada.getSelectedItem();
        String acomp = (String)comboAcomp.getSelectedItem();
        
        Sanduba s = new Sanduba(pro,tam,pao,sal,mol,acomp);
        JOptionPane.showMessageDialog(null, "O total ficou R$"+s.calcularPreco()+" reais.");
        carrinho.adicionarSanduba(s);
    }//GEN-LAST:event_ButtonAddSandubaActionPerformed

    private void buttonAddSanduicheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddSanduicheActionPerformed
        String saborsanduba = (String) jBoxSanduba.getSelectedItem();
        String tamanhosanduba = (String) jBoxTamanho.getSelectedItem();
        if ((saborsanduba.equals("Selecione um sanduiche...")) || (tamanhosanduba.equals("Selecione um tamanho..."))){
            JOptionPane.showMessageDialog(null, "Selecione um sabor ou um tamanho válido!");
    }   else{
            Sanduiche sanduba = new Sanduiche(saborsanduba, tamanhosanduba);
            carrinho.adicionarSanduba(sanduba);          
            JOptionPane.showMessageDialog(null,"sanduiche de " + saborsanduba + " adicionada ao carrinho!");
        }  
    }//GEN-LAST:event_buttonAddSanduicheActionPerformed

    private void jBoxSandubaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoxSandubaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBoxSandubaActionPerformed

    private void jButtonVerCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerCarrinhoActionPerformed
        
    }//GEN-LAST:event_jButtonVerCarrinhoActionPerformed

    private void buttonVerCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVerCarrinhoActionPerformed
        sandubas = carrinho.getSandubas();
        JOptionPane.showMessageDialog(null, carrinho.verCarrinho());
    }//GEN-LAST:event_buttonVerCarrinhoActionPerformed

    private void buttonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFinalizarActionPerformed
        Cliente cliente1 =  new Cliente(name,bairro,num,pay);
        if (carrinho.getSandubas().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O carrinho está vazio!");
                } else {

                    sandubas = carrinho.getSandubas();
                    float valorTotal = carrinho.calcularTotal(sandubas);
                    String sanduichesTexto = "";

                    for (Sanduiche p : carrinho.getSandubas()) {
                        sanduichesTexto += "sanduiche de " + p.getSabor() + " - " + p.getTamanho() + " - R$" + p.getPreco() + "\n";
                }

                JOptionPane.showMessageDialog(null, 
                    ""
                    + "========== Nota Fiscal =========="
                    + "\nCliente: " + cliente1.getNome()
                    + "\nTelefone: " + cliente1.getTelefone()
                    + "\nBairro: " + cliente1.getBairro()
                    + "\n\nCarrinho de Compras: \n" + sanduichesTexto
                    + "\nValor total: R$ " + valorTotal
                    + "\nForma de Pagamento: " + cliente1.getPay()
                );
            }
    }//GEN-LAST:event_buttonFinalizarActionPerformed

    private void jBoxTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoxTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBoxTamanhoActionPerformed

    private void comboPaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPaoActionPerformed

    private void comboMolhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMolhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMolhoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sanduiches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sanduiches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sanduiches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sanduiches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        ;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAddSanduba;
    private javax.swing.JButton buttonAddSanduiche;
    public javax.swing.JButton buttonFinalizar;
    private javax.swing.JButton buttonVerCarrinho;
    private javax.swing.JComboBox<String> comboAcomp;
    private javax.swing.JComboBox<String> comboMolho;
    private javax.swing.JComboBox<String> comboPao;
    private javax.swing.JComboBox<String> comboPro;
    private javax.swing.JComboBox<String> comboSalada;
    private javax.swing.JComboBox<String> comboTam;
    private javax.swing.JComboBox<String> jBoxSanduba;
    private javax.swing.JComboBox<String> jBoxTamanho;
    private javax.swing.JButton jButtonVerCarrinho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
