import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;
  private boolean hasElevator;
  private boolean hasKitchen;

  /**
   * 
   * @param name
   * @param address
   * @param nFloors
   * @param hasDiningRoom
   * @param hasElevator
   */

  public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean hasElevator) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    this.hasElevator = hasElevator;
    this.hasKitchen = false;
  }
  /**
     * Creates a House object
     * @param name
     * @param address
     * @param nFloors
     * @param hasDiningRoom
     * @return a new house object with a name, address, floor amount, and hasDiningRoom.
     * in the format [name] is a [nFloors]-building located at [address].
     */

    /** Overloaded contructor */
     public House(String name, String address, int nFloors ){
      super(name, address, nFloors);
      this.residents = new ArrayList<String>();
      this.hasDiningRoom = false;
      this.hasElevator = false;
      this.hasKitchen = false;
     }
       /** Overloaded contructor */
     public House(String name, String address, boolean hasKitchen){
      super(name, address);
      this.nFloors = 3;
      this.residents = new ArrayList<String>();
      this.hasDiningRoom = false;
      this.hasElevator = false;
      this.hasKitchen = hasKitchen;
     }

  /** Accessor for hasDiningRoom */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  /** Accessor for hasKitchen */
  public boolean hasKitchen(){
    return this.hasKitchen;
  }

  /** Accessor for hasElevator */
  public boolean hasElevator() {
    return this.hasElevator;
  }

  /** Accessor for number of residents */
  public int nResidents() {
    return this.residents.size();
  }

/**
 * moves in a string name into the house if they do not already live there
 * @param name
 * 
 */
  public void moveIn(String name) {
    // check if this.residents contains name
    try{
      if (this.residents.contains(name)){
      //   if so: throw and exception
      throw new RuntimeException(name + " is already a resdient of " + this.name);
    }
    this.residents.add(name);
    System.out.println(name + " has just moved into " + this.name + "! Go say hello :-)");
    }
    catch (RuntimeException e){
      System.out.println(e);
    }
  }


  public String moveOut(String name){
    try{
      if (!this.residents.contains(name)){
          throw new RuntimeException(name + " doesn't live in " + this.name);
    }
    this.residents.remove(name);
    System.out.println(name + " has moved out of " + this.name);

  }
    catch (RuntimeException e){
    System.out.println(e);
    
    }
    return name;
  }
  /**
   * moves out a resident of the house
   * @param person
   * @return name
   */


  public boolean isResident(String person){
    if (this.residents.contains(name)){
      return true;
    }
    else{
      return false;
    }
  }
  /**
   * checks if a person is a resident of the house
   * @param person
   * @return boolean
   */
  

  public String toString() {
    String description = super.toString();
    description += " There are currently " + this.nResidents() + " people living in this house.";
    description += " This house ";
    if (this.hasDiningRoom) {
      description += "has";
    } else {
      description += "does not have";
    }
    description += " an active dining room.";
    description += " This house ";
    if(this.hasElevator){
      description += "has";
    } else{
      description += "does not have";
    } 
    description += " an elevator"; 
    description += " This house ";
    if(this.hasKitchen){
      description += "has";
    } else{
      description += "does not have";
    } 
    description += " a kitchen"; 
    return description;
  }
  /**
   * creates a description of the house
   * @param args
   * @return description
   */

  public void showOptions() {
    System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n) \n + isResident() \n + moveIn() \n + moveOut()" );
}

public void goToFloor(int floorNum) {
    try{
    if(this.hasElevator == false){
        throw new RuntimeException("Sorry there is no elevator.");
     }
     super.goToFloor(floorNum);
    } catch (RuntimeException e){
        System.out.println(e);
    }
}

  public static void main(String[] args) {
    House king = new House("King", "The Quad", 3, true, true);
    House wilson = new House("Wilson", "The Quad", 4, false, false);
    House jordan = new House("Jordan", "The Quad", true);
    System.out.println("\n");
    System.out.println(king+ "\n");
    System.out.println(wilson+ "\n");
    System.out.println(jordan+ "\n");
    king.enter();
    king.goToFloor(2);
    wilson.goToFloor(2);
    king.moveIn("Tabby");
    king.moveIn("Liz");
    king.moveOut("Tabby");
    king.isResident("Tabby");
    king.isResident("Liz");
    System.out.println(king);
  }

}