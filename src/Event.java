/**
 * Created by Ansel on 17/11/2017.
 */
public abstract class Event {
    private String name;
    private long datetime;

    public Event(String name, long datetime) {
        this.name = name;
        datetime = datetime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDatetime() {
        return datetime;
    }

    public void setDatetime(long datetime) {
        datetime = datetime;
    }
}
