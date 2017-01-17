package Tac;
public class Tic extends javax.swing.JFrame {
    public Tic() {
        initComponents();
        DisAbleAll();
        this.setLocationRelativeTo(null);
        this.setTitle("MyAmmaji Pvt Ltd");
            }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        on_off = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        box2 = new javax.swing.JButton();
        box3 = new javax.swing.JButton();
        box1 = new javax.swing.JButton();
        box5 = new javax.swing.JButton();
        box6 = new javax.swing.JButton();
        box7 = new javax.swing.JButton();
        box8 = new javax.swing.JButton();
        box9 = new javax.swing.JButton();
        box4 = new javax.swing.JButton();
        boxwin = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        On = new javax.swing.JRadioButton();
        Off = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(38, 211, 14));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        jPanel5.setBackground(new java.awt.Color(29, 26, 24));
        jPanel5.setPreferredSize(new java.awt.Dimension(280, 280));

        box2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box2ActionPerformed(evt);
            }
        });

        box3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        box3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box3ActionPerformed(evt);
            }
        });

        box1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });

        box5.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        box5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box5ActionPerformed(evt);
            }
        });

        box6.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        box6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box6ActionPerformed(evt);
            }
        });

        box7.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        box7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box7ActionPerformed(evt);
            }
        });

        box8.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        box8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box8ActionPerformed(evt);
            }
        });

        box9.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        box9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box9ActionPerformed(evt);
            }
        });

        box4.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        box4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(box8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(box9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(box5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(box6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        boxwin.setEditable(false);
        boxwin.setBackground(new java.awt.Color(205, 38, 167));
        boxwin.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(254, 254, 38));
        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(125, 249, 2));
        jTextField1.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jTextField1.setText("Tic Tac Toe");

        on_off.add(On);
        On.setText("On");
        On.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnActionPerformed(evt);
            }
        });

        on_off.add(Off);
        Off.setText("Off");
        Off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxwin, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(On)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Off)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(On)
                    .addComponent(Off))
                .addGap(3, 3, 3)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxwin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(28, 19, 9));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>                        
    int player1=0;
    int player2=1;
    int s=0;
    public void DisAbleAll()
    {
    box1.setEnabled(false);
    box2.setEnabled(false);
    box3.setEnabled(false);
    box4.setEnabled(false);
    box5.setEnabled(false);
    box6.setEnabled(false);
    box7.setEnabled(false);
    box8.setEnabled(false);
    box9.setEnabled(false);
    }
    public void EnableAll()
    {
       
    box1.setEnabled(true);
    box2.setEnabled(true);
    box3.setEnabled(true);
    box4.setEnabled(true);
    box5.setEnabled(true);
    box6.setEnabled(true);
    box7.setEnabled(true);
    box8.setEnabled(true);
    box9.setEnabled(true);
    boxwin.setText("");
    }
    
    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        if(player1==0)
        {
        box1.setText("X");
        box1.setEnabled(false);
        opr();
        player1++;
        player2--;
        }
        else
        {
        box1.setText("0");
        box1.setEnabled(false);
        opr();
        player1--;
        player2++;
        }
    }                                    

    private void box2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
if(player1==0)
        {
        box2.setText("X");
        box2.setEnabled(false);
        opr();
        player1++;
        player2--;
        }
        else
        {
        box2.setText("0");
        box2.setEnabled(false);
        opr();
        player1--;
        player2++;
        }        // TODO add your handling code here:
    }                                    

    private void box3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
if(player1==0)
        {
        box3.setText("X");
        box3.setEnabled(false);
        opr();
        player1++;
        player2--;
        }
        else
        {
        box3.setText("0");
        box3.setEnabled(false);
        opr();
        player1--;
        player2++;
        }        // TODO add your handling code here:
    }                                    

    private void box4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
if(player1==0)
        {
        box4.setText("X");
        box4.setEnabled(false);
        opr();
        player1++;
        player2--;
        }
        else
        {
        box4.setText("0");
        box4.setEnabled(false);
        opr();
        player1--;
        player2++;
        }           // TODO add your handling code here:
    }                                    

    private void box5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
if(player1==0)
        {
        box5.setText("X");
        box5.setEnabled(false);
        opr();
        player1++;
        player2--;
        }
        else
        {
        box5.setText("0");
        box5.setEnabled(false);
        opr();
        player1--;
        player2++;
        }           // TODO add your handling code here:
    }                                    

    private void box6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
if(player1==0)
        {
        box6.setText("X");
        box6.setEnabled(false);
        opr();
        player1++;
        player2--;
        }
        else
        {
        box6.setText("0");
        box6.setEnabled(false);
        opr();
        player1--;
        player2++;
        }           // TODO add your handling code here:
    }                                    

    private void box7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
if(player1==0)
        {
        box7.setText("X");
        box7.setEnabled(false);
        opr();
        player1++;
        player2--;
        }
        else
        {
        box7.setText("0");
        box7.setEnabled(false);
        opr();
        player1--;
        player2++;
        }           // TODO add your handling code here:
    }                                    

    private void box8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
if(player1==0)
        {
        box8.setText("X");
        box8.setEnabled(false);
        opr();
        player1++;
        player2--;
        }
        else
        {
        box8.setText("0");
        box8.setEnabled(false);
        opr();
        player1--;
        player2++;
        }           // TODO add your handling code here:
    }                                    

    private void box9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
if(player1==0)
        {
        box9.setText("X");
        box9.setEnabled(false);
        opr();
        player1++;
        player2--;
        }
        else
        {
        box9.setText("0");
        box9.setEnabled(false);
        opr();
        player1--;
        player2++;
        }           // TODO add your handling code here:
    }                                    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        box1.setText("");
        box2.setText("");
        box3.setText("");
        box4.setText("");
        box5.setText("");
        box6.setText("");
        box7.setText("");
        box8.setText("");
        box9.setText("");
        EnableAll();
    }                                        

    private void OnActionPerformed(java.awt.event.ActionEvent evt) {                                   
        On.setEnabled(false);
        Off.setEnabled(true);
        EnableAll(); // TODO add your handling code here:
    }                                  

    private void OffActionPerformed(java.awt.event.ActionEvent evt) {                                    
       On.setEnabled(true);
       Off.setEnabled(false);
        DisAbleAll();        // TODO add your handling code here:
    }                                   

    public void opr()
{
if(box1.getText().equals(box2.getText()) && box2.getText().equals(box3.getText())
   || box1.getText().equals(box4.getText()) && box4.getText().equals(box7.getText())
   || box1.getText().equals(box5.getText()) && box5.getText().equals(box9.getText())    
  )
    {
          String str=box1.getText();
          if(str!="")
          {
       boxwin.setText("Congrates:"+box1.getText() +" Win");
       DisAbleAll();
          }
    }
else if(box2.getText().equals(box5.getText()) && box5.getText().equals(box8.getText()))
       {
          String str=box2.getText();
          if(str!="")
          {
       boxwin.setText("Congrates:"+box2.getText() +" Win");  
       DisAbleAll();
          }
       }
else if(box3.getText().equals(box6.getText()) && box6.getText().equals(box9.getText())
     ||box3.getText().equals(box5.getText()) && box5.getText().equals(box7.getText()
     ) 
    )
      {
          String str=box3.getText();
          if(str!="")
          {
       boxwin.setText("Congrates:"+ box3.getText() +" Win");  
           DisAbleAll();
          }
       }
else if(box4.getText().equals(box5.getText()) && box5.getText().equals(box6.getText()))
{
          String str=box4.getText();
          if(str!="")
          {
       boxwin.setText("Congrates:"+box4.getText() +" Win");  
           DisAbleAll();
          }
       }
else if(box7.getText().equals(box8.getText()) && box8.getText().equals(box9.getText()))
{
          String str=box7.getText();
          if(str!="")
          {
       boxwin.setText("Congrates:"+box7.getText() +" Win");  
           DisAbleAll();
          }
       }        

}
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic().setVisible(true);
            }
        });
       
}

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton Off;
    private javax.swing.JRadioButton On;
    private javax.swing.JButton box1;
    private javax.swing.JButton box2;
    private javax.swing.JButton box3;
    private javax.swing.JButton box4;
    private javax.swing.JButton box5;
    private javax.swing.JButton box6;
    private javax.swing.JButton box7;
    private javax.swing.JButton box8;
    private javax.swing.JButton box9;
    private javax.swing.JTextField boxwin;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.ButtonGroup on_off;
    // End of variables declaration                   
}
