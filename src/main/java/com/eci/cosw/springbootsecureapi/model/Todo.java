/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.springbootsecureapi.model;

/**
 *
 * @author JuanArevaloMerchan
 */
public class Todo {
    private String description;
    private int priority;
    private boolean completed;

    
    public Todo(){
        
    }
    
    public Todo(String description, int priority, boolean completed){
        this.description = description;
        this.priority = priority;
        this.completed = completed;
    }
    
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**
     * @return the completed
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * @param completed the completed to set
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    /**
     * @return 
     */
    public boolean getCompleted() {
        return completed;
    }
    
}
