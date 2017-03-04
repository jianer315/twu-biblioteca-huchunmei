package com.twu.serviceImp;

import com.twu.bean.Movie;
import com.twu.service.GetMovie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmhu on 03/03/2017.
 */
public class GetMovieImp implements GetMovie {
    @Override
    public List getMovieList() {
        List<Movie> movieList=new ArrayList<Movie>();
        Movie movie1=new Movie();
        movie1.setId(1);
        movie1.setMoviename("changcheng");
        movie1.setDirector("zhangyimou");
        movie1.setMovieyear("2017");
        movie1.setRating(8);

        Movie movie2=new Movie();
        movie2.setId(2);
        movie2.setMoviename("danaotianzhu");
        movie2.setDirector("baobao");
        movie2.setMovieyear("2017");
        movie2.setRating(5);

        Movie movie3=new Movie();
        movie2.setId(3);
        movie2.setMoviename("xijuzhiwang");
        movie2.setDirector("zhouxingchi");
        movie2.setMovieyear("2001");
        movie2.setRating(9);
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        return movieList;
    }
}
