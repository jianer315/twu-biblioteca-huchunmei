package com.twu.biblioteca;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cmhu on 03/03/2017.
 */
public class WatchMovieTest {
    @Test
    public void testWatchMovieSuccess() {
        //given
        String account="no-2";
        int movieid=1;
        //when
        String result= WatchMovieAction.WatchMovie(account,movieid);

        //then
        Assert.assertEquals("you can watch movie!",result);
    }
    @Test
    public void testWatchMovieNotLogin() {
        //given
        String account="no-3";
        int movieid=1;

        //when
        String result= WatchMovieAction.WatchMovie(account,movieid);

        //then
        Assert.assertEquals("please login",result);
    }
    @Test
    public void testWatchMovieFail() {
        //given
        String account="no-1";
        int movieid=1;

        //when
        String result= WatchMovieAction.WatchMovie(account,movieid);

        //then
        Assert.assertEquals("please check out for watching",result);
    }
}
