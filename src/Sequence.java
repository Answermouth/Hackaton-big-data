import java.util.ArrayList;

/**
 * Created by Ansel on 17/11/2017.
 */
public class Sequence {

    ArrayList<Event> events;

    public Sequence() {
        this.events = new ArrayList<Event>();
    }

    public Event getEvent(int i) {
        return events.get(i);
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public ArrayList<Event> getEvents(int i, int j) {
        return new ArrayList<Event>(events.subList(i, j));
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }

    public void addEvents(ArrayList<Event> events) {
        this.events.addAll(events);
    }
}
