package HibernateSand;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "CHOICE")
public class Choice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CHOICE_ID")
    private Long id;

    @Column(name = "TEXT")
    private String text;

    @ManyToOne
    @JoinColumn(name = "QUESTION_ID", nullable = false, updatable = false, insertable = false)
    private Question question;

}
