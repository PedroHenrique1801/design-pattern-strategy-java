public class Robo {
    private Comportamento comportamento;
    private int bateria = 100; 

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        if (bateria <= 0) {
            System.out.println("[ERRO] Bateria esgotada! O robô não pode se mover. Recarregue.");
            return;
        }

        if (bateria <= 20 && !(this.comportamento instanceof ComportamentoDefensivo)) {
            System.out.println("[ALERTA] Bateria crítica (" + bateria + "%). Trocando para modo DEFENSIVO automaticamente para poupar energia!");
            this.comportamento = new ComportamentoDefensivo();  
        }

        comportamento.mover();
        
        bateria -= 20; 
        System.out.println("(Nível atual da bateria: " + bateria + "%)\n");
    }

    public void recarregar() {
        this.bateria = 100;
        System.out.println("[SISTEMA] Robô recarregado! Bateria em 100%.\n");
    }
}
