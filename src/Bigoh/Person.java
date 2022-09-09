package Bigoh;

public class Person {
    private String name;
    private String novehicle;
    private String vehicle1;
    private String vehicle2;

    void setPersonDetails(String newName,String noOfVehicle,String vehicle1,String Vehicle2){
        this.name=newName;
        this.novehicle=noOfVehicle;
        this.vehicle1=vehicle1;
        this.vehicle2=Vehicle2;
    }
    void getPersonDetails(){
        System.out.println(name+" has "+novehicle+",vehicle one is "+vehicle1+" and another is "+vehicle2 );
    }
}
