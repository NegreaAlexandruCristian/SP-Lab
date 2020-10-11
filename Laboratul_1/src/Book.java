import java.util.ArrayList;

public class Book {

    private String bookName;
    private ArrayList<String> bookContents;

    public Book(){

        this.bookName = "";
        this.bookContents =  new ArrayList<>();
    }

    public Book(String bookName) {
        this.bookName = bookName;
        this.bookContents = new ArrayList<String>();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public ArrayList<String> getBookContents() {
        return bookContents;
    }

    public void setBookContents(ArrayList<String> bookContents) {
        this.bookContents = bookContents;
    }

    public void createNewParagraph(String paragraph){

        this.bookContents.add(paragraph);
    }

    public void createNewImage(String image){

        this.bookContents.add(image);
    }

    public void createNewTable(String table){

        this.bookContents.add(table);
    }

    public void print(){

        System.out.println("The name of the book is : " + this.bookName);
        for(String contents: this.bookContents){

            System.out.println(contents);
        }
    }
}
