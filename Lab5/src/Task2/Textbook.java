package Task2;

import java.io.Serializable;

public class Textbook implements Serializable {
    public  String ISBN;
    public String title;
    public String author;

    Textbook()
    {
             ISBN = "noISBN";
             title = "noTitle";
             author = "noAuthor";
    }
    public  Textbook(String ISBN, String title, String author)
    {
        this.author = author;
        this.ISBN = ISBN;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return  "Title is " + title;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  Textbook)
        {
            Textbook tx = (Textbook) obj;
            if(this.title == tx.title && this.ISBN == tx.ISBN && this.author == tx.author )
            {
                return  true;
            }

        }
        return  false;
    }
}
