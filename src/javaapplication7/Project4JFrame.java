/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author juana
 */
public class Project4JFrame extends JFrame
{
    //private ParentClass_StoreItem[] StoreItemsLoop; 
    // Purpose Array: The purpose of the array is to interract 
    protected String outputItems = "";
    // Purpose; Create a array List
    // Author: Juana Rodriguez
    ArrayList<StoreItems> storeItems = new ArrayList<>();
    // Movies Button
    // Author: Juana Roderiguez
    private final JButton MoviesButton;
    // Books Button
    // Author: Juana Roderiguez
    private final JButton BooksButton;
    // Painting Button
    // Author: Juana Roderiguez
    private final JButton PaintingButton;
    // Layout Object
    // Author: Juana Roderiguez
    private final FlowLayout layout;
    // display results
    // Author: Juana Roderiguez
    private final JTextArea textArea1;
    // Purpose title
  
    
    // adds JButtons to JFrame Constructor
    public  Project4JFrame()
    {
        super("Store Items Inventory");
        // Set frame Layout
        // Text Area Properties
        // Author: Juana Rodriguez
        layout = new FlowLayout();
        setLayout(layout);               
        textArea1 = new JTextArea("Inventory Items. Click any buuton to start",20,40);
        textArea1.setFont(new java.awt.Font("Tahoma", 0, 16));
        //layout.setAlignment(FlowLayout.TRAILING);
        textArea1.setEditable(false);
        
        // Add Scrollpane
        add(new JScrollPane(textArea1));
        // Set up movieButton and register listener
        MoviesButton = new JButton("Add Movie");
       
        // adds movie button to frame
        add(MoviesButton);
        MoviesButton.setFont(new java.awt.Font("Tahoma", 0, 20)); 
        // 245, 176, 65  
        MoviesButton.setBackground(new java.awt.Color(113, 151, 188));
        MoviesButton.addActionListener(
            // anonymous inner class
            new ActionListener()
            {
                // Process MoviesButton event
                @Override
                public void actionPerformed(ActionEvent event)
                {
                    layout.setAlignment(FlowLayout.CENTER);
                    try
                    {
                        // obtain user input from JOptionPane input dialogs
                        // Purpose Gets the user inputs
                        // Author: Juana Rodriguez
                        // 10/17/2017
                        String author = JOptionPane.showInputDialog("Enter Authors Name: ");
                        while(author == null || author.isEmpty())
                        {
                           author = JOptionPane.showInputDialog("Empty Field. Enter Authors Name: ");
                           
                        }
                        // Purpose Gets the user inputs
                        // Author: Juana Rodriguez
                        // 10/17/2017
                        String title = JOptionPane.showInputDialog("Enter Movies Title: ");
                        while(title == null || title.isEmpty())
                        {
                           title = JOptionPane.showInputDialog("Empty Field. Enter Movies Title: ");
                           
                        }
                        
                        Date dateAcquired = Date.from(Instant.now());
                        // Purpose Gets the user inputs
                        // Author: Juana Rodriguez
                        // 10/17/2017
                        String purchasePrice = JOptionPane.showInputDialog("Enter Purchase Price $: ");
                        double purchasedPriceConverted = Double.parseDouble(purchasePrice);
                        
                        // Purpose Gets the user inputs
                        // Author: Juana Rodriguez
                        // 10/17/2017
                        while(purchasePrice == null || purchasePrice.isEmpty())
                        {
                           purchasePrice = JOptionPane.showInputDialog("Empty Field. Enter Purchase Price:");
                           
                        }
                        // Purpose Gets the user inputs
                        // Author: Juana Rodriguez
                        // 10/17/2017
                        double askingPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter Asking Price $: "));
                        while(Double.toString(askingPrice) == null || Double.toString(askingPrice).isEmpty())
                        {
                          //String.valueOf(askingPrice) = JOptionPane.showInputDialog("Empty Field. Enter Director Name:");
                            askingPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter Asking Price $: "));
                           
                        }
                        // Purpose Gets the user inputs
                        // Author: Juana Rodriguez
                        // 10/17/2017
                        String director = JOptionPane.showInputDialog("Enter Director Name: ");
                        while(director == null || director.isEmpty())
                        {
                           director = JOptionPane.showInputDialog("Empty Field. Enter Director Name:");
                           
                        }
                        // Purpose Gets the user inputs
                        // Author: Juana Rodriguez
                        // 10/17/2017
                        String actor = JOptionPane.showInputDialog("Enter actor Name: ");
                        while(actor== null || actor.isEmpty())
                        {
                           actor = JOptionPane.showInputDialog("Empty Field. Enter actor Name: ");
                           
                        }
                        // Purpose Gets the user inputs
                        // Author: Juana Rodriguez
                        // 10/17/2017
                        String actress = JOptionPane.showInputDialog("Enter Actress Name: ");
                        while(actress== null || actress.isEmpty())
                        {
                           actress = JOptionPane.showInputDialog("Empty Field. Enter Actress Name: ");
                           
                        }
                        // Purpose: Create a new object
                        // Author: Juana Rodriguez
                        // 10/17/2017
                        Movies newMovies = new Movies(author, title, dateAcquired, purchasedPriceConverted, askingPrice, director , actor, actress);
                    
                        //Purpose: Adds A new Movie to the ArrayList
                        // Author: Juana Rodriguez
                        storeItems.add(newMovies);
                       
                        // Purpose: Display a JOptionPane alerting the user that he or she entered a new entry
                        // Author: Juana Rodriguez
                        JOptionPane.showMessageDialog(null, "You New Book entry was added", "New Entry ", JOptionPane.PLAIN_MESSAGE);
                        // Author: Juana Rodriguez
                        outputItems = "";
                        // Purpose: counts the movies
                        // Author: Juana Rodriguez
                        //int numMovies = Movies.getMovieCount();
                        // Purpose: Sets the total muvies to the jLabel1TotalMovies
                        // Author Juana Rodriguez
               
                        // Purpose: Set the entries to the jTextArea1
                        // Author: JUana Rodriguez
                        textArea1.setText(outputItems);
                        // Purpose: counts the movies and lavels all the entries
                        int countMovies = 1;        
                        // Purpose for: the purpose of this loop is to increase countMovies count
                        // interacting with the array list
                        // Author Juana Rodriguez
                        for(StoreItems newMovie : storeItems)
                        {
                            // Create a heading for the number of items in the store
                            outputItems += "_____________________Store Item " + countMovies + " _____________________________";
                            outputItems += newMovie.toString();
                            textArea1.setText(outputItems); 
                            // Increases the count
                            countMovies ++;
                        } 
                    }
                    catch(NumberFormatException exception)
                    {
                        // Purpose: Get a error message
                        // AuthorName: Juana Rodriguez
                        JOptionPane.showMessageDialog(null, "Enter a valid Input, try again!!", "Error", JOptionPane.ERROR_MESSAGE);                       
                    }
                }                   
            }
        );
        // set up center and register lister
        BooksButton = new JButton("add Book");
        add(BooksButton);
        BooksButton.setFont(new java.awt.Font("Tahoma", 0, 20)); 
        //218, 247, 166  
        BooksButton.setBackground(Color.getHSBColor(218, 247, 166));
        BooksButton.addActionListener(
            new ActionListener()
            {
                // Process MoviesButton event
                @Override
                public void actionPerformed(ActionEvent event)
                {
                    layout.setAlignment(FlowLayout.CENTER);
                    try
                    {
                    // Purpose Gets the user inputs
                   // Author: Juana Rodriguez
                    // 10/17/2017
                    String author = JOptionPane.showInputDialog("Enter Author Name: ");
                        while(author == null || author.isEmpty())
                        {
                           author = JOptionPane.showInputDialog("Invalid Input. Enter Author Name: ");
                           
                        }
                    // Purpose Gets the user inputs
                    // Author: Juana Rodriguez
                   // 10/17/2017
                    String title = JOptionPane.showInputDialog("Enter title Name: ");
                        while(author == null || author.isEmpty())
                        {
                           author = JOptionPane.showInputDialog("Empty Field. Enter title Name: ");
                           
                        }
                    // Purpose Gets the user inputs
                    // Author: Juana Rodriguez
                   // 10/17/2017
                    Date dateAcquired = Date.from(Instant.now());
                    // Asking price
                    double purchasePrice = Double.parseDouble(JOptionPane.showInputDialog("Enter Purchase Price $: "));                 
                        while(author == null || author.isEmpty())
                        {
                           author = JOptionPane.showInputDialog("Invalid Input. Enter Purchase Price Name: ");
                           
                        }
                    // Purpose Gets the user inputs
                    // Author: Juana Rodriguez
                    // 10/17/2017
                    //double askingPrice = JOptionPane.showInputDialog("Enter Asking Price:");
                    double askingPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter Asking Price $: "));
                        while(Double.toString(askingPrice) == null || Double.toString(askingPrice).isEmpty())
                        {
                          //String.valueOf(askingPrice) = JOptionPane.showInputDialog("Empty Field. Enter Director Name:");
                            askingPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter Asking Price $: "));
                           
                        }
                    // Purpose Gets the user inputs
                        // Author: Juana Rodriguez
                        // 10/17/2017
                    String genre = JOptionPane.showInputDialog("Enter Genre: ");
                        while(author == null || author.isEmpty())
                        {
                           author = JOptionPane.showInputDialog("Empty Field. Enter Genre: ");
                           
                        }
                    // Purpose Create a nuw object
                    // Author: Juana Rodriguez
                    Books newBookClass = new Books(author, title, dateAcquired , purchasePrice, askingPrice, genre);
                    //Purpose: Adds A new Movie to the ArrayList
                        // Author: Juana Rodriguez
                        storeItems.add(newBookClass);
                    
                        // Purpose: Display a JOptionPane alerting the user that he or she entered a new entry
                        // Author: Juana Rodriguez
                        JOptionPane.showMessageDialog(null, "You New Book entry was added", "New Entry ", JOptionPane.PLAIN_MESSAGE);
                        // Author: Juana Rodriguez
                        outputItems = "";
                        // Purpose: counts the movies
                        // Author: Juana Rodriguez
                        //int numMovies = Movies.getMovieCount();
                        // Purpose: Sets the total muvies to the jLabel1TotalMovies
                        // Author Juana Rodriguez
               
                        // Purpose: Set the entries to the jTextArea1
                        // Author: JUana Rodriguez
                        textArea1.setText(outputItems);
                        // Purpose: counts the movies and lavels all the entries
                        int countBooks = 1;        
                        // Purpose for: the purpose of this loop is to increase countMovies count
                        // interacting with the array list
                        // Author Juana Rodriguez
                        for(StoreItems newMovie : storeItems)
                        {
                            // Create a heading for the number of items in the store
                            outputItems += "______________________Store Item " + countBooks + " _____________________________";
                            outputItems += newMovie.toString();
                            textArea1.setText(outputItems); 
                            // Increases the count
                            countBooks++;
                        } 
                    }
                    catch(NumberFormatException exception)
                    {
                        // Purpose: Get a error message
                        // AuthorName: Juana Rodriguez
                        JOptionPane.showMessageDialog(null, "Enter a valid Input, try again!!", "Error", JOptionPane.ERROR_MESSAGE);                       
                    }
                }                   
            }
        );
        PaintingButton = new JButton("Add Painting");
        add(PaintingButton);
        //240, 178, 122  
        PaintingButton.setBackground(new java.awt.Color(240, 178, 122));
        PaintingButton.setFont(new java.awt.Font("Tahoma", 0, 20)); 
        PaintingButton.addActionListener(
                      new ActionListener()
            {
                // Process MoviesButton event
                @Override
                public void actionPerformed(ActionEvent event)
                {
                    layout.setAlignment(FlowLayout.RIGHT);
                    try
                    {
                        // Purpose Gets the user inputs
                        // Author: Juana Rodriguez
                        // 10/17/2017
                        String author = JOptionPane.showInputDialog("Enter Authors Name: ");
                            while(author == null || author.isEmpty())
                            {
                                author = JOptionPane.showInputDialog("Invalid Input. Enter Authors Name: ");
                           
                            }
                        // Purpose Gets the user inputs
                        // Author: Juana Rodriguez
                        // 10/17/2017
                        String title = JOptionPane.showInputDialog("Enter title Name: ");
                            while(title == null || title.isEmpty())
                            {
                                title = JOptionPane.showInputDialog("Empty Field. Enter title Name: ");
                           
                            }
                        // Purpose Gets the user inputs
                        // Author: Juana Rodriguez
                        // 10/17/2017
                        Date dateAcquired = Date.from(Instant.now());
                        // Asking price
                        double purchasePrice = Double.parseDouble(JOptionPane.showInputDialog("Enter Purchase Price $: "));                 
                            while(Double.toString(purchasePrice) == null || Double.toString(purchasePrice).isEmpty())
                            {
                                purchasePrice = Double.parseDouble(JOptionPane.showInputDialog("Invalid Input. Enter Purchase Price Name: "));
                           
                            }
                        //double askingPrice = JOptionPane.showInputDialog("Enter Asking Price:");
                        double askingPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter Asking Price $: "));
                            while(Double.toString(askingPrice) == null || Double.toString(askingPrice).isEmpty())
                            {
                                //String.valueOf(askingPrice) = JOptionPane.showInputDialog("Empty Field. Enter Director Name:");
                                askingPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter Asking Price $: "));
                           
                            }
                        // Purpose Gets the user inputs
                        // Author: Juana Rodriguez
                        // 10/17/2017
                        int width = Integer.parseInt(JOptionPane.showInputDialog("Enter Width: "));
                            while(Integer.toString(width)== null || Integer.toString(width).isEmpty())
                            {
                                width = Integer.parseInt(JOptionPane.showInputDialog("Empty Field \n. Enter Width: "));
                           
                            }
                        // Purpose Gets the user inputs
                        // Author: Juana Rodriguez
                        // 10/17/2017
                         int height = Integer.parseInt(JOptionPane.showInputDialog("Enter Width: "));
                            while(Integer.toString(height)== null || Integer.toString(height).isEmpty())
                            {
                                height = Integer.parseInt(JOptionPane.showInputDialog("Empty Field. Enter Height: "));
                           
                            }
                        // Purpose Gets the user inputs
                        // Author: Juana Rodriguez
                        // 10/17/2017
                        String media = JOptionPane.showInputDialog("Enter Media: ");
                            while(media == null || media.isEmpty())
                            {
                                media = JOptionPane.showInputDialog("Empty Field. Enter Enter Media: ");
                           
                            }
                        Paintings newPainting = new Paintings(author, title, dateAcquired , purchasePrice, askingPrice, width, height, media);
                        // Purpose: Adds a item to the array
                        //Author Name: Juana Rodriguez
                        // Date: 10/10/2017
                        storeItems.add(newPainting);   
                    
                        // Purpose: Display a JOptionPane alerting the user that he or she entered a new entry
                        // Author: Juana Rodriguez
                        JOptionPane.showMessageDialog(null, "You New Painting entry was added", "New Entry ", JOptionPane.PLAIN_MESSAGE);
                        // Author: Juana Rodriguez
                        outputItems = "";
                        // Purpose: counts the movies
                        // Author: Juana Rodriguez
                        //int numMovies = Movies.getMovieCount();
                        // Purpose: Sets the total muvies to the jLabel1TotalMovies
                        // Author Juana Rodriguez
               
                        // Purpose: Set the entries to the jTextArea1
                        // Author: JUana Rodriguez
                        textArea1.setText(outputItems);
                        // Purpose: counts the movies and lavels all the entries
                        int countPaintings = 1;        
                        // Purpose for: the purpose of this loop is to increase countMovies count
                        // interacting with the array list
                        // Author Juana Rodriguez
                        for(StoreItems Paintinge : storeItems)
                        {
                            // Create a heading for the number of items in the store
                            outputItems += "____________________Store Item " + countPaintings + " _____________________________";
                            outputItems += Paintinge.toString();
                            textArea1.setText(outputItems); 
                            // Increases the count
                            countPaintings++;
                        } 
                    }
                    catch(NumberFormatException exception)
                    {
                        // Purpose: Get a error message
                        // AuthorName: Juana Rodriguez
                        JOptionPane.showMessageDialog(null, "Enter a valid Input!!", "Error", JOptionPane.ERROR_MESSAGE);                       
                    }
                }                   
            }      
        );      
        
    } 
}
