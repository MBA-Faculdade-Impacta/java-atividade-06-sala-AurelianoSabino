package br.com.impacta.models;
import java.util.ArrayList;

public class Produto {

  public int codigo;
  public String descricao;
  public double valor;

public static ArrayList<Produto> listarProdutos(){

  ArrayList<Produto> listaDeProdutos = new ArrayList<>();

  Produto produto = new Produto();
		
  produto.codigo = 1;
	produto.descricao = "Camisa";
	produto.valor = 70.00;
	listaDeProdutos.add(produto);

  produto.codigo = 2;
  produto.descricao = "Shorts";
	produto.valor = 57.50;
	listaDeProdutos.add(produto);

  produto.codigo = 3;
	produto.descricao = "Meia";
	produto.valor = 9.99;
	listaDeProdutos.add(produto);

  produto.codigo = 4;
	produto.descricao = "Toca";
	produto.valor = 35.00;
	listaDeProdutos.add(produto);

  produto.codigo = 5;
	produto.descricao = "Luva";
	produto.valor = 19.50;
	listaDeProdutos.add(produto);

  return listaDeProdutos;

}

  public static Produto buscarProdutoPeloId(ArrayList<Produto> listaDeProdutos , int codigoProduto){

    for(int x = 0; x <= listaDeProdutos.size(); x++){
      
      if(listaDeProdutos.get(x).codigo == codigoProduto) {
          return listaDeProdutos.get(x);
      }
    
    }

      return null;
    
  }

}

  

