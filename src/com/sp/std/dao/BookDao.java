package com.sp.std.dao;

import com.sp.std.beans.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao extends BaseDao<Book> {
    @Override
    public void save() {
        System.out.println("BookDao save Book.......");
    }
}
