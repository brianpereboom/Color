package Color;
public class WidgetInterface extends javax.swing.JFrame implements ColorConverter {

    private javax.swing.JPanel Panel;
    private javax.swing.JLabel Label;
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JTextField TextField0;
    private javax.swing.JTextField TextField1;
    private javax.swing.JTextField TextField2;
    private javax.swing.JTextField TextField3;
    private javax.swing.JTextField TextField4;
    private javax.swing.JTextField TextField5;
    private javax.swing.JTextField TextField6;
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;

    public WidgetInterface() {
        initComponents();
    }
    
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Label = new javax.swing.JLabel();
        ComboBox = new javax.swing.JComboBox<String>();
        TextField0 = new javax.swing.JTextField();
        TextField1 = new javax.swing.JTextField();
        TextField2 = new javax.swing.JTextField();
        TextField3 = new javax.swing.JTextField();
        TextField4 = new javax.swing.JTextField();
        TextField5 = new javax.swing.JTextField();
        TextField6 = new javax.swing.JTextField();
        Button0 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();

        Panel.setBackground(new java.awt.Color(51, 51, 51));

        Label.setBackground(new java.awt.Color(255, 255, 255));
        Label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Label.setForeground(new java.awt.Color(255, 255, 255));
        Label.setText("Color Converter");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(Label)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Label)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RGB", "HSV" }));

        TextField0.setEditable(true);
        TextField1.setEditable(true);
        TextField2.setEditable(true);
        TextField3.setEditable(false);
        TextField4.setEditable(false);
        TextField5.setEditable(false);
        TextField6.setEditable(false);

        Button0.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Button0.setText("Convert");
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });

        Button1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Button1.setText("Exit");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER, false)
                    .addComponent(ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER, false)
                    .addComponent(TextField0, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER, false)
                    .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER, false)
                    .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER, false)
                    .addComponent(Button0)
                    .addComponent(Button1)
                )
                .addGap(50, 50, 50)
            )
            .addGap(29, 29, 29)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField0, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button0)
                )
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button1)
                )
                .addGap(46, 46, 46)
            )
        );

        pack();
    }

    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String val=(String)ComboBox.getSelectedItem();
        
        if(val.equals("RGB")){
            double red = Double.parseDouble(TextField0.getText());
            double green = Double.parseDouble(TextField1.getText());
            double blue = Double.parseDouble(TextField2.getText());

            double[] hsv = ColorConverter.toHSV(red, green, blue);
            
            TextField3.setText("HSV");
            TextField4.setText(String.format("%.1f", hsv[0]));
            TextField5.setText(String.format("%.3f", hsv[1]));
            TextField6.setText(String.format("%.3f", hsv[2]));
        } else if(val.equals("HSV")) {
            double hue = Double.parseDouble(TextField0.getText());
            double saturation = Double.parseDouble(TextField1.getText());
            double value = Double.parseDouble(TextField2.getText());

            double[] rgb = ColorConverter.toRGB(hue, saturation, value);
                
            TextField3.setText("RGB");
            TextField4.setText(String.format("%.0f", rgb[0]));
            TextField5.setText(String.format("%.0f", rgb[1]));
            TextField6.setText(String.format("%.0f", rgb[2]));
        }
    }
    
    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.exit(0);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WidgetInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WidgetInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WidgetInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WidgetInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WidgetInterface().setVisible(true);
            }
        });
    }
}
