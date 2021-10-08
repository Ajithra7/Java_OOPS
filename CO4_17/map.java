import java.util.*;
class map
	{
	public static void main(String args[])
	    	{
        	HashMap<String, Integer> hm = new HashMap<String, Integer>();
  
       	        hm.put("a", 100);
        	hm.put("b", 200);
        	hm.put("c", 300);
        	hm.put("d", 400);
  
        // Traversing through the map, the insertion order is not retained in the hashmap.
		System.out.println("initial map contents:");
       		for (HashMap.Entry<String, Integer> me : hm.entrySet())
 			{
            		System.out.print(me.getKey() + ":");
            		System.out.println(me.getValue());
        		}
		System.out.println("map contents after updation:");
		hm.put("c",500);
		for (HashMap.Entry<String, Integer> me : hm.entrySet())
 			{
            		System.out.print(me.getKey() + ":");
            		System.out.println(me.getValue());
        		}
		hm.remove("a");
		System.out.println("map contents after removal:");
		for (HashMap.Entry<String, Integer> me : hm.entrySet())
 			{
            		System.out.print(me.getKey() + ":");
            		System.out.println(me.getValue());
        		}
    		}
	}