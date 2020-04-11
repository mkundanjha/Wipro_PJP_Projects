public class VideoStore{
    Video[] store;
    static int ind=0;
    
    public void addVideo(String name){
       store[ind]=new Video(name);
       ind++;
       System.out.println("Video\""+name+"\" added successfully.");
       
       
   } 
    public void doCheckout(String name){
       for(int i=0;i<store.length;i++){
            if (store[i].getName().equals(name)){
               store[i].doCheckout();
               break;
           }
        }
       System.out.println("Video\""+name+"\" checked out successfully."); 
       
   }
   public void doReturn(String name){
        for(int i=0;i<store.length;i++){
            if (store[i].getName().equals(name)){
               store[i].doReturn();
               break;
           }
        }
        System.out.println("Video\""+name+"\" reterned successfully."); 
       
    }
    

   public void receiveRating(String name,int rating){
       for(int i=0;i<store.length;i++){
            if (store[i].getName().equals(name)){
                store[i].receiveRating(rating);
                break;
            }
       }
       System.out.println("Rating \""+rating+"has been mapped to the Video\""+name+"\""); 
       
   }
   
   public void listInventory(){
       System.out.println("------------------------------------------------------------------");
       System.out.println("Video Name        |       Checkout Status        |       Rating");
       System.out.println("------------------------------------------------------------------");
       
       for(int i=0;i<store.length;i++){
           System.out.println(store[i].getName()+"   |   "+store[i].getCheckout()+"   |   "+store[i].getRating()+"   |   ");
           
       }
   }
    
}
