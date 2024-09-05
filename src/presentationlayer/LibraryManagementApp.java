package presentationlayer;

import businesslayer.LibraryManagement;

public class LibraryManagementApp {
    public static void main(String[] args) {

        LibraryManagement libraryManagement = new LibraryManagement();

        libraryManagement.borrowAll();
        libraryManagement.searchFor("History of Art", "book");
        libraryManagement.searchFor("Animal Farm");
    }
}