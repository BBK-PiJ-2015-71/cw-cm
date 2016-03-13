import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Set;

public class FutureMeetingImpl extends MeetingImpl implements FutureMeeting{

	public FutureMeetingImpl(Integer ID, Calendar date, Set<Contact> contacts){
		super(ID, date, contacts);

	}

}