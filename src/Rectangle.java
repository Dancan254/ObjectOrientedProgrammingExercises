public class Rectangle {
    //attributes//instance variables
    private int length;
    private int width;

    //constructor
    public Rectangle(int l, int w){//parameters
        //instantiation
        //keyword -> this -> used to refer to the instance variable
//        this.length = length;
//        this.width = width;
        length = l;
        width = w;
    }
    //methods
    //calculate area
    public void calArea(int length, int breadth){
        int area = length * width;
        System.out.println("The area of our rectangle is " + area);
    }
    //getter length
    public int getLength(){
        return length;
    }

    public int getWidth() {
        return width;
    }

    //setters
    public void setLength(int l){
        this.length = l;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
