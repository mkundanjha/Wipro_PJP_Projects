import java.util.Scanner;
public class VideoLauncher{  
    
	public static void main(String[] args) {
	    
	    VideoStore video=new VideoStore();
	    Scanner scanner= new Scanner(System.in);
	
		String videoName;
		int rating;
		int flag=0;
		while(flag!=6){
		System.out.println("MAIN MENU \n---------\n---------\n");
		System.out.println("1.Add Videos \n2.Check Out Videos \n3.Return Video \n4.Receive Rating \n5.List Inventory \n6.Exit \n");
		String input= scanner.nextLine();
		int number=Integer.parseInt(input);
		flag=number;
		    
		    switch(number){
		        case 1:{
		            System.out.print("Enter the name of the video that you want to add:");
		            videoName=scanner.nextLine();
		            video.addVideo(videoName);
		            break;
		        }
		        case 2:{
		            System.out.print("Enter the name of the video that you want to check out:");
		            videoName=scanner.nextLine();
		            video.doCheckout(videoName);
		            break;
		            
		        }
		        case 3:{
		            System.out.print("Enter the name of the video that you want to return:");
		            videoName=scanner.nextLine();
		            video.doReturn(videoName);
		            break;
		            
		        }
		         case 4:{
		            System.out.print("Enter the name of the video that you want to Rate:");
		            videoName=scanner.nextLine();
		            System.out.print("Enter the rating for this Video ");
		            rating=Integer.parseInt(scanner.nextLine());
		            video.receiveRating(videoName,rating);
		            break;
		        }
		         case 5:{   
		             video.listInventory();
		             break;
		       }
		    }
	   
		}
	    
	}
    
}
