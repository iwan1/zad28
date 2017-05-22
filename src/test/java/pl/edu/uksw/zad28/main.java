package pl.edu.uksw.zad28;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.collections4.map.MultiValueMap;

public class main {
	public <T> void wypisz(ArrayList<T> a){
		for(int i = 0; i<a.size(); i++){
			System.out.println(a.get(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiValueMap<Integer, Person> wiekowo = new MultiValueMap<Integer, Person>();
		
		wiekowo.put(23, new Person("Maciej", "Iwanski"));
		wiekowo.put(23, new Person("Maciej", "Jasko"));
		wiekowo.put(23, new Person("Kolo", "Wrotek"));
		
		wiekowo.put(0, new Person("Nowo", "Rodek"));
		
		ArrayList<Person> a = (ArrayList<Person>) wiekowo.getCollection(23);
		main mojemain = new main();
		mojemain.wypisz(a);
		
	}

}
