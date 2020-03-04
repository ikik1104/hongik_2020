
public class Ex0302_0666 {

}

abstract class Player{
	abstract void play(int pos);
	abstract void stop();
}

class AudioPlayer extends Player{
	void play(int pos) {	}
	void stop() {	}
}

abstract class AbstractPlayer extends Player{
	void play(int pos) {	}
}

