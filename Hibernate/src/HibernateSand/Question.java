package HibernateSand;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "QUESTION")
public class Question implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "QUESTION_ID")
    private Long id;

    @Column(name = "TEXT")
    private String text;


    @OneToMany (
            cascade = {CascadeType.ALL},
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "QUESTION_ID")
    @org.hibernate.annotations.Cascade(
            value = org.hibernate.annotations.CascadeType.DELETE_ORPHAN
    )
    @org.hibernate.annotations.IndexColumn(name = "CHOICE_POSITION")
    private List choices = new ArrayList<>();




}
