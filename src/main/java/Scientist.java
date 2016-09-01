import java.io.Serializable;

/**
 * Created by Alexandr on 01.09.2016.
 */
public class Scientist implements Cloneable, Serializable {
    private String nameScientist;

    public Scientist (Scientist scientist) {
        this.nameScientist = scientist.nameScientist;
    }


    public Scientist(String nameScientist) {
        this.nameScientist = nameScientist;
    }

    public Scientist() {
    }

    public String getNameScientist() {
        return nameScientist;
    }

    public void setNameScientist(String nameScientist) {
        this.nameScientist = nameScientist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Scientist scientist = (Scientist) o;

        return nameScientist != null ? nameScientist.equals(scientist.nameScientist) : scientist.nameScientist == null;

    }

    @Override
    public int hashCode() {
        return nameScientist != null ? nameScientist.hashCode() : 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Scientist{" +
                "nameScientist='" + nameScientist + '\'' +
                '}';
    }
}
