package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "zajęcięByTyp", query = "SELECT e from zajęcie e WHERE e.typ='protetyka'")
public class Zajęcie {
    private Integer id;
    private String typ;

    @Basic
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "typ")
    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Zajęcie zajęcie = (Zajęcie) o;

        if (id != null ? !id.equals(zajęcie.id) : zajęcie.id != null) return false;
        if (typ != null ? !typ.equals(zajęcie.typ) : zajęcie.typ != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (typ != null ? typ.hashCode() : 0);
        return result;
    }
}
