package ua.artcode.week8.day1.ioc.di;

import java.util.Date;

/**
 * Created by serhii on 14.03.15.
 */
public class IServiceB implements IService {
    @Override
    public String format(Date date) {
        return String.format("B=%1$ty-%1$tm-%1$td", date);
    }
}
