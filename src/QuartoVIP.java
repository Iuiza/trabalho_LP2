public class QuartoVIP extends Quarto {

    // ======= CONSTRUTOR =======
    public QuartoVIP(int numero){
        super(numero);
        super.setTipo("VIP");
    }
    // ======= MÉTODOS =======
    @Override
    public double calcPrecoTotal() {
        int qtdeDia = 0;
        super.precoDiaria = 700.00;
        return super.precoDiaria * qtdeDia;
    }

    
}
