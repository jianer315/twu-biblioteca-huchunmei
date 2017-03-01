package com.twu.biblioteca;

import com.twu.bean.Book;
import com.twu.dao.BookDao;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by cmhu on 01/03/2017.
 */
public class ShowListTest {
    @Test

    public void testShowListCase1()
    {
        String option="list books";
        List <Book>booklist=new ArrayList<Book>();
        booklist=ShowListAction.ShowList(option);
        for(int i = 0;i<booklist.size();i++){

            assertEquals(1,booklist.get(i).getState());

        }
    }
@Test
    public void testShowListCase2()
    {
        String option="null";
        List <Book>booklist=new ArrayList<Book>();
        booklist=ShowListAction.ShowList(option);
        assertEquals(null,booklist);

    }
}
