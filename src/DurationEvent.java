import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by Ansel on 17/11/2017.
 */
public class DurationEvent extends Event{
    private long endTime;

    public DurationEvent(String name, long datetime, long endTime) {
        super(name, datetime);
        this.endTime = endTime;
    }

    public DurationEvent(String name, long datetime, String endTime) {
        this(name, datetime, Long.parseLong(endTime));
    }

    @Override
    public String toXml() {
        Date start = new Date(this.datetime * 1000);
        Date end = new Date(this.endTime * 1000);
        DateFormat format = new SimpleDateFormat("MMM dd yyyy HH:mm:ss z", Locale.US);
        format.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));

        String output = "";

        output += "    <event\n";
        output += "        start=\"" + format.format(start) + "\"\n";
        output += "        end=\"" + format.format(end) + "\"\n";
        output += "        isDuration=\"true\"\n";
        output += "        title=\"" + this.name + "\"\n";
        output += "        >\n";
        output += "        " + this.name + "\n";
        output += "        </event>\n\n";

        return output;
    }
}
