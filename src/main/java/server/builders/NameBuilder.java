package server.builders;

import server.exceptions.ValidationException;
import server.validation.Validation;

import java.util.Scanner;

import static server.validation.Validation.validate;

public class NameBuilder {
    public static String build() {
        String name;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите название Vehicle: ");
            name = sc.nextLine();
            validate(name, Validation::validateUserName, "Неверное имя. Оно не должно быть пустым.");
            return name;
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
            return build();
        }
    }
}
