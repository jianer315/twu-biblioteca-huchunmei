package com.twu.biblioteca;

import com.twu.bean.Book;
import com.twu.bean.Movie;
import com.twu.service.GetMovie;
import com.twu.serviceImp.GetBookImp;
import com.twu.serviceImp.GetMovieImp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmhu on 03/03/2017.
 */
public class ShowMovieDetailAction {
    public static String ShowMovieDetail(int id) {
        GetMovieImp getMovieImp=new GetMovieImp();
        List<Movie> movielist=new ArrayList<Movie>();
        String detail= "";
        movielist = getMovieImp.getMovieList();
        for (int i = 0; i < movielist.size(); i++) {
            if (movielist.get(i).getId() == id) {
                detail = movielist.get(i).getMoviename() + movielist.get(i).getMovieyear() + movielist.get(i).getDirector()+movielist.get(i).getRating();
                break;
            }
        }
        return detail;
    }
}
