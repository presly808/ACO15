package ua.artcode.crm.model;

import java.time.LocalDateTime;

/**
 * Created by serhii on 14.08.16.
 */
public class Comment {

    private long id;
    private String title;
    private String message;
    private LocalDateTime creationTime;
    private long creatorId;

}
