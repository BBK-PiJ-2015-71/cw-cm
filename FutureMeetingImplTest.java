import org.junit.*;
import static org.junit.Assert.*;
import java.lang.*;
import java.util.Set;
import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FutureMeetingImplTest {

	@Test(expected = IllegalArgumentException.class)
	public void testExceptions1() {
		Set<Contact> setB=new LinkedHashSet<Contact>();

		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");

		setB.add(contact1);
		setB.add(contact2);

		Calendar date1=new GregorianCalendar(2016,1,25);

		FutureMeeting meeting1 = new FutureMeetingImpl(-101,date1,setB);

	}

	@Test(expected = NullPointerException.class)
	public void testExceptions2() {
		Set<Contact> setB=new LinkedHashSet<Contact>();

		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");

		setB.add(contact1);
		setB.add(contact2);

		Calendar date1=new GregorianCalendar(2016,1,25);

		FutureMeeting meeting1 = new FutureMeetingImpl(null,date1,setB);

	}

	@Test
	public void testgetId(){

		Set<Contact> setB=new LinkedHashSet<Contact>();

		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");

		setB.add(contact1);
		setB.add(contact2);

		Calendar date1=new GregorianCalendar(2016,1,25);

		FutureMeeting meeting1 = new FutureMeetingImpl(101,date1,setB);

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

		FutureMeeting meeting1 = new FutureMeetingImpl(101,date1,setB);

		Calendar resultDate  = meeting1.getDate();	

		assertEquals(date1,resultDate);

	}


	@Test
	public void testgetContacts(){

		Set<Contact> setB=new LinkedHashSet<Contact>();

		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");

		setB.add(contact1);
		setB.add(contact2);

		Calendar date1=new GregorianCalendar(2016,1,25);

		FutureMeeting meeting1 = new FutureMeetingImpl(101,date1,setB);

		Set<Contact> setA=new LinkedHashSet<Contact>();
		setA.add(contact1);
		setA.add(contact2);

		Set<Contact> resultContacts  = meeting1.getContacts();	

		assertEquals(setA,resultContacts);

	}
	
}