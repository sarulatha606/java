package java2;

public class Book {
	
	    String title;
	    String author;
	    String isbn;

	   
	    public Book(String title, String author, String isbn) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	    }

	    // Display book details
	    public void display() {
	        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
	    }
	}

	class Library {
	    Book book;

	    // Method to add a book
	    public void addBook(String title, String author, String isbn) {
	        book = new Book(title, author, isbn);
	        System.out.println("Book added!");
	    }

	    // Method to remove a book
	    public void removeBook() {
	        if (book != null) {
	            System.out.println("Book removed: " + book.title);
	            book = null;
	        } else {
	            System.out.println("No book to remove.");
	        }
	    }

	    // Method to display the book
	    public void displayBook() {
	        if (book != null) {
	            book.display();
	        } else {
	            System.out.println("No book in the library.");
	        }
	    }
	

	public class simpleLibrary {
	    public static void main(String[] args) {
	        Library library = new Library();

	        // Add a book
	        library.addBook("The Great Gatsby", "F. Scott Fitzgerald", "1234");

	        // Display the book
	        library.displayBook();

	        // Remove the book
	        library.removeBook();

	        // Try displaying again
	        library.displayBook();
	    }
	}
	}


