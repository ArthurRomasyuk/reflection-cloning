/**
 * Created by Alexandr on 01.09.2016.
 */
public class CloneByClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scientist vasya = new Scientist("Vasya");
        Dolly dolly = new Dolly("white", 4, vasya);
        System.out.println("original info: "+dolly);

        Dolly dollyClone = (Dolly) dolly.clone();

        System.out.println("clone info: "+dollyClone);
        dollyClone.getScientist().setNameScientist("Gleb");

        System.out.println("----Changing scientists----");

        System.out.println("original info: "+dolly);
        System.out.println("clone info: "+dollyClone);

        //для глубокого клонирования необходимо разкомментить второй оверрайд метода clone()




    }
}
