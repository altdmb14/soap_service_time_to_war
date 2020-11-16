package ru.datetime.timestamp.service;

import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Service
public class TimeService {

    public XMLGregorianCalendar getCurrentTime() throws Exception{
        String FORMATER = "yyyy-MM-dd'T'HH:mm:ss";

        DateFormat format = new SimpleDateFormat(FORMATER);

        Date date = new Date();
        XMLGregorianCalendar gDateFormatted1 =
                DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));

        return gDateFormatted1;
    }
}
