//class Book {
//    void UpdateDb() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("UpdatingDB");
//            try {
//                Thread.sleep(8000);
//            } catch (InterruptedException e) {
//            }
//        }
//    }
//}
//
//    class Number {
//        void print() {
//            for (int i = 1; i <= 5; i++) {
//                System.out.println(i);
//            }
//        }
//        public class MultiThreadDemo{
//
//    public static void main(String[] args) {
//            Book b1 = new Book();
//            Number n1=new Number();
//
class book{
    void UpdateDB(){
        for(int i=1;i<=5;i++) {
            System.out.println("updatingDB");
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
            }
        }
        }
    }
    class num{
    void print(){
        for(int i=1;i<=5;i++) {
            System.out.println(i);
        }
    }
    }

public class MultiThreadDemo {
    public static void main(String[]args){
        book b1=new book();
        num n1=new num();
        b1.UpdateDB();
        n1.print();
    }
}
