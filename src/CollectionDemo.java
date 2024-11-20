//import javax.naming.InsufficientResourcesException;
//import java.util.*;
////Array list
////public class CollectionDemo {
////    public static void main(String[] args) {
//////        ArrayList<Integer> numbers = new ArrayList<Integer>();
////        for (int i = 0; i <= 10; i++) {
////            numbers.add(i);
////        }
////
////        numbers.add(100);
////        numbers.add(100);
////        System.out.println(numbers);
////        numbers.set(0, 100);
////        numbers.remove(2);
////        System.out.println(numbers.get(7));
////        System.out.println(numbers);
////        System.out.println(numbers.contains(100));
////        System.out.println(numbers.contains(15));
//////        for (int i : numbers)
//////            System.out.println(i);
//////        Iterator<Integer> i = numbers.iterator();
////        while (i.hasNext()) {
////        }
////        System.out.println(i);
////        ArrayList<String> name = new ArrayList<String>();
////        name.add("lavanya");
////        name.add("10");
////        name.add("1");
////        System.out.println(name);
////        for (String j : name) {
////            System.out.println(j);
////        }
//////        linked list
////        LinkedList<Integer> cars=new LinkedList<>();
////        cars.add(10);
////        cars.add(11);
////        cars.add(12);
////        System.out.println(cars.remove(2) +" the twelve is removed");
////         QUEUE
////        Queue<String> q= new LinkedList<String>();
////        q.add("lavan");
////        q.add("shlini");
////        q.add("keertrhana");
////        System.out.println(q.peek());
////        System.out.println(q.remove());
////        System.out.println(q.peek());
////        System.out.println(q.poll());
//// int i= 10;
//// Integer i2=Integer.valueOf(i);
////  int j=i2.intValue();
////System.out.println(i2);
////Integer i3=20;
////        System.out.println(i3);
////int k=i2;
////        System.out.println(k);
////        Integer ob1=10;
////        String ob2="laba";
////        Double ob3=12.23;
////         Character ob4='A';
////        System.out.println(ob1);
////        System.out.println(ob2);
////        System.out.println(ob3);
////        System.out.println(ob4);
////
////
////
////   }
////}
////class InsufficientFundException extends Exception{
////    public InsufficientFundException(int amount) {
////        super("Insufficient funds. You need an additional " + amount + " units.");
////    }
////
////}
////class Account{
////    int balance;
////    static int widthdraw(int x){
////        return x;
////    }
////}
////public class CollectionDemo {
////    public static <InsufficientFundException> void main(String[] args) {
////        Account ob1 = new Account();
////        ob1.balance = 1000;
////        int widthdraw = 1500;
////        System.out.println(ob1.balance);
////        System.out.println(widthdraw);
////        System.out.println("i widthdraw a amount 1500");
//
//        try {
//            if (ob1.balance < widthdraw)
//                throw new InsufficientFundException(widthdraw - ob1.balance);
//        }
//       catch(InsufficientFundException e){
//                System.out.println(e.getMessage());
//            }
//        }
//    }

class InsufficientFundException extends Exception {
    public InsufficientFundException(int amount) {
        super("Insufficient funds. You need an additional " + amount + " units.");
    }
}
class Account {
    int balance;
}
public class CollectionDemo {
    public static void main(String[] args) {
        Account ob1 = new Account();
        ob1.balance = 1000;
        int withdraw = 1500;

        System.out.println("Current balance: " + ob1.balance);
        System.out.println("Requested withdrawal amount: " + withdraw);
        System.out.println("I am trying to withdraw an amount of 1500");

        try {
            if (ob1.balance < withdraw) {
                throw new InsufficientFundException(withdraw - ob1.balance);
            } else {
                ob1.balance -= withdraw;
                System.out.println("Withdrawal successful. New balance: " + ob1.balance);
            }
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
}
