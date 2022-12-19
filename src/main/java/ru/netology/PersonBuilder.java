package ru.netology;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String city;

    public PersonBuilder setName(String name) throws IllegalStateException {
        if (name.isEmpty()) throw new IllegalStateException("Поле \"ИМЯ\" не может быть пустым!");
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) throws IllegalStateException {
        if (surname.isEmpty()) throw new IllegalStateException("Поле \"ФАМИЛИЯ\" не может быть пустым!");
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Возраст указан неверно!");
        }
        return this;
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() throws IllegalStateException {
        if (name != null && surname != null) {
            return new Person(name, surname, age, city);
        } else {
            throw new IllegalStateException("Не заполнены обязательные поля!");
        }
    }
}
