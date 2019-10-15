package ru.avalon.java.dev.j10.labs.models;

import java.time.LocalDate;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {

    private int passportSeries;
    private int passportNumber;
    private String firstName;
    private String secondName;
    private String middleName;
    private String lastName;
    private LocalDate birthDay;

    //дата выдачи пасспорта
    private LocalDate dateOfIssue;

    //кем выдан паспорт
    private String issuedBy;


    public Passport() {
    }

    //конструктор имя и фамилия
    public Passport(int passportSeries, int passportNumber, String firstName, String lastName, LocalDate birthDay, LocalDate dateOfIssue, String issuedBy) {
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.dateOfIssue = dateOfIssue;
        this.issuedBy = issuedBy;
    }

    //конструктор имя, отчество, фамилия
    public Passport(int passportSeries, int passportNumber, String firstName, String middleName, String lastName, LocalDate birthDay, LocalDate dateOfIssue, String issuedBy) {
       this (passportSeries, passportNumber, firstName, lastName, birthDay, dateOfIssue, issuedBy);
       this.middleName = middleName;
    }

    //конструктор имя, второе имя, отчество, фамилия
    public Passport(int passportSeries, int passportNumber, String firstName, String secondName, String middleName, String lastName, LocalDate birthDay, LocalDate dateOfIssue, String issuedBy) {
        this (passportSeries, passportNumber, firstName, middleName, lastName, birthDay, dateOfIssue, issuedBy);
        this.secondName = secondName;
    }

    public int getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(int passportSeries) {
        this.passportSeries = passportSeries;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    //DONE
    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
}
