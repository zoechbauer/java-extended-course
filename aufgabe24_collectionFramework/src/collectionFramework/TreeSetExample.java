package collectionFramework;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import javax.annotation.Generated;

/**
 * This example shows how you could use TreeSet Collection for merging mail lists.
 * @author zoe
 *
 */
public class TreeSetExample {
	ArrayList<Email> emailList1 = new ArrayList<>();
	ArrayList<Email> emailList2 = new ArrayList<>();
	TreeSet<Email> mergedList  = new TreeSet<>();
	
	
	public void mergeMailLists() {
		generateMailList1();
		generateMailList2();
		printMailList(emailList1, "Liste 1");
		printMailList(emailList2, "Liste 2");
		mergeLists();
		printMergedList(mergedList, "Liste 1 + Liste 2");
	}
	
	private void generateMailList1() {
		emailList1.add(new Email("Daniel", "Düsentrieb",  "daniel.duesentrieb@provider.com"));
		emailList1.add(new Email("Lisa", "Fleissig",  "lisa.fleissig@provider.com"));
		emailList1.add(new Email("Max", "Mustermann",  "max.mustermann@provider.com"));
	}
	
	private void generateMailList2() {
		emailList2.addAll(emailList1); // duplicate email
		emailList2.add(new Email("Otto", "Normalverbraucher",  "otto.normalverbraucher@provider.com"));
	}
	
	private void mergeLists() {
		this.mergedList.addAll(this.emailList1);
		this.mergedList.addAll(this.emailList2);
	}
	
	private void printMailList(ArrayList<Email> emails, String header) {
		System.out.printf("%n%s%n", header);
		for(Email email : emails) {
			System.out.println(email);
		}
	}
	
	private void printMergedList(TreeSet<Email> mergedList, String header) {
		System.out.printf("%n%s%n", header);
		Iterator<Email> it = mergedList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
