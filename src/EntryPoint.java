public class EntryPoint {
    public static void main(String[] args) {

        //create the object
        //className objRef = new className(param/args);
        Person person1 = new Person("Ian", "male",4000);
        //access the name -> getters
        System.out.println(person1.getName());
        //gender
        System.out.println(person1.getGender());
        //id
        System.out.println(person1.getIdNumber());

        //print all values
        System.out.println(person1.toString());

        //change name
        person1.setName("John");
        System.out.println(person1.getName());

    }
}
