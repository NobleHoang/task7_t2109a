public class Book {
    String name;
    Author author;
    double price;
    int qty;
    public Book(String name, Author author, double price, int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", author=" + author + ", price=" + price + ", qty=" + qty + '}';
    }
    public static void main(String[] args) {
        Author author=new Author("Noblehhmh","noblehhmh2003@gmail.com",'M');
        System.out.println(author);
        Book book=new Book("Hieu", author, 9.99,2);
        System.out.println(book);
        book.setPrice(699.999);
        book.setQty(20);
        System.out.println("New Price: "+book.getPrice());
        System.out.println("New QTY: "+book.getQty());
    }
}
