
public class Cricket {
String player;
String team;
int age;
String role;

Cricket(String player,String team,String role,int age){
	this.player=player;
	this.age=age;
	this.team=team;
	this.role=role;
}

void printcriketer() {
System.out.println("Player: "+player+"| Age:"+age+"| team: "+team+"| Role: "+role);
}
}
