/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanchonete;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import lanchonete.Carrinho;
import lanchonete.Cliente;
import lanchonete.Sanduiche;
/**
 *
 * @author Nicolas
 */
public class InterfaceUser{

    public static void main(String[] args){
        Carrinho carrinho = new Carrinho();
        Cliente cliente1;
        double preco;
        Sanduiche sanduiche;
        ArrayList<Sanduiche> sandubas;
        String sabor, tamanho = null;
        Scanner s = new Scanner(System.in);
        boolean run = true;
        
        String nome = JOptionPane.showInputDialog(null, "Qual é o seu nome?");
        
        JOptionPane.showMessageDialog(null, "Olá, " + nome + " Seja Bem-vindo à nossa lanchonete!");
        String telefone = JOptionPane.showInputDialog(null, "Digite o seu telefone:\n(xx) xxxxx-xxxx");
        String[] bairros = {"Boa Viagem", "Pina", "Piedade", "Ouro Preto", "Cabo de Santo Agostinho", "Várzea", "Água Fria", "Macaxeira", "Dois Irmãos", "Paulista", "Nova Descoberta", "Caxangá", "Outro"};

        String bairro = (String) JOptionPane.showInputDialog(
                null,
                "Qual Bairro Você Mora?",
                "Bairro",
                JOptionPane.QUESTION_MESSAGE,
                null,
                bairros,
                bairros[8]);
        
        String[] pays = {"Debito", "Credito", "Dinheiro", "Pix", "Mercado Pago"};
        
        String pay = (String) JOptionPane.showInputDialog(
                null,
                "Qual a forma de pagamento?",
                "Pagamento",
                JOptionPane.QUESTION_MESSAGE,
                null,
                pays,
                pays[4]);
        
        
        
        cliente1 = new Cliente(nome, telefone, bairro, pay);
        
        
        
        while (run){
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção: \n\n1 - Adicionar item \n2 - Remover item \n3 - Ver carrinho \n4 - Finalizar pedido \n\nDigite uma opção"));
        
            switch (opcao){
                case 1:
                    int opcaoSabor = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o sabor da sanduiche: \n\n1 - Almondegas \n2 - Calabresa \n3 - Frango \n4 - Nordestina \n\nOpção: "));
                    switch (opcaoSabor){
                        case 1:
                            sabor = "Almondegas";
                            break;
                        case 2:
                            sabor = "Calabresa";
                            break;
                        case 3: 
                            sabor = "Frango";
                            break;
                        case 4:
                            sabor = "Nordestina";
                            break;
                            
                        default:
                            JOptionPane.showMessageDialog(null, "Não temos essa opção disponível no momento!");
                            return;
                    }
            
                    int opcaoTamanho = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o tamanho do sanduiche: \n\n1 - Pequena \n2 - Média \n3 - Grande \n\nOpção: "));
          
                    switch (opcaoTamanho){
                        case 1:
                            tamanho = "Pequena";
                            break;
                        case 2:
                            tamanho = "Média";
                            break;
                        case 3:
                            tamanho = "Grande";
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Por gentileza, escolha um tamanho válido!");
                            break;
                         } 

                    if (tamanho.equals("Pequena")){
                        preco = 25.0;
                        sanduiche = new Sanduiche(sabor, tamanho);
                        carrinho.adicionarSanduba(sanduiche);
                        
                        JOptionPane.showMessageDialog(null,"sanduiche de " + sanduiche.getSabor() + " adicionada ao carrinho!");
                        break;
                          } 
                    else if(tamanho.equals("Média")){
                        preco = 40.0;
                        sanduiche = new Sanduiche(sabor, tamanho);
                        carrinho.adicionarSanduba(sanduiche);
                        
                        JOptionPane.showMessageDialog(null, "sanduiche de " + sanduiche.getSabor() + " adicionada ao carrinho!");
                        break;
                     }  else if(tamanho.equals("Grande")){
                        preco = 60.0;
                        sanduiche = new Sanduiche(sabor, tamanho);
                        carrinho.adicionarSanduba(sanduiche);
                        
                        JOptionPane.showMessageDialog(null, "sanduiche de " + sanduiche.getSabor() + " adicionada ao carrinho!");
                        break;
        
                     }  else{
                        JOptionPane.showMessageDialog(null, "Digite uma opção válida!");
                        
                
                    }
                    
                    break;

                case 2:
                    
                    sandubas = carrinho.getSandubas();
                    if (sandubas.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Não há sanduiches no carrinho!");
                        break;
                    }
               
                    int opcaosanduiche = -1;
                    while (opcaosanduiche < 0 || opcaosanduiche > sandubas.size()) {
                        
                        String mensagem = "Escolha o item que deseja remover: \n\n";
                        for (int i = 0; i < sandubas.size(); i++) {
                            mensagem += (i) + 1 + ". " + sandubas.get(i) + "\n";
                        }
                        mensagem += "\nOpção: ";
                        try {
                            
                        
                            opcaosanduiche = 0;
                            opcaosanduiche = Integer.parseInt(JOptionPane.showInputDialog(null, mensagem));
                    
                        
                       
                    
                            Sanduiche sanduicheRemovida = sandubas.remove(opcaosanduiche - 1);
                            JOptionPane.showMessageDialog(null, "\nItem " + sanduicheRemovida.getSabor() + " (" + sanduicheRemovida.getTamanho() + ") removida do carrinho!");
                            break;
                        }
                        catch(IndexOutOfBoundsException e){
                            
                            JOptionPane.showMessageDialog(null, "Opção inválida!");
                                JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e.getMessage());
                                break;
                    
                    }
             
                        }
                
                case 3:
                    sandubas = carrinho.getSandubas();
                    if (sandubas.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Não há itens no carrinho!");
                        break;
                    }
                    
                    int opcaosanduiche1 = -1;
                    while (opcaosanduiche1 == -1) {
                        String mensagem = "itens no Carrinho: \n\n";
                        for (int i = 0; i < sandubas.size(); i++) {
                            mensagem += (i + 1) + ". " + sandubas.get(i) + "\n";
                        }
                        JOptionPane.showMessageDialog(null, mensagem);
                        opcaosanduiche1 = 0;
                    }
                    break;
                case 4:
                        if (carrinho.getSandubas().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "O carrinho está vazio!");
                        } else {
                           
                            sandubas = carrinho.getSandubas();
                            double valorTotal = carrinho.calcularTotal(sandubas);
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
                            + "O de cima me mamou"
                        );
        
                        run = false;
                        }
                break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Insira uma opção válida!");
                    break;
                    }
        }
    }

}