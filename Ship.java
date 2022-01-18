public abstract class Ship {
    Passenger passenger;
    static int counter;
    String bookingid;
    double billAmount;
    
    public Ship(Passenger passenger) {
        this.passenger = passenger;
    }
    
    public Passenger getPassenger() {
        return passenger;
    }
    public double getBillAmount() {
        return billAmount;
    }
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
    public String getBookingid() {
        return bookingid;
    }
    public void setBookingid(String bookingid) {
        this.bookingid = bookingid;
    }
    public void generateBookingId(){
        
    }
    public Integer identifyDiscountPercentage(double cost){
        return (int) cost;
    }
    public abstract void calculate(String cuisine);
    

    

    
}
