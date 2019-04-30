package util;

import main.Route;

/**
 * @author Bianca Amorim
 *
 *
 */

//Heur�stica de refinamento: descida em vizinhan�a vari�vel

public interface RefinementHeuristic {
	
	/**
	 * @param r
	 * @param graph
	 * @param route
	 */
	void refine(Route r, long[][] graph, int[] route);

}