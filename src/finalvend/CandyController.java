/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalvend;

import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author albert
 */
public class CandyController implements Initializable, ControlledScreen {
    @FXML private CheckBox mars;
    @FXML private CheckBox snickers;
    @FXML private CheckBox hersheys;
    @FXML private CheckBox wonderbar;
    @FXML private CheckBox reesesPieces;
    @FXML private CheckBox smarties;
    @FXML private Button vend;
    @FXML private TextField moneyField;
    @FXML private TextField changeField;
     private double moneyInputed, change;
     private double sum;
     
   
    private ArrayList <Double> selections = new ArrayList<Double>();
    NumberFormat formatter = new DecimalFormat("#0.00");
   
   /**
     * method will check if check boxes were selected, and add the selected items to selections array
     */
    public void selectedItems(){
        
        if (mars.isSelected() == true)
            selections.add(1.50);
        if(snickers.isSelected() == true){
          selections.add(1.50);
        }
        if(hersheys.isSelected() == true){
          selections.add(1.50);
        }
        if(reesesPieces.isSelected() == true){
          selections.add(1.50);
        }
        if(smarties.isSelected() == true){
          selections.add(1.50);
        }
        if(wonderbar.isSelected() == true){
          selections.add(1.50);
        }
        if(mars.isSelected() == false && snickers.isSelected() == false && hersheys.isSelected() == false && reesesPieces.isSelected() == false && smarties.isSelected() == false && wonderbar.isSelected() == false){
            String errorMessage = "Please Make a Selection";
            JOptionPane.showMessageDialog(null, errorMessage, "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    /**
     * method getFindTotal
     * @return double sum
     */
    public double getFindTotal(){
        return sum;
    }
    /**
     * loops through array to find total of selections and stores it in global variable sum
     */ 
    public void findTotal(){
        
        for (double total : selections){
          sum  = sum + total;
          
    }
        
    }
     /**
     * method to find change from money inputted subtracting the sum, and validates change variable is greater than 0.
     */
    public void setChange(){
        
       change =  moneyInputed - sum;
       
       if(change <= 0){
           String errorMessage = "You do not have enough money for this purchase";
            JOptionPane.showMessageDialog(null, errorMessage, "ERROR", JOptionPane.INFORMATION_MESSAGE);
            
            change = 0;
           // throw new IllegalArgumentException("Please insert more money.");
       }else{
           
       }
    }
     /**
     * method returns double change
     * @return 
     */
    public double getChange(){
        return change;
    }
    /**
     * method returns double moneyInputed
     * @return 
     */
    public double getMoney(){
        return moneyInputed;
    }
      /**
     * method that takes money field, formats and checks if change is greater than 5 cents.
     */
    public void setMoney(){
       String tempMoney = moneyField.getText();
        double tempMoneyDouble = Double.parseDouble(tempMoney);
         
        if((tempMoneyDouble/0.05) % 1 == 0){ 
       moneyInputed = tempMoneyDouble;
    }else{
            String errorMessage = "This machine does not accept change smaller than 5 cent coins";
            JOptionPane.showMessageDialog(null, errorMessage, "ERROR", JOptionPane.INFORMATION_MESSAGE);
         //throw new IllegalArgumentException("Money inputed must be greater than $0.05");
        }
      
    }
     /**
     * clears all selections made
     */
    public void clear(){
        sum = 0;
        change = 0;
        selections.clear();
        
        
    }
     /**
     * method to format money
     * @return String formattedMoneyField
     */
    public String formatMoney(){
        double tempMoneyField = Double.parseDouble(moneyField.getText());
        String formattedMoneyField = formatter.format(tempMoneyField);
        
        return formattedMoneyField;
        
        
    }
    /**
     * method to format change
     * @return String formattedChangeText
     */
    public String formatChange(){
        String formattedChangeText = formatter.format(change);
        return formattedChangeText;
    }
     /**
     * method to get text fields
     */
    public void setTextFields(){
        changeField.setText(formatChange());
    moneyField.setText(formatMoney());
    }
    /**
     * method to run methods: clear(), setMoney(), selectedItems(), findTotal(), setChange(), setTextFields()
     * @param event vend
     */
    public void vend(ActionEvent event)
    {
        
     clear();
     setMoney();
     selectedItems();
     findTotal();
     setChange();
     setTextFields();
    
    
    
    }
    
    
    
    
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      
    }    
    
    
    ScreensController myController;
    
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }
    
    @FXML
    private void goToPop(ActionEvent event){
        myController.setScreen(ScreensFramework.screen1ID);
    }
 
}

