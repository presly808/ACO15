package small_task.observer_pattern.weather.observers;

public interface Observer {

    void update(float temp, float humidity, float pressure);

}
