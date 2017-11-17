import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by Ansel on 17/11/2017.
 */
public class PunctualEvent extends Event {

    public PunctualEvent(String name, long datetime) {
        super(name, datetime);
    }

    public PunctualEvent(String name, String datetime) {
        this(name, Long.parseLong(datetime));
    }

    @Override
    public String toXml() {
        Date date = new Date(this.datetime * 1000);
        DateFormat format = new SimpleDateFormat("MMM dd yyyy HH:mm:ss z", Locale.US);
        format.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));

        String output = "";

        output += "    <event\n";
        output += "        start=\"" + format.format(date) + "\"\n";
        output += "        title=\"" + this.name + "\"\n";
        output += "        >\n";
        output += "        " + this.name + "\n";
        output += "        </event>\n\n";

        return output;
    }
}
