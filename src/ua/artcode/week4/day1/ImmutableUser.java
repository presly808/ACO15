package ua.artcode.week4.day1;

/**
 * Created by serhii on 27.08.16.
 */
public class ImmutableUser implements Comparable<ImmutableUser> {

    private static int count = 0;

    private final int id;
    private final String name;
    private final double salary;

    public ImmutableUser(String name, double salary) {
        this.id = count++;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public int compareTo(ImmutableUser o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "ImmutableUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
