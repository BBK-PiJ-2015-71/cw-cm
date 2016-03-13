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

	
}