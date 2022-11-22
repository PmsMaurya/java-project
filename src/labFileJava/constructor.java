
package labFileJava;

public class constructor {
	float radius;
	constructor(){
		radius=2.5f;
		
	}
	double CircleArea() {
		return(Math.PI)*radius*radius;
	}
   constructor(float r){
	   radius=r;
   }
}