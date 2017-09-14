package com.davidstranders.sportclub.model;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by DS on 2-2-2017.
 */
@Document
public class Game {

    @Id
    private String id;

    @DBRef
    private List<Team> teams;
    private Integer scoreTeamA;
    private Integer scoreTeamB;

    @DBRef
    private Location location;

    @DBRef
    private Competition competition;
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date date;

    public Game(){}

    public Game(int scoreTeamA, int scoreTeamB, Date date, Location location, Competition competition) {
        this.teams = new ArrayList<>();
        this.scoreTeamA = scoreTeamA;
        this.scoreTeamB = scoreTeamB;
        this.location = location;
        this.competition = competition;
        this.date = date;
    }

    // Constructor for loading database
    public Game(Date date, Location location, Competition competition) {
        this.teams = new ArrayList<>();
        this.location = location;
        this.competition = competition;
        this.date = date;
    }

    // Constructor for testing
    public Game(Team teamA, Team teamB, Integer scoreTeamA, Integer scoreTeamB) {
        this.teams = new ArrayList<>();
        this.teams.add(teamA);
        this.teams.add(teamB);
        this.scoreTeamA = scoreTeamA;
        this.scoreTeamB = scoreTeamB;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public Integer getScoreTeamA() {
        return scoreTeamA;
    }

    public void setScoreTeamA(Integer scoreTeamA) {
        this.scoreTeamA = scoreTeamA;
    }

    public Integer getScoreTeamB() {
        return scoreTeamB;
    }

    public void setScoreTeamB(Integer scoreTeamB) {
        this.scoreTeamB = scoreTeamB;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", location=" + location +
                ", competition=" + competition +
                ", date=" + date +
                '}';
    }
}
