public class ContactImpl implements Contact{

	int id;
	String name;
	String note;

	public ContactImpl(int id, String name, String note){
		this.id=id;
		this.name=name;
		this.note=note;
	}

	public ContactImpl(int id, String name){
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