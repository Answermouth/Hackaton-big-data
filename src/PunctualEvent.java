/**
 * Created by Ansel on 17/11/2017.
 */
public class PunctualEvent extends Event {

    public PunctualEvent(String name, long datetime) {
        super(name, datetime);
    }

    public PunctualEvent(String name, String datetime) {
        super(name, Long.parseLong(datetime));
    }
}
