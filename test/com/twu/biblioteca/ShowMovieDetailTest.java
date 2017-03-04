package com.twu.biblioteca;

import com.twu.bean.Book;
import com.twu.bean.Movie;
import com.twu.service.GetMovie;
import com.twu.serviceImp.GetBookImp;
import com.twu.serviceImp.GetMovieImp;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmhu on 03/03/2017.
 */
public class ShowMovieDetailTest {
    @Test
    public void testShowMovieDetail() {
        //given
        GetMovieImp getBookImp=new GetMovieImp();
        List<Movie> movieList=new ArrayList<Movie>();
        movieList=getBookImp.getMovieList();
        Movie movie=new Movie();
        for(int i = 0;i<movieList.size();i++){

            if(movieList.get(i)!=null)
            {
                movie=movieList.get(i);
                break;
            }

        }
        String actual="";

        //when
        String result=ShowMovieDetailAction.ShowMovieDetail(movie.getId());

        //then
        Assert.assertEquals(actual+movie.getMoviename()+movie.getMovieyear()+movie.getDirector()+movie.getRating(),result);
    }
}
