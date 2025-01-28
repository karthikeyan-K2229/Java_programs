//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
// Person.java
//class Person
////////{
////////    String name="lavaa";
////////    String name1="lllll0";
////////
////////  public void display(String name,String name1)
////////    {
////////        System.out.println(name+" "+name1);
////////////    }
////////////}
//////////// class Address{
////////////    String address="Covai";
////////////    String stste="tamil";
////////////
////////////    public void display()
////////////    {
////////////        System.out.println(address+" "+stste);
////////////    }
////////////}
////////////
////////////public class Main {
////////////    public static void main(String[] args) {
////////////
////////////        Address a=new Address();
////////////        a.display();
////////////        System.out.println(a.address);
////////////        String n="lavanya";
////////////        String n1="l";
////////////        Person p=new Person();
////////////        p.display(n,n1);
////////////
////////////    }
////////////}
//class Box{
//    int length;
//   int breadth;
////////    int height;
////////    int volume(){
////////        return length * breadth * height;
////////
////////    }
////////}
////////public class Main {
////////    public static void main(String[] args) {
////////        Box blackbox = new Box();
////////        blackbox.length = 12;
////////        blackbox.breadth = 10;
////////        blackbox.height = 11;
////////        blackbox.volume();
////////        System.out.println(blackbox.length);
////////        System.out.println(blackbox.breadth);
////////        System.out.println(blackbox.height);
////////        System.out.println(blackbox.volume());
////////
////////    }
////////}
////////////}
//////////class student{
//////////    String name;
//////////    String mail_id;
//////////    int rollno;
//////////    int mblno;
//////////}
//////////public class Main{
//////////    public static void main(String[]args){
//////////        student A= new student();
//////////        student B= new student();
//////////        student C=new student();
//////////        A.name="lavanya";
//////////        B.name="gayathri";
//////////        C.name="divya";
//////////        A.mail_id="lava12gmail.com";
//////////        B.mail_id="gayu23gmail.com";
//////////        C.mail_id="divya34gmail.com";
//////////        A.rollno=12;
//////////        B.rollno=23;
//////////        C.rollno=25;
//////////        A.mblno=234566789;
//////////        B.mblno=987654321;
//////////        C.mblno=897645321;
//////////        System.out.println(A.name);
//////////        System.out.println(B.name);
//////////        System.out.println(C.name);
//////////        System.out.println(A.mail_id);
//////////        System.out.println(B.mail_id);
//////////        System.out.println(C.mail_id);
//////////        System.out.println(A.rollno);
//////////        System.out.println(B.rollno);
//////////        System.out.println(C.rollno);
//////////        System.out.println(A.mblno);
//////////        System.out.println(B.mblno);
//////////        System.out.println(C.mblno);
//////////    }
//////////}
//class library{
//    String user;
//    String book;
//    String mail_id;
//    int card_no;
//    String reminder_message;
//}
////public class Main{
//    public static void main(String []args){
//         library user=new library();
//         library book=new library();
//         library mail_id=new library();
//         library card_no=new library();
//         library reminder_message=new library();
//         user.user="harini";
//         book.book="java";
//         mail_id.mail_id="harini123@gmail.com";
//         card_no.card_no=123;
//         System.out.println(user.user+" "+ book.book);
//         System.out.println(mail_id.mail_id);
//         System.out.println(card_no.card_no);
//    }
//}
//`///////public class Main {
////////    public static void main(String[] args) {
////////        int num;
////////        Scanner sc = new Scanner(System.in);
////////        System.out.println("enter the month:");
////////        String month = sc.nextLine();
////////        System.out.println("enter the year");
////////        int year = sc.nextInt();
////////        System.out.println("enter the date");
////////        int Date = sc.nextInt();
////////        System.out.println("enter a num:");
////////        num = sc.nextInt();
////////        if (num > 0) {
////////            System.out.println(num + " is a positive number.");
////////        } else if (num == 0) {
////////            System.out.println(num + " is a netrual");
////////        } else {
////////            System.out.println(num + " is a  negative number.");
////////        }
////////    }
////////}
//////
//////
////////                  METHOD & METHOD OVERLOADING
public class Main {
    static int stu_detail(int mblno) {
        return mblno;
    }
        static int mymethodplus ( int x, int y){
         return x + y;
        }
        static String mymethodplus ( String a,String b){
        return a+b;

    }

    public static void main(String[]args){
       int stu_detail=987654321;
      int result= mymethodplus(12,13);
       String word=mymethodplus("hello","java");
       System.out.println(stu_detail);
       System.out.println(result);
       System.out.println(word);
    }
}
////////
////////                        RECURSIVE CALL
////////public class Main {
////////    static int fib(int n){
////////        if(n<=1)
////////            return n;
////////        return fib(n-1)+fib(n-2);
////////    }
////////
////////        public static void main (String[] args){
////////            int n = 15;
////////            System.out.println(fib(n));
////////        }
////////class fruit{
////////    String name;
////////    String color;
////////}
////////public class Main{
////////    public static void main(String[] args){
////////        fruit A= new fruit();
////////        A.name="apple";
////////        A.color="red";
////////        System.out.println(A.name);
////////        System.out.println(A.color);
////////    }
////////}                                 MODIFIERS
////class test{
////    int a;
////    private int b;
////
////    public int c;
//    protected int d;
//}
//public class Main{
//    public static void main(String[]args){
//        test mark=new test();
//        mark.a=12;
//        mark.b=10;
//        mark.c=23;
//        mark.d=34;
//        System.out.println(mark.a);
//        System.out.println(mark.c);
//        System.out.println(mark.d);
//    }
//}
////class Animal{
//////    void eat() {
//////        System.out.println("this animal can eat");
//////    }
//////}
//////class dog extends Animal{
//////    void bark(){
//////        System.out.println(" this animal can bark");
//////    }
//////}
//////class puppy extends dog{
//////    void weep(){
//////        System.out.println("weep");
//////    }
//////}
//////class cat extends Animal{
//////    void meow(){
//////        System.out.println("can meow");
//////    }
//////}
//////public class Main{
//////    public static void main(String[]args){
//////      puppy  ob1=new puppy();
//////      cat ob2=new cat();
//////        ob2.meow();
//////        ob1.weep();
//////        ob1.bark();
//////        ob1.eat();
//////    }
//////}
//class animal{
//    String name;
//    int age;
//    void makesound(){
//        System.out.println("animal makes a sound");
//    }
//}
//class dog extends animal{
//    String breed;
//    @Override
//    void makesound() {
//    System.out.println("dog barks");
//    }
//    void fetch(){
//        System.out.println("dog fetching");
//    }
//}
//class cat extends animal{
//    String color;
//    @Override
//    void makesound() {
//        System.out.println("cat meows");
//    }
//    void climb(){
//        System.out.println("cat is climbing");
//    }
//}
////public class Main {
//    public static void main(String[] args) {
//        animal a1=new animal();
//        a1.name="parrot";
//        a1.age=2;
//        a1.makesound();
//        System.out.println(a1.name);
//        System.out.println(a1.age);
//        dog d1=new dog();
//        d1.name="tommy";
//        d1.breed="husky";
//        d1.makesound();
//        d1.fetch();
//        System.out.println(d1.name);
//        System.out.println(d1.breed);
//        cat c1=new cat();
//        c1.color="black";
//        c1.makesound();
//        c1.climb();
//        System.out.println(c1.color);
//    }
//}

//                                        INHERITANCE AND ITS TYPE
//
////class vehicle{
////    String brand;
////    int year;
////    void startEngine(){
////    }
////}
////class car extends vehicle{
////    String fueltype;
////    @Override
////    void startEngine() {
////        System.out.println("car engine starts");
////    }
////    void drive(){
////        System.out.println("car is starting");
////    }
////}
////class truck extends car{
////    int loadcapacity;
////
////    @Override
////    void startEngine() {
////        System.out.println("truck engine start");
////    }
////    void haul(){
////        System.out.println("truck is hauling");
////    }
////}
////public class Main {
//   public static void main(String[] args) {
//       truck t1=new truck();
//       t1.loadcapacity=200;
//       t1.startEngine();
//       t1.haul();
//       t1.brand="benz";
//       t1.drive();
//   }
//}
////                                                 SUPER KEYWORD
//class animal{
//    int age=12;
//    String breed= "husky";
//    animal(String name){
//        System.out.println(name);
//    }
//    void makesound(){
//       System.out.println("animals make sound");
//    }
//}
//class dog extends animal{
//    dog(){
//        super("tiger");
//        super.makesound();
//        System.out.println(super.age);
//        System.out.println("dog");
//        System.out.println(super.breed);
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        dog d1=new dog();
//    }
//}
////                            SUPER KEYOWRD EXERCISE
//class person{
//    person(String name){
//        System.out.println(name);
//    }
//}
//class employee extends person{
//   employee(){
//       super("lavanya");
//   }
//
//}
//    public class Main{
//    public static void main(String[] args){
//        employee e1=new employee();
//
//
//    }
//}23
//                                     THIS KEYWord
//public class teacher {
//    String myname;
//    teacher(){
//        System.out.println("hello teacher");
//    }
//    void setname(String myname){
//        this.myname=myname;
//    }
//    public static void main(String []args){
//        teacher t1=new teacher();
//        t1.setname("mark");
//        System.out.println(t1.myname);
//
//    }
//}
//                                   INNER (OR) NESTED CLASS
//class outer{
////    int num;
////    void numbers(){
////        System.out.println("enter the numbers");
////    }
////    class inner{
////        String name;
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        outer o=new outer();
//        o.num=3;
//        System.out.println(o.num);
//        outer.inner i=o.new inner();
//        i.name="lavanya";
//        System.out.println(i.name);
//    }
//}
//                                       Abstraction
// abstract class vechile{
//     abstract void speed();
//     void brand(){
//         System.out.println("baleno");
//     }
//}
//class truck extends vechile{
//    void speed(){
//        System.out.println("200km/hr");
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        truck t1=new truck();
//        t1.speed();
//        t1.brand();
//    }
//}
//                                         INTERFACE
// interface ridable{
//    int maxSpeed=12;
//  public  void ride();
// default void display(){
//      System.out.println("hello from ridable interface");
//  }
//
//}
//class car implements ridable{
//     public void ride(){
//        System.out.println("you are riding a car");
//    }
//    public void  display(){
//         System.out.println("hello from class method");
//    }
//
//}
//class bike implements ridable{
//    public void ride(){
//        System.out.println("you are riding a bike");
//    }
//}
//class mechanic {
//    void check(ridable r) {
//        System.out.println("checking");
//        r.ride();
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        ridable r= new car();
//        mechanic m = new mechanic();
//        car c=new car();
//        bike b=new bike();
//        c.display();
//        m.check(c);
//        m.check(b);?"



//    }
//}
////abstract class computer{
//     abstract void code();
//}
//class laptop extends computer{
//    void code(){
//        System.out.println("coding,compling..");
//    }
//}
//class desktop extends computer{
//    void code(){
//        System.out.println("coding,compile,run :Fastrer");
//    }
//}
//class developer {
//    void devApp(computer lap){
//        lap.code();
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        computer lap=new laptop();
//        computer desk=new desktop();
//        developer navin=new developer();
//        navin.devApp(desk);
//    }
//}
//                                    Enum
//enum months {
//   JANUARY("J"), FEBRUARY("F"), MARCH("M"), APRIL("A"), MAY("M"), JUNE("J"), JULY("J"), AUGUST("A"), SEPTEMBER("S"), OCTOBER("O"), NOVEMBER("N"), DECEMBER("D");
//   private String abbr;
//
//    months(String ab) {
//        abbr = ab;
//    }
//
//    public String getAbbr() {
//        return abbr;
//    }
//}
//public class Main{
//        public static void main(String[]args) {
//            months m1=months.DECEMBER;
//            System.out.println(m1);
//            System.out.println(m1.ordinal());
//
//      }
//}
//
//enum weeks{
//    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
//}
//public class Main{
//    public static void main(String[]args){
//        weeks w1=weeks.FRIDAY;
//        weeks w2=weeks.SATURDAY;
//        System.out.println(w1);
//        System.out.println(w2);
//    }
//
//}
//import java.time.LocalTime;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//public class Main {
//    public static void main(String[] args) {
//        LocalTime l1 = LocalTime.now();
//        LocalDate d1=LocalDate.now();
//        LocalDateTime dt=LocalDateTime.now();
//        System.out.println(d1);
//        System.out.println(l1);
//        System.out.println(dt);
//    }
//}
//                                      try and catch exception
//public class Main{
//    public static void main(String[]args){
//        int a=10;int b=0;
//        int c=0;
//        try {
//            c = a / b;
//        }
//        catch(Exception e){
//            System.out.println("Error occured");
//        }
//        System.out.println(c);
//    }
//}
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        try {
//            ArrayList<Integer> num = new ArrayList<>();
//            num.add(1);
//            num.add(2);
//            num.add(3);
//            System.out.println(num.get(1));
//        }
//        catch(Exception e){
//          System.out.println("index out of bounds ");
//        }
//        finally{
//            System.out.println("the try and catch are executed");
//        }
//        File file=new File("abc.text");
//        try{
//                FileInputStream fs = new FileInputStream(file);
//        }
//        catch (FileNotFoundException e){
//          e.printStackTrace();
//        }
//    }
//}
//import java.util.regex.Pattern;
//import java.util.regex.Matcher;
//public class Main{
//    public static void main(String[]args){
//        String para="java is a very very complicated programming language";
//        String patternString="python";
//        Pattern pattern= Pattern.compile(patternString);
//        Matcher matcher = pattern.matcher(para);
//        if(matcher.find()){
//            System.out.println("matcher is found");
//        }
//        else{
//            System.out.println("matcher is  not found");
//        }
//
//    }
//}
//import java.io.PrintStream;
//import java.util.Scanner;
//public class Main{
//    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the totalscore:");
//        int totalscore = sc.nextInt();
//        System.out.println("enter a overs:");
//        double overs = sc.nextDouble();
//         System.out.print("The run rate is:");
//         double runRate;
//         runRate=totalscore/overs;
//         System.out.println(runRate);
//
//    }
//}






