/**
 * Implementa��o da heur�stica do Vizinho Mais Pr�ximo (Nearest Neighbor Heuristic) como a Heur�stica de Constru��o
 */
package main;

/**
 * @author Bianca Amorim
 * 
 *
 */
public class NNH implements ConstructiveHeuristic {
	
	int countRoutes[];
	int start;
	
	//NNH - Nearest Neighbor Heuristic (Heur�stica do vizinho mais pr�ximo)
	//TSS - Travelling Salesman Solution (Solu��o do TSP)
	
	@Override
	public void solutionTPS(long[][] graph, int[] vectorTSS) {
		
		//Contador de rotas por cidade e ponto de partida
		countRoutes = new int[graph.length];
		start = 0;
		
		int currentCity = start, nextCity = -1, n = 0;
		vectorTSS[0] = start;
	}

}
