
class Tv {
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class VCR {
	boolean power;
	int counter = 0;
	void power() {power = !power;}
	void play() {/*�������*/}
	void stop() {/*�������*/}
	void rew() {/*�������*/}
	void ff() {/*�������*/}
}

class TVCR extends Tv {
	VCR vcr = new VCR(); // VCRŬ������ ���Խ��Ѽ� ����Ѵ�.
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}

}