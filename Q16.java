import java.util.Scanner;

public class Q16 {
	 
	  
      public static void main(String[] args) {
    	  
    	  Scanner scanner=new Scanner(System.in);
    	  String str[]= {"가위","바위","보"};
    	  System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
    	  
    	  while(true) {
    		  int n=(int)(Math.random()*3);
    		  System.out.print("가위 바위 보!>>");
    		  String game = scanner.next();
    		   if(game.equals("그만")) {
    			   System.out.println("게임을 종료합니다...");
    			   break;
    		   }
        	  
               System.out.print("사용자는 "+game+", 컴퓨터는 "+str[n]+", ");
        	   if (game.equals("가위")) {
        		   if(str[n].equals("가위"))
        			   System.out.println("비겼습니다.");
        		   else if(str[n].equals("바위"))
        			   System.out.println("컴퓨터가 이겼습니다.");
        		   else if(str[n].equals("보"))
        			   System.out.println("사용자가 이겼습니다.");
        	   }
        	   
        	   if (game.equals("바위")) {
        		   if(str[n].equals("바위"))
        			   System.out.println("비겼습니다.");
        		   else if(str[n].equals("보"))
        		       System.out.println("컴퓨터가 이겼습니다.");
        		   else if(str[n].equals("가위"))
        			   System.out.println("사용자가 이겼습니다.");        		   
        	   }
        	   
        	   if(game.equals("보")) {
        		   if(str[n].equals("보"))
        			   System.out.println("비겼습니다.");
        		   if(str[n].equals("가위"))
        			   System.out.println("컴퓨터가 이겼습니다.");
        		   if(str[n].equals("주먹"))
        			   System.out.println("사용자가 이겼습니다.");
        	   }
        	   
        	   else
        		   System.out.println("잘못 입력하였습니다.");
        	
    	  }
          scanner.close();
    	  
      }
}
