package entities;

import entities.Params.Orientation;

public class PositionMachine {

	private CordXY cordonneesMachine;
	private Params.Orientation orientationMachine;
	public CordXY getCordonneesMachine() {
		return cordonneesMachine;
	}
	public void setCordonneesMachine(CordXY cordonneesMachine) {
		this.cordonneesMachine = cordonneesMachine;
	}
	public Params.Orientation getOrientationMachine() {
		return orientationMachine;
	}
	public void setOrientationMachine(Params.Orientation orientationMachine) {
		this.orientationMachine = orientationMachine;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cordonneesMachine == null) ? 0 : cordonneesMachine.hashCode());
		result = prime * result + ((orientationMachine == null) ? 0 : orientationMachine.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PositionMachine other = (PositionMachine) obj;
		if (cordonneesMachine == null) {
			if (other.cordonneesMachine != null)
				return false;
		} else if (!cordonneesMachine.equals(other.cordonneesMachine))
			return false;
		if (orientationMachine != other.orientationMachine)
			return false;
		return true;
	}
	public PositionMachine(CordXY cordonneesMachine, Orientation orientationMachine) {
		super();
		this.cordonneesMachine = cordonneesMachine;
		this.orientationMachine = orientationMachine;
	}
	
	
}
