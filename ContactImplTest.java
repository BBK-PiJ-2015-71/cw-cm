import org.junit.*;
import static org.junit.Assert.*;
import java.lang.*;

public class ContactImplTest {

	@Test(expected = IllegalArgumentException.class)
	public void testExceptions1() {
		Contact contact1 = new ContactImpl(-123,"Ullash Hazarika","He is always late to meetings");

	}

	@Test(expected = NullPointerException.class)
	public void testExceptions2() {
		Contact contact1 = new ContactImpl(123,null,null);

	}

	@Test
	public void testgetId(){
		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");
		int resultId1    = contact1.getId();
		int resultId2	 = contact2.getId();	
		assertEquals(123,resultId1);
		assertEquals(13,resultId2);

	}

	@Test
	public void testgetName(){
		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");
		String resultname1  = contact1.getName();
		String resultname2	 = contact2.getName();	
		assertEquals("Ullash Hazarika",resultname1);
		assertEquals("Adam Smith",resultname2);
	}

	@Test
	public void testgetNotes(){
		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");
		String resultnote1  = contact1.getNotes();
		String resultnote2  = contact2.getNotes();	
		assertEquals("He is always late to meetings",resultnote1);
		assertEquals(null,resultnote2);
	}

	@Test
	public void testaddNotes(){
		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");
		contact1.addNotes("A new note");
		contact2.addNotes("A new note");	
		String resultnote1  = contact1.getNotes();
		String resultnote2  = contact2.getNotes();	
		assertEquals("A new note",resultnote1);
		assertEquals("A new note",resultnote2);
	}
}