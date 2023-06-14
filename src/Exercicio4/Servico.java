package Exercicio4;

public class Servico extends Imposto {
    private double valorISS;

    public Servico(String nome, double custoProduto, double valorVenda, double valorPIS, double valorCOFINS, double valorICMS, double valorDIFAL, double valorISS) {
        super(nome, custoProduto, valorVenda, valorPIS, valorCOFINS, valorICMS, valorDIFAL);
        this.valorISS = valorISS;
    }

    public Servico() {

    }

    public double getValorISS() {
        return valorISS;
    }

    public void setValorISS(Double aDouble) {
        this.valorISS = valorISS;
    }

    @Override
    public double calcularRob() {
        double valorRob = super.calcularRob() - valorISS;
        return valorRob;
    }

}
