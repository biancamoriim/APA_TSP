package salesman;

import controller.ControllerTSP;
import main.NNH;
import main.VND;

/**
 * @author Bianca Amorim
 *
 *
 */

//Classe principal

public class TravellingSalesman {
	
	public static void main(String[] args) {
		
		//Classe controladora
		ControllerTSP control = new ControllerTSP();
		
		// Matriz original
		control.printMatrixTSP();
		
		//Solu��o para o TSP com o VND
		//Par�metros(Construtitva -> Nearerst Neighboor | Refinamento -> Variable Neighborhood Descent)
		control.controlTSP(new NNH(), new VND());
		
		//Exibi��o da primeira solu��o
		control.printInitialVectorTSS();
		control.printInitialVectorTSS();
		
		//Exibi��o do refinamento
		control.printRefinementVectorTSS();
		control.printRefinementResultTSS();
		
		//Exibi��o da melhor solu��o encontrada
		control.printOptGlobalVectorTSS();
		control.printOptGlobalTSS();
		
	}

}
