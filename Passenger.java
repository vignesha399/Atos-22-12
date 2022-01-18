public class Passenger {
    String passengerName;
    int age;
    String packageType;
    int noOfPassengers;
    public Passenger(String passengerName, int age, String packageType, int noOfPassengers) {
        this.passengerName = passengerName;
        this.age = age;
        this.packageType = packageType;
        this.noOfPassengers = noOfPassengers;
    }
    public String getPackageType(){
        return "hello";
    }
    public int getNoOfPassengers(){
        return 0;
    }
    public Boolean validatePassengersDetails() {
        return true;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
