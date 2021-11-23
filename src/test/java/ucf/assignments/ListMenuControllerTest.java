/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Koby Montenegro
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;

class ListMenuControllerTest
{
    @Test
    void AddAList()
    {
        //New Array List of Lists
        //Use AddAList
        //Make sure the size of the list is 1 and not 0
        //Asset.equals(expected size, actual size)
    }

    @Test
    void ClickedAddAList()
    {
        //New List
        //Use ClickedAddAList with the correct string input
        //Use Listview to check the saved list
        //New String expected = title of new List
        //Assert.equals(expected string, actual from ListView)
    }

    @Test
    void ClickedDeleteTheList()
    {
        //New List
        //Add items to List, make some complete and some incomplete
        //Use ClickedDeleteTheList
        //ItemsTA should have the saved Lists
        //New String expected = ""
        //Assert.equals(expected, actual from ItemsTA)
    }

    @Test
    void RemoveAList()
    {
        //New Array List of Lists
        //Use AddItem to add items to the lists, make some complete and some incomplete
        //Use RemoveAList at a random index
        //Compare the descriptions
        //Assert.equals(expected Description, actual Description)
    }

    @Test
    void ClickedAddItem()
    {
        //New List
        //ClickedAddItem with correct text input
        //ItemsTA should have the new item
        //New String expected
        //Assert.equals(expected string, actual from ItemsTA)
    }

    @Test
    void ClickedDeleteItem()
    {
        //New List
        //Use AddItem to add items to the lists, make some complete and some incomplete
        //ClickedDeleteItem with correct text input
        //ItemsTA should have only the items that were not deleted
        //New String expected
        //Assert.equals(expected string, actual from ItemsTA)
    }

    @Test
    void ClickedEditDescription()
    {
        //New List
        //Use AddItem and make it Complete
        //ClickedEditDescription with correct text input
        //ItemsTA should have the new Description
        //New String expected
        //Assert.equals(expected string, actual from ItemsTA)
    }

    @Test
    void ClickedEditDueDate()
    {
        //New List
        //Use AddItem
        //ClickedEditDueDate with correct text input
        //ItemsTA should have the new DueDate
        //New String expected
        //Assert.equals(expected string, actual from ItemsTA)
    }

    @Test
    void ClickedEditComplete()
    {
        //New List
        //Use AddItem, make it complete
        //ClickedEditComplete with correct text input
        //ItemsTA should have the new Complete status
        //New String expected
        //Assert.equals(expected string, actual from ItemsTA)
    }


    @Test
    void DisplayItems()
    {
        //New List
        //Use AddItem
        //Use DisplayItems
        //ItemsTA should have the saved Lists
        //New String expected
        //Assert.equals(expected string, actual from ItemsTA)
    }

    @Test
    void ClickedShowAllItems()
    {
        //New List
        //Use AddItem, some should be complete, some incomplete
        //Use ClickedShowAllItems
        //ItemsTA should show all the items
        //New String expected
        //Assert.equals(expected string, actual from ItemsTA)
    }

    @Test
    void ClickedShowIncomplete()
    {
        //New List
        //Use AddItem, some should be complete, some incomplete
        //Use ClickedShowIncomplete
        //ItemsTA should show only the incomplete items
        //New String expected
        //Assert.equals(expected string, actual from ItemsTA)
    }


    @Test
    void ClickedShowComplete()
    {
        //New List
        //Use AddItem, some should be complete, some incomplete
        //Use ClickedShowComplete
        //ItemsTA should show only the complete items
        //New String expected
        //Assert.equals(expected string, actual from ItemsTA)
    }


    @Test
    void ClickedSaveList()
    {
        //New List
        //Use AddItem, some should be complete, some incomplete
        //Use ClickedSaveList
        //Get a new file from the function
        //Assert.equals(expected true, actual FileExists using file from function)
    }


    @Test
    void ClickedSaveListOfLists()
    {
        //New List
        //Use AddItem, some should be complete, some incomplete
        //Use ClickedSaveListOfLists
        //Get a new file from the function
        //Assert.equals(expected true, actual FileExists using file from function)
    }

    @Test
    void SaveListOfLists()
    {
        //New List
        //Use AddItem, some should be complete, some incomplete
        //Use ClickedSaveListOfLists
        //Get a new file from the function
        //Assert.equals(expected true, actual FileExists using file from function)
    }

    @Test
    void ClickedLoadList()
    {
        //New List
        //Use AddItem, some should be complete, some incomplete
        //Use ClickedSaveList
        //Use ClickedLoadList with correct text input
        //ItemsTA should show have the saved list
        //New String expected
        //Assert.equals(expected string, actual from ItemsTA)
    }


    @Test
    void ClickedLoadListOfLists()
    {
        //New List
        //Use AddItem, some should be complete, some incomplete
        //Use ClickedSaveListOfLists
        //Use ClickedLoadListOfLists with correct text input
        //ItemsTA should show have the saved lists
        //New String expected
        //Assert.equals(expected string, actual from ItemsTA)
    }

    @Test
    void LoadListOfLists()
    {
        //New ArrayList of Lists
        //Use AddItem, some should be complete, some incomplete
        //Use SaveListOfList
        //Use LoadListOfList and save in a new list
        //Assert.equals(expected original ArrayList, actual from LoadListOfList)
    }


    @Test
    void ClickedListView()
    {
        //New List
        //Use AddItem
        //Use ClickedListView to return an index
        //Assert.equals(expected index, actual from ClickedListView)
    }


    @Test
    void FileFormattingManager()
    {
        //New ArrayList of Lists
        //Use AddItem, some should be complete, some incomplete
        //String Result = FileFormattingManager
        //String expected
        //Assert.equals(expected string, actual Result)
    }

}