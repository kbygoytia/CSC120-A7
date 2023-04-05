/* This is a stub for the Cafe class */
public class Cafe extends Building {

    // The number of ounces of coffee remaining in inventory
    private int nCoffeeOunces; 

    // The number of sugar packets remaining in inventory
    private int nSugarPackets; 

    // The number of "splashes" of cream remaining in inventory
    private int nCreams; 

    // The number of cups remaining in inventory
    private int nCups; 
    

    private boolean hasElevator;
    /**
     * 
     * @param name
     * @param address
     * @param nFloors
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     * @param hasElevator
     */

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups, boolean hasElevator) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }

    /**
     * Creates a Cafe object
     *@param name
     * @param address
     * @param nFloors
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     * @param hasElevator
     * @return a new cafe object with a name, address,  floor amount, nCoffeeOunces, nSugarPackets, nCreams, and nCups.
     * in the format [name] is a [nFloors]-building located at [address].
     */

    /*Accessor for nCoffeeOunces */
    public int nCoffeeOunces(){
        return this.nCoffeeOunces;
    }
    /*Accessor for nSugarPackets */
    public int nSugarPackets(){
        return this.nSugarPackets;
    }
    /*Accessor for nCreams */
    public int nCreams(){
        return this.nCreams;
    }
    /*Accessor for nCups */
    public int nCups(){
        return this.nCups;
    }

    public boolean hasElevator(){
        return this.hasElevator;
    }

  

    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        try{
            if(this.nCoffeeOunces <= size-1 | this.nSugarPackets <= nSugarPackets-1 | this.nCreams <= nCreams-1 | this.nCups == 0){
                throw new RuntimeException("We are low on our inventory to make coffee. Comeback another time.");
            } this.nCoffeeOunces -= size;
              this.nSugarPackets -= nSugarPackets;
              this.nCreams -= nCreams;
              this.nCups -= 1;
              System.out.println("Thank you for your purchase!");
        } catch (RuntimeException e){
            System.out.println(e);
            this.restock(size, nSugarPackets, nCreams, nCups);
            }
    }

 

    public void sellCoffee(int size){
        this.nCreams = 0;
        this.nSugarPackets = 0;
        try{
            if(this.nCoffeeOunces <= size -1 | this.nCups == 0){
                throw new RuntimeException("We are low on our inventory to make coffee. Comeback another time.");
            }this.nCoffeeOunces -=size;
            this.nCups -= 1;
            System.out.println("Thank you for your purchase!");
        }catch (RuntimeException e){
            System.out.println(e);
            this.restock(size);
        }
    }

    /**
     * 
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        if(this.nCoffeeOunces < nCoffeeOunces){
            this.nCoffeeOunces = nCoffeeOunces+20;
        }
        if(this.nSugarPackets < nSugarPackets){
            this.nSugarPackets = nSugarPackets+10;
        }
        if(this.nCreams < nCreams){
            this.nCreams = nCreams+10;
        }
        if(this.nCups == 0){
            this.nCups = nCups+5;
        }
    } 

    private void restock(int nCoffeeOunces){
        this.nCoffeeOunces = nCoffeeOunces+20;
    }
    /**
     * restocks nCoffeeOunces, nSugarPackets, nCreams, and nCups so that a coffee can be made
     * @param args
     */

    public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n) \n + isResident() \n + moveIn() \n + moveOut() \n + sellCoffee() \n + restock()" );
    }

    public void goToFloor(int floorNum) {
        try{
            throw new RuntimeException("Sorry you do not have access to move up.");
        } catch (RuntimeException e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        Cafe compass = new Cafe("Compass", "Smith College", 2, 12, 12, 12, 12, true);
        System.out.println(compass);
        compass.goToFloor(2);
        compass.sellCoffee(16, 13, 13);
        compass.sellCoffee(16, 13, 13);
        compass.sellCoffee(16);
        compass.sellCoffee(16);
    }
    
}

