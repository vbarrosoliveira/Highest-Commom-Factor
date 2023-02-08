package question9;
//Write a program to calculate The Highest Common Factor(HCF) of Two given numbers.
public class Main9 {
    public static void main(
            String[] args) {
        int given_number1 = 100; //here we suppose given_number1 < given_number2
        int given_number2 = 200;
        int check_number=2;
        int common_factor =1;


        while (check_number <= given_number1) {

            if (given_number1 % check_number == 0 && given_number2 % check_number == 0) {

                common_factor = check_number;
                System.out.println(common_factor + " is a common factor");
                check_number++;
            }
            else

                check_number++;


        }
        System.out.println(common_factor + "= HCF");
    }
}
