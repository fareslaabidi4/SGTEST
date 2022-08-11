package service;

import java.util.ArrayList;
import java.util.List;

import entities.Params;
import entities.Params.InstructionMachine;
import entities.PositionMachine;
import entities.Surface;

public class MachineManagement {
	
	private Surface surface;
	private PositionMachine positionMachine;
	private List<Params.InstructionMachine> listeInstruction;
	
	public void setSurface(Surface surface) {
		this.surface = surface;
	}
	
	public void setPositionMachine(PositionMachine positionMachine) {
		this.positionMachine = positionMachine;
	}

	public void setListeInstruction(
			List<Params.InstructionMachine> pListeInstruction) {
		this.listeInstruction = pListeInstruction;
		if(pListeInstruction == null){
			listeInstruction = new ArrayList<InstructionMachine>();
		}
	}

	public void executerInstructions() {
		for(InstructionMachine instruction : listeInstruction){
			InstructionManagement.executerInstruction(positionMachine,
					instruction, this.surface.getMaximumPos());
		}
	}

	public String toString(){
		return 	positionMachine.getCordonneesMachine().getX() 
				+ " " 
				+ positionMachine.getCordonneesMachine().getY()
				+ " " 
				+ positionMachine.getOrientationMachine().getCodeOrientation() ;
	}
}
