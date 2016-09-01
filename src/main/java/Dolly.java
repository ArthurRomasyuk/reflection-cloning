import java.io.Serializable;

/**
 * Created by Alexandr on 26.08.2016.
 */
public class Dolly implements Cloneable, Serializable {
    private String colour;
    private int legsNumber;
    private Scientist scientist;

    public Dolly() {
    }

    public Dolly(String colour, int legsNumber, Scientist scientist) {
        this.colour = colour;
        this.legsNumber = legsNumber;
        this.scientist = scientist;
    }

    public Dolly(String colour, int legsNumber) {
        this.colour = colour;
        this.legsNumber = legsNumber;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Scientist getScientist() {
        return scientist;
    }

    public void setScientist(Scientist scientist) {
        this.scientist = scientist;
    }

    public int getLegsNumber() {
        return legsNumber;
    }

    public void setLegsNumber(int legsNumber) {
        this.legsNumber = legsNumber;
    }

    private void Be () {
        System.out.println("Beeee!");
    }

    @Override
    public String toString() {
        return "Dolly{" +
                "colour='" + colour + '\'' +
                ", legsNumber=" + legsNumber +
                ", scientist=" + scientist +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dolly dolly = (Dolly) o;

        if (legsNumber != dolly.legsNumber) return false;
        if (colour != null ? !colour.equals(dolly.colour) : dolly.colour != null) return false;
        return scientist != null ? scientist.equals(dolly.scientist) : dolly.scientist == null;

    }



    @Override
    public int hashCode() {
        int result = colour != null ? colour.hashCode() : 0;
        result = 31 * result + legsNumber;
        result = 31 * result + (scientist != null ? scientist.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        Dolly clone = (Dolly) super.clone();
//        Scientist scientistForClone = new Scientist(scientist);
//        clone.setScientist(scientistForClone);
//        return clone;
//    }
}
