package ua.artcode.week8.day1.ioc.di;

import java.util.Date;

/**
 * Created by serhii on 14.03.15.
 */
public class IServiceA implements IService {


    @Override
    public String format(Date date) {
        return "A="+date.toString();
    }



}
