package day0325;

public class Speaker {

	int volume;

	Speaker(int volume) {
		this.volume = volume;
	}

	void volumeUp() {
		if (volume >= 100) {
			System.out.println("������ ������ �� �����ϴ�. �ִ� �����Դϴ�.");
		} else {
			volume += 10;
			System.out.println("������ 10 �����մϴ�.");
		}
	}

	void volumeDown() {
		volume -= 10;
		System.out.println("volumeDown ȣ��");
	}

	void showVolume() {
		System.out.println("���� ����:" + volume);
	}

}
