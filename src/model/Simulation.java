package model;

import java.util.Map;

import view.SimulationScreen;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public abstract class Simulation {
		protected SimulationScreen myView;
	
		public Simulation(SimulationScreen simScreen){
			myView = simScreen;
		}
	
		/**
		 * first fill grid with appropriate square types
		 * then pass squares their appropriate neighbors
		 * Then update squares
		 */
		abstract void runSim(Map<String, String> paramMap, Integer[][] grid);
		
		/**
		 * fill grid with squares that have the right values given the parameters and the type of each space
		 * initialize grid, and fill
		 * @param paramMap 
		 */
		abstract void fillGrid(Map<String, String> paramMap, Integer[][] grid);
		
		/**
		 * first it will pass each square its neighbors
		 *  then it will go through and call each cell to update.
		 *  update view
		 */
		abstract void updateGrid();
		
		/**
		 * pass each square its neighbors
		 */
		abstract void updateNeighbors();
		
		/**
		 * this method takes myGrid and turns it into a grid that is readable for the view
		 */
		abstract void updateColorGrid();
		
	}

	
	

