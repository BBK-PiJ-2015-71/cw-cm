import java.lang.*;
import java.util.Set;
import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ContactManagerImpl implements ContactManager{

	private Integer meetingCount=0;
	private Integer currentmeetingID=1;
	private Map<Integer, Meeting> meetingmap;
	private Map<Integer, Meeting> futuremeetingmap;
	private Map<Integer, Meeting> pastmeetingmap;
	private List<Meeting> meetings;	
	private List<FutureMeeting> futuremeetings;
	private List<PastMeeting> pastmeetings;

	public ContactManagerImpl(){

		meetingmap = new HashMap<Integer, Meeting>();
		futuremeetingmap = new HashMap<Integer, Meeting>();
		pastmeetingmap  = new HashMap<Integer, Meeting>(); 
		meetings      = new ArrayList<Meeting>();
		futuremeetings= new ArrayList<FutureMeeting>();
		pastmeetings  = new ArrayList<PastMeeting>();
	}
	
	public int addFutureMeeting(Set<Contact> contacts, Calendar date){
		int meetingID=currentmeetingID;
		FutureMeeting meeting1 = new FutureMeetingImpl(currentmeetingID,date,contacts);
		meetingmap.put(currentmeetingID,meeting1);
		futuremeetingmap.put(currentmeetingID,meeting1);
		currentmeetingID++;
		return meetingID;
	}

	public PastMeeting getPastMeeting(int id){
		PastMeeting meeting1 = (PastMeetingImpl) pastmeetingmap.get(id);
		return meeting1;
	}

	public FutureMeeting getFutureMeeting(int id){
		FutureMeeting meeting1 = (FutureMeeting) futuremeetingmap.get(id);
		return meeting1;

	}

	public Meeting getMeeting(int id){

		Set<Contact> setB=new LinkedHashSet<Contact>();

		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");

		setB.add(contact1);
		setB.add(contact2);

		Calendar date1=new GregorianCalendar(2016,1,25);

		FutureMeeting meeting1 = new FutureMeetingImpl(101,date1,setB);
		return meeting1;
	}

	public List<Meeting> getFutureMeetingList(Contact contact){
		return meetings;
	}

	public List<Meeting> getMeetingListOn(Calendar date){
		return meetings;
	}

	public List<PastMeeting> getPastMeetingListFor(Contact contact){
		return pastmeetings;
	}

	public void addNewPastMeeting(Set<Contact> contacts, Calendar date, String text){

		PastMeeting meeting1 = new PastMeetingImpl(currentmeetingID,date,contacts,text);
		pastmeetingmap.put(currentmeetingID,meeting1);
		meetingmap.put(currentmeetingID,meeting1);
		currentmeetingID++;
	}

	public PastMeeting addMeetingNotes(int id, String text){
     
		Set<Contact> setB=new LinkedHashSet<Contact>();

		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");

		setB.add(contact1);
		setB.add(contact2);

		Calendar date1=new GregorianCalendar(2016,1,25);

		PastMeeting meeting1 = new PastMeetingImpl(-101,date1,setB,"Meeting was short. Key people missing");

		return meeting1;
	}

	public int addNewContact(String name, String notes){
		return 0;
	}

	public Set<Contact> getContacts(String name){
		Set<Contact> setB=new LinkedHashSet<Contact>();

		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");

		setB.add(contact1);
		setB.add(contact2);
		return setB;
	}

	public Set<Contact> getContacts(int... ids){
		Set<Contact> setB=new LinkedHashSet<Contact>();

		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");

		setB.add(contact1);
		setB.add(contact2);
		return setB;
	}

	public void flush(){

	}
}