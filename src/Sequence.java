import java.util.ArrayList;

/**
 * Created by Ansel on 17/11/2017.
 */
public class Sequence {

    ArrayList<Event> events;

    public Sequence() {}

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }
}
