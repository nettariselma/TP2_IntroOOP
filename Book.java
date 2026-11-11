public class Book {

 // 1. Private Attributes ( Encapsulation )
 private String title ;
 private String author ;
 private double price ;
 // 2. Getters ( public read access )
 public String getTitle () { return title ; }
 public String getAuthor () { return author ; }
 public double getPrice () { return price ; }
 // 3. Setters ( public write access )
 public void setTitle ( String title ) { this . title = title ; }
 public void setAuthor ( String author ) { this . author = author ; }
 public void setPrice ( double price ) { this . price = price ; }
 // 4. Behavior
 public void displayInfo () {
 System . out . println (" Title : " + title ) ;
 System . out . println (" Author : " + author ) ;
 System . out . println (" Price : " + price + " DA") ;
 System . out . println (" ---------------------------") ;
 }
 }