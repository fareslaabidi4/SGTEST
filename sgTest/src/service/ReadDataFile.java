package service;

import java.util.ArrayList;
import java.util.List;

import entities.CordXY;
import entities.Params.Orientation;
import entities.PositionMachine;
import entities.Params.InstructionMachine;
import entities.Surface;

public class ReadDataFile {

	private static final String ESPACE = " ";

	private ReadDataFile(){

	}


	public static PositionMachine formaterLigneMachine(String ligneMachine){
		String[] elts = ligneMachine.split(ESPACE);
		CordXY pCoordonneesMachine = new CordXY(Integer.valueOf(elts[0]), Integer.valueOf(elts[1]));
		Orientation orientationMachine = getOrientation(elts[2].charAt(0));
		return new PositionMachine(pCoordonneesMachine, orientationMachine);
	}

	
	public static Surface formaterLigneSurface(String ligneSurface){
		String[] elts = ligneSurface.split(ESPACE);
		return new Surface(new CordXY(Integer.valueOf(elts[0]), Integer.valueOf(elts[1])));
	}

	
	public static List<InstructionMachine> formaterLigneInstruction(String ligneInstruction){
		List<InstructionMachine> listInstruction = new ArrayList<InstructionMachine>();
		for(char instruction :ligneInstruction.toCharArray()){
			listInstruction.add(getInstruction(instruction));
		}
		return listInstruction;
	}


	public static Orientation getOrientation(char cOrientation){
		for(Orientation orientation : Orientation.values()) {
			if (orientation.getCodeOrientation() == cOrientation){
				return orientation;
			}
		}
		return null;
	}

	public static InstructionMachine getInstruction(char cInstruction){
		for(InstructionMachine instruction : InstructionMachine.values()) {
			if (instruction.getCodeInstruction() == cInstruction) {
				return instruction;
			}
		}
		return null;
	}
}

