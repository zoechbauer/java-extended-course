package collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * This example shows how you could use HashMap Collection for maintaining students.
 * @author zoe
 *
 */
public class HashMapExample1 {
	
	public static void manageStudents() {
		HashMap<Integer, Student> studentsMap  = new HashMap<>();
		
		Student danDues = new Student(11111, "Daniel", "Düsentrieb", "Physik");
		Student lisFlei = new Student(22222, "Lisa", "Fleissig", "Englisch");
		Student maxMust = new Student(33333, "Max", "Mustermann", "Informatik");
		
		studentsMap.put(11111, danDues);
		studentsMap.put(22222, lisFlei);
		studentsMap.put(33333, maxMust);
		
		// print list
		System.out.println(studentsMap.toString());
		System.out.println();
		
		for(Map.Entry<Integer, Student> entry : studentsMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		// override existing key
		studentsMap.put(33333, danDues);
		
		System.out.println();
		for(Map.Entry<Integer, Student> entry : studentsMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		// delete item
		studentsMap.remove(22222);
		
		System.out.println();
		for(Map.Entry<Integer, Student> entry : studentsMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		// **************************
		// sorted list with TreeMap
		// **************************
		TreeMap<Integer, Student> sortedStudenTreeMap = new TreeMap<>();
		
		sortedStudenTreeMap.put(11111, danDues);
		sortedStudenTreeMap.put(22222, lisFlei);
		sortedStudenTreeMap.put(33333, maxMust);
		
		System.out.println();
		for(Map.Entry<Integer, Student> entry : sortedStudenTreeMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		  
	}
	
}
