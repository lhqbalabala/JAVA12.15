import java.util.Scanner;
public class _12_7{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a binary number: ");
        try {
            String bin = input.nextLine();
            System.out.println("The decimal value for binary number " + bin+"is "+bin2Dec(bin));
            input.close();
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }

    }
    public static int bin2Dec(String bin) throws NumberFormatException {
        int bincharToDecimal=0,decimalValue=0;
        for(int i=0;i<bin.length();i++){
            char ch = bin.charAt(i);
            if(ch>='0' && ch<='1'){
                bincharToDecimal = ch - '0';
            }
            else{
                throw new NumberFormatException();
            }
            decimalValue = decimalValue * 2 + bincharToDecimal;
        }
        return decimalValue;
    }

}
