package day7;

public class Shape {
	
	int width, height,depth;

	public Shape() {
		
		width= height = depth = 0;
		
	}
	//# 2
     public Shape(int width, int height, int depth) {
    	 this.width = width;
    	 this.height = height;
    	 this.depth = depth;
    	 
    	 
    	 
	
    }
     //# 3 
     
     public Shape(int width) {
    	 this.width = width;
    	 this.height = width;
    	 this.depth = width;
    	 
    	 
    	 
     }
     //#4
     
     public Shape(int width, int depth) {
    	 this.width = width;
    	 this.height = 10;
    	 this.depth = depth;
    	 
     }	 
     
     public int volume() {
    	 return  (width * height * depth);
     }
    	 

     
}
     
     
     
     






