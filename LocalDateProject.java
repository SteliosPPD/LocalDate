package localdateproject;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateProject {

    public static void main(String[] args) {

        LocalDate Today = LocalDate.now();
        System.out.println(Today);
        
                
        //get data from String
        String hmnia = "24/06/2019";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateFromString = LocalDate.parse(hmnia, formatter);
        System.out.println(dateFromString);
        
        //antistrofo
        String newString = dateFromString.format(formatter);
        System.out.println(newString);
        
        
        //firstDayOfWeek
        LocalDate date = LocalDate.of(2019, 6, 13);
        System.out.println(date);
        LocalDate firstDayOfWeek = date;
        while(firstDayOfWeek.getDayOfWeek() != DayOfWeek.MONDAY){
            firstDayOfWeek = firstDayOfWeek.minusDays(1);
        }
        System.out.println(firstDayOfWeek);
        
        LocalDate lastDayOfWeek = date;
        while(lastDayOfWeek.getDayOfWeek() != DayOfWeek.FRIDAY){
            lastDayOfWeek = lastDayOfWeek.plusDays(1);
        }
        System.out.println(lastDayOfWeek);
        
        
        String hm = "24/12/2019";
        String month = hm.substring(3, 5);
        System.out.println("Month is " + month);
        int numberOfMonth = Integer.parseInt(month);
        System.out.println(numberOfMonth);
        
        
        
        
    }
    
}
