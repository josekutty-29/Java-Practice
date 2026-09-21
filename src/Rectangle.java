
public class Rectangle {
int length;
int breadth;

Rectangle(int l,int b){
	this.length=l;
	this.breadth=b;	
	}
void area() {
	System.out.println("Area= "+(length*breadth));

}
void perimeter() {
	System.out.println("Perimeter= "+(2*(length+breadth)));
	
}
}
