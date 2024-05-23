package democode;


public class Sroom {
   public static int r_id;
   public static String type;
   
   public Sroom(int r_id, String type){
       this.r_id = r_id;
       this.type = type;
       SRoomDetails();
}
   public static void SRoomDetails(){
		System.out.println("Room ID: "+r_id);
		// TODO Auto-generated catch block
	
       System.out.println("Room Type: "+type);
}
}
