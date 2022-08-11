package service;

import entities.CordXY;
import entities.Params.InstructionMachine;
import entities.Params.Orientation;
import entities.PositionMachine;

public class InstructionManagement {
	
	
	private InstructionManagement(){

	}

	public static CordXY avancerMachine(PositionMachine positionMachine, CordXY coordonnesMax){
		CordXY cordXYSuivantes = null;
		int x, y;
		switch (positionMachine.getOrientationMachine()) {
		case NORTH:
			x = positionMachine.getCordonneesMachine().getX();
			y = positionMachine.getCordonneesMachine().getY() + 1;
			break;
		case EAST:
			x = positionMachine.getCordonneesMachine().getX() + 1;
			y = positionMachine.getCordonneesMachine().getY();
			break;
		case SOUTH:
			x = positionMachine.getCordonneesMachine().getX();
			y = positionMachine.getCordonneesMachine().getY() - 1;
			break;
		case WEST:
			x = positionMachine.getCordonneesMachine().getX() - 1;
			y = positionMachine.getCordonneesMachine().getY();
			break;
		default:
			x=0;
			y=0;
		}
		cordXYSuivantes = new CordXY(x, y);
		
		if (cordXYSuivantes != null
				&& coordonnesMax.supMax(cordXYSuivantes)) {
			return cordXYSuivantes;
		} else {
			return positionMachine.getCordonneesMachine();
		}
	}
	
	
	
	public static Orientation pivoterDroite(Orientation orientation) {
		Orientation orientationSuivante = null ;
		switch (orientation){
			case NORTH : 
				orientationSuivante =  Orientation.EAST;
				break;
			case EAST : 
				orientationSuivante =  Orientation.SOUTH;
				break;
			case SOUTH : 
				orientationSuivante =  Orientation.WEST;
				break;
			case WEST : 
				orientationSuivante =  Orientation.NORTH;
				break;
		 
		}
		return orientationSuivante;		
	}
	
	
	public static Orientation pivoterGauche(Orientation orientation) {
		Orientation orientationSuivante = null ;
		switch (orientation){
			case NORTH : 
				orientationSuivante =  Orientation.WEST; 
				break;
			case EAST : 
				orientationSuivante =  Orientation.NORTH; 
				break;
			case SOUTH : 
				orientationSuivante =  Orientation.EAST; 
				break;
			case WEST : 
				orientationSuivante =  Orientation.SOUTH; 
				break;
		}
		return orientationSuivante;		
	}


	public static void executerInstruction(PositionMachine positionMachine, InstructionMachine instruction,CordXY coordonnesMax) {
		
		switch (instruction){
			case AVANCER : 
				positionMachine.setCordonneesMachine(InstructionManagement.avancerMachine(positionMachine, coordonnesMax)); 
				break;
			case DROITE : 
				positionMachine.setOrientationMachine(InstructionManagement.pivoterDroite(positionMachine.getOrientationMachine())); 
				break;
			case GAUCHE : 
				positionMachine.setOrientationMachine(InstructionManagement.pivoterGauche(positionMachine.getOrientationMachine())); 
				break;
		}
	}
}
