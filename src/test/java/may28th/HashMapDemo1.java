package may28th;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		Map<String, Integer> hMap=new HashMap<String, Integer>();
		
		//put
		hMap.put("John", 100);
		hMap.put("Kevin", 101);
		hMap.put("Praveen", 102);
		hMap.put("Ravi", 103);
		
		System.out.println("No of entries : "+hMap.size());
		
		Set<Entry<String, Integer>> entries=hMap.entrySet();
		
		for(Entry<String, Integer> temp:entries)
		{
			System.out.println(temp.getKey()+"----"+temp.getValue());
		}
		
		System.out.println(hMap);
	  Set<String> keys=hMap.keySet();
	  System.out.println(keys);
	  Collection<Integer> values=hMap.values();
	  System.out.println(values);
		
		

	}

}
