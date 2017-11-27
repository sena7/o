package common.model;

import java.time.ZonedDateTime;

/**
 * @author Sena Bak <br>
 * @version 1.0 <br>
 * 201710251001
 * 
 *          <p>
 * 
 *          PersistenceObject holds the fields that would be commonly persisted to the
 *          database.
 * 
 *          </p>
 *
 */
public class CommonPersistence {
	private Long id;
	private ZonedDateTime insert;
    private ZonedDateTime update;
    
	public Long getId() {
		return id;
	}
	public ZonedDateTime getInsert() {
		return insert;
	}
	public ZonedDateTime getUpdate() {
		return update;
	}
	
   
	

}
