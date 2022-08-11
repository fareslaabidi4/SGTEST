package service;

import entities.Params.InstructionMachine;
import entities.Params.Orientation;

public class DataReader {

	private DataReader(){

	}

	
	public static boolean parseMachine(String machine){
		StringBuilder stringBuilder = new StringBuilder("");
		stringBuilder.append(Orientation.NORTH.getCodeOrientation())
			.append("|").append(Orientation.SOUTH.getCodeOrientation())
			.append("|").append(Orientation.EAST.getCodeOrientation())
			.append("|").append(Orientation.WEST.getCodeOrientation());
		return machine.matches("(\\d+) (\\d+) (" + stringBuilder.toString()+")");
	}
	

	public static boolean parseListInstruction(String instructions){
		StringBuilder stringBuilder = new StringBuilder("");
		stringBuilder.append("(").append(InstructionMachine.AVANCER.getCodeInstruction())
		.append("|").append(InstructionMachine.DROITE.getCodeInstruction())
		.append("|").append(InstructionMachine.GAUCHE.getCodeInstruction())
		.append(")+");

		return instructions.matches(stringBuilder.toString());
	}


	public static boolean parseSurface(String surface){
		return surface.matches("(\\d+) (\\d+)");
	}
}
