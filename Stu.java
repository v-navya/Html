import java.util.*;
public class Stu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        String name=sc.nextLine();
        System.out.println("enter class:");
        int a=sc.nextInt();
        System.out.println("enter age:");
        int age=sc.nextInt();
         System.out.println("enter gender");
          char ch=sc.next().charAt(0);
         System.out.println("enter marks of subjects:");
          int s1=sc.nextInt();
          int s2=sc.nextInt();
          int s3=sc.nextInt();
    double total=s1+s2+s3;
    double avg=total/3;
    double per=(total/300)*100;
 
   String k=(per<=40)?"fail":"pass";
    System.out.println();
   System.out.println("name :"+name);
      System.out.println("class :"+a);
       System.out.println("age :"+age);
       //System.out.println("enter gender");
          //char ch=sc.next().charAt(0);
       if(ch=='f'||ch=='m'||ch=='o')
       {
        System.out.println("gender :"+ch);
       }
       else{
         System.out.println("not valid");
       }
       System.out.println("pass / fail :"+k);

    }
}
