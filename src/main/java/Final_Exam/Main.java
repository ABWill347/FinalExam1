package Final_Exam;

public class Main {
    public static void main(String[] args) {
        int[] numbers= {1,2,3,4,5,6,7,8,9,10,11,12,13};
        oddNumbers(numbers);


        System.out.println("The sum of the numbers are "+ sumOfAllNumbers(numbers));
        System.out.println("The average number is "+ average(numbers));
        randomNum(0);
        System.out.println("The sum of all even numbers are "+ sumEvenNum(numbers));
        System.out.println("The volume of a cube is "+volumeOfCube(2));
        System.out.println(leapYear(2024));
    }//PSVM
public static void oddNumbers(int[] numbers){//Question 1
        for (int  i = numbers.length-1;i >=0; i-- ){
        if(numbers[i] % 2==1){
            System.out.println("the odd numbers are "+numbers[i]);
        }
    }
    }public static int sumOfAllNumbers(int[] numbers){//Question 2
       int sum =0;
        for(int i =0; i < numbers.length; i++){
            sum +=numbers[i];
        }return sum;
    }public static double average(int[] numbers){//Question 3
        int averageNum = 0;
        for(int i =0; i <numbers.length; i++){
            averageNum += numbers[i];
        }return (double)averageNum/numbers.length;//Question 4
   }public static void randomNum(int numbers){
       int random= (int) (Math.random()* 6) +1+ numbers;
        System.out.println("The random number from 1-6 is "+random);
    }public static int sumEvenNum(int[] numbers){//Question 5
        int sum =0;
        for(int i =0; i < numbers.length; i++) {
        if (numbers[i] % 2==0)
            sum +=numbers[i];
        }return sum;
    }public static int  volumeOfCube(int volume){//Number 6
        int volumeOF =volume * volume * volume;
        return volumeOF;
    }public static boolean leapYear(int years) {//Question 9//check if year is leap year, it is divisible by 4= 4%==0 and 100=%100==0
        int year = 2024;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return true;
            }
        }return ;
    }







}//Main
