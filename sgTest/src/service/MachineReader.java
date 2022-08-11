package service;

public class MachineReader {
	
	private String surface ;
	private String machine ;
	private String instructions ;

	public MachineReader(){
		this.surface = "";
		this.machine = "";
		this.instructions = "";
	}
	
	
	public boolean executeParse(){
		return DataReader.parseMachine(machine)
				&& DataReader.parseSurface(surface)
				&& DataReader.parseListInstruction(instructions);
	}
	
	public String getSurface() {
		return surface;
	}

	public void setSurface(String surface) {
		this.surface = surface;
	}

	public String getMachine() {
		return machine;
	}

	public void setMachine(String machine) {
		this.machine = machine;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
}
