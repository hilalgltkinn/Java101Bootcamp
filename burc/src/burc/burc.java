package burc;

class burc {
  public static void main(String[] args) {
    
    java.util.Scanner klavye=new java.util.Scanner(System.in);
    
    System.out.println("L�tfen do�du�unuz ay� yaz�n�z");
    String ay=klavye.next();
 
    System.out.println("L�tfen do�du�unuz g�n� yaz�n�z");
    int gun=klavye.nextInt();
 
    String burc="";
 
    if (ay.equalsIgnoreCase("Ocak"))
    {
      if (gun>22)
        burc="Kova";
      else
        burc="O�lak";
    }
 
    if (ay.equalsIgnoreCase("�ubat"))
    {
      if (gun>20)
        burc="Bal�k";
      else
        burc="Kova";
    }
 
    if (ay.equalsIgnoreCase("Mart"))
    {
      if (gun>21)
        burc="Ko�";
      else
        burc="Bal�k";
    }
 
    if (ay.equalsIgnoreCase("Nisan"))
    {
      if (gun>21)
        burc="Bo�a";
      else
        burc="Ko�";
    }
 
    if (ay.equalsIgnoreCase("May�s"))
    {
      if (gun>22)
        burc="�kizler";
      else
        burc="Bo�a";
    }
 
    if (ay.equalsIgnoreCase("Haziran"))
    {
      if (gun>23)
        burc="Yenge�";
      else
        burc="�kizler";
    }
 
    if (ay.equalsIgnoreCase("Temmuz"))
    {
      if (gun>23)
        burc="Aslan";
      else
        burc="Yenge�";
    }
 
    if (ay.equalsIgnoreCase("A�ustos"))
    {
      if (gun>23)
        burc="Ba�ak";
      else
        burc="Aslan";
    }
 
    if (ay.equalsIgnoreCase("Eyl�l"))
    {
      if (gun>23)
        burc="Terazi";
      else
        burc="Ba�ak";
    }
 
    if (ay.equalsIgnoreCase("Ekim"))
    {
      if (gun>23)
        burc="Akrep";
      else
        burc="Terazi";
    }
 
    if (ay.equalsIgnoreCase("Kas�m"))
    {
      if (gun>22)
        burc="Yay";
      else
        burc="Akrep";
    }
 
    if (ay.equalsIgnoreCase("Aral�k"))
    {
      if (gun>22)
        burc="O�lak";
      else
        burc="Yay";
    }
 
   System.out.println(gun+" "+ay+" "+" g�n�nde do�duysan�z burcunuz da "+burc+" olur");
    
  }
}