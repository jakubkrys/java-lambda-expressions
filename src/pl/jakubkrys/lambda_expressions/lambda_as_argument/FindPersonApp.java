package pl.jakubkrys.lambda_expressions.lambda_as_argument;

import java.util.*;

public class FindPersonApp {
    public static void main(String[] args) {

        PersonRepo personRepo = new PersonRepo();
        personRepo.add(new Person("Marek", 63));
        personRepo.add(new Person("Julia", 18));
        personRepo.add(new Person("Kasia", 6));
        personRepo.add(new Person("Maciek", 45));
        personRepo.add(new Person("Darek", 59));
        personRepo.add(new Person("Czarek", 9));
        personRepo.add(new Person("Adrianna", 92));
        personRepo.add(new Person("Bogusia", 22));
        personRepo.add(new Person("Andrzej", 66));

        System.out.println("----- Find name Andrzej -----");
        Criteria findAndrzej = person -> person.getName().equals("Andrzej");
        Set<Person> andrzejs = personRepo.find(findAndrzej);
        System.out.println(andrzejs);

        System.out.println();
        System.out.println("----- Find person older than 65 -----");
        Criteria findOldies = person -> person.getAge() > 65;
        Set<Person> oldies = personRepo.find(findOldies);
        System.out.println(oldies);

        System.out.println();
        System.out.println("----- Find person with name starts with M -----");
        Criteria nameStartsWithM = person -> person.getName().startsWith("M");
        Set<Person> mNamed = personRepo.find(nameStartsWithM);
        System.out.println(mNamed);

        System.out.println();
        System.out.println("----- Find person younger than 10 -----");
        Criteria findKids = person -> person.getAge() < 10;
        Set<Person> kids = personRepo.find(findKids);
        System.out.println(kids);

        System.out.println();
        System.out.println("----- Find person younger or equal 18 -----");
        Criteria findAduls = person -> person.getAge() >= 18;
        Set<Person> adults = personRepo.find(findAduls);
        System.out.println(adults);

        System.out.println();
        System.out.println("----- Find person older than 55 and with name starts with A -----");
        Criteria findA55 = person -> person.getAge() > 55 && person.getName().startsWith("A");
        Set<Person> a55 = personRepo.find(findA55);
        System.out.println(a55);
    }
}