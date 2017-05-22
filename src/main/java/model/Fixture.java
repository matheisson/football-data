package model;

import com.sun.istack.internal.Nullable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * Created by levente on 2017.05.20..
 */
@Entity
public class Fixture {

    @Id
    private String id;
    @Past
    private Date date;
    private int matchday;
    @NotNull
    private Team homeTeam;
    @NotNull
    private Team awayTeam;
    @NotNull
    private int homeGoals;
    @NotNull
    private int awayGoals;
    private boolean penalty;
    @Nullable
    private int homeScoredPen;
    @Nullable
    private int awayScoredPen;

    public Fixture(){}

    public Fixture(String id, Date date, int matchday, Team homeTeam, Team awayTeam, int homeGoals, int awayGoals) {
        this.id = id;
        this.date = date;
        this.matchday = matchday;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMatchday() {
        return matchday;
    }

    public void setMatchday(int matchday) {
        this.matchday = matchday;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }

    public boolean isPenalty() {
        return penalty;
    }

    public void setPenalty(boolean penalty) {
        this.penalty = penalty;
    }

    public int getHomeScoredPen() {
        return homeScoredPen;
    }

    public void setHomeScoredPen(int homeScoredPen) {
        this.homeScoredPen = homeScoredPen;
    }

    public int getAwayScoredPen() {
        return awayScoredPen;
    }

    public void setAwayScoredPen(int awayScoredPen) {
        this.awayScoredPen = awayScoredPen;
    }
}
