import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ListSets {

	public static void main(String[] args) {
		// Lists
		List<String> listString = new ArrayList<String>();
		listString.add("January");
		listString.add("February");
		listString.add("March");
		listString.add("April");
		listString.add("May");

		for (int i = 0; i < listString.size(); i++) {
			System.out.println(listString.get(i));
		}

		// Hashset: Random order
		Set<String> hash_Set = new HashSet<String>();
		hash_Set.add("January");
		hash_Set.add("February");
		hash_Set.add("March");
		hash_Set.add("April");
		hash_Set.add("May");
		System.out.println(hash_Set);

		// Treeset: Alphabetical order
		Set<String> tree_Set = new TreeSet<String>();
		tree_Set.add("January");
		tree_Set.add("February");
		tree_Set.add("March");
		tree_Set.add("April");
		tree_Set.add("May");
		System.out.println(tree_Set);

		// LinkedHashSet: Order of insertion
		Set<String> linked_Hash_Set = new LinkedHashSet<String>();
		linked_Hash_Set.add("January");
		linked_Hash_Set.add("February");
		linked_Hash_Set.add("March");
		linked_Hash_Set.add("April");
		linked_Hash_Set.add("May");
		System.out.println(linked_Hash_Set);

		// SortedSet: Same as treeset but contains additional functionalities like
		// headset,tailset,subset
		SortedSet<String> sites = new TreeSet<>();
		sites.add("January");
		sites.add("February");
		sites.add("March");
		sites.add("April");
		sites.add("May");
		System.out.println("Sorted Set: " + sites);
		System.out.println("First: " + sites.first());
		System.out.println("Last: " + sites.last());
		SortedSet<String> beforeQuiz = sites.headSet("March");
		System.out.println(beforeQuiz);
		SortedSet<String> betweenCodeAndQuiz = sites.subSet("February", "March");
		System.out.println(betweenCodeAndQuiz);
		SortedSet<String> afterCode = sites.tailSet("April");
		System.out.println(afterCode);

		// NavigableSet: Extension of sortedset with some addidiontla methods like
		// ceil,floor etc
		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(0);
		ns.add(1);
		ns.add(2);
		ns.add(3);
		ns.add(4);
		ns.add(5);
		ns.add(6);
		NavigableSet<Integer> reverseNs = ns.descendingSet();

		// Print the normal and reverse views
		System.out.println("Normal order: " + ns);
		System.out.println("Reverse order: " + reverseNs);

		NavigableSet<Integer> threeOrMore = ns.tailSet(3, true);
		System.out.println("3 or  more:  " + threeOrMore);
		System.out.println("lower(3): " + ns.lower(3));
		System.out.println("floor(3): " + ns.floor(3));
		System.out.println("higher(3): " + ns.higher(3));
		System.out.println("ceiling(3): " + ns.ceiling(3));

		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set:  " + ns);

		System.out.println("pollLast(): " + ns.pollLast());
		System.out.println("Navigable Set:  " + ns);

		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set:  " + ns);

		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set:  " + ns);

		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set:  " + ns);

		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("pollLast(): " + ns.pollLast());
	}

}
