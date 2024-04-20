/**
* An example that sorts numbers by it`s value from the smallest to biggest with map
* @version 1.0
*/

import java.util.*;


public class Main { 
  
    public static void main(String args[])  { 

        Map<String, Integer> hm = new HashMap<String, Integer>(); 
  
        hm.put("a", new Integer(100)); 
        hm.put("b", new Integer(200)); 
        hm.put("c", new Integer(450)); 
        hm.put("d", new Integer(400)); 
        
        List<Map.Entry<String, Integer>> list = new LinkedList<>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        
        // Traversing through sorted list
        for (Map.Entry<String, Integer> entry : list) {
            System.out.print(entry.getKey() + ":");
            System.out.println(entry.getValue());
        }
    } 
}
