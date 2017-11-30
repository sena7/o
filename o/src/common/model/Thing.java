package common.model;

/**
 * @author Sena Bak
 * <p>
 * <p>
 * Anything that we recognise. <br>
 * The things we put into Thing object are the copy/aspect/reflection of
 * the actual things.<br>
 * Nothing can be free from the time and space. <br>
 * So Things in this program is even if they are pointing at the things.
 * <br>
 * We express what have about the things in many ways.<br>
 * <p>
 * The uniqueness of the thing and the Thing as Object are dealt
 * separately because they have different purposes. <br>
 * The uniqueness of the thing is determined by <br>
 * The time inserted into the system The equals
 */
public class Thing {

    private long id;
    private Object expressed;
    /**
     * lazy initialisation.
     * can be null.
     */
    private Time time;
    private DatabaseTime databaseTime;

    /**
     * not complete
     */
    public Thing(Object expressed) {
        System.out.println(expressed.getClass());
        this.expressed = expressed;
    }

    public Thing() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Object getExpressed() {
        return expressed;
    }

    public void setExpressed(Object expressed) {
        this.expressed = expressed;
    }


    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public DatabaseTime getDatabaseTime() {
        return databaseTime;
    }

    public void setDatabaseTime(DatabaseTime databaseTime) {
        this.databaseTime = databaseTime;
    }
}
