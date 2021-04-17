import java.awt.Color;
import java.awt.Font;

public class Calculation extends javax.swing.JFrame {

    private double x;
    private double y;
    private boolean isDotUsed = false;
    private String value = "";
    private String choice = "";

    public Calculation() {
        initComponents();
    }

    public void enable() {
        on.setEnabled(false);  // ON BUtton Disable
        off.setEnabled(true);  // OFF Button Enable

        display.setEnabled(true);
        display.setText("");
        btn0.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);

        btn_back.setEnabled(true);
        btn_equal.setEnabled(true);
        btn_pos.setEnabled(true);
        btn_neg.setEnabled(true);
        btn_mul.setEnabled(true);
        btn_div.setEnabled(true);
        btn_mod.setEnabled(true);
        btn_ac.setEnabled(true);
        btn_sign.setEnabled(true);
        btn_dot.setEnabled(true);
    }

    public void disable() {
        on.setEnabled(true);    // ON Button
        off.setEnabled(false);  // OFF Button

        display.setEnabled(false);
        display.setText("");
        
        x=0;
        y=0;
        value = "";
        choice = "";

        btn0.setEnabled(false);
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);

        btn_back.setEnabled(false);
        btn_equal.setEnabled(false);
        btn_pos.setEnabled(false);
        btn_neg.setEnabled(false);
        btn_mul.setEnabled(false);
        btn_div.setEnabled(false);
        btn_mod.setEnabled(false);
        btn_ac.setEnabled(false);
        btn_sign.setEnabled(false);
        btn_dot.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        btn_sign = new javax.swing.JLabel();
        btn0 = new javax.swing.JLabel();
        btn_dot = new javax.swing.JLabel();
        btn_equal = new javax.swing.JLabel();
        btn_pos = new javax.swing.JLabel();
        btn3 = new javax.swing.JLabel();
        btn1 = new javax.swing.JLabel();
        btn2 = new javax.swing.JLabel();
        btn_neg = new javax.swing.JLabel();
        btn6 = new javax.swing.JLabel();
        btn4 = new javax.swing.JLabel();
        btn5 = new javax.swing.JLabel();
        btn_mul = new javax.swing.JLabel();
        btn9 = new javax.swing.JLabel();
        btn7 = new javax.swing.JLabel();
        btn8 = new javax.swing.JLabel();
        btn_div = new javax.swing.JLabel();
        btn_mod = new javax.swing.JLabel();
        btn_ac = new javax.swing.JLabel();
        btn_back = new javax.swing.JLabel();
        on = new javax.swing.JLabel();
        off = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        display.setEditable(false);
        display.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        btn_sign.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_sign.setForeground(new java.awt.Color(255, 153, 51));
        btn_sign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_sign.setText("+/-");
        btn_sign.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_sign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_signMouseClicked(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn0MouseClicked(evt);
            }
        });

        btn_dot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_dot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_dot.setText(".");
        btn_dot.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_dot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dotMouseClicked(evt);
            }
        });

        btn_equal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_equal.setForeground(new java.awt.Color(255, 153, 0));
        btn_equal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_equal.setText("=");
        btn_equal.setAlignmentY(0.0F);
        btn_equal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_equal.setFocusable(false);
        btn_equal.setIconTextGap(0);
        btn_equal.setMaximumSize(new java.awt.Dimension(80, 80));
        btn_equal.setMinimumSize(new java.awt.Dimension(80, 80));
        btn_equal.setOpaque(true);
        btn_equal.setPreferredSize(new java.awt.Dimension(80, 80));
        btn_equal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_equalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_equalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_equalMouseExited(evt);
            }
        });

        btn_pos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_pos.setForeground(new java.awt.Color(255, 153, 51));
        btn_pos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_pos.setText("+");
        btn_pos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_pos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_posMouseClicked(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });

        btn_neg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_neg.setForeground(new java.awt.Color(255, 153, 51));
        btn_neg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_neg.setText("-");
        btn_neg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_neg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_negMouseClicked(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });

        btn_mul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_mul.setForeground(new java.awt.Color(255, 153, 51));
        btn_mul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_mul.setText("*");
        btn_mul.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_mul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_mulMouseClicked(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn9MouseClicked(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn7MouseClicked(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn8MouseClicked(evt);
            }
        });

        btn_div.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_div.setForeground(new java.awt.Color(255, 153, 51));
        btn_div.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_div.setText("/");
        btn_div.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_div.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_divMouseClicked(evt);
            }
        });

        btn_mod.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_mod.setForeground(new java.awt.Color(255, 153, 51));
        btn_mod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_mod.setText("%");
        btn_mod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_mod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modMouseClicked(evt);
            }
        });

        btn_ac.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_ac.setForeground(new java.awt.Color(255, 51, 51));
        btn_ac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_ac.setText("AC");
        btn_ac.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_acMouseClicked(evt);
            }
        });

        btn_back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 153, 51));
        btn_back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_back.setText("<--");
        btn_back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });

        on.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        on.setText("ON");
        on.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        on.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onMouseClicked(evt);
            }
        });

        off.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        off.setText("OFF");
        off.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        off.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                offMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALCULATOR");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(btn_pos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_sign, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(btn_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(btn_equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_neg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_mul, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_ac, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_div, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(on, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(off, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(on, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(off, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ac, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_div, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mul, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_neg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sign, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_equal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        if (btn1.isEnabled() == true) {
            value += "1";
            display.setText(value);
        }
    }//GEN-LAST:event_btn1MouseClicked

    private void onMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onMouseClicked
        enable();
    }//GEN-LAST:event_onMouseClicked

    private void offMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offMouseClicked
        disable();
    }//GEN-LAST:event_offMouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        if (btn1.isEnabled() == true) {
            value += "2";
            display.setText(value);
        }
    }//GEN-LAST:event_btn2MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        if (btn1.isEnabled() == true) {
            value += "3";
            display.setText(value);
        }
    }//GEN-LAST:event_btn3MouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        if (btn1.isEnabled() == true) {
            value += "4";
            display.setText(value);
        }
    }//GEN-LAST:event_btn4MouseClicked

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked
        if (btn1.isEnabled() == true) {
            value += "5";
            display.setText(value);
        }
    }//GEN-LAST:event_btn5MouseClicked

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseClicked
        if (btn1.isEnabled() == true) {
            value += "6";
            display.setText(value);
        }
    }//GEN-LAST:event_btn6MouseClicked

    private void btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseClicked
        if (btn1.isEnabled() == true) {
            value += "7";
            display.setText(value);
        }
    }//GEN-LAST:event_btn7MouseClicked

    private void btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseClicked
        if (btn1.isEnabled() == true) {
            value += "8";
            display.setText(value);
        }
    }//GEN-LAST:event_btn8MouseClicked

    private void btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseClicked
        if (btn1.isEnabled() == true) {
            value += "9";
            display.setText(value);
        }
    }//GEN-LAST:event_btn9MouseClicked

    private void btn0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0MouseClicked
        if (btn1.isEnabled() == true) {
            value += "0";
            display.setText(value);
        }
    }//GEN-LAST:event_btn0MouseClicked

    private void btn_dotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dotMouseClicked
        if (btn1.isEnabled() == true) {
            if (isDotUsed == false) {
                value += ".";
                display.setText(value);
                isDotUsed = true;
            }
        }
    }//GEN-LAST:event_btn_dotMouseClicked

    private void btn_signMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signMouseClicked
        if (btn1.isEnabled() == true) {
            if (display.getText().equals("")) {
                choice = "-";
                value = "-";
                display.setText(choice);

            }
        }
    }//GEN-LAST:event_btn_signMouseClicked

    private void btn_equalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_equalMouseClicked
        if (x != 0.0) {
            if (!choice.equals("")) {
                y = Double.parseDouble(value);
                double result = 0;
                switch (choice) {
                    case "+":
                        result = x + y;
                        display.setText(String.valueOf(result));
                        choice = "";
                        value = "";
                        isDotUsed = false;
                        break;
                    case "-":
                        result = x - y;
                        display.setText(String.valueOf(result));
                        choice = "";
                        value = "";
                        isDotUsed = false;
                        break;
                    case "*":
                        result = x * y;
                        display.setText(String.valueOf(result));
                        choice = "";
                        value = "";
                        isDotUsed = false;
                        break;
                    case "/":
                        try {
                            result = x / y;
                            if (String.valueOf(result).equalsIgnoreCase("infinity")) {
                                throw new ArithmeticException();
                            }
                            display.setText(String.valueOf(result));
                            choice = "";
                            value = "";
                            isDotUsed = false;
                        } catch (ArithmeticException e) {
                            display.setText("Can not divide by zero");
                            choice = "";
                            value = "";
                            isDotUsed = false;
                        }
                        break;
                    case "%":
                        result = x % y;
                        display.setText(String.valueOf((int) result));
                        choice = "";
                        value = "";
                        isDotUsed = false;
                        break;
                }
            }
        }
    }//GEN-LAST:event_btn_equalMouseClicked

    private void btn_posMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_posMouseClicked
        if (!(display.getText().equals("") || display.getText().equals(choice) || value.equals(""))) {
            x = Double.parseDouble(value);
            choice = "+";
            value = "";
            display.setText(choice);
            isDotUsed = false;
        }
    }//GEN-LAST:event_btn_posMouseClicked

    private void btn_negMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_negMouseClicked
        if (btn1.isEnabled() == true) {
            if (display.getText().equals("")) {
                choice = "-";
                value = "-";
                display.setText(choice);
            } else if (!(display.getText().equals("") || display.getText().equals(choice) || value.equals(""))) {
                x = Double.parseDouble(value);
                choice = "-";
                value = "";
                display.setText(choice);
                isDotUsed = false;
            }
        }
    }//GEN-LAST:event_btn_negMouseClicked

    private void btn_mulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_mulMouseClicked
        if (!(display.getText().equals("") || display.getText().equals(choice) || value.equals(""))) {
            x = Double.parseDouble(value);
            choice = "*";
            value = "";
            display.setText(choice);
            isDotUsed = false;
        }
    }//GEN-LAST:event_btn_mulMouseClicked

    private void btn_divMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_divMouseClicked
        if (!(display.getText().equals("") || display.getText().equals(choice) || value.equals(""))) {
            x = Double.parseDouble(value);
            choice = "/";
            value = "";
            display.setText(choice);
            isDotUsed = false;
        }
    }//GEN-LAST:event_btn_divMouseClicked

    private void btn_modMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modMouseClicked
        if (!(display.getText().equals("") || display.getText().equals(choice) || value.equals(""))) {
            x = Double.parseDouble(value);
            choice = "%";
            value = "";
            display.setText(choice);
            isDotUsed = false;
        }
    }//GEN-LAST:event_btn_modMouseClicked

    private void btn_acMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_acMouseClicked
        choice = "";
        value = "";
        x = 0;
        y = 0;
        isDotUsed = false;
        display.setText(value);
    }//GEN-LAST:event_btn_acMouseClicked

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked

        int length = display.getText().trim().length();
        int number = display.getText().trim().length() - 1;
        String store;
        if (length > 0) {
            StringBuilder back = new StringBuilder(display.getText().trim());
            back.deleteCharAt(number);
            store = back.toString();
            value = store;
            display.setText(store);
        }
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_equalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_equalMouseEntered
        if (btn_equal.isEnabled() == true) {
            btn_equal.setBackground(Color.red);
            btn_equal.setForeground(Color.black);
            //btn_equal.setFont(new Font(btn_equal.getFont().getName(),Font.BOLD,38));
        }

    }//GEN-LAST:event_btn_equalMouseEntered

    private void btn_equalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_equalMouseExited
        if (btn_equal.isEnabled() == true) {
            btn_equal.setBackground(new Color(204, 204, 204));
            btn_equal.setForeground(new Color(255, 153, 0));

        }
    }//GEN-LAST:event_btn_equalMouseExited

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
            java.util.logging.Logger.getLogger(Calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn0;
    private javax.swing.JLabel btn1;
    private javax.swing.JLabel btn2;
    private javax.swing.JLabel btn3;
    private javax.swing.JLabel btn4;
    private javax.swing.JLabel btn5;
    private javax.swing.JLabel btn6;
    private javax.swing.JLabel btn7;
    private javax.swing.JLabel btn8;
    private javax.swing.JLabel btn9;
    private javax.swing.JLabel btn_ac;
    private javax.swing.JLabel btn_back;
    private javax.swing.JLabel btn_div;
    private javax.swing.JLabel btn_dot;
    private javax.swing.JLabel btn_equal;
    private javax.swing.JLabel btn_mod;
    private javax.swing.JLabel btn_mul;
    private javax.swing.JLabel btn_neg;
    private javax.swing.JLabel btn_pos;
    private javax.swing.JLabel btn_sign;
    private javax.swing.JTextField display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel off;
    private javax.swing.JLabel on;
    // End of variables declaration//GEN-END:variables
}
