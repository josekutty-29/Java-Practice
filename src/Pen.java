
public class Pen {
String company;
String type;
String inkcolor;

Pen(String company,String type,String inkcolor){
	this.company=company;
	this.type=type;
	this.inkcolor=inkcolor;
}

void printPenDetails() {
	System.out.println("Company : "+company+" | Type: "+type+" | Inkcolor: "+inkcolor);
}
	
}
