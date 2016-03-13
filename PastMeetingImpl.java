import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Set;

public class PastMeetingImpl extends MeetingImpl implements PastMeeting{

	private String notes;
	public PastMeetingImpl(Integer ID, Calendar date, Set<Contact> contacts, String notes){
		super(ID, date, contacts);
		this.notes=notes;
	}

	public String getNotes(){
		return notes;
	}

}