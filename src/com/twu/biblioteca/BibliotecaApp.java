package com.twu.biblioteca;
import com.twu.bean.Book;
import com.twu.bean.Checkout_item;
import com.twu.bean.Movie;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        LoginAction loginAction = new LoginAction();
        System.out.println("user " + loginAction.Login("no-1", "12345612"));

        BorrowBookAction borrowBookAction = new BorrowBookAction();
        System.out.println(borrowBookAction.BorrowBook(2, "no-1"));

        ReturnBookAction returnBookAction = new ReturnBookAction();
        System.out.println(returnBookAction.ReturnBook("no-1", 5));

        ShowBookDetailAction showBookDetailAction = new ShowBookDetailAction();
        System.out.println("The book detail information is: " + showBookDetailAction.ShowBookDetail(1));

        ShowBookListAction showBookListAction = new ShowBookListAction();
        List<Book> bookList = new ArrayList<Book>();
        bookList = showBookListAction.ShowList("list books");
        System.out.println("The book list is:");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i).getBookName());
        }

        ShowMovieListAction showMovieListAction = new ShowMovieListAction();
        List<Movie> movieList = new ArrayList<Movie>();
        System.out.println("The movie list is:");
        movieList = showMovieListAction.ShowList("list movies");
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println(movieList.get(i).getMoviename());
        }

        ShowMovieDetailAction showMovieDetailAction = new ShowMovieDetailAction();
        System.out.println(showMovieDetailAction.ShowMovieDetail(1));

        ViewAccountInfoAction viewAccountInfoAction = new ViewAccountInfoAction();
        System.out.println("The account info is:");
        System.out.println(viewAccountInfoAction.ViewAccountInfo("no-1"));

        CheckoutMovieAction checkoutMovieAction = new CheckoutMovieAction();
        System.out.println("checkout a movie:");
        System.out.println(checkoutMovieAction.CheckoutMovie(1, "no-1"));

        WatchMovieAction watchMovieAction = new WatchMovieAction();
        System.out.println(watchMovieAction.WatchMovie("no-2", 1));

        QuitAction quitAction = new QuitAction();
        System.out.println(quitAction.quit("no-1"));

        LoginAction loginAdmin = new LoginAction();
        System.out.println(loginAdmin.Login("no-admin", "123"));

        CheckoutBookInfoAction checkoutBookInfoAction = new CheckoutBookInfoAction();
        List<Checkout_item> checkout_items = new ArrayList<Checkout_item>();
        checkout_items = checkoutBookInfoAction.CheckoutBookInfo("no-admin");
        System.out.println("checkout book people list:");
        for (int i = 0; i < checkout_items.size(); i++) {
            System.out.println("user: " + checkout_items.get(i).getUser_libnumber());
            System.out.println("book: " + checkout_items.get(i).getBook_id());
        }
    }

}
