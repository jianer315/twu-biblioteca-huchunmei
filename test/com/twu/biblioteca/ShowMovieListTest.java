package com.twu.biblioteca;

import com.twu.bean.Book;
import com.twu.bean.Movie;
import com.twu.service.GetMovie;
import com.twu.serviceImp.GetMovieImp;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by cmhu on 03/03/2017.
 */
public class ShowMovieListTest {
    @Test
    public void testShowBookListSuccess()
    {   //given
        String option="list movies";
        List<Movie> movielist_ex=new ArrayList<Movie>();
        List<Movie> movielist_ac=new ArrayList<Movie>();
        GetMovieImp getMovieImp=new GetMovieImp();
        movielist_ex=getMovieImp.getMovieList();

        //when
        movielist_ac= ShowMovieListAction.ShowList(option);

        //then
        assertEquals(movielist_ex.size(),movielist_ac.size());
    }

    @Test
    public void testShowBookListFail()
    {   //given
        String option="null";
        List<Movie> movielist_ac=new ArrayList<Movie>();

        //when
        movielist_ac= ShowMovieListAction.ShowList(option);

        //then
        assertEquals(null,movielist_ac);
    }
}
