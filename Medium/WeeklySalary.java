public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(WeeklySalary(new int[]{8, 8, 8, 8, 8, 0, 0}));
        System.out.println(WeeklySalary(new int[]{0, 0, 0, 0, 0, 10, 10}));
        System.out.println();
    }

    //My Solution
    public static int WeeklySalary(int[] hours) {
        //Create var for total weekly salary
        int totalWeeklySalary = 0;

        //Loop over the array
        for(int i=0; i < hours.length; i++)  {
            //Rules for Sat - Sun
            if(i == 5 || i == 6) {
                //First 8 Hours
                if(hours[i] <= 8 && hours[i] > 0) {
                    totalWeeklySalary = totalWeeklySalary + ((hours[i] * 10) * 2);
                }
                //First 8 Hours Plus Overtime
                if(hours[i] > 8) {
                    totalWeeklySalary = totalWeeklySalary + ((8 * 10) * 2);
                    totalWeeklySalary = totalWeeklySalary + (((hours[i] - 8) * 15) * 2);
                }
            } else {
                //Rules for Mon - Fri
                //First 8 Hours
                if(hours[i] <= 8 && hours[i] > 0) {
                    totalWeeklySalary = totalWeeklySalary + (hours[i] * 10);
                }
                //First 8 Hours Plus Overtime
                if(hours[i] > 8) {
                    totalWeeklySalary = totalWeeklySalary + (8 * 10);
                    totalWeeklySalary = totalWeeklySalary + ((hours[i] - 8) * 15);
                }
            }
        }
        return totalWeeklySalary;
    }

    //Better Solution
    public static int WeeklySalary(int[] hours) {
        int sum = 0;
        for (int i = 0; i < hours.length; i++){
            //Calculates salary
            int dayEarnings = hours[i]*10 + (hours[i] > 8 ? (hours[i]-8)*5 : 0);
            //Check to see which day it is to multiply by 1 or 2
            dayEarnings *= i > 4 ? 2 : 1;
            //acc to sum
            sum += dayEarnings;
        }
        return sum;
    }
}

