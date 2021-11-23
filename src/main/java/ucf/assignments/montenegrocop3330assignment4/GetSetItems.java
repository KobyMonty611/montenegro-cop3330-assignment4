/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Koby Montenegro
 */

package ucf.assignments.montenegrocop3330assignment4;

public class GetSetItems
{
    String Description = "";
    String DueDate = "";
    boolean completed = false;

    //GET AND SET FOR DESCRIPTION
    public String getDescription()
    {
        return "Description";
    }

    public void setDescription(String description)
    {
        this.Description = description;
    }

    //GET AND SET DUEDATE
    public String getDueDate()
    {
        return "DueDate";
    }

    public void setDueDate(String dueDate)
    {
        this.DueDate = dueDate;
    }

    //GET AND SET COMPLETED
    public boolean getCompleted()
    {
        return false;
    }

    public void setCompleted(boolean getCompleted)
    {
        this.completed = getCompleted;
    }
}