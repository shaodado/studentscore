import java.util.Scanner;

public class studentscore {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("請問有幾組");
		int team =sc.nextInt();
		System.out.	print("總共有"+team+"組\r\n");
        System.out.print("組員互評:"+"  請輸入組別");
        int teamnumber=sc.nextInt();
        if(team<teamnumber) {
	        do {
	        	System.out.print("查無此組別\r\n重新輸入");
	        	teamnumber=sc.nextInt();
	        }
	        while(team>=teamnumber);
        }
        System.out.print("請輸入組員名稱\r\n組員1:");
        String  teammate1=sc.next();
        System.out.println("組員2:");
        String  teammate2=sc.next();
        System.out.println("組員3:");
        String  teammate3=sc.next();
        System.out.println("組員4:");
        String  teammate4=sc.next();
        
        System.out.println("請輸入自己的名子");
        String name=sc.next();
        
        if(name==teammate1)
        {
        	System.out.print(name+"您好:\r\n"+"請為您的隊友評分\r\n"+"組員2:"+teammate2);
        	int teammate2fraction=sc.nextInt();
        	System.out.print("組員3:"+teammate3);
        	int teammate3fraction=sc.nextInt();
        	System.out.print("組員4:"+teammate4);
        	int teammate4fraction=sc.nextInt();
        	System.out.print(teammate2+teammate2fraction+"分\r\n"+teammate3+teammate3fraction+"分\r\n"+teammate4+teammate4fraction+"分\r\n");
        }else if(name==teammate2)
        {
        	System.out.print(name+"您好:\r\n"+"請為您的隊友評分\r\n"+"組員1:"+teammate1);
        	int teammate1fraction=sc.nextInt();
        	System.out.print("組員3:"+teammate3);
        	int teammate3fraction=sc.nextInt();
        	System.out.print("組員4:"+teammate4);
        	int teammate4fraction=sc.nextInt();
        	System.out.print(teammate1+teammate1fraction+"分\r\n"+teammate3+teammate3fraction+"分\r\n"+teammate4+teammate4fraction+"分\r\n");
        }else if(name==teammate3)
        {
        	System.out.print(name+"您好:\r\n"+"請為您的隊友評分\r\n"+"組員1:"+teammate1);
        	int teammate1fraction=sc.nextInt();
        	System.out.print("組員2:"+teammate2);
        	int teammate2fraction=sc.nextInt();
        	System.out.print("組員4:"+teammate4);
        	int teammate4fraction=sc.nextInt();
        	System.out.print(teammate1+teammate1fraction+"分\r\n"+teammate2+teammate2fraction+"分\r\n"+teammate4+teammate4fraction+"分\r\n");
        }else if(name==teammate4)
        {
        	System.out.print(name+"您好:\r\n"+"請為您的隊友評分\r\n"+"組員1:"+teammate1);
        	int teammate1fraction=sc.nextInt();
        	System.out.print("組員2:"+teammate2);
        	int teammate2fraction=sc.nextInt();
        	System.out.print("組員3:"+teammate3);
        	int teammate3fraction=sc.nextInt();
        	System.out.print(teammate1+teammate1fraction+"分\r\n"+teammate2+teammate2fraction+"分\r\n"+teammate3+teammate3fraction+"分\r\n");
        }
        
        
	}
	
	
}
