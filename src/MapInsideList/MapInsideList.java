package MapInsideList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapInsideList {

	public static void main(String[] args) {
		
		List<Map<String,String>> list=new ArrayList<>();
		
		Map<String,String> map=new HashMap<>();
		map.put("a", "Nitish");
		map.put("b", "Kumar");
		
		list.add(map);
		
		for(Map<String,String> m:list)
		{
			for(Map.Entry<String, String> e:m.entrySet())
			{
				String key = e.getKey();
			    String value = e.getValue();
			    
			    System.out.println("Key : " +key);
			    System.out.println("value : " +value);
			}
		}
		
	}

}
