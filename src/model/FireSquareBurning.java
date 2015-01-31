package model;

import java.util.List;
import java.util.Random;

public class FireSquareBurning extends FireSquare{

	private static final int PROB_CATCH = 60;
	private Random myRandom;
	
	public FireSquareBurning(List<FireSquare> neighbors) {
		super(neighbors);
		myRandom = new Random();
	}

	@Override
	public FireSquare chechStatus() {
		return new FireSquareEmpty(myNeighbors);
	}

	@Override
	public FireSquare checkNeighbor() {
		if(calculateProbability()){
			return new FireSquareBurning(myNeighbors);
		}
		else{
			return null;
		}
	}

	private boolean calculateProbability() {
		return myRandom.nextInt(PROB_CATCH) <= PROB_CATCH;
				
	}

}
