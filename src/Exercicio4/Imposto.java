package Exercicio4;

public class Imposto {

    private String produtoNome;
    private Double produtoCusto;
    private Double venda;
    private Double pis;
    private Double cofins;
    private Double icms;
    private Double difal;

    public Imposto() {

    }

    public double calcularRob()
    {
        double valorRob = ((venda - produtoCusto - pis - cofins - icms - difal) / venda) * 100;
        return valorRob;
    }

    public Imposto(String produtoNome, Double produtoCusto, Double venda, Double pis, Double cofins, Double icms, Double difal) {
        this.produtoNome = produtoNome;
        this.produtoCusto = produtoCusto;
        this.venda = venda;
        this.pis = pis;
        this.cofins = cofins;
        this.icms = icms;
        this.difal = difal;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public Double getProdutoCusto() {
        return produtoCusto;
    }

    public void setProdutoCusto(Double produtoCusto) {
        this.produtoCusto = produtoCusto;
    }

    public Double getVenda() {
        return venda;
    }

    public void setVenda(Double venda) {
        this.venda = venda;
    }

    public Double getPis() {
        return pis;
    }

    public void setPis(Double pis) {
        this.pis = pis;
    }

    public Double getCofins() {
        return cofins;
    }

    public void setCofins(Double cofins) {
        this.cofins = cofins;
    }

    public Double getIcms() {
        return icms;
    }

    public void setIcms(Double icms) {
        this.icms = icms;
    }

    public Double getDifal() {
        return difal;
    }

    public void setDifal(Double difal) {
        this.difal = difal;
    }
}

