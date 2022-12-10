package week03_review;

public class DaysInWeek {

    public static void main(String[] args) {


        int day = -200;

        if (day >= 1 && day <= 7) {
            String result = "";

            if (day >= 1 && day <= 7) { // 7 possible out puts

                if (day == 1) {
                    System.out.println("Monday");
                    result = "Monday";
                } else if (day == 2) {
                    System.out.println("Tuesday");
                    result = "Tuesday";
                } else if (day == 3) {
                    System.out.println("Wednesday");
                    result = "Wednesday";
                } else if (day == 4) {
                    System.out.println("Thursday");
                    result = "Thursday";
                } else if (day == 5) {
                    System.out.println("Friday");
                    result = "Friday";
                } else if (day == 6) {
                    System.out.println("Saturday");
                    result = "Saturday";
                } else {
                    System.out.println("Sunday");
                    result = "Sunday";
                }

            } else { // day is invalid. day < 1 or  day > 7

                //  } else { // day is invalid. day < 1 or  day > 7. 2 possible outputs

                if (day < 1) {
                    System.out.println("Minimum day number can not be less than 1");
                    result = "Minimum day number can not be less than 1";
                } else {
                    System.out.println("Maximum day number can not be greater than 7");
                    result = "Maximum day number can not be greater than 7";
                }

            }


            System.out.println(result);


        }

    }

}
