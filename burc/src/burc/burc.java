package burc;

class burc {
  public static void main(String[] args) {
    
    java.util.Scanner klavye=new java.util.Scanner(System.in);
    
    System.out.println("Lütfen doðduðunuz ayý yazýnýz");
    String ay=klavye.next();
 
    System.out.println("Lütfen doðduðunuz günü yazýnýz");
    int gun=klavye.nextInt();
 
    String burc="";
 
    if (ay.equalsIgnoreCase("Ocak"))
    {
      if (gun>22)
        burc="Kova";
      else
        burc="Oðlak";
    }
 
    if (ay.equalsIgnoreCase("Þubat"))
    {
      if (gun>20)
        burc="Balýk";
      else
        burc="Kova";
    }
 
    if (ay.equalsIgnoreCase("Mart"))
    {
      if (gun>21)
        burc="Koç";
      else
        burc="Balýk";
    }
 
    if (ay.equalsIgnoreCase("Nisan"))
    {
      if (gun>21)
        burc="Boða";
      else
        burc="Koç";
    }
 
    if (ay.equalsIgnoreCase("Mayýs"))
    {
      if (gun>22)
        burc="Ýkizler";
      else
        burc="Boða";
    }
 
    if (ay.equalsIgnoreCase("Haziran"))
    {
      if (gun>23)
        burc="Yengeç";
      else
        burc="Ýkizler";
    }
 
    if (ay.equalsIgnoreCase("Temmuz"))
    {
      if (gun>23)
        burc="Aslan";
      else
        burc="Yengeç";
    }
 
    if (ay.equalsIgnoreCase("Aðustos"))
    {
      if (gun>23)
        burc="Baþak";
      else
        burc="Aslan";
    }
 
    if (ay.equalsIgnoreCase("Eylül"))
    {
      if (gun>23)
        burc="Terazi";
      else
        burc="Baþak";
    }
 
    if (ay.equalsIgnoreCase("Ekim"))
    {
      if (gun>23)
        burc="Akrep";
      else
        burc="Terazi";
    }
 
    if (ay.equalsIgnoreCase("Kasým"))
    {
      if (gun>22)
        burc="Yay";
      else
        burc="Akrep";
    }
 
    if (ay.equalsIgnoreCase("Aralýk"))
    {
      if (gun>22)
        burc="Oðlak";
      else
        burc="Yay";
    }
 
   System.out.println(gun+" "+ay+" "+" gününde doðduysanýz burcunuz da "+burc+" olur");
    
  }
}