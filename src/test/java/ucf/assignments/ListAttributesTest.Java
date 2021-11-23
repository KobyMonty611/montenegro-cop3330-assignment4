/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Koby Montenegro
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;

class ListAttributesTest
{

    @Test
    void searchDate()
    {
        //New ArrayList<GetSetItems> TestItem = new ArrayList<GetSetItems>();
        //setDueDate = "01-01-2021"

        //New ArrayList<ListAttributes> TestList = new ArrayList<ListAttributes>();
        //Add TestItem to TestList

        //searchDate(getDueDate from TestList)
        //Assert.equals to 1 to see if it worked
    }

    @Test
    void searchDescription()
    {
        //New ArrayList<GetSetItems> TestItem
        //setDescription = "Specific"

        //New ArrayList<ListAttributes> TestList
        //Add TestItem to TestList

        //searchDate(getDescription from TestList)
        //Assert.equals to 1 to see if it worked
    }

    @Test
    void getItems()
    {
        //New List
        //New ArrayList<GetSetItems> TestItems
        //Use getItems
        //Use Assert.equals (expected TestItems, Actual getItems)
    }

    @Test
    void setItems()
    {
        //New List
        //New ArrayList<GetSetItems> TestItems
        //Use setItems to pass the TestItems
        //Use Assert.equals (expected TestItems, Actual setItems)
    }

    @Test
    void getTitle()
    {
        //New List
        //Set the list title
        //Use getTitle
        //Assert.equals(expected title, actual getTitle)
    }

    @Test
    void setTitle()
    {
        //New List
        //Use setTitle to set list title as "Specific"
        //Assert.equals(expected title, actual setTitle)
    }

    @Test
    void AddItem()
    {
        //New List
        //Add an item to the new List
        //Use AddItem

        //Sees if the size is not equal to 0
        //Assert.equals(expected list size, actual list size)
    }

    @Test
    void RemoveItem()
    {
        //New List
        //Add an item to the new List
        //Use RemoveItem on that newly added Item

        //Sees if the size is  equal to 0
        //Assert.equals(expected list size, actual list size)
    }

    @Test
    void DisplayAll()
    {
        //New List
        //Add an item to the new List
        //New String expected
        //Assert.equals(expected output, actual DisplayAll output)
    }

    @Test
    void CompleteDisplay()
    {
        //New List
        //Use AddItem to the new list
        //Use AddItem to the new list, set completed status to true
        //New String expected
        //Assert.equals(expected output, actual DisplayComplete output)
    }

    @Test
    void IncompleteDisplay()
    {
        //New List
        //Use AddItem to the new list
        //Use AddItem to the new list, set completed status to true
        //New String expected
        //Assert.equals(expected output, actual DisplayIncomplete output)
    }

    @Test
    void SaveList()
    {
        //New List
        //Use AddItem to the new list
        //Use SaveList
        //Assert.equals(expected outputDirectory, actual outputDirectory)
    }

    @Test
    void LoadList()
    {
        //New List
        //Use AddItem to the new list
        //Use SaveList
        //New List expected = LoadList
        //Assert.equals(expected list, actual list)
    }

    @Test
    void FileFormatting()
    {
        //New List
        //Use AddItem to the new list
        //New String Result = FileFormat
        //New String Output
        //Assert.equals(expected Output, actual Result)
    }

    @Test
    void CheckingDate()
    {
        //New String correctFormat
        //boolean Result = Use CheckingDate on correctFormat
        //Assert.equals(expected true, actual Result)
    }

}
