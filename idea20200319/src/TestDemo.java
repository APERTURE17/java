
class Book {
    private String name;
    private String author;
    private int price;

    public Book() {

    }

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, String author) {
        this(name, author,0);
    }

    public Book(String name) {
        this(name,null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override//重写
    public String toString() {
        return "Book{" +
                "书名='" + name + '\'' +
                ", 作者='" + author + '\'' +
                ", 价格=" + price +
                '}';
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("三体");
        System.out.println(book1.getName());
        book1.setAuthor("刘慈欣");
        System.out.println(book1.getAuthor());
        book1.setPrice(46);
        System.out.println(book1.getPrice());
        Book book2 = new Book("X-man","StanLee");
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor());
        System.out.println(book1);
        System.out.println(book2);
        Book book3 = new Book("贩罪");
        System.out.println(book3);
    }
}
