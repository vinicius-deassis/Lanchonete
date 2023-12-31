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
import lanchonete.Sanduiche;
import lanchonete.Sanduba;

/**
 *
 * @author USER
 */
public class Sanduiches extends javax.swing.JFrame {    
    lanchonete.Carrinho carrinho = new Carrinho();
    private ArrayList<Sanduba> sandubas;
    public String name,num,bairro,pay;
    Pedido p = new Pedido();
    
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
        cardapio = new javax.swing.JButton();
        buttonCombo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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

        comboPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carne", "Frango", "Salame", "Calabresa", "Almondegas" }));
        comboPro.setToolTipText("");
        comboPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProActionPerformed(evt);
            }
        });

        jLabel6.setText("Tamanho");

        comboSalada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tomate", "Pepino", "Alface", "Cebola Roxa", "Azeitona" }));
        comboSalada.setToolTipText("");
        comboSalada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSaladaActionPerformed(evt);
            }
        });

        comboTam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeno", "Medio", "Grande" }));

        comboMolho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ketchup", "Barbecue", "Maionese", "Rose", "Chipotle" }));
        comboMolho.setToolTipText("");
        comboMolho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMolhoActionPerformed(evt);
            }
        });

        comboAcomp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Batata", "Coca", "Nuggets", "Guarana", "SEM ACOMP." }));
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

        jLabel5.setText("Acompanhamento");

        comboPao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Francês", "3 queijos", "Integral", "9 graos", "Italiano com Queijo" }));
        comboPao.setToolTipText("");
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
        jLabel7.setText("MONTE SEU COMBO");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));

        jBoxSanduba.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Almondegas", "Calabresa", "Costela", "Nordestina", "Frango", "Beirute", "Doce" }));
        jBoxSanduba.setToolTipText("");
        jBoxSanduba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoxSandubaActionPerformed(evt);
            }
        });

        jBoxTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeno", "Médio", "Grande" }));
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

        cardapio.setText("Cardápio");
        cardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardapioActionPerformed(evt);
            }
        });

        buttonCombo.setText("Cardápio");
        buttonCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonComboActionPerformed(evt);
            }
        });

        jButton1.setText("Limpar Carrinho");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(comboMolho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboPao, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(comboPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboAcomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6))
                    .addComponent(jLabel3)
                    .addComponent(comboSalada, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jBoxSanduba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ButtonAddSanduba)
                            .addComponent(buttonAddSanduiche))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardapio)
                            .addComponent(buttonCombo)
                            .addComponent(jBoxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(buttonVerCarrinho)
                        .addGap(18, 18, 18)
                        .addComponent(buttonFinalizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboAcomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel3)
                            .addGap(2, 2, 2)
                            .addComponent(comboSalada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboPao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboMolho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAddSanduba)
                    .addComponent(buttonCombo))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBoxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonAddSanduiche)
                            .addComponent(cardapio))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonFinalizar)
                            .addComponent(buttonVerCarrinho)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBoxSanduba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
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
      
        String mol = (String)comboMolho.getSelectedItem();
        String tam = (String)comboTam.getSelectedItem();
        String pao = (String)comboPao.getSelectedItem();
        String pro = (String)comboPro.getSelectedItem();
        String sal = (String)comboSalada.getSelectedItem();
        String acomp = (String)comboAcomp.getSelectedItem();
        
        Sanduiche s = new Sanduiche(pro,tam,pao,sal,mol,acomp);
        JOptionPane.showMessageDialog(null, "Seu Sanduiche de " + s.getSabor() + "(" + s.getTamanho() + ")" + "\nfoi adcionado ao carrinho" + "\nno Valor de R$"+s.calcularPreco()+"0.");
        s.setPreco(s.calcularPreco());
        carrinho.adicionarSanduba(s);
        System.out.println(carrinho);
    }//GEN-LAST:event_ButtonAddSandubaActionPerformed

    private void buttonAddSanduicheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddSanduicheActionPerformed
        String saborsanduba = (String) jBoxSanduba.getSelectedItem();
        String tamanhosanduba = (String) jBoxTamanho.getSelectedItem();
        if ((saborsanduba.equals("Selecione um sanduiche...")) || (tamanhosanduba.equals("Selecione um tamanho..."))){
            JOptionPane.showMessageDialog(null, "Selecione um sabor ou um tamanho válido!");
    }   else{
            Sanduba sanduba = new Sanduba(saborsanduba, tamanhosanduba);
            carrinho.adicionarSanduba(sanduba);          
            JOptionPane.showMessageDialog(null,"Tradiconal " + saborsanduba + " - R$" + sanduba.getPreco() + "0\n foi adcionado ao carrinho.");
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

                    for (Sanduba p : carrinho.getSandubas()) {
                        sanduichesTexto += "Sanduiche de " + p.getSabor() + " - " + p.getTamanho() + " - R$" + p.getPreco() + "0\n foi adcionado ao carrinho.";
                }

                JOptionPane.showMessageDialog(null, 
                    ""
                    + "========== Nota Fiscal =========="
                    + "\nCliente: " + cliente1.getNome()
                    + "\nTelefone: " + cliente1.getBairro()
                    + "\nBairro: " + cliente1.getTelefone()
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

    private void cardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardapioActionPerformed
        // TODO add your handling code here:
        Cardapio c = new Cardapio();
        c.setVisible(true);
    }//GEN-LAST:event_cardapioActionPerformed

    private void buttonComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonComboActionPerformed
        Combo a = new Combo();
        a.setVisible(true);
        
        //JOptionPane.showMessageDialog(null, p.showItens());
    }//GEN-LAST:event_buttonComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        carrinho.getSandubas().clear();
        JOptionPane.showMessageDialog(null, "Todos os itens removidos do carrinho!");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton buttonCombo;
    public javax.swing.JButton buttonFinalizar;
    private javax.swing.JButton buttonVerCarrinho;
    private javax.swing.JButton cardapio;
    private javax.swing.JComboBox<String> comboAcomp;
    private javax.swing.JComboBox<String> comboMolho;
    private javax.swing.JComboBox<String> comboPao;
    private javax.swing.JComboBox<String> comboPro;
    private javax.swing.JComboBox<String> comboSalada;
    private javax.swing.JComboBox<String> comboTam;
    private javax.swing.JComboBox<String> jBoxSanduba;
    private javax.swing.JComboBox<String> jBoxTamanho;
    private javax.swing.JButton jButton1;
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
