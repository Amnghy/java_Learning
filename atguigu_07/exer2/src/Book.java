public class Book {
    private String bookname;
    private String author;
    private double price;

    public String getBookname(){
        return bookname;
    }
    public void setBookname(String a){
        bookname = a;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String a){
        author = a;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double p){
        price = p;
    }
    public String showinfo(){
        return "Bookname" + bookname + ", author" + author + ",price" + price;
    }


}
