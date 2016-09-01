import java.io.*;

/**
 * Created by Alexandr on 01.09.2016.
 */
public class CloneBySerialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("user.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        Scientist alph = new Scientist("Alph");
        Dolly dolly = new Dolly("black", 5, alph);
        objectOutputStream.writeObject(dolly);

        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Dolly dollyClone = (Dolly) objectInputStream.readObject();

        System.out.println(dolly == dollyClone);
        System.out.println(dolly.equals(dollyClone));

        dolly.getScientist().setNameScientist("Beta");

        System.out.println("original info: "+dolly);
        System.out.println("clone info: "+dollyClone);






    }
}
