package ua.artcode.week5.layouts;

import org.apache.log4j.Layout;
import org.apache.log4j.spi.LoggingEvent;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 */
public class MySimpleLayout extends Layout {
    @Override
    public String format(LoggingEvent event) {

        long timeStamp = event.getTimeStamp();
        Date date = new Date(timeStamp);


        return String.format("[%1$ty/%1$tm/%1$td %1$tH:%1$tM] %2$s %3$s\n",
                date,
                event.getLevel(),
                event.getMessage());
    }

    @Override
    public boolean ignoresThrowable() {
        return false;
    }

    @Override
    public void activateOptions() {

    }
}
