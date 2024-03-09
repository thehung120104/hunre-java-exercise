package baitapchuong3;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Máy: Bạn có gia đình chưa? (Trả lời 'có' hoặc 'chưa')");

	        
	        String answer = scanner.nextLine();

	     
	        switch (answer.toLowerCase()) {
	            case "có":
	                System.out.println("Máy: Bạn có mấy con?");
	                int numberOfChildren = scanner.nextInt();

	              
	                switch (numberOfChildren) {
	                    case 0:
	                        System.out.println("Máy: Bạn hãy bình tĩnh và thận trọng!");
	                        break;
	                    case 1:
	                    case 2:
	                    case 3:
	                        System.out.println("Máy: Hơi nhiều");
	                        break;
	                    default:
	                        System.out.println("Máy: Nhiều quá");
	                        break;
	                }
	                break;

	            case "chưa":
	                System.out.println("Máy: Bạn hãy bình tĩnh và thận trọng!");
	                break;

	            default:
	                System.out.println("Máy: Câu trả lời không rõ ràng. Hãy thử lại!");
	                break;
	        }

	}

}
