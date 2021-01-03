import java.util.*;
import java.util.concurrent.ExecutionException;
public class _12_10 {
    public static void main(String[] args){
        List list=new ArrayList();
        try {
            while(true) {
                list.add(1);
            }
        } catch (Exception e) {
            System.exit(0);
        }
    }
}