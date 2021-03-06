package Lab11;

/* CSC 120 Lab # 11
 * Alec Barker
 * Today's Date
 *      12/1/17
 * Acknowledgements:
 * 
 */

import java.awt.*;
import javax.swing.*;

public class MUFrame extends javax.swing.JFrame {

    
    // declare private data here
    
    
    
    
    
    
    
    
    // constructor method
    public MUFrame() {
        initComponents();
        
        Color b = getBackground();
        System.out.println("background is " + b);
        setBackground(Color.ORANGE);
        
        
    } // end of constructor
    
    // declare other methods here
    
    
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        processInputButton = new javax.swing.JButton();
        inputField = new javax.swing.JTextField();
        outputScrollPane = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.ORANGE);
        setName("CSC 120 Lab 11");

        jInternalFrame1.setBackground(Color.ORANGE);
        jInternalFrame1.setBorder(null);
        jInternalFrame1.setTitle("CSC 120 Lab 11");
        jInternalFrame1.setVisible(true);

        jLabel1.setText("Type something below, then");

        jLabel2.setText("click the button:");

        processInputButton.setText("Click to Process Input");
        processInputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processInputButtonActionPerformed(evt);
            }
        });

        outputArea.setBackground(new Color(225, 225, 225));
        outputArea.setColumns(20);
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
        outputArea.setRows(5);
        outputScrollPane.setViewportView(outputArea);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1)
                    .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processInputButton))
                .addGap(42, 42, 42)
                .addComponent(outputScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(processInputButton))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(outputScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void processInputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processInputButtonActionPerformed

        capitalizeInputText();
        
        lowerInputText();
        
        questionInputText();
        
        firstCharacterInputText();
        
        lastCharacterInputText();
        
        first5InputText();
        
        numberInputText();
        
        moreThan10InputText();
        
        spacesInputText();
        
        swapInputText();
        outputArea.append("=================================================\n");
                
    }//GEN-LAST:event_processInputButtonActionPerformed

    
    
    public void capitalizeInputText() {
        String userInput;
        String modifiedValue;
        
        userInput = inputField.getText();
        modifiedValue = userInput.toUpperCase();
        outputArea.append("All capital letters:\n");
        outputArea.append("\t" + modifiedValue + "\n");
        outputArea.append("\n");
        
    } // end of capitalizeInputText()
    
    public void lowerInputText() {
        String userInput;
        String modifiedValue;
        
        userInput = inputField.getText();
        modifiedValue = userInput.toLowerCase();
        outputArea.append("All lowercase letters:\n");
        outputArea.append("\t" + modifiedValue + "\n");
        outputArea.append("\n");
        
    }
    
    public void questionInputText() {
        String userInput;
        String modifiedValue;
        
        userInput = inputField.getText();
        modifiedValue = "?" + userInput + "?";
        outputArea.append("With a question mark at the beginning and at the end:\n");
        outputArea.append("\t" + modifiedValue + "\n");
        outputArea.append("\n");
        
    }
    
    public void firstCharacterInputText() {
        String userInput;
        char modifiedValue;
        
        userInput = inputField.getText();
        modifiedValue = userInput.charAt(0);
        outputArea.append("The first character:\n");
        outputArea.append("\t" + modifiedValue + "\n");
        outputArea.append("\n");
        
    }
    
    public void lastCharacterInputText() {
        String userInput;
        Integer temp;
        char modifiedValue;
        
        userInput = inputField.getText();
        temp = userInput.length() - 1;
        modifiedValue = userInput.charAt(temp);
        outputArea.append("The last character:\n");
        outputArea.append("\t" + modifiedValue + "\n");
        outputArea.append("\n");
        
    }
    
    public void first5InputText() {
        String userInput;
        String modifiedValue;
        
        userInput = inputField.getText();
        if(userInput.length() >= 5){
            modifiedValue = userInput.substring(0, 5);
        }
        else{
            modifiedValue = userInput.substring(0, userInput.length());
        }
        outputArea.append("Substring of the first 5 characters:\n");
        outputArea.append("\t" + modifiedValue + "\n");
        outputArea.append("\n");
        
    } 
    
    public void numberInputText() {
        String userInput;
        Integer modifiedValue;
        
        userInput = inputField.getText();
        modifiedValue = userInput.length();
        outputArea.append("Number of characters in the input:\n");
        outputArea.append("\tNumber of characters is " + modifiedValue + "\n");
        outputArea.append("\n");
        
    }
    
    public void moreThan10InputText() {
        String userInput;
        String modifiedValue;
        
        userInput = inputField.getText();
        if(userInput.length() > 10){
            modifiedValue = "Yes";
        }
        else{
            modifiedValue = "No";
        }
        outputArea.append("Does it contain more than 10 characters?\n");
        outputArea.append("\t" + modifiedValue + "\n");
        outputArea.append("\n");
        
    }
    
    public void spacesInputText() {
        String userInput;
        String modifiedValue;
        
        userInput = inputField.getText();
        if(userInput.indexOf(" ") > 0){
            modifiedValue = "Yes";
        }
        else{
            modifiedValue = "No";
        }
        outputArea.append("Does input contain a blank space?\n");
        outputArea.append("\t" + modifiedValue + "\n");
        outputArea.append("\n");
        
    }
    
    public void swapInputText() {
        String userInput, tempValue;
        Integer length;
        String modifiedValue;
        
        userInput = inputField.getText();
        length = userInput.length();
        tempValue = userInput.substring(1, length - 1);
        modifiedValue = userInput.charAt(length-1) + tempValue + userInput.charAt(0);
        outputArea.append("The first char last and the last char first:\n");
        outputArea.append("\t" + modifiedValue + "\n");
        outputArea.append("\n");
        
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MUFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputField;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JScrollPane outputScrollPane;
    private javax.swing.JButton processInputButton;
    // End of variables declaration//GEN-END:variables
}
