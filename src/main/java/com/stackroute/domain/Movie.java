package com.stackroute.domain;

public class Movie {
    private Actor actor;

    public void setActor(Actor actor)
    {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    void display()
    {
        System.out.println(actor);
    }
}
