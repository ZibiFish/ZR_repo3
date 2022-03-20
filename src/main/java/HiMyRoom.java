import com.sun.source.doctree.SummaryTree;
//code review
public class HiMyRoom {
    public static void main(String[] args) {
       boolean reason = true;
        System.out.println("Hi World");
            if(reason){
                int result = SumOfNumber(7, 3);
                System.out.println(result);
            }
//test comment
    }
    public static int SumOfNumber(int a, int b){
        return a+b;
    }
}
