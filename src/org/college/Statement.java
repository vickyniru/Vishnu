package org.college;

public class Statement {
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
        	m= d+10;
        	System.out.println("now the value of d is"+ d);
        	System.out.println("now the value of d is"+ m);
        	return d;
        	
        }
      
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Statement s = new Statement();
         int d = s.add();
         int m = s.add();
      
         s.add();
         s.subtract(d,m);
         
         
         
	}
         
	}


