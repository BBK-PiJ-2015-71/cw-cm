import java.util.*;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Misc{


	public static void main(String[] args){
	
		Integer i=null;

		if(i==null){
			System.out.println("NULL- yes");
		}
		else{
			System.out.println("NULL- NO");	
		}
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");	
		Calendar date1=new GregorianCalendar(2016,3,25);
		System.out.println("Date : "+sdf.format(date1.getTime()));

		Set<String> setA=new LinkedHashSet<String>();

		setA.add("element 0");
		setA.add("element 1");
		setA.add("element 2");

		//access via Iterator
		Iterator iterator = setA.iterator();
		while(iterator.hasNext()){
			String element = (String) iterator.next();
			System.out.println("Element: "+element);
		}

		Set<Contact> setB=new LinkedHashSet<Contact>();

		Contact contact1 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
		Contact contact2 = new ContactImpl(13,"Adam Smith");

		setB.add(contact1);
		setB.add(contact2);

		//access via Iterator
		Iterator iterator2 = setB.iterator();
		while(iterator2.hasNext()){
			Contact element2 = (ContactImpl) iterator2.next();
			System.out.println("Element: "+element2.getId());
		}


      Map m1 = new HashMap(); 
      m1.put("Zara", "8");
      m1.put("Mahnaz", "31");
      m1.put("Ayan", "12");
      m1.put("Daisy", "14");
      System.out.println();
      System.out.println(" Map Elements");
      System.out.println("\t" + m1);


	Map<Integer, String> mapA = new HashMap<Integer, String>();

	mapA.put(101, "element 1");
	mapA.put(102, "element 2");
	mapA.put(103, "element 3");

	String element11 = (String) mapA.get(101);

	System.out.println("map element: "+element11);

	Iterator<Integer> iterator4 = mapA.keySet().iterator();
	while(iterator4.hasNext()){
		Integer key4   = iterator4.next();
		String value4 = mapA.get(key4);
		System.out.println("Key:" + key4+" , "+"Value:  "+value4);
		if(key4.equals(102)){System.out.println("Equal 101");}
	}

	//access via new for-loop
	for(Object key5 : mapA.keySet()) {
    		Object value5 = mapA.get(key5);
	}

	Set<Contact> setC=new LinkedHashSet<Contact>();

	Contact contact3 = new ContactImpl(123,"Ullash Hazarika","He is always late to meetings");
	Contact contact4 = new ContactImpl(13,"Adam Smith");

	setC.add(contact3);
	setC.add(contact4);

	Calendar date2=new GregorianCalendar(2016,1,25);

	Meeting meeting1 = new PastMeetingImpl(101,date2,setB,"Meeting was short. Key people missing");

	Map<Integer, Meeting> mapM = new HashMap<Integer, Meeting>();

	mapM.put(101, meeting1);

	Meeting meet101 = (PastMeetingImpl) mapM.get(101);
	System.out.println("Meeting101: "+meet101.getId());


	List listA = new ArrayList();

	listA.add("element 0");
	listA.add("element 1");
	listA.add("element 2");

	System.out.println("list : "+listA.get(0));
	
	//access via Iterator
	Iterator iterator6 = listA.iterator();
	while(iterator6.hasNext()){
		String element6 = (String) iterator6.next();
		System.out.println("List elements: "+element6);
		
	}


	//access via new for-loop
	for(Object object : listA) {
		String element = (String) object;
	}

	String name1="ullash Hazarika";
	String str1="ula";
	System.out.println("contains ul: "+name1.contains(str1));

	Misc.func(100,130,-8);
    }

    public static void func(int... nums){
		for(int i=0;i<nums.length;i++){
			System.out.println("num is "+nums[i]);
		}
	}

}