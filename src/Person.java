public class Person {
    //attributes
    private String name;
    private String gender;
    private int idNumber;

    //default constructor
    public Person(){ //parameters

    }

//    public Person(String name, String gender, int idNumber){
//        //this -> use to refer to the instance variable
//        this.name = name;
//        this.gender = gender;
//        this.idNumber = idNumber;
//    }

    public Person(String fName, String genders, int id){
        name = fName;
        gender = genders;
        idNumber= id;
    }

    //getters
    //getName
    public String getName(){
        return name;
    }
    //getGender

    public String getGender() {
        return gender;
    }

    public int getIdNumber(){
        return idNumber;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
    //toString

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }
}
