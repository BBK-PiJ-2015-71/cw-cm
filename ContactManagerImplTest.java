import org.junit.*;
import static org.junit.Assert.*;
import java.lang.*;
import java.util.Set;
import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class ContactManagerImplTest{

	@Test
	public void testaddFutureMeeting(){

		Set<Contact> setB=new LinkedHashSet<Contact>();

		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");

		setB.add(contact1);
		setB.add(contact2);

		Calendar date1=new GregorianCalendar(2016,1,25);

		//FutureMeeting  meeting1 = new FutureMeetingImpl(101,date1,setB);

		ContactManager manager1 = new ContactManagerImpl();

		int resultId	 = manager1.addFutureMeeting(setB, date1);
		
		assertEquals(1,resultId);

	}

}

///javac -cp .;junit-4.12.jar;hamcrest-core-1.3.jar ContactManagerImplTest.java
///java  -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore ContactManagerImplTest