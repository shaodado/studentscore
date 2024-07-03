import java.util.Scanner;

import javax.swing.JFrame;
public class java{
    public static void main(String arg[]){
      
        JFrame  studentscore=new JFrame("studentscore");
        studentscore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        studentscore.setSize(600,500);
        studentscore.setVisible(true);
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();

        System.out.print(a);
    }
}