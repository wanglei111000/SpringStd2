package com.sp.std.dao;

import com.sp.std.beans.Car;
import org.springframework.stereotype.Repository;

@Repository
public class CarDao extends BaseDao<Car>{
    @Override
    public void save() {
        System.out.println("CarDao save Car.......");
    }
}
