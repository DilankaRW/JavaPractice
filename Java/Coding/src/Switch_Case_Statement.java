public class Switch_Case_Statement {
    public static void main(String[] args) {

//        int weekday = 2;
//        switch (weekday){
//            case 1: System.out.println("Today is Monday");
//                break;
//            case 2: System.out.println("Today is Tuesday");
//                break;
//            case 3: System.out.println("Today is Wednesday");
//                break;
//            case 4: System.out.println("Today is Thursday");
//                break;
//            case 5: System.out.println("Today is Friday");
//                break;
//            case 6: System.out.println("Today is Saturday");
//                break;
//            case 7: System.out.println("Today is Sunday");
//                break;
//            default:
//                System.out.println("Try again");
//        }   /* Answer is "Today is Tuesday" */


        String day = "Sunday";
        switch (day){
            case  "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("School");
                break;

            case "Saturday":
            case "Sunday":
                System.out.println("class");

                break;
            default: System.out.println("Try again");
        }   /* Answer is "class" */

    }
}
