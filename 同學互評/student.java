import java.util.Scanner;
public class student{
    public static void main(String arg[]){
      Scanner sc=new Scanner(System.in);
        /*JFrame  studentscore=new JFrame("studentscore");
        studentscore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        studentscore.setSize(600,500);
        studentscore.setVisible(true);*/
        System.out.println("請問會有幾組");
        int team=sc.nextInt();
        System.out.print("總共有"+team+"組\r\n");
        System.out.print("組員互評:"+"  請輸入組別");
        int teamnumber=sc.nextInt();
        
        do{
            System.out.println("沒有這一組"+" 輸入錯誤");
            System.out.println("請重新輸入");
            teamnumber=sc.nextInt();
        }while(team>=teamnumber);

        int student =sc.nextInt();
    }
}