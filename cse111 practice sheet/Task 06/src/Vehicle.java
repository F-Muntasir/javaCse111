public class Vehicle {
    public int x;
    public int y;

    public String details() {
        return x + ","+ y;
    }
//    public String comma(){
//        return ",";
//    }
    public void moveUp(){
        y++;
    }
    public void moveLeft(){
        x--;
    }
    public void moveDown(){
        y--;
    }
    public void moveRight(){
        x++;
    }
}
