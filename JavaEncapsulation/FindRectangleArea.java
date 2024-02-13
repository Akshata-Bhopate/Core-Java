package JavaEncapsulation;


public class FindRectangleArea {

	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    
        Rectangle rt = new Rectangle(20,30); 
        int lth = rt.getLength(); 
        int bth = rt.getBreadth(); 
        int Area = lth * bth; 
        System.out.println("Area: " +Area); 
        rt.setLength(50); 
        rt.setBreadth(60); 
        int ln = rt.getLength(); 
        int br = rt.getBreadth(); 
        int newArea = ln * br; 
        System.out.println("New area: " +newArea);
    }
}

class Rectangle
{
    int lth;
    int bth;

    Rectangle(int length, int breadth)
    {
        this.lth = length;
        this.bth = breadth;
    }
    public int getLength() {
        return lth;
    }

    public void setLength(int length) {
        this.lth = length;
    }

    public int getBreadth() {
        return bth;
    }

    public void setBreadth(int breadth) {
        this.bth = breadth;
    }

    int getArea()
    {
        return lth * bth;
    }



}
