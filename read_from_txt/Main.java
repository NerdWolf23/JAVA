package read_from_txt;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.File;
class Riga {
    public String cognome;
    public String nome;
    public double altezza;
    public int peso;
}
public class Main {
// [m] // [kg]
public static void main(String[] args) {

    File myObj = new File("./read_from_txt/tabella.txt");
    if (myObj.exists()) {
      System.out.println("File name: " + myObj.getName());
      System.out.println("Absolute path: " + myObj.getAbsolutePath());
      System.out.println("Writeable: " + myObj.canWrite());
      System.out.println("Readable " + myObj.canRead());
      System.out.println("File size in bytes " + myObj.length());
    } else {
      System.out.println("The file does not exist.");
    }

    System.out.println("+-----------------+-----------------+-------------+-------------+");
    System.out.println("|     Cognome     |      Nome       | Altezza (m) |  Peso (kg)  |");
    System.out.println("+-----------------+-----------------+-------------+-------------+");

    try (Scanner s = new Scanner(new FileReader("./read_from_txt/tabella.txt"))) {
    while(s.hasNext()) {
        Riga r = new Riga();
        r.cognome = s.next();
        r.nome = s.next();
        r.altezza = s.nextDouble();
        r.peso = s.nextInt();
        System.out.format("|      %-11s|      %-11s|     %.2f m  | %6d kg   | %n", r.cognome, r.nome, r.altezza, r.peso);
        }   
    }catch (FileNotFoundException e) {
    e.printStackTrace();
}
        System.out.println("+-----------------+-----------------+-------------+-------------+");
    }
}