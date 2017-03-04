package com.twu.biblioteca;

import com.twu.bean.Movie;
import com.twu.serviceImp.GetMovieImp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmhu on 03/03/2017.
 */
public class ShowMovieListAction {
    public static List<Movie> ShowList(String option) {
        if (option == "list movies") {
            GetMovieImp getMovieImp = new GetMovieImp();
            List<Movie> movielist = new ArrayList<Movie>();
            movielist = getMovieImp.getMovieList();
            return movielist;
        } else {
            return null;
        }
    }
}
