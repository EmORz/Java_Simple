import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! I am Emanuil from Razgrad.");
    }
}

class HelloJava {
    public static void main(String[] arguments) {
        System.out.println("Hello, Java");
        Scanner input = new Scanner(System.in);

        System.out.println("Entere number: ");
        var num = input.nextInt();
        var check = num / 10;
        var temp = "";

        System.out.println(num);

        while (true){
            temp+=(num%10);
            num/=10;
            //System.out.println(temp);
            if (num==0){
                break;
            }
        }
        System.out.println(Integer.parseInt(temp));

    }
}

class TestVariables{

    public static void main(String[] arguments){
        // Declare some variables
        byte centuries = 20;
        short years = 2000;
        int days = 730480;
        long hours = 17531520;
        // Print the result on the console
        System.out.println(centuries + " centuries is " + years +
                " years, or " + days + " days, or " + hours + " hours.");

        int a = 1;
        int b = 123;

        System.out.println(a == b);
        //Test for gist
    }

}

class firstTask{

    public  static  void main(String[] argumets){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student class:");
        var student = input.nextByte();

        studentClass(student);
    }

    public static void studentClass(byte student){


        var nachalno = "1-4 klas: nachalno uchilishte";
        var osnovno = "5-7 klas: osnovno uchilishte";
        var pyrviGimn = "8-10 klas: pyrvi gimnazialen etap";
        var vtoriGimn = "11-12 klas: vtori gimnazialen etap";
        if (student>0&&student<5){
            System.out.println(nachalno);
        } else if (student>4&&student<8) {
            System.out.println(osnovno);
        }else if (student>7&&student<11) {
            System.out.println(pyrviGimn);
        }else if (student>10&&student<13) {
            System.out.println(vtoriGimn);
        }else {
            System.out.println("Error!");
        }

    }

}
