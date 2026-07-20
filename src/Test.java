import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Robo robo = new Robo();
        
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        robo.setComportamento(normal);

        int opcao = -1;

        System.out.println("=== PAINEL DE CONTROLE DO ROBÔ ===");

        while (opcao != 0) {
            System.out.println("Escolha o comando:");
            System.out.println("1 - Mover Normal");
            System.out.println("2 - Mover Defensivo");
            System.out.println("3 - Mover Agressivo");
            System.out.println("4 - Recarregar Bateria");
            System.out.println("0 - Desligar Robô");
            System.out.print("Opção: ");
            
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    robo.setComportamento(normal);
                    robo.mover();
                    break;
                case 2:
                    robo.setComportamento(defensivo);
                    robo.mover();
                    break;
                case 3:
                    robo.setComportamento(agressivo);
                    robo.mover();
                    break;
                case 4:
                    robo.recarregar();
                    break;
                case 0:
                    System.out.println("Desligando os sistemas do robô...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
            }
        }
        
        leitor.close();
    }
}