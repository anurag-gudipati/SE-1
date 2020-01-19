
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ClassGrade {
	Map<String,String> classList = new HashMap<String,String>();
	
	public ClassGrade() {
		classList.put("Bob","A");
		classList.put("Mary","B");
		classList.put("Sarah","C");
		classList.put("Philip","A");
		classList.put("Greg","F");
	}
	public void printClassList() {
		Iterator<Entry<String,String>> entries = classList.entrySet().iterator();
		while(entries.hasNext()) {
			Entry<String,String> entry = entries.next();
			System.out.println("Key = " + entry.getKey()+",Value = " + entry.getValue());
		}
	}
	public void printClassList2() {
		for(Map.Entry<String,String> entry : classList.entrySet()) {
			System.out.println("Key = "+ entry.getKey()+",Value = "+entry.getValue());
		}
		for(String key : classList.keySet()) {
			System.out.println("Key = "+ key);
		}
		for(String value : classList.values()) {
			System.out.println("Value =" + value);
		}
	}
	public static void main(String args[]) {
		ClassGrade myCLassList = new ClassGrade();
		myCLassList.printClassList();
	}
	}
