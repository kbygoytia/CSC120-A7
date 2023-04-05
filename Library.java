/* This is a stub for the Library class */
import java.util.Hashtable;
public class Library extends Building{

    private Hashtable<String, Boolean> collection;
    private boolean hasElevator;

    /**
     * 
     * @param name
     * @param address
     * @param nFloors
     * @param hasElevator
     */
    public Library(String name, String address, int nFloors, boolean hasElevator) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
    }
    /**
     * Creates a Library object
     * @param name
     * @param address
     * @param nFloors
     * @param hasElevator
     * @return a new library object with a name, address, and floor amount 
     * in the format [name] is a [nFloors]-building located at [address].
     */

    /** Accessor for collection */
    public Hashtable<String, Boolean> getCollection() {
      return this.collection;
    }
    /**
     * Looks for a title inside of the library's collection
     * @param title inside of collection
     * @return this.collection
     */

    public void addTitle(String title){
      try{
        if(this.collection.containsKey(title)){
          throw new RuntimeException("This book is already in the library.");
        } 
        else{
          this.collection.put(title, true);
        }
      }
        catch (RuntimeException e){
          System.out.println(e);
           
        } 
    }

    public void addTitle(int title_num){
      String title = String.valueOf(title_num);
      this.addTitle(title);
    }
    /**
     * adds the String title specified in main into the collection
     * @param title
     * 
     */

    public boolean hasElevator(){
        return this.hasElevator;
    }

    public String removeTitle(String title){
      try{
        if(!this.collection.containsKey(title)){
          throw new RuntimeException(title + " isn't in the library");
        } 
        else{
          this.collection.remove(title);
        }
      }
        catch (RuntimeException e){
          System.out.println(e);
           
        } 
        return(title); 
  }

  public String removeTitle(int title_num){
    String title = String.valueOf(title_num);
    return this.removeTitle(title);
    }
  /**
   * removes a string title from the collection
   * @param title
   * @return title
   */

  

    public void checkOut(String title){
      try{
        if(!this.collection.containsKey(title)){
          throw new RuntimeException(title + " does not exist in the library.");
        } else if (this.collection.get(title).equals(false)){
            throw new RuntimeException(title + " has not been returned to the library.");
          }
        else{
          this.collection.replace(title, false);
          System.out.println(title + " has successfully been checked out.");
        }
      }
        catch (RuntimeException e){
          System.out.println(e);
           
        } 
    }

    public void checkOut(int title_num){
      String title = String.valueOf(title_num);
      this.checkOut(title);
      }

    /**
     * checks out a key string title by turning it's value false
     * @param title
     */


    public void returnBook(String title){
      try{
        if(!this.collection.containsKey(title)){
          throw new RuntimeException(title + " does not exist in the library.");
        } else if (this.collection.get(title).equals(true)){
            throw new RuntimeException(title + " has already been returned to the library.");
          }
        else{
          this.collection.replace(title, true);
          System.out.println(title + " has been returned.");
        }
      }
        catch (RuntimeException e){
          System.out.println(e);
           
        } 
    }

    public void returnBook(int title_num){
      String title = String.valueOf(title_num);
      this.returnBook(title);
      }
    /**
     * returns key string title by chaning value to true
     * @param title
     * 
     */

  

    // returns true if the title appears as a key in the Libary's collection, false otherwise
    public boolean containsTitle(String title){
      if(this.collection.containsKey(title)){
        return true;
      }
      else{
        return false;
      }
    } 

    public boolean containsTitle(int title_num){
      String title = String.valueOf(title_num);
      return this.containsTitle(title);
      }
    /**
     * checks if collection conatins a string title
     * @param title
     * @return boolean
     */

    


    // returns true if the title is currently available, false otherwise
    public boolean isAvailable(String title){
      if (this.collection.get(title).equals(true)){
        return true;
      }
      else{
        return false;
        }
      }

      public boolean isAvailable(int title_num){
        String title = String.valueOf(title_num);
        return this.isAvailable(title);
        }
      /**
       * checks if a key string title is available in collection by looking at its value boolean to see if it is true
       * @param title
       * @return boolean
       */

      public String toString() {
        String description = super.toString();
        description += " There are currently " + this.collection.size() + " books in this collection.";
        return description;
      }
      /**
       * prints amount of titles in collection
       * @param args
       * @return description
       */
  
    // prints out the entire collection in an easy-to-read way (including checkout status)
    public void printCollection(){
      System.out.println(this.collection.toString());
    }
    /**
     * prints the titles and their boolean in collection
     * @param args
     */

    public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n) \n + addTitle() \n + removeTitle() \n + returnBook() \n + checkOut() \n + containsTitle() \n + isAvailable() \n + printCollection()" );
    }
    

    public static void main(String[] args) {
      Library nielson = new Library("Nielson", "Smith College", 4, true);
      nielson.addTitle("The Lorax by Dr. Seuss");
      System.out.println(nielson);
      nielson.printCollection();
      nielson.isAvailable("The Lorax by Dr. Seuss");
      nielson.containsTitle("The Lorax by Dr. Seuss");
      nielson.checkOut("The Lorax by Dr. Seuss");
      nielson.addTitle("Bible");
      nielson.returnBook("Bible");
      nielson.addTitle(1984);
      nielson.checkOut(1984);
      nielson.printCollection();
      nielson.returnBook(1984);
      nielson.printCollection();
    }
  
  }