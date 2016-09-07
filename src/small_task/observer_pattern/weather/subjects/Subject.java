package small_task.observer_pattern.weather.subjects;

import small_task.observer_pattern.weather.observers.Observer;

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
