package com.twu.biblioteca;

import com.twu.bean.Book;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

/**
 * Created by cmhu on 01/03/2017.
 */
public class ShowBookListTest {
    @Test
    public void testShowBookListSuccess() {
        //given
        String option = "list books";
        List<Book> booklist = new ArrayList<Book>();

        //when
        booklist = ShowBookListAction.ShowList(option);

        //then
        for (int i = 0; i < booklist.size(); i++) {

            assertEquals(1, booklist.get(i).getState());
        }
    }

    @Test
    public void testShowBookListFail() {
        //given
        String option = "invalid option";
        List<Book> booklist = new ArrayList<Book>();

        //when
        booklist = ShowBookListAction.ShowList(option);

        //then
        assertEquals(null, booklist);
    }
}
