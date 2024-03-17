public class Main {
    public static void main(String[] args) {

        //create our object of rectangle
        //class -> blueprint for creating objects
        //object -> instance of a class
        int length = 89;
        int width = 90;
        Rectangle rect = new Rectangle(length, width);//arguments
        //we use the dot operand to access the various elements/ attributes
        //access length-> we will need getters
        int ourLength = rect.getLength();
        System.out.println("Our length is " + ourLength);// 89
        //method 2
        System.out.println("Our length is " + rect.getLength()); //89

        //modify the values -> use setters
        //setLength
        rect.setLength(67);
        //after setting -> access new length
        System.out.println("Our new length is " + rect.getLength());
        //set the width
        rect.setWidth(87);
        //access the width
        System.out.println("Our new width is " + rect.getLength());

        Rectangle rectangle = new Rectangle(67, 55);
        //length
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());

        //set
        rectangle.setLength(90);
        rectangle.setWidth(78);
        //access new
        System.out.println("New for rectangle 2 " + rectangle.getWidth());
        System.out.println("New for rectangle 2 " + rectangle.getLength());


    }
}
