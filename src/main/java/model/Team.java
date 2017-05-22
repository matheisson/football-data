package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by levente on 2017.05.20..
 */
@Entity
public class Team {

    @Id
    private String id;
    @NotNull
    private String name;
    private String code;
    @OneToMany
    @NotNull
    private List<Fixture> fixtures;
    private String crestUrl;

    public Team() {}

    public Team(String id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Fixture> getFuxtures() {
        return fixtures;
    }

    public void setFuxtures(List<Fixture> fuxtures) {
        this.fixtures = fuxtures;
    }

    public String getCrestUrl() {
        return crestUrl;
    }

    public void setCrestUrl(String crestUrl) {
        this.crestUrl = crestUrl;
    }
}
