import java.math.BigInteger;

/**
 *
 * @author Mahtab Davoudi 
 * Universal ElGamal Re-Encryption
 */
public class ElGamalUniversallReEncryption extends javax.swing.JFrame {

    private final static BigInteger one= new BigInteger("1");
	private BigInteger p=new BigInteger("65537");
	private BigInteger g=new BigInteger("3");
	private BigInteger x; 
	private BigInteger y; 
	private BigInteger m; 
	private BigInteger mOne; 

	private BigInteger r1;
	private BigInteger X;
	private BigInteger W;
	private BigInteger Z;
	private BigInteger Y;

	private BigInteger X1;
	private BigInteger W1;
	private BigInteger Z1;
	private BigInteger Y1;

	private BigInteger c2;

	private BigInteger w1;
	private BigInteger w2;

	private BigInteger r2;
	private BigInteger c11;
	private BigInteger c22;

	private BigInteger decreptedMessage;
	private BigInteger decreptedMessageOne;
	private BigInteger k;
	private BigInteger k1;


    public ElGamalUniversallReEncryption() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        xTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        yTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        yComButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        c1TextField = new javax.swing.JTextField();
        c1ComButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        c2ComButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        c2TextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        r2TextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        c11Button = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        c11TextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        c21Button = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        c22TextField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        m1Button = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        mdecTextField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        ComButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        w2TextField = new javax.swing.JTextField();
        w1TextField = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        newXTextField = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        newYTextField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        newWTextField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        newZTextField = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        mDecTextField = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        mONETextField = new javax.swing.JTextField();
        XButton2 = new javax.swing.JButton();
        YButton2 = new javax.swing.JButton();
        WButton2 = new javax.swing.JButton();
        ZButton2 = new javax.swing.JButton();
        mdecButton2 = new javax.swing.JButton();
        mONEButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Universal ElGamal Re-Encryption");

        jLabel2.setText("0. Given a large prime p=65537, a primitive root g=3");

        jLabel3.setText("1. Choose a private key x");

        jLabel4.setText("x=");

        xTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("<html>2. Compute public key y=g<sup>x</sup></html>");

        jLabel6.setText("y=");

        yTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("3. Input a message m");

        jLabel8.setText("m=");

        mTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTextFieldActionPerformed(evt);
            }
        });

        jLabel9.setText("4. Choose a random number r1");

        rTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rTextFieldActionPerformed(evt);
            }
        });

        jLabel10.setText("r1=");

        yComButton.setText("Com");
        yComButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yComButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("<html>4.1. X=g<sup>r1</sup> mod p</html>");

        jLabel12.setText("X=");

        c1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1TextFieldActionPerformed(evt);
            }
        });

        c1ComButton.setText("Com");
        c1ComButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ComButtonActionPerformed(evt);
            }
        });

        jLabel13.setText("<html>4.2. Y=m*y<sup>r</sup> mod p</html>");

        c2ComButton.setText("Com");
        c2ComButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ComButtonActionPerformed(evt);
            }
        });

        jLabel14.setText("Y=");

        c2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2TextFieldActionPerformed(evt);
            }
        });

        jLabel15.setText("5. Choose another random number r2");

        jLabel16.setText("r2=");

        r2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2TextFieldActionPerformed(evt);
            }
        });

        jLabel17.setText("<html>5.1. W=g<sup>r2</sup>mod p</html>");

        c11Button.setText("Com");
        c11Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c11ButtonActionPerformed(evt);
            }
        });

        jLabel18.setText("W=");

        c11TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c11TextFieldActionPerformed(evt);
            }
        });

        jLabel19.setText("<html>5.2. Z=1*y<sup>r2</sup> mod p</html>");

        c21Button.setText("Com");
        c21Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c21ButtonActionPerformed(evt);
            }
        });

        jLabel20.setText("Z=");

        c22TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c22TextFieldActionPerformed(evt);
            }
        });

        jLabel21.setText("<html>6.1. m=Y/(X)<sup>x</sup></html>");

        m1Button.setText("Com");
        m1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m1ButtonActionPerformed(evt);
            }
        });

        jLabel22.setText("m=");

        mdecTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdecTextFieldActionPerformed(evt);
            }
        });

        jLabel23.setText("<html>6.2. 1=Z/(W)<sup>x</sup></html>");

        ComButton1.setText("Com");
        ComButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel24.setText("m1=");

        jLabel25.setText("7. Re-encryption");

        jLabel26.setText("7.1. Choose two random numbers w1, w2");

        jLabel27.setText("w1=");

        jLabel28.setText("w2=");

        w2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w2TextFieldActionPerformed(evt);
            }
        });

        w1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w1TextFieldActionPerformed(evt);
            }
        });

        jLabel29.setText("<html>8. X'=X*W<sup>w1</sup> mod p</html>");

        jLabel30.setText("X'=");

        newXTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newXTextFieldActionPerformed(evt);
            }
        });

        jLabel31.setText("<html>9. Y'= Y*Z<sup>w1</sup> mod p</html>");

        jLabel32.setText("Y'=");

        newYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newYTextFieldActionPerformed(evt);
            }
        });

        jLabel33.setText("<html>10. W'= W<sup>w2</sup> mod p</html>");

        jLabel34.setText("W'=");

        newWTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newWTextFieldActionPerformed(evt);
            }
        });

        jLabel35.setText("<html>11. Z'= Z<sup>w2</sup> mod p</html>");

        jLabel36.setText("Z'=");

        newZTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newZTextFieldActionPerformed(evt);
            }
        });

        jLabel37.setText("<html>12. m= Y'/(X')<sup>x</sup> mod p</html>");

        jLabel38.setText("m=");

        mDecTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDecTextFieldActionPerformed(evt);
            }
        });

        jLabel39.setText("<html>13. 1= Z'/(W')<sup>x</sup> mod p</html>");

        jLabel40.setText("m1=");

        mONETextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mONETextFieldActionPerformed(evt);
            }
        });

        XButton2.setText("Com");
        XButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XButton2ActionPerformed(evt);
            }
        });

        YButton2.setText("Com");
        YButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YButton2ActionPerformed(evt);
            }
        });

        WButton2.setText("Com");
        WButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WButton2ActionPerformed(evt);
            }
        });

        ZButton2.setText("Com");
        ZButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZButton2ActionPerformed(evt);
            }
        });

        mdecButton2.setText("Com");
        mdecButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdecButton2ActionPerformed(evt);
            }
        });

        mONEButton2.setText("Com");
        mONEButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mONEButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(50, 50, 50)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c1ComButton)
                                    .addComponent(c2ComButton)
                                    .addComponent(c11Button)
                                    .addComponent(c21Button)
                                    .addComponent(m1Button))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(64, 64, 64)
                                    .addComponent(jLabel4)
                                    .addGap(29, 29, 29)
                                    .addComponent(xTextField))
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(yComButton)
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel6)
                                    .addGap(35, 35, 35)
                                    .addComponent(yTextField))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(ComButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel24))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel16))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel27))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel12)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(mTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel18)
                                                .addComponent(jLabel20)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel31)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel35)
                                                        .addComponent(jLabel33)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(1, 1, 1)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel39)
                                                        .addComponent(jLabel37))))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(mdecButton2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel38))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(YButton2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel32))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(XButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(36, 36, 36)
                                                    .addComponent(jLabel30))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(WButton2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel34))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(ZButton2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel36))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(mONEButton2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel40)))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1)
                                        .addComponent(c1TextField)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(c2TextField)
                                        .addComponent(r2TextField)
                                        .addComponent(c11TextField)
                                        .addComponent(c22TextField)
                                        .addComponent(mdecTextField)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(w1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel28)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(w2TextField))
                                        .addComponent(newXTextField)
                                        .addComponent(newYTextField)
                                        .addComponent(newWTextField)
                                        .addComponent(newZTextField)
                                        .addComponent(mDecTextField)
                                        .addComponent(mONETextField))))
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 20, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(xTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(yTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yComButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(mTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(rTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(c1ComButton)
                    .addComponent(jLabel12)
                    .addComponent(c1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(c2ComButton)
                    .addComponent(jLabel14)
                    .addComponent(c2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(r2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(c11Button)
                    .addComponent(jLabel18)
                    .addComponent(c11TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(c21Button)
                            .addComponent(jLabel20)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c22TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(m1Button)
                    .addComponent(jLabel22)
                    .addComponent(mdecTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(ComButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel26))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28)
                        .addComponent(w2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(w1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(newXTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(XButton2)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(YButton2)
                    .addComponent(jLabel32)
                    .addComponent(newYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(WButton2)
                    .addComponent(jLabel34)
                    .addComponent(newWTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(ZButton2)
                    .addComponent(jLabel36)
                    .addComponent(newZTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(mdecButton2)
                    .addComponent(jLabel38)
                    .addComponent(mDecTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mONEButton2)
                        .addComponent(jLabel40)
                        .addComponent(mONETextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(194, 194, 194))
        );

        pack();
    }

    private void xTextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void yComButtonActionPerformed(java.awt.event.ActionEvent evt) {
	try{
		x=new BigInteger(xTextField.getText());
	}
	catch(NumberFormatException e){
		xTextField.setText("Enter a private key.");
		return;
	}
	y=g.modPow(x, p);
        yTextField.setText(""+y);
    }

    private void c11ButtonActionPerformed(java.awt.event.ActionEvent evt) {
	try{
		r2=new BigInteger(r2TextField.getText());
	}
	catch(NumberFormatException e){
		r2TextField.setText("Enter a random number.");
		return;
	}
	W=g.modPow(r2,p);
	c11TextField.setText(""+W);
    }

    private void c21ButtonActionPerformed(java.awt.event.ActionEvent evt) {
	Z=one.multiply(y.modPow(r2,p)).mod(p);
	c22TextField.setText(""+Z);
    }

    private void m1ButtonActionPerformed(java.awt.event.ActionEvent evt) {
	mdecTextField.setText(""+Y.multiply((X.modPow(x,p)).modInverse(p)).mod(p));
    }

    private void c1ComButtonActionPerformed(java.awt.event.ActionEvent evt) {
	try{
		r1= new BigInteger(rTextField.getText());
	}
	catch(NumberFormatException e){
		rTextField.setText("Enter a random number.");
		return;
	}
	X=g.modPow(r1, p);
	c1TextField.setText(""+X);
    }

    private void c2ComButtonActionPerformed(java.awt.event.ActionEvent evt) {
	try{
		m=new BigInteger(mTextField.getText());
	}
	catch(NumberFormatException e){
		mTextField.setText("Enter a message.");
		return;
	}
	Y=m.multiply(y.modPow(r1,p)).mod(p);
	c2TextField.setText(""+Y);
	
    }

    private void yTextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void mTextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void rTextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void c1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void c2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void r2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void c11TextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void mdecTextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void ComButton1ActionPerformed(java.awt.event.ActionEvent evt) {
	jTextField1.setText(""+Z.multiply((W.modPow(x,p)).modInverse(p)).mod(p));
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {}

    private void w2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void w1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void newXTextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void newYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void newWTextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void mONETextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void mDecTextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void newZTextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void c22TextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void YButton2ActionPerformed(java.awt.event.ActionEvent evt) {
	Y1=Y.multiply(Z.modPow(w1,p)).mod(p);
	newYTextField.setText(""+Y1);
    }

    private void WButton2ActionPerformed(java.awt.event.ActionEvent evt) {
	try{
		w2=new BigInteger(w2TextField.getText());
	}
	catch(NumberFormatException e){
		w2TextField.setText("Enter a random number.");
		return;
	}
	W1=W.modPow(w2,p);
	newWTextField.setText(""+W1);
    }

    private void ZButton2ActionPerformed(java.awt.event.ActionEvent evt) {
	Z1=Z.modPow(w2,p);
	newZTextField.setText(""+Z1);
    }

    private void mdecButton2ActionPerformed(java.awt.event.ActionEvent evt) {
	decreptedMessage=(Y1.multiply((X1.modPow(x,p)).modInverse(p))).mod(p);
	mDecTextField.setText(""+decreptedMessage);
    }

    private void mONEButton2ActionPerformed(java.awt.event.ActionEvent evt) {
	decreptedMessageOne=(Z1.multiply((W1.modPow(x,p)).modInverse(p))).mod(p);
	mONETextField.setText(""+decreptedMessageOne);
    }

    private void XButton2ActionPerformed(java.awt.event.ActionEvent evt) {
	try{
		w1=new BigInteger(w1TextField.getText());
	}
	catch(NumberFormatException e){
		w1TextField.setText("Enter a random number.");
		return;
	}
	X1=X.multiply(W.modPow(w1,p)).mod(p);
	newXTextField.setText(""+X1);
	
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
            java.util.logging.Logger.getLogger(ElGamalUniversallReEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElGamalUniversallReEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElGamalUniversallReEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElGamalUniversallReEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElGamalUniversallReEncryption().setVisible(true);
            }
        });
    }


    private javax.swing.JButton ComButton1;
    private javax.swing.JButton WButton2;
    private javax.swing.JButton XButton2;
    private javax.swing.JButton YButton2;
    private javax.swing.JButton ZButton2;
    private javax.swing.JButton c11Button;
    private javax.swing.JTextField c11TextField;
    private javax.swing.JButton c1ComButton;
    private javax.swing.JTextField c1TextField;
    private javax.swing.JButton c21Button;
    private javax.swing.JTextField c22TextField;
    private javax.swing.JButton c2ComButton;
    private javax.swing.JTextField c2TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton m1Button;
    private javax.swing.JTextField mDecTextField;
    private javax.swing.JButton mONEButton2;
    private javax.swing.JTextField mONETextField;
    private javax.swing.JTextField mTextField;
    private javax.swing.JButton mdecButton2;
    private javax.swing.JTextField mdecTextField;
    private javax.swing.JTextField newWTextField;
    private javax.swing.JTextField newXTextField;
    private javax.swing.JTextField newYTextField;
    private javax.swing.JTextField newZTextField;
    private javax.swing.JTextField r2TextField;
    private javax.swing.JTextField rTextField;
    private javax.swing.JTextField w1TextField;
    private javax.swing.JTextField w2TextField;
    private javax.swing.JTextField xTextField;
    private javax.swing.JButton yComButton;
    private javax.swing.JTextField yTextField;

}

