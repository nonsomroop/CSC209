import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.Vector;

public class Book {
    long isbn;
    String title;
    Vector<String> authors = new Vector<>();
    int authorSize;
    float price;
    String major;
    String[] majors = {"Computer", "Engineering", "Science", "Liberal Art"};

    public Book(){
        this.isbn = 0;
        this.title = null;
        float price = 0.0f;
        authorSize = 0;
        major = null;
    }

    public Book(long isbn, String title, float price) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        authorSize = 0;
        major = null;
    }

    public void setMajor(String newMajor) {
        for (String maj : majors){
            if (maj.equals(newMajor)){
                major = newMajor;
                return;
            }
        }
        System.out.println("Invalid");
    }

    public int addAuthor(String authorName){
        authors.add(authorName);
        authorSize++;
        return authorSize;
    }

    public void writeBookToFile(){
        Scanner sc = new Scanner(System.in);
        String filename = sc.next();
        try {
            RandomAccessFile fptr = new RandomAccessFile(filename, "rw");
            fptr.seek(fptr.length());

            fptr.writeLong(isbn);
            byte[] temp = new byte[30];
            temp = title.concat("                              ").getBytes();
            fptr.write(temp, 0, 30);
            for (int i = 0; i < authorSize; i++){
                temp = authors.get(i).concat("                              ").getBytes();
                fptr.write(temp, 0, 30);
            }
            fptr.writeInt(authorSize);
            fptr.writeFloat(price);
            //String major
            temp = major.concat("                               ").getBytes();
            fptr.write(temp, 0, 30);

            fptr.close();

        }
        catch (IOException ex){
            System.out.println("error");
        }
    }
}
