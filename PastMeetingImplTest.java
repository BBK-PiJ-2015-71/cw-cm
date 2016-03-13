import org.junit.*;
import static org.junit.Assert.*;
import java.lang.*;
import java.util.Set;
import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PastMeetingImplTest {

	@Test(expected = IllegalArgumentException.class)
	public void testExceptions1() {
		Set<Contact> setB=new LinkedHashSet<Contact>();

		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");

		setB.add(contact1);
		setB.add(contact2);

		Calendar date1=new GregorianCalendar(2016,1,25);

		PastMeeting meeting1 = new PastMeetingImpl(-101,date1,setB,"Meeting was short. Key people missing");

	}

	@Test(expected = NullPointerException.class)
	public void testExceptions2() {
		Set<Contact> setB=new LinkedHashSet<Contact>();

		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");

		setB.add(contact1);
		setB.add(contact2);

		Calendar date1=new GregorianCalendar(2016,1,25);

		PastMeeting meeting1 = new PastMeetingImpl(101,date1,null,"Meeting was short. Key people missing");

	}

	@Test
	public void testgetNotes(){

		Set<Contact> setB=new LinkedHashSet<Contact>();

		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");

		setB.add(contact1);
		setB.add(contact2);

		Calendar date1=new GregorianCalendar(2016,1,25);

		PastMeeting meeting1 = new PastMeetingImpl(101,date1,setB,"Meeting was short. Key people missing");

		String resultnotes	 = meeting1.getNotes();	

		assertEquals("Meeting was short. Key people missing",resultnotes);

	}

	@Test
	public void testgetId(){

		Set<Contact> setB=new LinkedHashSet<Contact>();

		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");

		setB.add(contact1);
		setB.add(contact2);

		Calendar date1=new GregorianCalendar(2016,1,25);

		PastMeeting meeting1 = new PastMeetingImpl(101,date1,setB,"Meeting was short. Key people missing");

		int resultId	 = meeting1.getId();	

		assertEquals(101,resultId);

	}

	@Test
	public void testgetDate(){

		Set<Contact> setB=new LinkedHashSet<Contact>();

		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");

		setB.add(contact1);
		setB.add(contact2);

		Calendar date1=new GregorianCalendar(2016,1,25);
		Calendar date2=new GregorianCalendar(2016,1,25);

		PastMeeting meeting1 = new PastMeetingImpl(101,date1,setB,"Meeting was short. Key people missing");

		Calendar resultDate  = meeting1.getDate();	

		assertEquals(date2,resultDate);

	}


	@Test
	public void testgetContacts(){

		Set<Contact> setB=new LinkedHashSet<Contact>();

		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");

		setB.add(contact1);
		setB.add(contact2);

		Calendar date1=new GregorianCalendar(2016,1,25);

		PastMeeting meeting1 = new PastMeetingImpl(101,date1,setB,"Meeting was short. Key people missing");

		Set<Contact> setA=new LinkedHashSet<Contact>();
		setA.add(contact1);
		setA.add(contact2);

		Set<Contact> resultContacts  = meeting1.getContacts();	

		assertEquals(setA,resultContacts);

	}
}