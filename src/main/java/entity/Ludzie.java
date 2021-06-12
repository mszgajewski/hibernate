package entity;

import javax.persistence.*;

@Entity
public class Ludzie {
    private String imie;
    private String nazwisko;

    @Id
    @Column(name = "imie")
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Basic
    @Column(name = "nazwisko")
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ludzie ludzie = (Ludzie) o;

        if (imie != null ? !imie.equals(ludzie.imie) : ludzie.imie != null) return false;
        if (nazwisko != null ? !nazwisko.equals(ludzie.nazwisko) : ludzie.nazwisko != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = imie != null ? imie.hashCode() : 0;
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        return result;
    }
}
