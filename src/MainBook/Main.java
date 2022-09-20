package MainBook;

import bookdew.Book;

import java.util.Objects;
import java.util.Scanner;

/**
 * Клас, для оголошення методів, пов'язаних з створенням масиву, то демонстрації функцій виводу
 */
public class Main {
    public static void main(String[] args) {

        Book[] books = new Book[9];
        books[0] = new Book(252655, "Намисто", "Володимир Винниченко", "Веселка", 1880, 374, 95);
        books[1] = new Book(252656, "Пітер Пен", "Дж.М.Баррі", "Школа", 1902, 223, 140);
        books[2] = new Book(252657, "П'ятнадцятирічний Капітан", "Жуль Верн", "Школа", 1878, 257, 150);
        books[3] = new Book(252658, "Капітан Зірвиголова", "Луї Буссенар", "Ранок", 1901, 243, 140);
        books[4] = new Book(252659, "Робінзон Крузо", "Даніель Дефо", "Школа", 1719, 221, 130);
        books[5] = new Book(252659, "Острів Скарбів", "Роберт Луї Стівенсон", "Школа", 1881, 311, 170);
        books[6] = new Book(252660, "Сильмариліон", "Дж.Р.Р.Толкін", "Астролябія", 1960, 564, 200);
        books[7] = new Book(252661, "Володар Перстнів:Дві Вежі", "Дж.Р.Р.Толкін", "Астролябія", 1954, 612, 210);
        books[8] = new Book(252663, "Депеш Мод", "Сергій Жадан", "Фоліо", 2004, 240, 130);


        print_O(books);
        System.out.print("Введіть ім'я автора:");
        Scanner in1 = new Scanner(System.in);
        String aut = in1.nextLine();
        print_A(books, aut);

        System.out.print("Введіть назву видавництва:");
        Scanner in2 = new Scanner(System.in);
        String pub = in2.nextLine();
        print_B(books, pub);

        System.out.print("Введіть рік:");
        Scanner in3 = new Scanner(System.in);
        int year = in1.nextInt();
        print_C(books, year);

    }

    /**
     * Створення маствиву о'єктів
     *
     * @return масив об'єктів
     */
    public static Book[] setArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість елементів масиву: ");
        var books = new Book[scanner.nextInt()];
        for (int i = 0; i < books.length; i++) {
            Book book = setBook();
            books[i] = book;
            System.out.println(" ");
        }

        return books;
    }

    /**
     * Стоворення об'єкту
     *
     * @return об'єкт
     */
    public static Book setBook() {
        Scanner scanner = new Scanner(System.in);

        Book book = new Book();

        System.out.print("Ввести id книги: ");
        book.setId(scanner.nextInt());

        System.out.print("Ввести назву книги: ");
        book.setName(scanner.nextLine());

        System.out.print("Введіть автора: ");
        book.setAuthor(scanner.nextLine());

        System.out.print("Введіть видавнцивтво: ");
        book.setPublishing(scanner.nextLine());

        System.out.print("Введіть рік написання: ");
        book.setYear(scanner.nextInt());

        System.out.print("Введіть кількість сторінок: ");
        book.setYear(scanner.nextInt());

        System.out.print("Введіть ціну: ");
        book.setPrice(scanner.nextDouble());
        return book;
    }


    /**
     * Вивід всього масиву
     *
     * @param A масив об'єктів
     */
    public static void print_O(Book[] A) {
        System.out.println("Книги в наявності:");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i].toString());
        }
    }

    /**
     * Функція виводу об'єктів зазначеного автора
     *
     * @param A   масив об'єктів
     * @param aut Автор книги
     */
    public static void print_A(Book[] A, String aut) {
        int num1 = 0;

        for (int i = 0; i < A.length; i++) {
            if (Objects.equals(A[i].getAuthor(), aut)) {
                System.out.println(A[i].toString());
                num1++;
            }
        }
        if (num1 != 0) {
            System.out.println("Кількість книжок заданого автора:" + num1);
        } else {
            System.out.println("Книжки заданого автора відсутні");
        }
    }

    /**
     * Функція виводу об'єктів які підпадають під параметр вибадвництва
     *
     * @param A    масив
     * @param publ назва видавництва
     */
    public static void print_B(Book[] A, String publ) {
        int num2 = 0;

        for (int i = 0; i < A.length; i++) {
            if (Objects.equals(A[i].getPublishing(), publ)) {
                System.out.println(A[i].toString());
                num2++;
            }
        }
        if (num2 != 0) {
            System.out.println("Кількість книжок заданого видавництва:" + num2);
        } else {
            System.out.println("Книжки заданого видавництва відсутні");
        }


    }

    /**
     * Функція виводу об'єктів  які підападють під параматр рік
     *
     * @param A    масив
     * @param year рік, після якого видана книга
     */
    public static void print_C(Book[] A, int year) {
        int num2 = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i].getYear() >= year) {
                System.out.println(A[i].toString());
                num2++;
            }
        }
        if (num2 != 0) {
            System.out.println("Кількість книжок написаних після заданого року:" + num2);
        } else {
            System.out.println("Книжки написані після заданого року відсутні");
        }
    }
}

