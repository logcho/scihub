package models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import io.ebean.Finder;
import io.ebean.Model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

// Interview scheduling model for RA job applications
@Entity
@Getter
@Setter
@ToString
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = Interview.class)
public class Interview extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "rajob_application_id", referencedColumnName = "id")
    private RAJobApplication rajobApplication;

    @ManyToOne
    @JoinColumn(name = "created_by_user_id", referencedColumnName = "id")
    private User createdBy;

    // JSON array of proposed times
    @Column(columnDefinition = "LONGTEXT")
    private String proposedTimes;

    // The chosen/confirmed time
    private String chosenTime;

    // Status: "proposed", "scheduled", "completed", "cancelled"
    private String status;

    private String createdTime;
    private String updatedTime;
    private String location;
    @Column(columnDefinition = "LONGTEXT")
    private String notes;

    public Interview() {
    }

    public Interview(RAJobApplication rajobApplication, User createdBy, String proposedTimes, String status) {
        this.rajobApplication = rajobApplication;
        this.createdBy = createdBy;
        this.proposedTimes = proposedTimes;
        this.status = status;
        this.createdTime = new java.util.Date().toString();
        this.updatedTime = new java.util.Date().toString();
    }

    public static Finder<Long, Interview> find = new Finder<Long, Interview>(Interview.class);

}
