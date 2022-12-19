package ru.netology;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge() {
        return age != 0;
    }

    public boolean hasAddress() {
        return city != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        if (this.hasAge()) {
            return age;
        }
        return 0;
    }

    public String getAddress() {
        return city;
    }

    public void setAddress(String address) {
        if (this.hasAddress()) {
            this.city = address;
        }
    }

    public void happyBirthday() {
        if (age != 0) {
            age++;
        }
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setSurname(surname);
        personBuilder.setAddress(city);
        return personBuilder;
    }

    @Override
    public String toString() {
        return "{" +
                "Имя='" + name + '\'' +
                ", Фамилия='" + surname + '\'' +
                ", Возраст=" + age +
                ", Город='" + city + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, city);
    }
}
