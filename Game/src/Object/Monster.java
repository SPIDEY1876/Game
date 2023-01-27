package Object;

import env.Sprite;

/**
 * @todo Complete the class file.
 */
public class Monster extends Sprite {
	int m=Math.random()>0.5?1:-1;
	Monster(){
		this.icon='M';
		this.x=17;
		this.y=8;
	}
	public void move(char command) {
		if(command=='w'|command=='s') {
			if(this.x==1) {
				this.x=this.x+1;
		}
			else if(this.x==17) {
				this.x=this.x-1;
			}
			else {
				this.x=this.x+m;
		}
		}
		else if(command=='a'|command=='d') {
			if(this.y==1) {
				this.y=this.y+1;
		}
			else if(this.y==8) {
				this.y=this.y-1;
			}
			else {
				this.y=this.y+m;}
		}

	}
}
