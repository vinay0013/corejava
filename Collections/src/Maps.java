import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// Hashmap: Random order
		Map<String, String> hash_Map = new HashMap<String, String>();
		hash_Map.put("January", "month");
		hash_Map.put("February", "month");
		hash_Map.put("March", "month");
		hash_Map.put("April", "month");
		hash_Map.put("May", "month");
		System.out.println(hash_Map);

		// Treemap: Aphabetical order of key
		Map<String, String> tree_Map = new TreeMap<String, String>();
		tree_Map.put("January", "month");
		tree_Map.put("February", "month");
		tree_Map.put("March", "month");
		tree_Map.put("April", "month");
		tree_Map.put("May", "month");
		System.out.println(tree_Map);

		// LinkedHashmap: Insertion order of key
		Map<String, String> linked_hash_Map = new LinkedHashMap<String, String>();
		linked_hash_Map.put("January", "month");
		linked_hash_Map.put("February", "month");
		linked_hash_Map.put("March", "month");
		linked_hash_Map.put("April", "month");
		linked_hash_Map.put("May", "month");
		System.out.println(linked_hash_Map);

	}

}
