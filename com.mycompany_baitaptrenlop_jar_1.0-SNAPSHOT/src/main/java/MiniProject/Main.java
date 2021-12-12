package MiniProject;

import MiniProject.controllers.BookManager;
import B14_MiniProject.models.Book;
import B14_MiniProject.services.BookDataService;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String choose = null;
        boolean exit = false;
        BookManager bookManager = new BookManager("./resources/book-input.txt");

        showMenu();
        while (true) {

            choose = scanner.nextLine();

            switch (choose) {
                case "1":
                    System.out.println("Add Book");
                    bookManager.addBook(scanner);
                    break;
                case "2":
                    System.out.println("Edit Book");
                    System.out.println("Enter language: ");
                    String bookLanguage = scanner.nextLine();
                    scanner.nextLine();
                    bookManager.editBook(bookLanguage);
                    break;
                case "3":
                    System.out.println("Delete Book");
                    System.out.println("Enter Price: ");
                    String bookPrice = scanner.nextLine();
                    scanner.nextLine();
                    bookManager.delete(bookPrice);//ok
                    break;
                case "4":
                    System.out.println("Sort By Id");
                    bookManager.sortById();
                    break;
                case "5":
                    System.out.println("Sort By Name");
                    bookManager.sortByName();
                    break;
                case "6":
                    System.out.println("Books");
                    bookManager.showAll();
                    break;
                case "0":
                    System.out.println("Exit");
                    exit = true;
                    break;
                default:
                    System.out.println("Please choose action");
                    break;
            }
            if (exit) {
                break;
            }

            showMenu();
        }

    }

    public static void showMenu() {

        System.out.println("---------------Menu---------------");
        System.out.println("1. Add book.");
        System.out.println("2. Edit book");
        System.out.println("3. Delete book");
        System.out.println("4. Sort books by id");
        System.out.println("5. Sort books by name");
        System.out.println("6. Show all books ");
        System.out.println("0. Exit");
        System.out.println("----------------------------------");
        System.out.println("Please choose: ");
    }

}
