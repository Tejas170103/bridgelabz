public class assignment2{
    public static void main(String[] args){
        Car car1=new Car("toyota",2021);
    car1.displayDetails();
    }
    static class Car{
        String model;
        int year;
        public Car(String model ,int year){
            this.model=model;
            this.year=year;
        }
        
        public void displayDetails(){
            System.out.println("model"+ this.model);
             System.out.println("year"+ this.year);
        }
    
    }
}
