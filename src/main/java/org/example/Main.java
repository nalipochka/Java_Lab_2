package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
 class Person {
    private String fullName;
    private String dateOfBirth;
    private String contactNumber;
    private String city;
    private String country;
    private String homeAddress;

    public Person() {
    }
    public Person(String fullName, String dateOfBirth, String contactNumber, String city, String country, String homeAddress) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.contactNumber = contactNumber;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
    }
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ПІБ: ");
        fullName = scanner.nextLine();

        System.out.print("Введіть дату народження: ");
        dateOfBirth = scanner.nextLine();

        System.out.print("Введіть контактний телефон: ");
        contactNumber = scanner.nextLine();

        System.out.print("Введіть місто: ");
        city = scanner.nextLine();

        System.out.print("Введіть країну: ");
        country = scanner.nextLine();

        System.out.print("Введіть домашню адресу: ");
        homeAddress = scanner.nextLine();
    }

    public void displayInfo() {
        System.out.println("ПІБ: " + fullName);
        System.out.println("Дата народження: " + dateOfBirth);
        System.out.println("Контактний телефон: " + contactNumber);
        System.out.println("Місто: " + city);
        System.out.println("Країна: " + country);
        System.out.println("Домашня адреса: " + homeAddress);
    }

    public String getFullName() {
        return fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }
    @Override
    public String toString() {
        return "ПІБ: " + fullName + "\nДата народження: " + dateOfBirth + "\nКонтактний телефон: " + contactNumber +
                "\nМісто: " + city + "\nКраїна: " + country + "\nДомашня адреса: " + homeAddress;
    }
}
class Country {
     private String countryName;
     private String continentName;
     private long population;
     private int countryCode;
     private String capital;
     private List<String> cities;
     public Country(){
         cities = new ArrayList<>();
     }
    public Country(String countryName, String continentName, long population, int countryCode, String capital, List<String> cities) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.population = population;
        this.countryCode = countryCode;
        this.capital = capital;
        this.cities = cities;
    }
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву країни: ");
        countryName = scanner.nextLine();

        System.out.print("Введіть назву континенту: ");
        continentName = scanner.nextLine();

        System.out.print("Введіть кількість жителів в країні: ");
        population = scanner.nextLong();

        System.out.print("Введіть телефонний код країни: ");
        countryCode = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        System.out.print("Введіть назву столиці: ");
        capital = scanner.nextLine();

        System.out.println("Введіть назви міст країни (введіть 'готово', щоб завершити введення міст):");
        String city;
        while (true) {
            city = scanner.nextLine();
            if (city.equals("готово")) {
                break;
            }
            cities.add(city);
        }
    }
    public void displayInfo() {
        System.out.println("Назва країни: " + countryName);
        System.out.println("Назва континенту: " + continentName);
        System.out.println("Кількість жителів: " + population);
        System.out.println("Телефонний код: " + countryCode);
        System.out.println("Столиця: " + capital);
        System.out.println("Міста країни:");
        for (String city : cities) {
            System.out.println(city);
        }
    }

    // Методи для доступу до окремих полів
    public String getCountryName() {
        return countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public long getPopulation() {
        return population;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public String getCapital() {
        return capital;
    }

    public List<String> getCities() {
        return cities;
    }
    public String toString() {
        return "Назва країни: " + countryName +
                "\nНазва континенту: " + continentName +
                "\nКількість жителів: " + population +
                "\nТелефонний код: " + countryCode +
                "\nСтолиця: " + capital +
                "\nМіста країни: " + cities.toString();
    }
}

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задание:");
        int task = scanner.nextInt();
        switch (task){
            case 1:{
                Person person = new Person();
                person.inputInfo();
                System.out.println("Інформація про людину:");
                person.displayInfo();
                Person person2 = new Person("Іван Петрович", "01.01.1990", "+1234567890", "Київ", "Україна", "вул. Головна, 1");
                System.out.println("\nІнформація про людину 2:");
                System.out.println(person2.toString());
            }
            break;
            case 2:{
                List<String> citiesList = new ArrayList<>();
                citiesList.add("Київ");
                citiesList.add("Львів");
                citiesList.add("Одеса");

                Country country1 = new Country();
                country1.inputInfo();
                System.out.println("Інформація про країну 1:");
                country1.displayInfo();

                Country country2 = new Country("Україна", "Європа", 45000000, 380, "Київ", citiesList);
                System.out.println("\nІнформація про країну 2:");
                System.out.println(country2.toString());
            }
            break;
            default:
                System.out.println("Error!");
        }
    }
}