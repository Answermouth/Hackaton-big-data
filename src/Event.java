/**
 * Created by Ansel on 17/11/2017.
 */
public abstract class Event {
    protected String name;
    protected long datetime;

    public Event(String name, long datetime) {
        this.name = name;
        this.datetime = datetime;
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

    public abstract String toXml();
}
