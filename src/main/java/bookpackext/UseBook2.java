package main.java.bookpackext;

import main.java.bookpack.*;

// Use the Book Class from bookpack.
class UseBook2 {
    public static void main(String args[]) {
        Book3 books[] = new Book3[5];

        books[0] = new Book3("Java: A Beginner's Guide",
                "Schildt", 2014);
        books[1] = new Book3("Java: The Complete Reference",
                "Schildt", 2014);
        books[2] = new Book3("The Art of Java",
                "Schildt and Holmes", 2003);
        books[3] = new Book3("Red Storm Rising",
                "Clancy", 1986);
        books[4] = new Book3("On the Road",
                "Kerouac", 1955);

        for(int i=0; i < books.length; i++) books[i].show();
    }
}