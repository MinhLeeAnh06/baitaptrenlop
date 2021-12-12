package B14_MiniProject.models;

import java.util.Scanner;

public class Book {

    private int id;
    private String name;
    private String language;
    private String author;
    private int publishdate;
    private String isbn;
    private String price;

    public Book() {

    }

    public Book(int id, String name, String language, String author, int publishdate , String isbn , String price) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.author= author;
        this.publishdate = publishdate;
        this.isbn = isbn ; 
        this.price = price;
    }
    public Book input(Scanner sc ){
       System.out.println("enter Book id ");
       int id =    sc.nextInt(); 
       sc.nextLine();
       System.out.println("enter full name ");
       String name =sc.nextLine();
       System.out.println("enter language");
       String language = sc.nextLine();
       System.out.println("enter author");
       String author = sc.nextLine();
       System.out.println("enter publishdate");
       int Publishdate = sc.nextInt();
       System.out.println("enter isbn");
       String isbn = sc.nextLine();
       System.out.println("enter price");
       String price = sc.nextLine();
      
       return new Book(id , name ,language , author , publishdate , isbn , price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(int publishdate) {
        this.publishdate = publishdate;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", klass=" + language + ", address=" + author + ", publishdate = " + publishdate + ", isbn = "+ isbn + " , price = " + price+ '}';
    }


}