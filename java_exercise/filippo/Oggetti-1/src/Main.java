import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Persona paolo = new Persona("Paolo", "Verdi",Sesso.M);
        System.out.println(paolo);

        // CREO VARIABILE CON LA DATA
        String pattern = "dd-MM-yyyy";

        // https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        // GESTISCE LE ECCEZIONI
        try {
            Date date = simpleDateFormat.parse("19-07-2001");
            paolo.setDataNascita(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(paolo);

        // STIAMO CREANDO E STAMPANDO UNO STUDENTE NUOVO
        Studente gianni = new Studente("Gianni", "Bianchi", Sesso.M, 1);
        System.out.println(gianni);

        // CREIAMO
        System.out.println(Compito.getNextId());
        Compito compito1 = new Compito();
        System.out.println(Compito.getNextId());
        Compito compito2 = new Compito();
        System.out.println(Compito.getNextId());
        System.out.println(compito1);
        System.out.println(compito2);
    }
}
