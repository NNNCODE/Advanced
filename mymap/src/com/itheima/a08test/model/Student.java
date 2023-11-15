package com.itheima.a08test.exercise;

import java.io.Console;

public class Student {
    private int  id;
    private String name;
    private String firstname;
    private Program program;
    private Episode episode;


    public Student() {
    }

    public Student(int id, String name, String firstname, Program program, Episode episode) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.program = program;
        this.episode = episode;

        setId(id);
        setName(name);
        setFirstname(firstname);
        setProgram(program);
        setEpisode(episode);
    }



    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param
     */


    public void display()
    {
        Console screen = System.console();
        screen.printf("%d %s %s %s ",id,firstname,program,episode);
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * 设置
     * @param firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * 获取
     * @return program
     */
    public Program getProgram() {
        return program;
    }

    /**
     * 设置
     * @param program
     */
    public void setProgram(Program program) {
        this.program = program;
    }

    /**
     * 获取
     * @return episode
     */
    public Episode getEpisode() {
        return episode;
    }

    /**
     * 设置
     * @param episode
     */
    public void setEpisode(Episode episode) {
        this.episode = episode;
    }

    public String toString() {
        return "Student{id = " + id + ", name = " + name + ", firstname = " + firstname + ", program = " + program + ", episode = " + episode + "}";
    }
}
