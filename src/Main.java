import com.Action;
import people.People;

public class Main {
    public static void main(String[] args) {
        Action A = new Action(20, "Lis");
        System.out.println(A.toString());

        People AA = new People("12", "1");
        AA.toString();
        System.out.println(AA.getCitizen1() + AA.getCitizen2());
        System.out.println(AA);

    }
}
