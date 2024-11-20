public class teacher {
    String myname;
    teacher(){
        System.out.println("hello teacher");
    }
    void setname(String myname){
       this.myname=myname;
    }
    public static void main(String []args){
      teacher t1=new teacher();
      t1.setname("mark");
      System.out.println(t1.myname);

    }
}
