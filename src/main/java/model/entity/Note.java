package model.entity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
@Getter
@Setter
public class Note {

    @Id
    @GeneratedValue
    private int id;
    private String message;
    private LocalDate date;
    private boolean done;

    public Note(int id) {

    }

    public Note(String message, LocalDate date, boolean done) {
        this.message = message;
        this.date = date;
        this.done = done;
    }
}
