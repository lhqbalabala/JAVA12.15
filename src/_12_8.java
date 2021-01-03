import java.util.Scanner;
public class _12_8{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a hex number: ");
        try {
            String hex = input.nextLine();
            System.out.println("The decimal value for hex number " + hex+"is "+hexToDec(hex.toUpperCase()));
            input.close();
        } catch (HexFormatException ex) {
            System.out.println(ex);
        }

    }
    public static int hexToDec(String hex) throws HexFormatException {
        int hexcharToDecimal=0,decimalValue=0;
        for(int i=0;i<hex.length();i++){
            char ch = hex.charAt(i);
            if(ch>='A' && ch<='F'){
                hexcharToDecimal = 10+ ch - 'A';
            }else if(ch>='0' && ch<='9'){
                hexcharToDecimal = ch - '0';
            }
            else{
                throw new HexFormatException("java.lang.FormatException");
            }
            decimalValue = decimalValue * 16 + hexcharToDecimal;
        }
        return decimalValue;
    }

}
class HexFormatException extends Exception{  //创建自定义异常
    public HexFormatException(String ErrorExceptin){	//构造方法
        super(ErrorExceptin);		//父类构造方法
    }
}