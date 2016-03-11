import org.junit.*;
import static org.junit.Assert.*;

public class ContactImplTest {

	@Test
	public void testgetId(){
		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		int resultId     = contact1.getId();
		assertEquals(123,resultId);

	}

	@Test
	public void testgetName(){
		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		String resultName  =contact1.getName();
		assertEquals("Ullash Hazarika",resultName);
	}

	@Test
	public void testgetNotes(){
		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		String resultNotes  =contact1.getNotes();
		assertEquals("He is always late to meetings",resultNotes);
	}

}