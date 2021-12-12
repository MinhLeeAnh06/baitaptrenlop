package MiniProject.controllers;

import B14_MiniProject.models.Book;
import B14_MiniProject.services.BookDataService;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class BookManager {

    private List<Book> list;

    private final String pathFileToInput;

    private BookDataService service;
    public BookManager(String pathFileToInput) {
        this.pathFileToInput = pathFileToInput;
        this.service = new BookDataService();
        try {
            this.list = service.read(pathFileToInput);
        } catch (IOException e) {
        }
    } 
    public void sortByName() {
        Collections.sort(list, (s1, s2) -> s1.getName().compareTo(s2.getName())); 
    }
    public void sortByAddress() { 
        Collections.sort(list, (s1, s2) -> s1.getLanguage().compareTo(s2.getLanguage()));
    }
    public void sortById() { 
        Collections.sort(list, (s1, s2) -> Integer.compare(s1.getId(), s2.getId()));
    }
    public Book findByPrice(String price) {
        for (Book s : list) {    
            if (s.getPrice().equals(price)) {               
                return s;
            }
        }
        return null;
    }
    public Book findByLanguage( String language) { 
        for (Book s : list) {
            if (s.getLanguage().equals(language) ) {
                return s;
            }
        }
        return null;
    }
    public void showAll() {
        for (Book s : list) {
            System.out.println(s.toString());
        }
    }
    public void delete(String price) { 
        Book findByPrice = findByPrice(price); 
        list.remove(findByPrice);
    }
    public void editBook(String language) { 
        Book book = findByLanguage( language); 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter name: ");
        String newBook = scanner.nextLine();
        book.setName(newBook); 
    }
    public void addBook(Scanner sc) { 
        list.add(new Book().input(sc));
    }

}