package com.twu.biblioteca;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by cmhu on 03/03/2017.
 */
public class CheckoutMovieTest {
    @Test
    public void testCheckoutMovieSuccess() {
        //given
        int movieid = 1;
        String account = "no-1";

        //when
        String result = CheckoutMovieAction.CheckoutMovie(movieid, account);

        //then
        assertEquals("Pay successfully", result);
    }

    @Test
    public void testCheckoutMoviePayed() {
        //given
        int movieid = 1;
        String account = "no-2";

        //when
        String result = CheckoutMovieAction.CheckoutMovie(movieid, account);

        //then
        assertEquals("checked out", result);
    }

    @Test
    public void testCheckoutMovieNotLogin() {
        //given
        int movieid = 1;
        String account = "no-4";

        //when
        String result = CheckoutMovieAction.CheckoutMovie(movieid, account);

        //then
        assertEquals("please login", result);
    }
}
