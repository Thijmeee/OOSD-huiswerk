package Week1.Object_IO;

import java.io.*;

public class Rooster implements Serializable {
    String vak;
    String lokaal;
    String docentNaam;
    int min;

    public Rooster(String vak, String lokaal, String docentNaam, int min) {
        this.vak = vak;
        this.lokaal = lokaal;
        this.docentNaam = docentNaam;
        this.min = min;
    }
    public void writeFile(String filename){
        try{
            File file = new File(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(this);
            objectOutputStream.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void readFile(String filename){
        try{
            File file = new File(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Rooster newRooster = (Rooster)objectInputStream.readObject();
            System.out.println("Vak: " + newRooster.vak + "\nDocent: " + newRooster.docentNaam +
                                " \nLokaal: " + newRooster.lokaal + " \nAantal min: " + newRooster.min);
            objectInputStream.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}

