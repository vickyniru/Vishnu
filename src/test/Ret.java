package test;

import org.college.Statement;

public class Ret {
	public int add() {
    	int a=10;
    	int b=15;
    	int c=a+b;
    System.out.println(c);
    
    return c;
}
    public int subtract(int d,int m) {
  
    	System.out.println("now the value of d is"+ d);
    	d= d*10;
    	d= d+10;
    	System.out.println("now the value of d is"+ d);
    	System.out.println("now the value of m is"+ m);
    	return d;
    	
    }
    
    public void multi(){
        int e = 11;
       	e = e + 100;
    	System.out.println("now the value of e is"+ e);
    
    }
    	  

public static void main(String[] args) {
	// TODO Auto-generated method stub
     Statement s = new Statement();
     int d = s.add();
     int m = s.add();
  //   int e = s.subtract(d,m);
     s.add();
     s.subtract(d,m);
     
     
}
}
     
	
	
	
	
	
	