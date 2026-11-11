 public class MainApp {
 public static void main ( String [] args ) {
// A. Create book1 and fill it via SETTERS
 Book book1 = new Book () ;
 book1 . setTitle (" Clean Code ") ;
 book1 . setAuthor (" Robert C. Martin ") ;
 book1 . setPrice (3200.0) ;
 // B. Create book2 and fill it via SETTERS
 Book book2 = new Book () ;
 book2 . setTitle (" Effective Java ") ;
 book2 . setAuthor (" Joshua Bloch ") ;
 book2 . setPrice (4500.0) ;
//C. Display both
System . out . println (" === Book 1 === ") ;
 book1 . displayInfo () ;
 System . out . println (" === Book 2 === ") ;
 book2 . displayInfo () ;
 // D. READ a value via GETTER
 System . out . println (" Book 1 price is: " + book1 . getPrice () + " DA") ;

 // E. MODIFY a value via SETTER
 book1 . setPrice (2900.0) ;
 System . out . println (" === Book 1 after price update === ") ;
 book1 . displayInfo () ;

 // F. Try to access a private field directly ( UNCOMMENT TO SEEERROR )
 // book1 . price = -5.0; // Compile error : price has privateaccess in Book
 }
 }