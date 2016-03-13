import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Set;

public abstract class MeetingImpl implements Meeting{

	private Integer ID;
	private Calendar date;
	private Set<Contact> contacts;

	public MeetingImpl(Integer ID, Calendar date, Set<Contact> contacts){
	
		if (ID <= 0) {
      			throw new IllegalArgumentException(Integer.toString(ID));
    		}
 
		this.ID=ID;
		this.date=date;
		this.contacts=contacts;

	}
	
	public int getId(){
		return this.ID;
	}

	public Calendar getDate(){
		return this.date;
	}	

	public Set<Contact> getContacts(){
		return this.contacts;
	}
}