package pl.edu.uksw.zad28;

public class Person{
	private String imie, nazwisko;
	
	public Person(String imie, String nazwisko){
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	
	public void wypisz(){
		System.out.println("Imie: " + imie + "\tNazwisko: " + nazwisko);
	}
	
	public String toString(){
		return "imie: " + imie + ", nazwisko: " + nazwisko;
	}
}
