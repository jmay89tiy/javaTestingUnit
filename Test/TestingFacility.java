
import com.company.IllegalArgumentException;
import com.company.EventClass;
import com.company.EventLog;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import static org.junit.Assert.*;

public class TestingFacility {

    EventLog allEventsGoHere = new EventLog();

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void properEvent() throws IllegalArgumentException {
        EventClass event = new EventClass();
        event.setName("Jeff");
        event.setAction("Face2Face");
        assertTrue(allEventsGoHere.addEvent(event));

    }

    @Test
    public void improperEventName() throws IllegalArgumentException {
        EventClass event = new EventClass();
        expected.expect(IllegalArgumentException.class);
        event.setName(null);
        event.setAction("Face2Face");
        assertTrue(allEventsGoHere.addEvent(event));

    }

    @Test
    public void properEventAction() throws IllegalArgumentException {
        EventClass event = new EventClass();
        expected.expect(IllegalArgumentException.class);
        event.setName("Jeff");
        event.setAction(null);
        assertTrue(allEventsGoHere.addEvent(event));


    }


    @Test
    public void properEventActionTwo() throws IllegalArgumentException {
        EventClass event = new EventClass();
//        expected.expect(IllegalArgumentException.class);
        event.setName("Jeff");
        event.setAction("PhoneCall");
        assertTrue(allEventsGoHere.addEvent(event));

    }

    @Test
    public void properEventActionThree() throws java.lang.IllegalArgumentException {
        EventClass event = new EventClass();
       // assertTrue(allEventsGoHere.addEvent(event));
    }

    @Test
    public void properEventActionFour() throws IllegalArgumentException {
        EventClass event = new EventClass();
//        expected.expect(IllegalArgumentException.class);
        event.setName("Jeff");
        event.setAction("TextMessaging");
        assertTrue(allEventsGoHere.addEvent(event));

    }

    @Test
    public void properEventActionFive() throws IllegalArgumentException {
        EventClass event = new EventClass();
//        expected.expect(IllegalArgumentException.class);
        event.setName("Jeff");
        event.setAction("Unknown");
        assertTrue(allEventsGoHere.addEvent(event));

    }
}
