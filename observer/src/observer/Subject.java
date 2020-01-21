package observer;

public interface Subject {
	void registerObserver(observer o);
	void removeObserver(observer o);
	void notifyobserver();
}
