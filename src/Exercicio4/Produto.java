package Exercicio4;

public class Produto extends Imposto {
    private double valorFrete;

    public Produto(String nome, double custoProduto, double valorVenda, double valorPIS, double valorCOFINS, double valorICMS, double valorDIFAL, double valorFrete) {
        super(nome, custoProduto, valorVenda, valorPIS, valorCOFINS, valorICMS, valorDIFAL);
        this.valorFrete = valorFrete;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(Double aDouble) {
        this.valorFrete = valorFrete;
    }

    public Produto() {

    }

    @Override
    public double calcularRob() {
        double valorRob = super.calcularRob() - valorFrete;
        return valorRob;
    }
}