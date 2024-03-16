package model;

@Data
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "task_name")
    private String task_name;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "status", nullable = false)
    private TaskStatus status;
    @Column(name = "createdDate")
    private LocalDateTime createdDate;
}@Data
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "task_name")
    private String task_name;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "status", nullable = false)
    private TaskStatus status;
    @Column(name = "createdDate")
    private LocalDateTime createdDate;
}