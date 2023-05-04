public class question1 {
    public static void main(String [] args){
        Book harrypotter1 = new Book(1, "Harry Potter: 1", 40.2f);
        System.out.println(harrypotter1.title);
        harrypotter1.setMajor("Liberal Art");
        System.out.println(harrypotter1.authorSize);
        System.out.println(harrypotter1.addAuthor("JK"));
        System.out.println(harrypotter1.authors.get(0));
        harrypotter1.addAuthor("Nanon");
        harrypotter1.addAuthor("Nanon1");
        harrypotter1.addAuthor("Nanon2");
        harrypotter1.addAuthor("Nanon3");
        harrypotter1.writeBookToFile();
    }
}
