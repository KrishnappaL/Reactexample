package democode;


public class Composition {
    public static void main(String[] args){
        Dental d = new Dental ("Dental Surgery ", "abc road",11889796);
        Sroom sr1 = new Sroom (1," Surgery Room 01");
        Sroom sr2 = new Sroom (2," Surgery Room 02");
        Sroom sr3 = new Sroom (3," Surgery Room 03");
      
        
        d.addsrooms(sr1);
        d.addsrooms(sr2);
        d.addsrooms(sr3);
        d.Details();
    }
 }


