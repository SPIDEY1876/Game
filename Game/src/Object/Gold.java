package Object;

import env.Sprite;

/**
 * @todo Complete the class file.
 */
public class Gold extends Sprite {
	int g=Math.random()>0.5?1:-1;
	Gold(){
		this.icon='G';
		this.x=(int)(Math.random()*(17)+1);
		this.y=(int)(4);
        }
	public void move(char command){
		if(this.x==1) {
			this.x=this.x+1;
		}
		else if(this.x==17) {
			this.x=this.x-1;
		}
		else {
		if (command=='w'|command=='s') {
			this.x=x+g;
		}
		else {
			
		}
		}
		}

}