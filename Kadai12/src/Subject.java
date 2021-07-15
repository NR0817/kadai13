import java.util.*;

abstract class Subject {
	public ArrayList<Observer> observers;
	Subject() {
		observers = new ArrayList<Observer>();
	}
	public void attach(Observer o) {
		observers.add(o);
	}
	public void detach(Observer o) {
		observers.remove(o);
	}
	public void tsuuchi() {
		for (Observer observer: observers) {
			observer.update(this);
		}
	}
}
class Suuchi extends Subject {
	boolean suuchiState;
	int atai;
	public boolean getState() {
		return suuchiState;
	}
	public void putValue(int atai) {
		if (atai > this.atai) {
			this.atai = atai;
			this.tsuuchi();
		} else { System.out.println("確認用メッセージ:更新してません"); }
	}
	public int getValue() {
		return atai;
	}
}