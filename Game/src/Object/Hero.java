package Object;

import env.Sprite;

/**
 * @todo Complete the class file.
 */
public class Hero extends Sprite{
	Hero(char icon){
		this.icon=icon;
		this.x=1;
		this.y=1;
	  }
     
	public void move(char command) {
		if(command=='w'&&this.y!=1) {
			this.y=this.y-1;
		}
		else if(command=='s'&&this.y!=8) {
			this.y=this.y+1;
		}
		else if(command=='a'&&this.x!=1) {
			this.x=this.x-1;
		}
		else if(command=='d'&&this.x!=17) {
			this.x=this.x+1;		
	}
	}	
}