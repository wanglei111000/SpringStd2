package com.sp.std.service;

import com.sp.std.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
//这里并不需要 注明为 spring 组件， 泛型也是 对象自动装配的参考条件 ，
// 如果存在泛型 ，需要按照泛型去查找对应的类来进行装配
public class BaseService<T> {
    @Autowired
    BaseDao<T> baseDao;
    //这里父类的属性在子类中都会有，这里不需要把它 显示的加入 容器
    //会自动加入 容器中
    public void save(){
        baseDao.save();
    }
}
