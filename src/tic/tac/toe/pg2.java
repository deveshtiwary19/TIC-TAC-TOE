/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author deves
 */
public class pg2 extends javax.swing.JFrame {

    private String StartGame="X";
    private int xcount=0;
    private int ycount=0;//variables Globally declared to use in all methods
    /**
     * Creates new form pg2
     */
    public pg2() {
        initComponents();
        this.setVisible(true);
        this.setSize(1071,700);
    }
private void gameScore()//The function to set the initial scores
{
    jLabel3.setText(String.valueOf(xcount));
     jLabel5.setText(String.valueOf(ycount));
}
private void choose_a_player()//The function to start the  game 
{
    if(StartGame.equalsIgnoreCase("x"))
    {
        StartGame="O";
    }
    else
    {
        StartGame="X";
    }
}
private void winner()
{
    String a1=jButton1.getText();
    String a2=jButton2.getText();
    String a3=jButton3.getText();
    
    String a4=jButton4.getText();
    String a5=jButton5.getText();
    String a6=jButton6.getText();
    
    String a7=jButton7.getText();
    String a8=jButton8.getText();
    String a9=jButton9.getText();
    
    if(a1==("X")&& a2==("X")&& a3==("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins");
        xcount++;
        gameScore();
        jButton1.setBackground(Color.CYAN);
        jButton2.setBackground(Color.CYAN);
        jButton3.setBackground(Color.CYAN);
    }
     if(a4==("X")&& a5==("X")&& a6==("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins");
        xcount++;
        gameScore();
        jButton4.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton6.setBackground(Color.CYAN);
    }
      if(a7==("X")&& a8==("X")&& a9==("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins");
        xcount++;
        gameScore();
        jButton7.setBackground(Color.CYAN);
        jButton8.setBackground(Color.CYAN);
        jButton9.setBackground(Color.CYAN);
    }
     if(a1==("X")&& a5==("X")&& a9==("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins");
        xcount++;
        jButton1.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton9.setBackground(Color.CYAN);
    }
      if(a3==("X")&& a5==("X")&& a7==("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins");
        xcount++;
        gameScore();
        jButton3.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton7.setBackground(Color.CYAN);
    }
       if(a1==("X")&& a4==("X")&& a7==("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins");
        xcount++;
        gameScore();
        jButton1.setBackground(Color.CYAN);
        jButton4.setBackground(Color.CYAN);
        jButton7.setBackground(Color.CYAN);
    }
        if(a2==("X")&& a5==("X")&& a8==("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins");
        xcount++;
        gameScore();
        jButton2.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
        jButton8.setBackground(Color.CYAN);
    }
         if(a3==("X")&& a6==("X")&& a9==("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins");
        xcount++;
        gameScore();
        jButton3.setBackground(Color.CYAN);
        jButton6.setBackground(Color.CYAN);
        jButton9.setBackground(Color.CYAN);
    }
       if(a1==("O")&& a2==("O")&& a3==("O"))
    {
        JOptionPane.showMessageDialog(this,"Player O wins");
        ycount++;
        gameScore();
        jButton1.setBackground(Color.PINK);
        jButton2.setBackground(Color.PINK);
        jButton3.setBackground(Color.PINK);
    }
        if(a4==("O")&& a5==("O")&& a6==("O"))
    {
        JOptionPane.showMessageDialog(this,"Player O wins");
        ycount++;
        gameScore();
        jButton4.setBackground(Color.PINK);
        jButton5.setBackground(Color.PINK);
        jButton6.setBackground(Color.PINK);
    }
         if(a7==("O")&& a8==("O")&& a9==("O"))
    {
        JOptionPane.showMessageDialog(this,"Player O wins");
        ycount++;
        gameScore();
        jButton7.setBackground(Color.PINK);
        jButton8.setBackground(Color.PINK);
        jButton9.setBackground(Color.PINK);
    }
          if(a1==("O")&& a5==("O")&& a9==("O"))
    {
        JOptionPane.showMessageDialog(this,"Player O wins");
        ycount++;
        gameScore();
        jButton1.setBackground(Color.PINK);
        jButton5.setBackground(Color.PINK);
        jButton9.setBackground(Color.PINK);
    }
           if(a3==("O")&& a5==("O")&& a7==("O"))
    {
        JOptionPane.showMessageDialog(this,"Player O wins");
        ycount++;
        gameScore();
        jButton3.setBackground(Color.PINK);
        jButton5.setBackground(Color.PINK);
        jButton7.setBackground(Color.PINK);
    }
            if(a1==("O")&& a4==("O")&& a7==("O"))
    {
        JOptionPane.showMessageDialog(this,"Player O wins");
        ycount++;
        gameScore();
        jButton1.setBackground(Color.PINK);
        jButton4.setBackground(Color.PINK);
        jButton7.setBackground(Color.PINK);
    }
             if(a2==("O")&& a5==("O")&& a8==("O"))
    {
        JOptionPane.showMessageDialog(this,"Player O wins");
        ycount++;
        gameScore();
        jButton2.setBackground(Color.PINK);
        jButton5.setBackground(Color.PINK);
        jButton8.setBackground(Color.PINK);
    }
              if(a3==("O")&& a6==("O")&& a9==("O"))
    {
        JOptionPane.showMessageDialog(this,"Player O wins");
        ycount++;
        gameScore();
        jButton3.setBackground(Color.PINK);
        jButton6.setBackground(Color.PINK);
        jButton9.setBackground(Color.PINK);
    }
          
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tic/tac/toe/images/x.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 10, 690, 80);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(null);

        jButton1.setBackground(java.awt.Color.lightGray);
        jButton1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(40, 30, 110, 90);

        jButton2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(160, 30, 110, 90);

        jButton3.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(280, 30, 110, 90);

        jButton4.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(40, 130, 110, 90);

        jButton5.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(160, 130, 110, 90);

        jButton6.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(280, 130, 110, 90);

        jButton7.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(40, 230, 110, 90);

        jButton8.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(160, 230, 110, 90);

        jButton9.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);
        jButton9.setBounds(280, 230, 110, 90);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(300, 190, 430, 350);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tic/tac/toe/images/back.png"))); // NOI18N
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(20, 20, 80, 80);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPTIONS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel3.setLayout(null);

        jButton11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 102, 102));
        jButton11.setText("RESET BOARD");
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11);
        jButton11.setBounds(10, 40, 190, 60);

        jButton12.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 102, 102));
        jButton12.setText("NEW GAME");
        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton12);
        jButton12.setBounds(10, 160, 190, 60);

        jButton13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 102, 102));
        jButton13.setText("CLEAR SCORE");
        jButton13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton13);
        jButton13.setBounds(10, 290, 190, 60);

        jButton14.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 102, 102));
        jButton14.setText("Help");
        jButton14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton14);
        jButton14.setBounds(10, 430, 190, 60);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 180, 230, 520);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SCOREBOARD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel4.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Player X:");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jLabel2);
        jLabel2.setBounds(10, 40, 240, 70);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("0");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jLabel3);
        jLabel3.setBounds(10, 120, 240, 70);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Player O:");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jLabel4);
        jLabel4.setBounds(10, 330, 240, 70);

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("0");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 410, 240, 70);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(810, 190, 260, 510);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1070, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         jButton8.setText(StartGame);
        if(StartGame.equalsIgnoreCase("X"))
        {
            jButton8.setForeground(Color.GREEN);
        }
        else
        {
            jButton8.setForeground(Color.RED);
        }
        
        winner();
        choose_a_player();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         jButton9.setText(StartGame);
        if(StartGame.equalsIgnoreCase("X"))
        {
            jButton9.setForeground(Color.GREEN);
        }
        else
        {
            jButton9.setForeground(Color.RED);
        }
        
        winner();
        choose_a_player();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(this,"Are you sure to clear the scores! Previous Scores will be lost","Confirm!",JOptionPane.YES_NO_OPTION);
       if(a==JOptionPane.YES_OPTION)
       {
        jLabel3.setText("0");
        jLabel5.setText("0");
        xcount=0;
        ycount=0;
       }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
       int a= JOptionPane.showConfirmDialog(this,"Are you sure to start NEW GAME?,Credits will be lost!!","New Match!",JOptionPane.YES_NO_OPTION);
       
       if(a==JOptionPane.YES_OPTION)
       {
         jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        
        
        
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
        jLabel3.setText("0");
        jLabel5.setText("0");
        xcount=0;
        ycount=0;
       }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(StartGame);
        if(StartGame.equalsIgnoreCase("X"))
        {
            jButton1.setForeground(Color.GREEN);
        }
        else
        {
            jButton1.setForeground(Color.RED);
        }
        
        winner();
        choose_a_player();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         jButton2.setText(StartGame);
        if(StartGame.equalsIgnoreCase("X"))
        {
            jButton2.setForeground(Color.GREEN);
        }
        else
        {
            jButton2.setForeground(Color.RED);
        }
       
        winner();
        choose_a_player();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         jButton3.setText(StartGame);
        if(StartGame.equalsIgnoreCase("X"))
        {
            jButton3.setForeground(Color.GREEN);
        }
        else
        {
            jButton3.setForeground(Color.RED);
        }
        
        winner();
        choose_a_player();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         jButton4.setText(StartGame);
        if(StartGame.equalsIgnoreCase("X"))
        {
            jButton4.setForeground(Color.GREEN);
        }
        else
        {
            jButton4.setForeground(Color.RED);
        }
       
        winner();
        choose_a_player();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         jButton5.setText(StartGame);
        if(StartGame.equalsIgnoreCase("X"))
        {
            jButton5.setForeground(Color.GREEN);
        }
        else
        {
            jButton5.setForeground(Color.RED);
        }
        
        winner();
        choose_a_player();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         jButton6.setText(StartGame);
        if(StartGame.equalsIgnoreCase("X"))
        {
            jButton6.setForeground(Color.GREEN);
        }
        else
        {
            jButton6.setForeground(Color.RED);
        }
        
        winner();
        choose_a_player();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         jButton7.setText(StartGame);
        if(StartGame.equalsIgnoreCase("X"))
        {
            jButton7.setForeground(Color.GREEN);
        }
        else
        {
            jButton7.setForeground(Color.RED);
        }
        
        winner();
        choose_a_player();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        
        
        
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(this,"Are you sure to Exit!","Exit Board!",JOptionPane.YES_NO_OPTION);
        if(a==JOptionPane.YES_OPTION)
        {
            this.dispose();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        Help obj=new Help();
        obj.setVisible(true);
        
    }//GEN-LAST:event_jButton14ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pg2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pg2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pg2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pg2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pg2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
