package loja;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class CadLoja {

	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
		Collection<Produto> produto = new ArrayList<>();
		
		produto.add(new Produto("JJ-01","NOTEBOOK",2500.60,10));
		produto.add(new Produto("JJ-02","CARREGADOR PARA CELLUAR",78.90,10));
		produto.add(new Produto("JJ-03","WEBCAM",95.00,10));
		produto.add(new Produto("JJ-04","IMPRESSORA",750.60,10));
		produto.add(new Produto("JJ-05","PLACA MÃE",2300.60,10));
		produto.add(new Produto("JJ-06","PLACE DE VIDEO",3500.00,10));
		produto.add(new Produto("JJ-08","MOUSE",45.00,10));
		produto.add(new Produto("JJ-09","PENDRIVE 32GB",67.00,10));
		produto.add(new Produto("JJ-10","HD SSD 240GB",240,10));
		
		//Pessoa p = new Pessoa();
		
		
	
	
	}
}
