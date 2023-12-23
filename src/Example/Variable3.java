package Example;

public class Variable3 {
    public static void main(String[] args) {
         int days = 10000;
         int years = days / 365;
         int month = (days - (years * 365)) / 30;
         int otherdays  = days - (years * 365) - (month * 30);
        System.out.println(years);
        System.out.println(month);
        System.out.println(otherdays);




    }
}
