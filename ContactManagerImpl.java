import java.lang.*;
import java.util.Set;
import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ContactManagerImpl implements ContactManager{

	private Integer meetingCount=0;
	private Integer currentmeetingID=1;
	private Integer currentcontactID=1;

	private Map<Integer, Meeting> meetingmap;
	private Map<Integer, Meeting> futuremeetingmap;
	private Map<Integer, Meeting> pastmeetingmap;
	private List<Meeting> meetings;	
	private List<FutureMeeting> futuremeetings;
	private List<PastMeeting> pastmeetings;
	private Map<Integer, Contact> contactmap;

	public ContactManagerImpl(){

		meetingmap = new HashMap<Integer, Meeting>();
		futuremeetingmap = new HashMap<Integer, Meeting>();
		pastmeetingmap  = new HashMap<Integer, Meeting>(); 
		meetings      = new ArrayList<Meeting>();
		futuremeetings= new ArrayList<FutureMeeting>();
		pastmeetings  = new ArrayList<PastMeeting>();
		contactmap    = new HashMap<Integer, Contact>();
		this.currentmeetingID=1;
		this.currentcontactID=1;
		
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

		FutureMeeting meeting1 = (FutureMeeting) futuremeetingmap.get(id);
		if(meeting1!=null){ return meeting1;}
		PastMeeting meeting2 = (PastMeeting) pastmeetingmap.get(id); 
                return meeting2;
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
     
		FutureMeeting meeting1 = (FutureMeetingImpl) futuremeetingmap.get(id);
		Calendar date1 = meeting1.getDate();
		Set<Contact> contactSet=meeting1.getContacts();
		PastMeeting meeting2 = new PastMeetingImpl(id,date1,contactSet,text);
		pastmeetingmap.put(id,meeting2);
		return meeting2;
	}

	public int addNewContact(String name, String notes){
		Contact contact1= new ContactImpl(currentcontactID,name,notes);
		int idc=currentcontactID;
		contactmap.put(currentcontactID,contact1);
		currentcontactID++;
		return idc;
	}

	public Set<Contact> getContacts(String name){
		Set<Contact> setB=new LinkedHashSet<Contact>();

		Iterator iterator4 = contactmap.keySet().iterator();
		while(iterator4.hasNext()){
			Object key4   = iterator4.next();
			Contact contact4 = contactmap.get(key4);
			if(contact4.getName().contains(name)){
				setB.add(contact4);
			}
		}
		
		return setB;
	}

	public Set<Contact> getContacts(int... ids){
		Set<Contact> setB=new LinkedHashSet<Contact>();

		Iterator<Integer> iterator4 = contactmap.keySet().iterator();

		while(iterator4.hasNext()){
			Integer key4   = iterator4.next();
			Contact contact4 = contactmap.get(key4);
			
			for(int i=0;i<ids.length;i++){	

				if(key4.equals(ids[i])){
					setB.add(contact4);
				}
			}
		}
		
		return setB;
	}

	public void flush(){

	}
}