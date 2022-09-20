package bookdew;

/**
 * Клас, в якому описаний
 */
public class Book {
    private int id;
    private String name;
    private String author;
    private String publishing;
    private int year;
    private int num_page;
    private double price;

    /**
     *Коструктор класа з параметрами
     * @param id айді книги
     * @param name назва книги
     * @param author автор книги
     * @param publishing видавництво
     * @param year рік написання
     * @param num_page кількість сторінок
     * @param price ціна
     */
    public Book(int id, String name, String author, String publishing, int year, int num_page, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.num_page = num_page;
        this.price = price;
    }

    /**
     * Конструктор класа без параметрів
     */
    public Book() {
        this.id = 0;
        this.name = "";
        this.author = "";
        this.publishing = "";
        this.year = 0;
        this.num_page = 0;
        this.price = 0.0;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNum_page() {
        return num_page;
    }

    public void setNum_page(int num_page) {
        this.num_page = num_page;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Перегружений метод виводу класу
     * @return строкова інформація про клас
     */
    @Override
    public String toString() {
        return "Книга{" +
                "id=" + id +
                ", Назва='" + name + '\'' +
                ", Автор='" + author + '\'' +
                ", Публікація='" + publishing + '\'' +
                ", Рік написання=" + year +
                ", Кількість сторінок=" + num_page +
                ", ціна=" + price +
                '}';
    }
}

