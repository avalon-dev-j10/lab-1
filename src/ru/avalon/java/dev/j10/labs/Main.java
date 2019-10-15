package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //DONE
        /*
         * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
         */

        Person ivanov = new Person(
                "Иван",
                "Иванович",
                "Иванов",
                new Passport(
                        1234,
                        123456,
                        "Иван",
                        "Иванович",
                        "Иванов",
                        LocalDate.of(2000, 01, 01),
                        LocalDate.of(2014, 01, 01),
                        "Отделом УФМС 1231231221"
                ),
                new Address(
                        "РФ",
                        "123456",
                        "Область 123",
                        "Город 123",
                        "Улица 123",
                        "Дом 123",
                        "Квартира 123"
                )
        );

        Person smith = new Person(
                "John",
                "Edvard",
                "",
                "Smith",
                new Passport(
                        4567,
                        234567,
                        "John",
                        "Edvard",
                        "Smith",
                        LocalDate.of(1980, 11, 11),
                        LocalDate.of(2005, 11, 11),
                        "Отделом УФМС 1231231221"
                ),
                new Address(
                        "US",
                        "654321",
                        "State 111",
                        "Town 111",
                        "Street 111",
                        "house 123",
                        "door 123"
                )
        );

        //DONE
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        String ivanovFullName = ivanov.getFullName();
        String smithFullName = smith.getFullName();
        String ivanovAdress = ivanov.getAddress();
        String smithAdress = smith.getAddress();

        //DONE
        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        System.out.println(ivanovFullName);
        System.out.println(ivanovAdress);

        System.out.println(smithFullName);
        System.out.println(smithAdress);

        //DONE
        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
