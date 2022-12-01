package Animal;

import java.util.Scanner;

public class Fish {
	int posX, posY, distance;
	
	public Fish(int posX, int posY, int distance) {
		this.posX = posX;
		this.posY = posY;
		this.distance = distance;
	}
	
	public int getX() {
		return this.posX;
	}
	public int getY() {
		return this.posY;
	}

	public void move() {
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
	public char getShape() {
		return 'F';
	}
}
