package hospital.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Обьект Доктор
 */
public class Doctors extends People {
    private int id;
    private String name;
    private String degree;
    private Date dateOfBirth;
    // @JsonProperty ("yearExperience")
    private int yearEperience;
    @JsonProperty("type")
    private List<String> type;
    private boolean visible;


    @Override
    public String toString() {
        return "\t" + "Доктор{" +
                "id:" + id +
                ", имя:'" + name + '\'' +
                ", степень:'" + degree + '\'' +
                ", дата рождения: " + dateOfBirth +
                ", опыт работы: " + yearEperience +
                ", тип:" + type +
                ", visible:" + visible +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctors)) return false;
        Doctors doctors = (Doctors) o;
        return id == doctors.id &&
                yearEperience == doctors.yearEperience &&
                visible == doctors.visible &&
                Objects.equals(name, doctors.name) &&
                Objects.equals(degree, doctors.degree) &&
                Objects.equals(dateOfBirth, doctors.dateOfBirth) &&
                Objects.equals(type, doctors.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, degree, dateOfBirth, yearEperience, type, visible);
    }

    @Override
    public void say() {
        System.out.println("Hello");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getYearEperience() {
        return yearEperience;
    }

    public void setYearEperience(int yearEperience) {
        this.yearEperience = yearEperience;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }


}
