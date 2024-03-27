package model;

public class Produto {
    private String nome;
    private float preco;
    private int qtdEstoque;


    public Produto(String nome, float preco, int qtdEstoque) {
        this.nome = nome;
        setPreco(preco);
        setQtdEstoque(qtdEstoque);
    }


    public float setValorEstoque(Produto[] produtos) {
        float valorTotal = 0;
        for (Produto produto : produtos) {
            valorTotal += produto.getPreco() * produto.getQtdEstoque();
        }
        return valorTotal;
    }

//------------------------------------------- 
    public boolean verificaProdutoDisponivel() {
        return qtdEstoque > 0;
    }

//-------------------------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

 //-------------------------------------------
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
    }

//-------------------------------------------
    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        if (qtdEstoque >= 0) {
            this.qtdEstoque = qtdEstoque;
        } else {
            System.out.println("A quantidade em estoque não pode ser negativa.");
        }
    }
    
}
