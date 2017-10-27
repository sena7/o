package common.model;

import java.io.Serializable;
import java.util.UUID;

public abstract class AbstractBaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	public AbstractBaseEntity() {
	this.id = UUID.randomUUID().toString();
	}
	
	public int hashCode(){
		return id.hashCode();
	}
	
	
	
	public String getId() {
		return id;
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof AbstractBaseEntity)) {
			return false;
		}
		AbstractBaseEntity other = (AbstractBaseEntity) obj;
		return getId().equals(other.getId());
	}

}
