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
  static Queue <Applicant> queue=new LinkedList<>();
  static boolean add=true;
  static int rollNo=1;
  static String name,mailId;
  public static void main(String args[]) throws InterruptedException {
	  boolean check=true;
	  Scanner sc=new Scanner(System.in);
	  while(add) {
		  System.out.println("\n____________fill your application_______________\n");
		  System.out.println("RollNo:"+rollNo+"\n");
		  System.out.print("Name:");
		  name=sc.next();
		  System.out.println();
		  do {
			  System.out.print("Mail ID:");
			  mailId=sc.next();
			  System.out.println();
			  check=true;
			  if(!mailId.contains("@gmail.com")) {
			  	check=false;
			  	System.out.println("invalid input");
			  }
		  }while(!check);
		  Applicant canditate=new Applicant(rollNo++,mailId,name);
		  queue.add(canditate);
		  System.out.println("\nnew application enter 1 |||| X exit enter 0");
		  int choice=sc.nextInt();
		  add=(choice==1)?true:false;
	  }
	  queueImplementation();
  }
  public static void queueImplementation() throws InterruptedException {
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
