package com.sp.std.test;

import com.sp.std.service.BookService;
import com.sp.std.service.CarService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTester5 {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:/conf/applicationContext7.xml");

    @Test
    public void test(){
        BookService bookService = ioc.getBean(BookService.class);
        CarService carService = ioc.getBean(CarService.class);
        carService.save();
        bookService.save();
//        运行结果
//        CarDao save Car.......
//        BookDao save Book.......
    }
}
