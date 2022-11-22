package Animal;

import java.util.Scanner;

public class Bear {
	int posX, posY, distance;
	
	public Bear(int posX, int posY, int distance) {
		this.posX = posX;
		this.posY = posY;
		this.distance = distance;
	}

	protected void move() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̵� - ����(a), ������(d), ��(w), �Ʒ�(s) >> ");
		
		String wasd = sc.next();
		switch(wasd) {
		case "w":
			if(this.posY > 0)
				this.posY -= this.distance;
			break;
		case "a":
			if(this.posX > 0)
				this.posX -= this.distance;
			break;
		case "s":
			if(this.posY < 19)
				this.posY += this.distance;
			break;
		case "d":
			if(this.posX < 9)
				this.posX += this.distance;
			break;
		}

	}
	protected char getShape() {
		return 'B';
	}
	void predation() {
		
	}

}