package UI;

import Animal.Bear;

public class CreateMap {
	char[][] map = new char[10][20];
	int size;
	Bear bear;
	void randomMap() {
		// �� ��ü '-'�� �ʱ�ȭ
		for(int i=0; i<10; i++)		// ����
			for(int j=0; j<20; j++)	// ����
				map[i][j] = '-';
				
		// Bear�� Fish ��ġ
		map[bear.getY()][bear.getX()] = bear.getShape();	// Bear ��ġ�� �޾ƿ� ��� ���� ( - > B)
		
		// �� �׸���
		for(int i=0; i<10; i++) {
			for(int j=0; j<20; j++)
				System.out.print(map[i][j]);
			System.out.println();
		}
	}
}
