import Insurance.CarInsurance;
import Insurance.HealthInsurance;
import Insurance.ResidenceInsurance;
import Insurance.TravelInsurance;
import Management.Management;
import User.Account;

import java.util.ArrayList;
import java.util.List;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Management management = new Management();
        Scanner sc = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            management.displayMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Kullanici turunu girin (Bireysel(Individual) veya Kurumsal(Enterprise)) (I/E): ");
                    sc.nextLine();
                    String userType = sc.nextLine();
                    System.out.print("Kullanici adini girin: ");
                    String name = sc.nextLine();
                    System.out.print("Kullanici soyadini girin: ");
                    String surname = sc.nextLine();
                    System.out.print("Kullanici e-postasini girin: ");
                    String email = sc.nextLine();
                    System.out.print("Kullanici sifresini girin: ");
                    String password = sc.nextLine();
                    System.out.print("Kullanici meslegini girin: ");
                    String profession = sc.nextLine();
                    System.out.print("Kullanici yasini girin: ");
                    int age = sc.nextInt();
                    String companyName = null;
                    if (userType.equalsIgnoreCase("E")) {
                        System.out.print("Sirketinizin adini girin: ");
                        sc.nextLine();
                        companyName = sc.nextLine();
                    }
                    management.addUser(userType, name, surname, email, password, profession, age,
                            companyName);
                    break;
                case 2:
                    if (management.isHaveAccount()) {
                        System.out.println("Sistemde hesap bulunamadi");
                        System.out.println("Lutfen once bir kullanici ekleyin.");
                        break;
                    }
                    System.out.print("Kullanici e-postasini girin: ");
                    sc.nextLine();
                    String userEmail = sc.nextLine();
                    System.out.print("Kullanici sifresini giriniz: ");
                    String userPassword = sc.nextLine();
                    Account account = management.login(userEmail, userPassword);
                    if (account == null) {
                        System.out.println();
                    } else {
                        System.out.println("Giris basarili!");
                        int option = -1;
                        while (option != 0) {
                            management.afterLoginMenu();
                            option = sc.nextInt();
                            switch (option) {
                                case 1:
                                    System.out.println("1. Ev Adresi");
                                    System.out.println("2. Is Adresi");
                                    System.out.print("Secimini gir: ");
                                    int addressChoice = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Cadde/Sokak adini girin: ");
                                    String streetAddress = sc.nextLine();
                                    System.out.print("Sehrinizi girin: ");
                                    String city = sc.nextLine();
                                    System.out.print("Ilcenizi girin: ");
                                    String state = sc.nextLine();
                                    System.out.print("Posta Kodunuzu girin: ");
                                    String zipCode = sc.nextLine();
                                    if (addressChoice == 1) {
                                        management.addHomeAddress(
                                                account.getUser(),
                                                streetAddress, city,
                                                state,
                                                zipCode);
                                    } else if (addressChoice == 2) {
                                        System.out.print(
                                                "Sirketinizin adini giriniz: ");
                                        sc.nextLine();
                                        companyName = sc.nextLine();
                                        management.addBusinessAddress(
                                                account.getUser(),
                                                companyName,
                                                streetAddress,
                                                city, state, zipCode);
                                    } else {
                                        System.out.println(
                                                "Gcersiz secim. Lutfen tekrar deneyiniz.");
                                    }
                                    break;
                                case 2:
                                    System.out.println("1. Araba Sigortasi");
                                    System.out.println("2. Saglik Sigortasi");
                                    System.out.println("3. Konut Sigortasi");
                                    System.out.println("4. Seyahat Sigortasi");
                                    System.out.print("Seciminizi giriniz: ");
                                    int insuranceChoice = sc.nextInt();
                                    sc.nextLine();
                                    if (insuranceChoice == 1) {

                                        System.out.print("Araba adini giriniz: ");
                                        String carMake = sc.nextLine();
                                        System.out.print("Araba modelini giriniz: ");
                                        String carModel = sc.nextLine();
                                        System.out.print("Araba yasini giriniz: ");
                                        int carAge = sc.nextInt();
                                        System.out.print(
                                                "Suruculer icin kapsam varsa dogru(true) veya yanlis(false) girin (T/F): ");
                                        sc.nextLine();
                                        String answer = sc.nextLine();
                                        boolean coverageForDrivers;
                                        if (answer.equalsIgnoreCase("t")) {
                                            coverageForDrivers = true;
                                        } else if (answer.equalsIgnoreCase(
                                                "f")) {
                                            coverageForDrivers = false;
                                        } else {
                                            System.out.println(
                                                    "Gecersiz secim. Lutfen tekrar deneyin.");
                                            break;
                                        }
                                        System.out.print(
                                                "Yolcular icin kapsam varsa, dogru(true) veya yanlis(false) girin (T/F): ");
                                        sc.nextLine();
                                        answer = sc.nextLine();
                                        boolean coverageForPassengers;
                                        if (answer.equalsIgnoreCase("t")) {
                                            coverageForPassengers = true;
                                        } else if (answer.equalsIgnoreCase(
                                                "f")) {
                                            coverageForPassengers = false;
                                        } else {
                                            System.out.println(
                                                    "Gecersiz secim. Lutfen tekrar deneyin.");
                                            break;
                                        }

                                        account.addInsurance(
                                                new CarInsurance(
                                                        carMake,
                                                        carModel,
                                                        carAge,
                                                        coverageForDrivers,
                                                        coverageForPassengers));
                                    } else if (insuranceChoice == 2) {

                                        System.out.print(
                                                    "Saglik durumunu girin: ");
                                        String healthCondition = sc.nextLine();
                                        System.out.print(
                                                "Kapsam limitini girin: ");
                                        double coverageLimit = sc.nextDouble();
                                        System.out.print(
                                                "Onceden var olan durum icin kapsam varsa, dogru(true) veya yanlis girin (T/F): ");
                                        sc.nextLine();
                                        String answer = sc.nextLine();
                                        boolean coverageForPreExistingCondition;
                                        if (answer.equalsIgnoreCase("t")) {
                                            coverageForPreExistingCondition = true;
                                        } else if (answer.equalsIgnoreCase(
                                                "f")) {
                                            coverageForPreExistingCondition = false;
                                        } else {
                                            System.out.println(
                                                    "Gecersiz secim. Lutfen tekrar deneyin.");
                                            break;
                                        }
                                        account.addInsurance(
                                                new HealthInsurance(
                                                        healthCondition,
                                                        coverageForPreExistingCondition,
                                                        coverageLimit));
                                    } else if (insuranceChoice == 3) {

                                        System.out.print(
                                                "Bina degerini girin: ");
                                        double buildingValue = sc.nextDouble();
                                        System.out.print(
                                                "Icerik degerini girin: ");
                                        double contentValue = sc.nextDouble();
                                        account.addInsurance(
                                                new ResidenceInsurance(
                                                        buildingValue,
                                                        contentValue));
                                    } else if (insuranceChoice == 4) {
                                        List<String> coveredCountries = new ArrayList<>();
                                        System.out.println("Ulkeleri girin:");
                                        while (sc.hasNextLine()) {
                                            String item = sc.nextLine();
                                            if (item.isEmpty()) {
                                                break;
                                            }
                                            coveredCountries.add(item);
                                        }
                                        System.out.print("Sureyi girin: ");
                                        int duration = sc.nextInt();
                                        account.addInsurance(
                                                new TravelInsurance(
                                                        coveredCountries,
                                                        duration));
                                    } else {
                                        System.out.println(
                                                "Gecersiz secim. Lutfen tekrar deneyin.");
                                    }

                                    break;

                                case 3:
                                    management.showUserInfo(account);
                                    break;
                                case 0:
                                    account = null;
                                    System.out.println("Cikiyorsunuz!");
                                    break;

                                default:
                                    System.out.println(
                                            "Gecersiz secim. Lutfen tekrar deneyin!");
                                    break;
                            }
                        }
                    }

                    break;
                case 3:
                    management.listAccounts();
                    break;
                case 0:
                    System.out.println("Sistemden cikliyor...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Gecersiz secim. Lutfen tekrar deneyin!");
                    break;
            }
        }
        sc.close();
    }
}