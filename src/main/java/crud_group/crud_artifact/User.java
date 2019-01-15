package crud_group.crud_artifact;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id = 1;

    @Basic
    @Column(name = "name", nullable = false, unique = true)
    public String name;

    @Basic
    @Column(name = "password", nullable = false)
    public String password;

    @Basic
    @Column(name = "type", nullable = false)
    public String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public User() {
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
