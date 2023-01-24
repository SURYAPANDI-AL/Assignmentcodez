import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Applicant{
     int rollNo;
     String mailId,name;
      public Applicant(int rollNo,String mailId,String name){
          this.rollNo=rollNo;
          this.mailId=mailId;
          this.name=name;
      }
}
public class InterviewPanel {
  private Queue <Applicant> queue=new LinkedList<>();
  private boolean add=true;
  private int rollNo=1;
  private String name,mailId;
  public static void main(String args[]) throws InterruptedException {
      boolean check=true;
      InterviewPanel ip=new InterviewPanel();
      Scanner sc=new Scanner(System.in);
      while(ip.add) {
          System.out.println("\n____________fill your application_______________\n");
          System.out.println("RollNo:"+ip.rollNo+"\n");
          System.out.print("Name:");
          ip.name=sc.next();
          System.out.println();
          do {
              System.out.print("Mail ID:");
              ip.mailId=sc.next();
              System.out.println();
              check=true;
              if(!ip.mailId.contains("@gmail.com")) {
                  check=false;
                  System.out.println("invalid input");
              }
          }while(!check);
          Applicant canditate=new Applicant(ip.rollNo++,ip.mailId,ip.name);
          ip.queue.add(canditate);
          System.out.println("\nnew application enter 1 |||| X exit enter 0");
          int choice=sc.nextInt();
          ip.add=(choice==1)?true:false;
      }
      ip.queueImplementation();
  }
  public void queueImplementation() throws InterruptedException {
      while(queue.peek()!=null) {
          System.out.println("_______________Applicant's Queue_______________\n");
          for(Applicant b:queue){
                  Thread.sleep(500);
                System.out.println(b.rollNo+" "+b.name+" "+b.mailId+"\n");  
                }  
          Thread.sleep(1000);
          System.out.println("\ncanditate come in.....\n");
          Thread.sleep(2000);
          queue.poll();
      }
  }
}
