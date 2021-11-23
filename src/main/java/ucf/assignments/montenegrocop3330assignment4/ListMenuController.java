/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Koby Montenegro
 */

package ucf.assignments.montenegrocop3330assignment4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class ListMenuController
{
    String ListTitle = "initialize";

    //TO VIEW LISTS
    @FXML
    public ListView ViewTheLists;

    //TO DISPLAY ITEMS
    @FXML
    public TextArea ItemsTA;

    //ALL FOR DESCRIPTION
    @FXML
    public TextField EditDescriptionDueDate;
    public TextField EditCurrentDescription;
    public TextField EditNewDescription;

    //ALL FOR DUE DATES
    public TextField EditNewDueDate;
    public TextField EditDueDateDescription;
    public TextField EditCurrentDueDate;

    //ALL FOR COMPLETE STATUS
    public TextField EditCompletedDescription;
    public TextField EditCompletedDueDate;
    public TextField EditNewCompleted;

    //ALL FOR ADDING AND DELETING
    public TextField AddItemDescription;
    public TextField AddItemDueDate;
    public TextField DeleteItemDescription;
    public TextField DeleteItemDueDate;

    //ALL FOR LOADING AND TITLE
    public TextField LoadListTitle;
    public TextField NewTitleText;

    //Lists to keep track of All Items, incomplete ones, and complete ones
    ArrayList<GetSetItems> items = new ArrayList<GetSetItems>();
    ArrayList<GetSetItems> IncompleteItems = new ArrayList<GetSetItems>();
    ArrayList<GetSetItems> CompleteItems = new ArrayList<GetSetItems>();

    //Array List to keep track of all the Lists
    ArrayList<ListAttributes> AllTheLists = new ArrayList<ListAttributes>();


    //FUNCTIONS BEGIN HERE
    public ArrayList<ListAttributes> AddAList(String Title)
    {
        //Create a new ListAttributes List
        ArrayList<ListAttributes> AddList = new ArrayList<ListAttributes>();
        //Add the list to AllTheLists

        return AddList;
    }


    @FXML
    public void ClickedAddAList(ActionEvent actionEvent)
    {
        //String AddListName = NewTitleText.getText()
        //AllTheLists.add.(AddAList(AddListName));
    }


    @FXML
    public void ClickedDeleteTheList(ActionEvent actionEvent)
    {
        //Find index of the given list by using ClickedListView
        //int foundIndex = ClickedListView
        //RemoveAList(foundIndex)
    }


    public ArrayList<ListAttributes> RemoveAList(int index)
    {
        //AllTheLists.remove(index)
        return AllTheLists;
    }


    @FXML
    public void ClickedAddItem(ActionEvent actionEvent)
    {
        //Find index of the given list by using ClickedListView
        //int listIndex = ClickedListView

        //int itemDescriptionIndex = searchDescription(listIndex)
        //int itemDateIndex = searchDate(listIndex)

        //AddItem(itemDescriptionIndex, itemDateIndex)
        //returnedText = DisplayAll(ArrayList<GetSetItems> currentList)
        //ItemsTA.setText(returnedText)

    }

    @FXML
    public void ClickedDeleteItem(ActionEvent actionEvent)
    {
        //Find index of the given list by using ClickedListView
        //int listIndex = ClickedListView

        //String descriptionText = from DeleteItemDescription(listIndex)
        //String dueDateText = from DeleteItemDueDate(listIndex)
        //int itemDescriptionIndex = searchDescription(listIndex)
        //int itemDateIndex = searchDate(listIndex)

        //RemoveItem(itemDescriptionIndex, itemDateIndex)
        //returnedText = DisplayAll(ArrayList<GetSetItems> currentList)
        //ItemsTA.setText(returnedText)
    }


    @FXML
    public void ClickedEditDescription(ActionEvent actionEvent)
    {
        //Find index of the given list by using ClickedListView
        //int listIndex = ClickedListView

        //String descriptionText = from EditCurrentDescription(listIndex)
        //String dueDateText = from EditDescriptionDueDate(listIndex)
        //int itemDescriptionIndex = searchDescription(descriptionText)
        //int itemDateIndex = searchDate(dueDateText)

        //setDescription(String get text from EditNewDescription)

        //returnedText = DisplayAll(ArrayList<GetSetItems> currentList)
        //ItemsTA.setText(returnedText)
    }


    @FXML
    public void ClickedEditDueDate(ActionEvent actionEvent)
    {
        //Find index of the given list by using ClickedListView
        //int listIndex = ClickedListView

        //String descriptionText = from EditDueDateDescription(listIndex)
        //String dueDateText = from EditCurrentDueDate(listIndex)
        //int itemDescriptionIndex = searchDescription(descriptionText)
        //int itemDateIndex = searchDate(dueDateText)

        //setDueDate(String get text from EditNewDueDate)

        //returnedText = DisplayAll(ArrayList<GetSetItems> currentList)
        //ItemsTA.setText(returnedText)
    }


    @FXML
    public void ClickedEditCompleted(ActionEvent actionEvent)
    {
        //Find index of the given list by using ClickedListView
        //int listIndex = ClickedListView

        //String descriptionText = from EditCompletedDescription(listIndex)
        //String dueDateText = from EditCompletedDueDate(listIndex)
        //int itemDescriptionIndex = searchDescription(descriptionText)
        //int itemDateIndex = searchDate(dueDateText)

        //setCompleted(String get text from EditNewCompleted)

        //returnedText = DisplayAll(ArrayList<GetSetItems> currentList)
        //ItemsTA.setText(returnedText)
    }


    public void DisplayItems(ListAttributes List)
    {
        //String display = list.getText()

        //ForLoop(int i = 0; i < amountOfLists ; i++)
        //For each item, display name and attributes in ItemsTA
    }


    @FXML
    public void ClickedShowAllItems(ActionEvent actionEvent)
    {
        //returnedText = DisplayAll(ArrayList<GetSetItems> currentList)
        //ItemsTA.setText(returnedText)
    }


    @FXML
    public void ClickedShowIncomplete(ActionEvent actionEvent)
    {
        //incompleteText = IncompleteDisplay(ArrayList<GetSetItems> currentList)
        //ItemsTA.setText(incompleteText)

        //returnedText = DisplayAll(ArrayList<GetSetItems> currentList)
        //ItemsTA.setText(returnedText)
    }


    @FXML
    public void ClickedShowComplete(ActionEvent actionEvent)
    {
        //completeText = CompleteDisplay(ArrayList<GetSetItems> currentList)
        //ItemsTA.setText(completeText)

        //returnedText = DisplayAll(ArrayList<GetSetItems> currentList)
        //ItemsTA.setText(returnedText)
    }


    @FXML
    public void ClickedSaveList(ActionEvent actionEvent)
    {
        //Find index of the given list by using ClickedListView
        //int listIndex = ClickedListView
        //saveList(list.(listIndex))

        //returnedText = DisplayAll(ArrayList<GetSetItems> currentList)
        //ItemsTA.setText(returnedText)
    }


    @FXML
    public void ClickedSaveListOfLists(ActionEvent actionEvent)
    {
        //SaveListOfLists(currentList)
        //Saves this list to external storage
    }


    public void SaveListOfLists(ArrayList<GetSetItems> items)
    {
        //String userDirectory = System.getProperty("user.dir");
        //Create a pathname and add the userDirectory and "MultipleLists" to the pathname
        //Add the name of the First List as well to the file path

        //Create a new file using that pathname
        //New File ("path/directory/"+ListTitle+".txt).mkdirs();
        //New Filewriter pathname.txt
        //Create new file using that new file
        //New String Output = ""

        //For Loop(int i=0; i < amountOfLists ; i++)
            //FileFormatting for each list
            //Add each one to Output

        //(Filewriter) pathname.txt.write
    }

    @FXML
    public void ClickedLoadList(ActionEvent actionEvent)
    {
        //Find index of the given list by using ClickedListView
        //int listIndex = ClickedListView
        //String LoadTitle = LoadListTitle.getText()
        //LoadList(LoadTitle)

        //returnedText = DisplayAll(ArrayList<GetSetItems> currentList)
        //ItemsTA.setText(returnedText)
    }


    @FXML
    public void ClickedLoadListOfLists(ActionEvent actionEvent)
    {
        //Array List returnedList = LoadListOfLists(currentListName)
        //Set current list to the returnedList
    }


    public ArrayList<ListAttributes> LoadListOfLists(String TODOListName)
    {
        //String userDirectory = System.getProperty("user.dir");
        //Create a pathname and add the userDirectory and "MultipleLists" to the pathname
        //Add the name of the First List as well to the file path

        //Create a new ListAttributes and load the file
        //While loop to go through the file
            //While loop
                //Create each item
                //Add each item to the list
        //Return the new List
        //ListAttributes List = new ToDoList("");

        ArrayList<ListAttributes> Lists = new ArrayList<ListAttributes>();
        return Lists;
    }


    public int ClickedListView(MouseEvent mouseEvent)
    {
        //ViewTheLists.getSelectionModel().getSelectedIndices();
        //Use this to find the index of the selected item
        //Return the index

        return 0;
    }

    public ListCell<ListAttributes> call(ListView<ListAttributes> p)
    {
        ListCell<ListAttributes> cell = new ListCell<ListAttributes>()
        {
            @Override
            protected void updateItem(ListAttributes list, boolean bln)
            {
                //Set the text in the ListCell to the tile of the ToDoList
            }
        };

        return cell;
    }

    public String FileFormattingManager()
    {
        //New String Output
        //Forloop (int i; i < amountOfLists ; i++)
            //Adding = List(i).ListAttributes.FileFormatting
            //Output = Output + Adding

        //Return Output

        return "Output";
    }

}
