import java.util.Scanner;
import modelo.Conta;
import modelo.Despesa;
import modelo.Meta;
import modelo.Receita;

public class Programa {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Conta conta = new Conta(12345, "Janaina", 1000.0, 500.0);
        Meta meta = new Meta("Comprar Computador", 3000.0, 0.0);
        Receita receita = new Receita("Salário Mensal", 2000.0);
        Despesa despesa = new Despesa("Aluguel de casa", 1200.0, "Pendente");
        
        System.out.println("=== SISTEMA DE CONTROLE FINANCEIRO ===");
        System.out.println("Cliente: " + conta.getCliente() + " | Saldo Inicial: R$ " + conta.getSaldo());
        System.out.println("--------------------------------------------------");
        
        //RECEITA
        System.out.print("Deseja depositar o " + receita.getOrigem() + " no valor de R$ " + receita.getValor() + "? (1-Sim / 2-Não): ");
        
        int opcao;
        opcao = entrada.nextInt();
        
        if (opcao == 1) {
            
            conta.setSaldo(conta.getSaldo() + receita.getValor());
            System.out.println("Salário adicionado com sucesso!");
            System.out.println("Saldo Atual: R$ " + conta.getSaldo());
            
        } else {
            
            System.out.println("Depósito anulado.");
            
        }
        
        System.out.println("--------------------------------------------------");
        
        //DESPESA
        
        System.out.print("Deseja pagar a despesa [" + despesa.getDescricao() + "] de R$ " + despesa.getValor() + "? (1-Sim / 2-Não): ");
        
        opcao = entrada.nextInt();
        
        if (opcao == 1) {
            
            if (conta.getSaldo() + conta.getLimite() >= despesa.getValor()) {
                
                conta.setSaldo(conta.getSaldo() - despesa.getValor());
                despesa.setStatus("Paga");
                
                System.out.println("Despesa paga com sucesso!");
                System.out.println("Saldo Atual: R$ " + conta.getSaldo());
                
            } else {
                System.out.println("Saldo insuficiente.");
            }
            
        } else {
            System.out.println("Pagamento anulado.");
        }
        
        System.out.println("--------------------------------------------------");
        
        System.out.print("Deseja poupar R$ 200.00 para a meta [" + meta.getObjetivo() + "]? (1-Sim / 2-Não): ");
        opcao = entrada.nextInt();
     
        if (opcao == 1) {
            
            if (conta.getSaldo() >= 200) {
                
                conta.setSaldo(conta.getSaldo() - 200);
                meta.setValorPoupado(meta.getValorPoupado() + 200);
                
                System.out.println("Dinheiro guardado na meta!");
                
            } else {
                System.out.println("Saldo insuficiente para poupar.");
            }
            
        } else {
            System.out.println("operação anulada.");
        }
        
        // Relatório Final
        System.out.println("\n========================================");
        System.out.println("         RELATÓRIO FINANCEIRO");
        System.out.println("========================================");
        System.out.println("Conta: " + conta.getNumero() + " | Cliente: " + conta.getCliente());
        System.out.println("Saldo Final: R$ " + conta.getSaldo() + " | Limite: R$ " + conta.getLimite());
        System.out.println("Situação do " + despesa.getDescricao() + ": " + despesa.getStatus());
        System.out.println("Meta [" + meta.getObjetivo() + "]: R$ " + meta.getValorPoupado() + " poupados de R$ " + meta.getValorAlvo());
        System.out.println("========================================");
    }
}    