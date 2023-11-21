import java.util.Scanner;

public class DaneStudenta {
    public static void main(String[] args){
        // tworzymy obiekt klasy Scanner do wczytywania danych z klawiatury
        Scanner scanner=new Scanner(System.in);
        System.out.print("Wprowadz Imie i nazwisko studenta: "); // wyswietlamy komunikat zapraszajacy do wpisania danych studenta
        // wprowadzone imie i nazwisko wpsiujemy do zmiennej
        String imieNazwisko =scanner.nextLine();
        //wyswietlamy imie i nazwisko
        System.out.println("Imie i nazwisko studenta : "+imieNazwisko);
        // zamykamy obiekt scaner
        scanner.close();
    }
}
