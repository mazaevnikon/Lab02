package clientlab02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class ClientLab02 extends javax.swing.JFrame {
    
    BufferedReader reader;
    PrintWriter writer;
    Socket sock;

   
    public ClientLab02() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serchButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        serchPane = new javax.swing.JTextPane();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        flightNumberPane = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        airbusPane = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        outPane = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        inPane = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        departureTimePane = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        trackTimePane = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        changeButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        endButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        serverArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        serchButton.setText("Найти");
        serchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serchButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(serchPane);

        jLabel1.setText("Добавление / изменение рейса по номеру");

        jScrollPane3.setViewportView(flightNumberPane);

        jScrollPane10.setViewportView(airbusPane);

        jScrollPane11.setViewportView(outPane);

        jScrollPane12.setViewportView(inPane);

        jScrollPane13.setViewportView(departureTimePane);

        jScrollPane14.setViewportView(trackTimePane);

        jLabel8.setText("Номер рейса :");

        jLabel9.setText("Аэробус :");

        jLabel10.setText("Пункт вылета :");

        jLabel11.setText("Пункт прибытия :");

        jLabel12.setText("Время вылета :");

        jLabel13.setText("Путевое время :");

        addButton.setText("Добавить");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Номер рейса", "Аэробус", "Маршрут", "Время вылета", "Путевое время"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(mainTable);

        jLabel2.setText("Поиск / удаление по номеру рейса");

        deleteButton.setText("Удалить");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        changeButton.setText("Изменить");
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Обновить список рейсов");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        endButton.setText("Выйти");
        endButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endButtonActionPerformed(evt);
            }
        });

        serverArea.setColumns(20);
        serverArea.setRows(5);
        jScrollPane1.setViewportView(serverArea);

        jLabel3.setText("Ответ от сервера :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(changeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(updateButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(endButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(serchButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(deleteButton)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(serchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void serchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serchButtonActionPerformed
      
        try {
            writer.println("findFlight");
            writer.flush();
            writer.println(serchPane.getText());
            writer.flush();
            
            String[] in = reader.readLine().split("/");
            
            if(in.length>1){
                serverArea.setText("Рейс найден");
                
                DefaultTableModel model = (DefaultTableModel) mainTable.getModel();
                int rows = model.getRowCount();
                for(int i =0; i<rows;i++){
                    model.removeRow(0);
                }
                
                Vector <String> v = new Vector<String>(1);
                model.addRow(v);
               
                for(int i = 0; i < in.length; i++){
                    mainTable.setValueAt(in[i],0,i);
                }
               
            }else{serverArea.setText("Рейс с указанным номером не найден");}
        } catch (IOException ex) {
            Logger.getLogger(ClientLab02.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_serchButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        try {
            writer.println("addFlight");
            writer.flush();
            writer.println(flightNumberPane.getText());
            writer.flush();
            writer.println(airbusPane.getText());
            writer.flush();
            writer.println(outPane.getText());
            writer.flush();
            writer.println(inPane.getText());
            writer.flush();
            writer.println(departureTimePane.getText());
            writer.flush();
            writer.println(trackTimePane.getText());
            writer.flush();
            
            if(reader.readLine().equals("+")){
            serverArea.setText("Рейс добавлен");
            
            DefaultTableModel model = (DefaultTableModel) mainTable.getModel();
            int rows = model.getRowCount();
            for(int i =0; i<rows;i++){
                model.removeRow(0); 
            }
            
            writer.println("getFlights");
            writer.flush();
            String[] in = reader.readLine().split("//");
            for(int i = 0; i < in.length; i++){
                Vector <String> v = new Vector<String>(i);
                model.addRow(v);
                String[] in2 = in[i].split("/");
                for(int j = 0; j < in2.length; j++){
                    mainTable.setValueAt(in2[j],i,j);
                }
            }
            }else{serverArea.setText("Вы заполнеели не все поля или рейс с указанным номером уже существует");}
        } catch (IOException ex) {
            Logger.getLogger(ClientLab02.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            writer.println("removeFlight");
            writer.flush();
            writer.println(serchPane.getText());
            writer.flush();
            
            if(reader.readLine().equals("+")){
            serverArea.setText("Рейс удален");
            DefaultTableModel model = (DefaultTableModel) mainTable.getModel();
            int rows = model.getRowCount();
            for(int i =0; i<rows;i++){
                model.removeRow(0); 
            }
            
            writer.println("getFlights");
            writer.flush();
            String[] in = reader.readLine().split("//");
            for(int i = 0; i < in.length; i++){
                Vector <String> v = new Vector<String>(i);
                model.addRow(v);
                String[] in2 = in[i].split("/");
                for(int j = 0; j < in2.length; j++){
                    mainTable.setValueAt(in2[j],i,j); 
                }
            }
            }else{serverArea.setText("Указанный номер рейса не найден");}
        } catch (IOException ex) {
            Logger.getLogger(ClientLab02.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
       try {
            writer.println("changeF");
            writer.flush();
            writer.println(flightNumberPane.getText());
            writer.flush();
            writer.println(airbusPane.getText());
            writer.flush();
            writer.println(outPane.getText());
            writer.flush();
            writer.println(inPane.getText());
            writer.flush();
            writer.println(departureTimePane.getText());
            writer.flush();
            writer.println(trackTimePane.getText());
            writer.flush();
            String r = reader.readLine();
            
            if(r.equals("+")){               
                serverArea.setText("Рейс изменмн");
                DefaultTableModel model = (DefaultTableModel) mainTable.getModel();
                int rows = model.getRowCount();
                for(int i =0; i<rows;i++){
                model.removeRow(0); 
                }      
                writer.println("getFlights");
                writer.flush();
                String[] in = reader.readLine().split("//");
                for(int i = 0; i < in.length; i++){
                    Vector <String> v = new Vector<String>(i);
                    model.addRow(v);
                    String[] in2 = in[i].split("/");
                    for(int j = 0; j < in2.length; j++){
                    mainTable.setValueAt(in2[j],i,j);
                    }
                }
  
                }else{
                    if(r.equals("--")){
                        serverArea.setText("Вы заполнели не все поля");
                    }
                        else{
                            if(r.equals("-")){
                               serverArea.setText("Рейс с указанным номером не найден");
                            }
                        }
                     }
   
             
        } catch (IOException ex) {
            Logger.getLogger(ClientLab02.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_changeButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) mainTable.getModel();
            
            int rows = model.getRowCount();
             for(int i =0; i<rows;i++){
             model.removeRow(0);
            }
            
        writer.println("getFlights");
        writer.flush();
        String[] in = reader.readLine().split("//");
        for(int i = 0; i < in.length; i++){
            Vector <String> v = new Vector<String>(i);
            model.addRow(v);
            String[] in2 = in[i].split("/");
            for(int j = 0; j < in2.length; j++){
               mainTable.setValueAt(in2[j],i,j); 
            }
        }
        } catch (IOException ex) {
            Logger.getLogger(ClientLab02.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void endButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButtonActionPerformed
    
        try {
            writer.close();
            reader.close();
            sock.close();
            System.exit(1);
        } catch (IOException ex) {
            Logger.getLogger(ClientLab02.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_endButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(ClientLab02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientLab02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientLab02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientLab02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ClientLab02 l = new ClientLab02();
                try {
                    l.start();
                } catch (IOException ex) {
                    Logger.getLogger(ClientLab02.class.getName()).log(Level.SEVERE, null, ex);
                }
                l.setVisible(true);
                
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextPane airbusPane;
    private javax.swing.JButton changeButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextPane departureTimePane;
    private javax.swing.JButton endButton;
    private javax.swing.JTextPane flightNumberPane;
    private javax.swing.JTextPane inPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable mainTable;
    private javax.swing.JTextPane outPane;
    private javax.swing.JButton serchButton;
    private javax.swing.JTextPane serchPane;
    private javax.swing.JTextArea serverArea;
    private javax.swing.JTextPane trackTimePane;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

private void start() throws IOException {
    
     try {
            sock = new Socket("127.0.0.1", 5000);
            reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            writer = new PrintWriter(sock.getOutputStream());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
     
     DefaultTableModel model = (DefaultTableModel) mainTable.getModel();
     
     
        writer.println("getFlights");
        writer.flush();
        String[] in = reader.readLine().split("//");
        for(int i = 0; i < in.length; i++){
            Vector <String> v = new Vector<String>(i);
            model.addRow(v);
            String[] in2 = in[i].split("/");
            for(int j = 0; j < in2.length; j++){
               mainTable.setValueAt(in2[j],i,j); 
            }
        }
     


}

}
