package ua.artcode.crm.model;

import java.time.LocalDateTime;

/**
 * Created by serhii on 14.08.16.
 */
public class Task {

    private String id;
    private String title;
    private String description;
    private Manager owner;
    private int status = StatusCodes.NEW;

    private LocalDateTime creationTime;
    // hours
    private int workHours;
    private LocalDateTime closedTime;

    private Dev executor;
    private Comment[] comments;

}
