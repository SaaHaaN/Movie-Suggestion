package Assigment3;

import java.util.List;
import javax.swing.*;

public class App extends javax.swing.JFrame {

    Functions f = new Functions();
    String target = "/target_user.csv";
    String main_data = "/main_data.csv";
    String movie_info = "/movies.csv";
    List<int[]> targetuservectors = f.readCSV(target);
    List<int[]> maindatavectors = f.readCSV(main_data);
    MaxHeap m = new MaxHeap(600);

    public App() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ByUserTabbedPane = new javax.swing.JTabbedPane();
        Page1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboxTargetUser = new javax.swing.JComboBox<>();
        movieCountSpinner = new javax.swing.JSpinner();
        userCountSpinner = new javax.swing.JSpinner();
        recomBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        recomArea = new javax.swing.JTextArea();
        Page2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comBoxMovie1 = new javax.swing.JComboBox<>();
        comBoxMovie2 = new javax.swing.JComboBox<>();
        comBoxMovie3 = new javax.swing.JComboBox<>();
        comBoxMovie4 = new javax.swing.JComboBox<>();
        comBoxMovie5 = new javax.swing.JComboBox<>();
        recomBtnPage2 = new javax.swing.JButton();
        usertxt = new javax.swing.JTextField();
        movietxt = new javax.swing.JTextField();
        m1txt = new javax.swing.JTextField();
        m2txt = new javax.swing.JTextField();
        m3txt = new javax.swing.JTextField();
        m4txt = new javax.swing.JTextField();
        m5txt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        recomTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Page1.setBackground(new java.awt.Color(255, 255, 255));
        Page1.setMaximumSize(new java.awt.Dimension(690, 403));
        Page1.setMinimumSize(new java.awt.Dimension(690, 403));
        Page1.setPreferredSize(new java.awt.Dimension(690, 403));

        jLabel1.setText("Target User:");

        jLabel2.setText("Movie Count:");

        jLabel3.setText("User Count:");

        cboxTargetUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "601", "602", "603", "604", "605", "606", "607", "608", "609", "610" }));

        recomBtn.setText("Get Recommendations");
        recomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recomBtnActionPerformed(evt);
            }
        });

        recomArea.setEditable(false);
        recomArea.setColumns(20);
        recomArea.setRows(5);
        jScrollPane1.setViewportView(recomArea);

        javax.swing.GroupLayout Page1Layout = new javax.swing.GroupLayout(Page1);
        Page1.setLayout(Page1Layout);
        Page1Layout.setHorizontalGroup(
            Page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Page1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxTargetUser, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(movieCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(recomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(Page1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        Page1Layout.setVerticalGroup(
            Page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Page1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(Page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxTargetUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(movieCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(userCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recomBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        ByUserTabbedPane.addTab("ByUser", Page1);

        Page2.setMaximumSize(new java.awt.Dimension(690, 403));
        Page2.setMinimumSize(new java.awt.Dimension(690, 403));
        Page2.setPreferredSize(new java.awt.Dimension(690, 403));

        jLabel4.setText("Similar User:");

        jLabel5.setText("Highest Movies:");

        comBoxMovie1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a Movie", "Sommersby", "Silent Movie", "King of Hearts", "Alien", "American Psycho", "Soul Plane", "Bats", "Quicksilver", "Daredevil", "Ring of Terror", "RoboCop" }));

        comBoxMovie2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a Movie", "Sommersby", "Silent Movie", "King of Hearts", "Alien", "American Psycho", "Soul Plane", "Bats", "Quicksilver", "Daredevil", "Ring of Terror", "RoboCop" }));

        comBoxMovie3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a Movie", "Sommersby", "Silent Movie", "King of Hearts", "Alien", "American Psycho", "Soul Plane", "Bats", "Quicksilver", "Daredevil", "Ring of Terror", "RoboCop" }));

        comBoxMovie4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a Movie", "Sommersby", "Silent Movie", "King of Hearts", "Alien", "American Psycho", "Soul Plane", "Bats", "Quicksilver", "Daredevil", "Ring of Terror", "RoboCop" }));

        comBoxMovie5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a Movie", "Sommersby", "Silent Movie", "King of Hearts", "Alien", "American Psycho", "Soul Plane", "Bats", "Quicksilver", "Daredevil", "Ring of Terror", "RoboCop" }));

        recomBtnPage2.setText("Get Recommendations");
        recomBtnPage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recomBtnPage2ActionPerformed(evt);
            }
        });

        recomTextArea2.setEditable(false);
        recomTextArea2.setColumns(20);
        recomTextArea2.setRows(5);
        jScrollPane2.setViewportView(recomTextArea2);

        javax.swing.GroupLayout Page2Layout = new javax.swing.GroupLayout(Page2);
        Page2.setLayout(Page2Layout);
        Page2Layout.setHorizontalGroup(
            Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Page2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Page2Layout.createSequentialGroup()
                        .addGroup(Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comBoxMovie4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comBoxMovie3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comBoxMovie2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comBoxMovie1, 0, 161, Short.MAX_VALUE)
                            .addComponent(comBoxMovie5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Page2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(m5txt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(m4txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(m3txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(m2txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(m1txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Page2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usertxt, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(movietxt)))))
                    .addComponent(recomBtnPage2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        Page2Layout.setVerticalGroup(
            Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Page2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Page2Layout.createSequentialGroup()
                        .addGap(0, 35, Short.MAX_VALUE)
                        .addGroup(Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m1txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comBoxMovie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comBoxMovie2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m3txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comBoxMovie3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m4txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comBoxMovie4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comBoxMovie5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m5txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(movietxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(recomBtnPage2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        ByUserTabbedPane.addTab("ByMovies", Page2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ByUserTabbedPane)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ByUserTabbedPane)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recomBtnActionPerformed
        recomArea.setText("");

        double[] cosinesimilarity = f.cosineSimilarity(targetuservectors.get(cboxTargetUser.getSelectedIndex()), maindatavectors, m); //cosine similarity
        
        int x = (int) movieCountSpinner.getValue(); //number of movies to be recommended
        int k = (int) userCountSpinner.getValue(); //number of users to be considered
        
        boolean isZero = x == 0 || k == 0;  //check if x or k is 0
        if (isZero) {
            JOptionPane.showMessageDialog(null, "Please enter a value greater than 0");
            return;
        }
        
        for (int i = 0; i < k; i++) {
            int index = f.getIndexofMax(cosinesimilarity, m); //get the index of the user with the highest cosine similarity
            List<Integer> maxIndices = f.findMaxIndices(maindatavectors.get(index), x); //find the indices of the movies with the highest ratings
            for (int j = 0; j < x; j++) {
                String[] movieInfo = f.getMovieInfoByID(movie_info, maxIndices.get(j)); //get the movie info by the movie id
                recomArea.append(movieInfo[0] + " " + movieInfo[1] + "\n");
            }
        }
        m.deleteAll(); //delete all the data in the heap
    }//GEN-LAST:event_recomBtnActionPerformed

    private void recomBtnPage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recomBtnPage2ActionPerformed
        recomTextArea2.setText("");
        int[] dummyUser = new int[9008];
        
        for (int i = 0; i < 9008; i++) {
            dummyUser[i] = 0; //initialize the dummy user
        }

        //get the movie id by the combobox index
        int m1 = f.getMovieIDbyCombobox(comBoxMovie1.getSelectedIndex());
        int m2 = f.getMovieIDbyCombobox(comBoxMovie2.getSelectedIndex());
        int m3 = f.getMovieIDbyCombobox(comBoxMovie3.getSelectedIndex());
        int m4 = f.getMovieIDbyCombobox(comBoxMovie4.getSelectedIndex());
        int m5 = f.getMovieIDbyCombobox(comBoxMovie5.getSelectedIndex());
        
        //control the comboboxes are different
        boolean isSame = m1 != m2 && m1 != m3 && m1 != m4 && m1 != m5
                && m2 != m3 && m2 != m4 && m2 != m5
                && m3 != m4 && m3 != m5
                && m4 != m5;
        
        //control the comboboxes are selected
        boolean isSelected = m1 == 0 || m2 == 0 || m3 == 0 || m4 == 0 || m5 == 0;
        
        //control the textfield is between 0-5 and empty with regex
        boolean mTxtIsNumber = m1txt.getText().matches("[0-5]") && m2txt.getText().matches("[0-5]") && m3txt.getText().matches("[0-5]") && m4txt.getText().matches("[0-5]") && m5txt.getText().matches("[0-5]");
        boolean mTxtIsEmpty = m1txt.getText().isEmpty() || m2txt.getText().isEmpty() || m3txt.getText().isEmpty() || m4txt.getText().isEmpty() || m5txt.getText().isEmpty();

        //control the textfield is between 0-9 and empty with regex
        boolean umIsNumber = usertxt.getText().matches("[0-9]") ||  movietxt.getText().matches("[0-9]");
        boolean umIsEmpty = usertxt.getText().isEmpty() || movietxt.getText().isEmpty();
        
        if (isSelected) { //control the comboboxes are selected
            JOptionPane.showMessageDialog(null, "Please select movies");
            return;
        }else if (!isSame) { //control the comboboxes are different
            JOptionPane.showMessageDialog(null, "Please select different movies");
            return;
        } else if (mTxtIsEmpty) { //control the textfield is empty
            JOptionPane.showMessageDialog(null, "Please enter the values");
            return;
        } else if (!mTxtIsNumber) { //control the textfield is between 0-5
            JOptionPane.showMessageDialog(null, "Please enter to rating the values between 0-5");
            return;
        }else if (umIsEmpty) { //control the textfield is empty
            JOptionPane.showMessageDialog(null, "Please enter the user and movie value");
            return;
        } else if (!umIsNumber) { //control the textfield is between 0-9
            JOptionPane.showMessageDialog(null, "Please enter to user and movie the values between 0-9");
            return;
        } else { //if there is no problem
            dummyUser[m1] = Integer.parseInt(m1txt.getText());
            dummyUser[m2] = Integer.parseInt(m2txt.getText());
            dummyUser[m3] = Integer.parseInt(m3txt.getText());
            dummyUser[m4] = Integer.parseInt(m4txt.getText());
            dummyUser[m5] = Integer.parseInt(m5txt.getText());

            double[] similarity = f.cosineSimilarity(dummyUser, maindatavectors, m); //cosine similarity

            int k = Integer.parseInt(usertxt.getText()); //number of users to be considered
            int x = Integer.parseInt(movietxt.getText()); //number of movies to be recommended
            
            for (int i = 0; i < k; i++) {
                int index = f.getIndexofMax(similarity, m); //get the index of the user with the highest cosine similarity
                List<Integer> maxIndices = f.findMaxIndices(maindatavectors.get(index), x); //find the indices of the movies with the highest ratings
                for (int j = 0; j < x; j++) {
                    String[] movieInfo = f.getMovieInfoByID(movie_info, maxIndices.get(j)); //get the movie info by the movie id
                    recomTextArea2.append(movieInfo[0] + " " + movieInfo[1] + "\n"); //print the movie info in the text area

                }
            }
            m.deleteAll(); //delete all the data in the heap
        }
    }//GEN-LAST:event_recomBtnPage2ActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new App().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane ByUserTabbedPane;
    private javax.swing.JPanel Page1;
    private javax.swing.JPanel Page2;
    private javax.swing.JComboBox<String> cboxTargetUser;
    private javax.swing.JComboBox<String> comBoxMovie1;
    private javax.swing.JComboBox<String> comBoxMovie2;
    private javax.swing.JComboBox<String> comBoxMovie3;
    private javax.swing.JComboBox<String> comBoxMovie4;
    private javax.swing.JComboBox<String> comBoxMovie5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField m1txt;
    private javax.swing.JTextField m2txt;
    private javax.swing.JTextField m3txt;
    private javax.swing.JTextField m4txt;
    private javax.swing.JTextField m5txt;
    private javax.swing.JSpinner movieCountSpinner;
    private javax.swing.JTextField movietxt;
    private javax.swing.JTextArea recomArea;
    private javax.swing.JButton recomBtn;
    private javax.swing.JButton recomBtnPage2;
    private javax.swing.JTextArea recomTextArea2;
    private javax.swing.JSpinner userCountSpinner;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}
