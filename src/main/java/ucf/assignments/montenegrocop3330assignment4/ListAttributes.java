/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Koby Montenegro
 */

package ucf.assignments.montenegrocop3330assignment4;

import java.util.ArrayList;

public class ListAttributes
{
    String ListTitle = "";
    ArrayList<GetSetItems> ListOfItems = new ArrayList<GetSetItems>();

    public  ListAttributes(String Title)
    {
        //Constructor to set up the title of a list
        //this.Title = Title
    }

    //SEARCH FUNCTIONS

    public int searchDate(String search)
    {
        //Forloop(i=0; i < amountOfItems; i++)
            //if search = ListOfItems.getDueDate
                //return 1;

        //If not,
            //return -1;

        return 0;
    }

    public int searchDescription(String search)
    {
        //Forloop(i=0; i < amountOfItems; i++)
            //if search = ListOfItems.getDescription
                //return 1;

        //If not,
            //return -1;

        return 0;
    }

    //END OF SEARCH FUNCTIONS


    //GET AND SET FUNCTIONS

    public ArrayList<GetSetItems> getItems()
    {
        ArrayList<GetSetItems> ListOfItems = new ArrayList<GetSetItems>();
        return ListOfItems;
    }

    public void setItems(ArrayList<GetSetItems> ListOfItems)
    {
        this.ListOfItems = ListOfItems;
    }

    public String getTitle()
    {
        return ListTitle;
    }

    public void setTitle(String title)
    {
        this.ListTitle = ListTitle;
    }

    //END OF GET AND SET FUNCTIONS


    //ADD AND REMOVE FUNCTIONS

    public void AddItem(String Description, String DueDate)
    {
        //Use GetSetItems Constructor to create a new item
        //ListOfItems.add(AddingItem)
        //this.ListTitle = ListTitle

    }

    public void RemoveItem(String Description, String DueDate)
    {
        //For loop(i; i < amountOfItems < i++)
            //Use searchDescription and searchDate to find the parameters
                //If both are found, remove them

        //this.ListTitle = ListTitle
    }

    //END OF ADD AND REMOVE FUNCTIONS


    //ALL DISPLAY FUNCTIONS

    public String DisplayAll(ArrayList<GetSetItems> items)
    {
        //New String Output = "initialize"
        //For loop (int i=0; i < amountOfItems <i++)
            //Add every item in the list to Output
            //Add Newline after every item

        //Return Output

        return "Output";
    }

    public String CompleteDisplay(ArrayList<GetSetItems> ListOfItems)
    {
        //New String Output = "initialize"

        //For loop (int i=0; i < amountOfItems <i++)
            //If item.getComplete == true
            //Add item in the list to Output
            //Add Newline after every item

        //Return Output

        return "Output";
    }

    public String IncompleteDisplay(ArrayList<GetSetItems> ListOfItems)
    {
        //New String Output = "initialize"

        //For loop (int i=0; i < amountOfItems <i++)
            //If item.getComplete == false
            //Add item in the list to Output
            //Add Newline after every item

        //Return Output

        return "Output";
    }

    //END OF ALL DISPLAY FUNCTIONS


    //ALL SAVING AND LOADING FUNCTIONS
    public void SaveList(ArrayList<GetSetItems> items)
    {
        //String userDirectory = System.getProperty("user.dir");
        //Create a pathname and add the userDirectory and "ToDoLists" to the pathname
        //Add the name of the List as well to the file path
        //Create a new file using that pathname
        //New File ("path/directory/"+ListTitle+".txt).mkdirs();
        //New Filewriter pathname.txt
        //Create new file using that new file
        //New string = FileFormatting()
        //(Filewriter) pathname.txt.write
    }

    public ListAttributes LoadList(String NameOfList)
    {
        //String userDirectory = System.getProperty("user.dir");
        //Create a pathname and add the userDirectory and "ToDoLists" to the pathname
        //Add the name of the List as well to the file path
        //Create a new ListAttributes by loading the file

        //While loop
            //Create items and add them to the list

        //Return to the new ListAttributes

        ListAttributes LoadingList = new ListAttributes("");
        return LoadingList;
    }

    //END OF ALL SAVING AND LOADING FUNCTIONS



    //ALL FORMATTING FUNCTIONS

    public boolean CheckingDate(String dueDate)
    {
        //dateFormat = Array.from(dueDate)
        //For loop
            //Check that first four numbers are parseable
                //If not return false

            //Check the that next character is "-"
            //Check the next two are parseable
                //If not return false

            //Check the that next character is "-"
            //Check the next two are parseable
                //If not return false

        //If it passes all of those ifs, return as true

        return true;
    }

    public String FileFormatting()
    {
        //New String Output = (TitleOfList + [ )
        //For loop(i = 0; i < amountOfItems < i++)
        //Add title, dueDate, and completed to Output
        //Add comma in between each attribute
        //Add Newline after each item

        //Add ] at the end
        //Return Output

        return "Output";
    }

    //END OF ALL FORMATTING FUNCTIONS
}
