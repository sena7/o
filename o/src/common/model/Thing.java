package common.model;

/**
 * 
 * @author Sena Bak
 * 
 *         <p>
 *         Anything that we recognise. <br>
 *         The things we put into Thing object are the copy/aspect/reflection of
 *         the things.<br>
 *         Nothing can be free from the time and space. <br>
 *         So Things in this program is even if they are pointing at the things.
 *         <br>
 *         We express what have about the Things in many ways.<br>
 * 
 * 
 * 
 *         The uniqueness of the thing and the Thing as Object are dealt
 *         separately because they have different purposes. <br>
 *         The uniqueness of the thing is determined by <br>
 *         The time inserted into the system The equals
 */
public class Thing {

	private CommonPersistence commonPersistence;
	private Object expressed;

	public CommonPersistence getCommonPersistence() {
		return commonPersistence;
	}

	public void setCommonPersistence(CommonPersistence commonPersistence) {
		this.commonPersistence = commonPersistence;
	}

	public Object getExpressed() {
		return expressed;
	}

	public void setExpressed(Object expressed) {
		this.expressed = expressed;
	}

	// TODO what if there is more primary matter which contains our thoughts ?
	// Like brain signal.
	// So instead of putting String, I put object as it is the very base of a
	// type and the minimal unit of being a container.

	/**
	 * True if this Thing is pointing at/holding of something specific, more
	 * substantial rather that the general, conceptual. A Thought I had is different
	 * the 'Thought' in that we use the same characters to call it. So even though I
	 * name it Thought, it is the bind of the series of things out of my head, not
	 * meaning the conceptual definition of thought in general.
	 */
	// private Boolean isUnique; // is pointing at the specific thing in your mind.

	// private Boolean isConceptual; // if it is set to be true, this object record
	// will be the only one in the database.

	// private List<Object> equals; // can be text, image, audio anything humans can
	// produce to point at the Thing. Capture of the Thing. Raw
	// if this Thing is not unique, a conceptual Thing, ..., no the relationship
	// between the conceptual word and

	// logically organised than equals.

	// To explain, express this thing outwardly, with use whatever available for
	// use and acceptable to the application. The limitations humans have the
	// the machine have will be applied to those.

	// express the below as another object, maybe as part of the Relationship
	// object.
	// 201709071029 These represent the relationships with the other things.
	// SO I think Thing is not a good place to be in

}
