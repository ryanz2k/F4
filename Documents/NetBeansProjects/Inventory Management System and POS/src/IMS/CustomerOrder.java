/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IMS;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raidi
 */
public class CustomerOrder extends javax.swing.JFrame {

    
    /**
     * Creates new form CustomerOrder
     */
    public CustomerOrder() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        backtoprofile = new javax.swing.JButton();
        CabernetSauvignonWine = new javax.swing.JButton();
        Schwarzbier = new javax.swing.JButton();
        ChardonnayWine = new javax.swing.JButton();
        OldTomGin = new javax.swing.JButton();
        BourbonWhisky = new javax.swing.JButton();
        PlymouthGin = new javax.swing.JButton();
        DistilledSoju = new javax.swing.JButton();
        FruitVodka = new javax.swing.JButton();
        PlainVodka = new javax.swing.JButton();
        NavyRum = new javax.swing.JButton();
        StoutBeer = new javax.swing.JButton();
        SweetCider = new javax.swing.JButton();
        RhumAgricole = new javax.swing.JButton();
        ScotchWhisky = new javax.swing.JButton();
        BitterCider = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        drinkproduct = new javax.swing.JTextField();
        addtocart = new javax.swing.JButton();
        drinkprice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        drinkquantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        drinktotal = new javax.swing.JTextField();
        totalbutton = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Shop");

        backtoprofile.setText("Back to Profile");
        backtoprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtoprofileActionPerformed(evt);
            }
        });

        CabernetSauvignonWine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/Cabernet Sauvignon Wine.jpg"))); // NOI18N
        CabernetSauvignonWine.setText("Cabernet Sauvignon Wine");
        CabernetSauvignonWine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CabernetSauvignonWine.setMargin(new java.awt.Insets(14, 14, 14, 14));
        CabernetSauvignonWine.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        CabernetSauvignonWine.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CabernetSauvignonWine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CabernetSauvignonWineActionPerformed(evt);
            }
        });

        Schwarzbier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/Schwarzbier.jpg"))); // NOI18N
        Schwarzbier.setText("Schwarzbier");
        Schwarzbier.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Schwarzbier.setMargin(new java.awt.Insets(14, 14, 14, 14));
        Schwarzbier.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Schwarzbier.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Schwarzbier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchwarzbierActionPerformed(evt);
            }
        });

        ChardonnayWine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/ChardonnayWine.jpg"))); // NOI18N
        ChardonnayWine.setText("Chardonnay Wine");
        ChardonnayWine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ChardonnayWine.setMargin(new java.awt.Insets(14, 14, 14, 14));
        ChardonnayWine.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ChardonnayWine.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ChardonnayWine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChardonnayWineActionPerformed(evt);
            }
        });

        OldTomGin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/Old Tom Gin.jpg"))); // NOI18N
        OldTomGin.setText("Old Tom Gin");
        OldTomGin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OldTomGin.setMargin(new java.awt.Insets(14, 14, 14, 14));
        OldTomGin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        OldTomGin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        OldTomGin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OldTomGinActionPerformed(evt);
            }
        });

        BourbonWhisky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/Bourbon Whisky.jpg"))); // NOI18N
        BourbonWhisky.setText("Bourbon Whisky");
        BourbonWhisky.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BourbonWhisky.setMargin(new java.awt.Insets(14, 14, 14, 14));
        BourbonWhisky.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BourbonWhisky.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BourbonWhisky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BourbonWhiskyActionPerformed(evt);
            }
        });

        PlymouthGin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/Plymouth Gin.jpg"))); // NOI18N
        PlymouthGin.setText("Plymouth Gin");
        PlymouthGin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PlymouthGin.setMargin(new java.awt.Insets(14, 14, 14, 14));
        PlymouthGin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PlymouthGin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PlymouthGin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlymouthGinActionPerformed(evt);
            }
        });

        DistilledSoju.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/Distilled Soju.jpg"))); // NOI18N
        DistilledSoju.setText("Distilled Soju");
        DistilledSoju.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DistilledSoju.setMargin(new java.awt.Insets(14, 14, 14, 14));
        DistilledSoju.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        DistilledSoju.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DistilledSoju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistilledSojuActionPerformed(evt);
            }
        });

        FruitVodka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/Fruit Vodka.jpg"))); // NOI18N
        FruitVodka.setText("Fruit Vodka");
        FruitVodka.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FruitVodka.setMargin(new java.awt.Insets(14, 14, 14, 14));
        FruitVodka.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        FruitVodka.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FruitVodka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FruitVodkaActionPerformed(evt);
            }
        });

        PlainVodka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/Plain Vodka.jpg"))); // NOI18N
        PlainVodka.setText("Plain Vodka");
        PlainVodka.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PlainVodka.setMargin(new java.awt.Insets(14, 14, 14, 14));
        PlainVodka.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        PlainVodka.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PlainVodka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlainVodkaActionPerformed(evt);
            }
        });

        NavyRum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/Navy Rum.jpeg"))); // NOI18N
        NavyRum.setText("Navy Rum");
        NavyRum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NavyRum.setMargin(new java.awt.Insets(14, 14, 14, 14));
        NavyRum.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        NavyRum.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        NavyRum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NavyRumActionPerformed(evt);
            }
        });

        StoutBeer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/Stout Beer.jpg"))); // NOI18N
        StoutBeer.setText("Stout Beer");
        StoutBeer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        StoutBeer.setMargin(new java.awt.Insets(14, 14, 14, 14));
        StoutBeer.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        StoutBeer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        StoutBeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StoutBeerActionPerformed(evt);
            }
        });

        SweetCider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/Sweet Cider.jpg"))); // NOI18N
        SweetCider.setText("Sweet Cider");
        SweetCider.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SweetCider.setMargin(new java.awt.Insets(14, 14, 14, 14));
        SweetCider.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        SweetCider.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SweetCider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SweetCiderActionPerformed(evt);
            }
        });

        RhumAgricole.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/Rhum AgricoleRhum Agricole.jpg"))); // NOI18N
        RhumAgricole.setText("Rhum Agricole");
        RhumAgricole.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RhumAgricole.setMargin(new java.awt.Insets(14, 14, 14, 14));
        RhumAgricole.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        RhumAgricole.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        RhumAgricole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RhumAgricoleActionPerformed(evt);
            }
        });

        ScotchWhisky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/Scotch Whisky.jpg"))); // NOI18N
        ScotchWhisky.setText("Scotch Whisky");
        ScotchWhisky.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ScotchWhisky.setMargin(new java.awt.Insets(14, 14, 14, 14));
        ScotchWhisky.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ScotchWhisky.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ScotchWhisky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScotchWhiskyActionPerformed(evt);
            }
        });

        BitterCider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/Bitter Cider.jpg"))); // NOI18N
        BitterCider.setText("Bitter Cider");
        BitterCider.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BitterCider.setMargin(new java.awt.Insets(14, 14, 14, 14));
        BitterCider.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BitterCider.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BitterCider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BitterCiderActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Quantity:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Price:");

        drinkproduct.setEditable(false);
        drinkproduct.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        addtocart.setText("Add to Cart");
        addtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtocartActionPerformed(evt);
            }
        });

        drinkprice.setEditable(false);
        drinkprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Product:");

        drinkquantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total:");

        drinktotal.setEditable(false);
        drinktotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        totalbutton.setText("Total");
        totalbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backtoprofile))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Schwarzbier, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ChardonnayWine, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CabernetSauvignonWine, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BourbonWhisky, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PlymouthGin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(OldTomGin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FruitVodka, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PlainVodka, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DistilledSoju, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StoutBeer, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SweetCider, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NavyRum, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ScotchWhisky, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BitterCider, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RhumAgricole, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3))))
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(totalbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addtocart)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(drinkquantity, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(drinkproduct, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(drinkprice, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(drinktotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Schwarzbier, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ChardonnayWine, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CabernetSauvignonWine, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BourbonWhisky, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PlymouthGin, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(OldTomGin, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(FruitVodka, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PlainVodka, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DistilledSoju, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(StoutBeer, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(SweetCider, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(NavyRum, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ScotchWhisky, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BitterCider, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RhumAgricole, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(drinkproduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(drinkquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(drinkprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(drinktotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addtocart)
                    .addComponent(totalbutton))
                .addGap(53, 53, 53)
                .addComponent(backtoprofile)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Back to Profile Button
    private void backtoprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtoprofileActionPerformed
        // TODO add your handling code here:
        dispose();
        CustomerProfile back = new CustomerProfile();
        back.setVisible(true);
    }//GEN-LAST:event_backtoprofileActionPerformed

    // All the Liqour that the Store Selling
    private void CabernetSauvignonWineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CabernetSauvignonWineActionPerformed
        // TODO add your handling code here:
        drinkproduct.setText("Cabernet Sauvignon Wine");
        drinkquantity.setText("1");
        drinkprice.setText("");
    }//GEN-LAST:event_CabernetSauvignonWineActionPerformed

    private void OldTomGinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OldTomGinActionPerformed
        // TODO add your handling code here:
        drinkproduct.setText(" Old Tom Gin");
        drinkquantity.setText("1");
        drinkprice.setText("");
    }//GEN-LAST:event_OldTomGinActionPerformed

    private void DistilledSojuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistilledSojuActionPerformed
        // TODO add your handling code here:
        drinkproduct.setText("Distilled Soju");
        drinkquantity.setText("1");
        drinkprice.setText("");
    }//GEN-LAST:event_DistilledSojuActionPerformed

    private void NavyRumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NavyRumActionPerformed
        // TODO add your handling code here:
        drinkproduct.setText("Navy Rum");
        drinkquantity.setText("1");
        drinkprice.setText("");
    }//GEN-LAST:event_NavyRumActionPerformed

    private void StoutBeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StoutBeerActionPerformed
        // TODO add your handling code here:
        drinkproduct.setText("Stout Beer");
        drinkquantity.setText("1");
        drinkprice.setText("");
    }//GEN-LAST:event_StoutBeerActionPerformed

    private void SweetCiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SweetCiderActionPerformed
        // TODO add your handling code here:
        drinkproduct.setText("Sweet Cider");
        drinkquantity.setText("1");
        drinkprice.setText("");
    }//GEN-LAST:event_SweetCiderActionPerformed

    private void RhumAgricoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RhumAgricoleActionPerformed
        // TODO add your handling code here:
        drinkproduct.setText("Rhum Agricole");
        drinkquantity.setText("1");
        drinkprice.setText("");
    }//GEN-LAST:event_RhumAgricoleActionPerformed

    private void ScotchWhiskyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScotchWhiskyActionPerformed
        // TODO add your handling code here:
        drinkproduct.setText("Scotch Whisky");
        drinkquantity.setText("1");
        drinkprice.setText("");
    }//GEN-LAST:event_ScotchWhiskyActionPerformed

    private void BitterCiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BitterCiderActionPerformed
        // TODO add your handling code here:
        drinkproduct.setText("Bitter Cider");
        drinkquantity.setText("1");
        drinkprice.setText("");
    }//GEN-LAST:event_BitterCiderActionPerformed

    private void SchwarzbierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchwarzbierActionPerformed
        // TODO add your handling code here:
        drinkproduct.setText("Schwarzbier");
        drinkquantity.setText("1");
        drinkprice.setText("");
    }//GEN-LAST:event_SchwarzbierActionPerformed

    private void ChardonnayWineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChardonnayWineActionPerformed
        // TODO add your handling code here:
        drinkproduct.setText("Chardonnay Wine");
        drinkquantity.setText("28");
        drinkprice.setText("");
    }//GEN-LAST:event_ChardonnayWineActionPerformed

    private void BourbonWhiskyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BourbonWhiskyActionPerformed
        // TODO add your handling code here:
        drinkproduct.setText("Bourbon Whisky");
        drinkquantity.setText("1");
        drinkprice.setText("");
    }//GEN-LAST:event_BourbonWhiskyActionPerformed

    private void PlymouthGinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlymouthGinActionPerformed
        // TODO add your handling code here:
        drinkproduct.setText("Plymouth Gin");
        drinkquantity.setText("1");
        drinkprice.setText("");
    }//GEN-LAST:event_PlymouthGinActionPerformed

    private void FruitVodkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FruitVodkaActionPerformed
        // TODO add your handling code here:
        drinkproduct.setText("Fruit Vodka");
        drinkquantity.setText("1");
        drinkprice.setText("");
    }//GEN-LAST:event_FruitVodkaActionPerformed

    private void PlainVodkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlainVodkaActionPerformed
        // TODO add your handling code here:
        drinkproduct.setText("Plain Vodka");
        drinkquantity.setText("1");
        drinkprice.setText("10");
    }//GEN-LAST:event_PlainVodkaActionPerformed

    private void addtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtocartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addtocartActionPerformed

    private void totalbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalbuttonActionPerformed
        // TODO add your handling code here:
        int Qual = Integer.parseInt(drinkquantity.getText());
        int Price = Integer.parseInt(drinkprice.getText());
        int Total = Qual * Price;
        String TotalPrice = Integer.toString(Total);
        drinktotal.setText(TotalPrice);
    }//GEN-LAST:event_totalbuttonActionPerformed
    
    // ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ 
    
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
            java.util.logging.Logger.getLogger(CustomerOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BitterCider;
    private javax.swing.JButton BourbonWhisky;
    private javax.swing.JButton CabernetSauvignonWine;
    private javax.swing.JButton ChardonnayWine;
    private javax.swing.JButton DistilledSoju;
    private javax.swing.JButton FruitVodka;
    private javax.swing.JButton NavyRum;
    private javax.swing.JButton OldTomGin;
    private javax.swing.JButton PlainVodka;
    private javax.swing.JButton PlymouthGin;
    private javax.swing.JButton RhumAgricole;
    private javax.swing.JButton Schwarzbier;
    private javax.swing.JButton ScotchWhisky;
    private javax.swing.JButton StoutBeer;
    private javax.swing.JButton SweetCider;
    private javax.swing.JButton addtocart;
    private javax.swing.JButton backtoprofile;
    private javax.swing.JTextField drinkprice;
    private javax.swing.JTextField drinkproduct;
    private javax.swing.JTextField drinkquantity;
    private javax.swing.JTextField drinktotal;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton totalbutton;
    // End of variables declaration//GEN-END:variables
}
