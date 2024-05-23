package democode;


import java.util.ArrayList;
import java.util.List;import java.util.ArrayList;
import java.util.List;
public class Dental{
	public List<Sroom> sRoomList;
    public String name;    
    public String address;
    public int contact;
    
    public Dental(String name, String address, int contact) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.sRoomList = new ArrayList<Sroom>();
    }

    public void addsrooms(Sroom room) {
    	sRoomList.add(room);
    }


  public void Details(){
      System.out.println("DENTAL SURGERY DETAILS");
      System.out.println("____________________");
      System.out.println("Name: "+name);
      System.out.println("Address: "+address);
      System.out.println("______________");
      System.out.println("Contact: "+contact);
      System.out.println("SURGERY ROOM DETAILS");
      int n = sRoomList.size();
     // System.out.println(n);
      } 
}