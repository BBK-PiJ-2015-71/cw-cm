import java.lang.*;

public class ContactImpl implements Contact{

	Integer id;
	String name;
	String note;

	public ContactImpl(Integer id, String name, String note){

		if (id <= 0) {
      			throw new IllegalArgumentException(Integer.toString(id));
    		}
 
		if (id==null || name==null||note==null) {
      			throw new NullPointerException("Null entry");
    		}

		this.id=id;
		this.name=name;
		this.note=note;
	}

	public ContactImpl(Integer id, String name){

		if (id <= 0) {
      			throw new IllegalArgumentException(Integer.toString(id));
    		}

		if (id==null || name==null) {
      			throw new NullPointerException("Null entry");
    		}

		this.id=id;
		this.name=name;
		this.note=null;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public String getNotes(){
		return note;
	}

	public void addNotes(String note){
		this.note=note;
	}
}