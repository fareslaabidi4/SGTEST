package entities;

public class Surface {
	private CordXY maximumPos;

	public CordXY getMaximumPos() {
		return maximumPos;
	}

	public void setMaximumPos(CordXY maximumPos) {
		this.maximumPos = maximumPos;
	}

	public Surface(CordXY maximumPos) {
		super();
		this.maximumPos = maximumPos;
	}

	public Surface() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maximumPos == null) ? 0 : maximumPos.hashCode());
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
		Surface other = (Surface) obj;
		if (maximumPos == null) {
			if (other.maximumPos != null)
				return false;
		} else if (!maximumPos.equals(other.maximumPos))
			return false;
		return true;
	}
	
	
}
