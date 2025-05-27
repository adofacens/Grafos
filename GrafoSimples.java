package AppGrafos;

import java.util.*; // Importa as estruturas como Scanner e LinkedList

class GrafoSimples {
	private int numVertices; // Armazena a qtde. de vértices
	private LinkedList<Integer>[] adjList; // Lista de adjacência
	private boolean direcionado; // define se o grafo é direcionado ou não
	
	// construtor do grafo
	Grafo(int numVertices, boolean direcionado) {
		this.numVertices = numVertices; // Inicializa o número de vértices
		this.direcionado = direcionado; // Define o tipo de grafo
		
		// cria o aray de listas de adjacência
		@SuppressWarnings("unchecked") // o java não permite a criação de arrays de tipos genéricos diretamente
		// Por isso utilizamos o LinkedList<Integer>[], para esta finalidade.
		LinkedList<Integer>[] tempList = new LinkedList[numVertices];
		this.adjList = tempList;
		
	}

	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
