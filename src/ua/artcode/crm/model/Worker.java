package ua.artcode.crm.model;

/**
 * Created by serhii on 20.08.16.
 */
public abstract class Worker {

    private long id;
    private String fullname;
    private String email;

    public Worker(String fullname, String email) {
        this.fullname = fullname;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
