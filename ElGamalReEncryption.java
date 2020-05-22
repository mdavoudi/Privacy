import java.math.BigInteger;

/**
 *
 * @author Mahtab Davoudi 
 * ElGamal Re-Encryption
 */
public class ElGamalReEncryption extends javax.swing.JFrame {

    
   	private final static BigInteger one= new BigInteger("1");
	private BigInteger p=new BigInteger("65537");
	private BigInteger g=new BigInteger("3");
	private BigInteger x; 
	private BigInteger y; 
	private BigInteger m; 
	
	private BigInteger r;
	private BigInteger c1;
	private BigInteger c2;

	private BigInteger r1;
	private BigInteger c11;
	private BigInteger c22;

	private BigInteger decreptedMessage;
	private BigInteger k;
	private BigInteger k1;
    
    public ElGamalReEncryption() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ElGamal Re-Encryption");

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

        jLabel9.setText("4. Choose a random number r");

        rTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rTextFieldActionPerformed(evt);
            }
        });

        jLabel10.setText("r=");

        yComButton.setText("Com");
        yComButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yComButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("<html>4.1. c1=g<sup>r</sup> mod p</html>");

        jLabel12.setText("c1=");

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

        jLabel13.setText("<html>4.2. c2=m*y<sup>r</sup> mod p</html>");

        c2ComButton.setText("Com");
        c2ComButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ComButtonActionPerformed(evt);
            }
        });

        jLabel14.setText("c2=");

        c2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2TextFieldActionPerformed(evt);
            }
        });

        jLabel15.setText("5. Choose another random number r'");

        jLabel16.setText("r'=");

        r2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2TextFieldActionPerformed(evt);
            }
        });

        jLabel17.setText("<html>5.1. c1'=c1*g<sup>r'</sup> mod p</html>");

        c11Button.setText("Com");
        c11Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c11ButtonActionPerformed(evt);
            }
        });

        jLabel18.setText("c1'=");

        c11TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c11TextFieldActionPerformed(evt);
            }
        });

        jLabel19.setText("<html>5.2. c2'=c2*y<sup>r'</sup> mod p</html>");

        c21Button.setText("Com");
        c21Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c21ButtonActionPerformed(evt);
            }
        });

        jLabel20.setText("c2'=");

        c22TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c22TextFieldActionPerformed(evt);
            }
        });

        jLabel21.setText("<html>6. m=c2'/(c1')<sup>x</sup> mod p</html>");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(334, 334, 334))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                            .addComponent(xTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 261, Short.MAX_VALUE)
                        .addComponent(yComButton)
                        .addGap(514, 514, 514))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(171, 171, 171)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel10)))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                                    .addComponent(rTextField)
                                    .addComponent(c1TextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(84, 84, 84))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(c2ComButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(c1ComButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(c11Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(c21Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(m1Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(81, 81, 81))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(168, 168, 168)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(196, 196, 196)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(221, 221, 221)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel18))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(c2TextField)
                                            .addComponent(r2TextField)
                                            .addComponent(c11TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel20))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(c22TextField)
                                            .addComponent(mdecTextField))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
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
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(c1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c1ComButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c2ComButton)
                        .addComponent(jLabel14)
                        .addComponent(c2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(r2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(c11Button)
                    .addComponent(jLabel18)
                    .addComponent(c11TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(c21Button)
                    .addComponent(jLabel20)
                    .addComponent(c22TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m1Button)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(mdecTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
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

   

    private void c1ComButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try{
		m=new BigInteger(mTextField.getText());
	}
	catch(NumberFormatException e){
		mTextField.setText("Enter a message.");
		return;
	}
	try{
		r=new BigInteger(rTextField.getText());
	}
	catch(NumberFormatException e){
		rTextField.setText("Enter a random number.");
		return;
	}
        c1=g.modPow(r, p);
	c1TextField.setText(""+c1);
    }

   private void c2ComButtonActionPerformed(java.awt.event.ActionEvent evt) {
         m=new BigInteger(mTextField.getText());
        c2=m.multiply(y.modPow(r, p)).mod(p);
	c2TextField.setText(""+c2);
    }

     private void c11ButtonActionPerformed(java.awt.event.ActionEvent evt) {
	try{
		m=new BigInteger(mTextField.getText());
	}
	catch(NumberFormatException e){
		mTextField.setText("Enter a message.");
		return;
	}
	try{
		r1=new BigInteger(r2TextField.getText());
	}
	catch(NumberFormatException e){
		r2TextField.setText("Enter a random number.");
		return;
	}
        c11=g.modPow(r1, p);
	c11TextField.setText(""+c11);
     }

    private void c21ButtonActionPerformed(java.awt.event.ActionEvent evt) {
	m=new BigInteger(mTextField.getText());
        c22=m.multiply(y.modPow(r1, p)).mod(p);
	c22TextField.setText(""+c22);
    }

    private void m1ButtonActionPerformed(java.awt.event.ActionEvent evt) {
	m=new BigInteger(mTextField.getText());
	c11=g.modPow(r1, p);
	c22=m.multiply(y.modPow(r1, p)).mod(p);
        k=c11.modPow(x, p);
	decreptedMessage=c22.multiply(k.modInverse(p)).mod(p);
	mdecTextField.setText(""+decreptedMessage);
    }
    

    private void yTextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void mTextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void rTextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void c1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void c2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void r2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void c11TextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void c22TextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

    private void mdecTextFieldActionPerformed(java.awt.event.ActionEvent evt) {}

  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ElGamalReEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElGamalReEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElGamalReEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElGamalReEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElGamalReEncryption().setVisible(true);
            }
        });
    }


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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton m1Button;
    private javax.swing.JTextField mTextField;
    private javax.swing.JTextField mdecTextField;
    private javax.swing.JTextField r2TextField;
    private javax.swing.JTextField rTextField;
    private javax.swing.JTextField xTextField;
    private javax.swing.JButton yComButton;
    private javax.swing.JTextField yTextField;


}




