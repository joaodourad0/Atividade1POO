package model;

public class PrincipalProduto {

	 public static void main(String[] args) {
	        
	        Produto pao = new Produto("Pão", 12.0f, 1);
	        Produto queijo = new Produto("Queijo", 7.0f, 1);
	        Produto leite = new Produto("leite", 5.5f, 1);

	        Produto[] produtos = {pao, queijo, leite};
	        float valorTotalEstoque = pao.setValorEstoque(produtos);
	        
	        System.out.println("Valor total em estoque: R$" + valorTotalEstoque);
	        System.out.println();
	    }
	}

