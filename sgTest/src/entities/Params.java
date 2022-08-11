package entities;

public class Params {

	private Params(){
		
	}
	
	
	public static enum Orientation {
		NORTH('N', "Nord"),
		EAST('E', "est"),
		WEST('W', "ouest"),
		SOUTH('S', "sud");
		
		private char codeOrientation;
		private String libelleOrientation;
		
		private Orientation(char pCodeOrientation, String pLibelleOrientation){
			this.codeOrientation = pCodeOrientation;
			this.libelleOrientation = pLibelleOrientation;
		}
		public char getCodeOrientation() {
			return codeOrientation;
		}
		public String getLibelleOrientation() {
			return libelleOrientation;
		}
	}
	

	public static enum InstructionMachine{
		DROITE('D', "Pivoter à droite"),
		GAUCHE('G', "Pivoter à gauche"),
		AVANCER('A', "Avancer");
		
		private String libelleInstruction;
		private char codeInstruction;
		
		private InstructionMachine(char pCodeInstruction, String libelleInstruction) {
			this.libelleInstruction = libelleInstruction;
			this.codeInstruction = pCodeInstruction;
		}
		
		public String getLibelleInstruction() {
			return libelleInstruction;
		}
		public char getCodeInstruction() {
			return codeInstruction;
		}

	}

	
}
