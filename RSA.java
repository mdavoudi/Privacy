/**
 *
 * @author Mahtab Davoudi
 * RSA Encryption/Decryption
 */
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;
public class RSA extends javax.swing.JDialog {

    private final static BigInteger one= new BigInteger("1");
	private final static SecureRandom random= new SecureRandom();
	
	private BigInteger p;
	private BigInteger q;
	private BigInteger d; 
	private BigInteger e; 
	private BigInteger n;
	private BigInteger phi;
	private BigInteger message;
	private BigInteger encrypted;
    public RSA(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents
	


        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        GenButton = new javax.swing.JButton();
        ComButton = new javax.swing.JButton();
        CalButton = new javax.swing.JButton();
        EncButton = new javax.swing.JButton();
        DecButton = new javax.swing.JButton();
        pTextField = new javax.swing.JTextField();
        qTextField = new javax.swing.JTextField();
        nTextField = new javax.swing.JTextField();
        eTextField = new javax.swing.JTextField();
        dTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        originalMTextField = new javax.swing.JTextField();
        cTextField = new javax.swing.JTextField();
        mDecTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); 
        jLabel1.setText("RSA Encryption/Decryption");

        jLabel2.setText("1. Generate primes p and q");

        jLabel3.setText("p = ");

        jLabel5.setText("q = ");

        jLabel4.setText("2. Compute n=pq ");

        jLabel6.setText("n = ");

        jLabel7.setText("3. Set a public key e    e =");

        jLabel8.setText("4. Calculate the private key d");

        jLabel9.setText("d = ");

        jLabel10.setText("5. Input a message m                         m = ");

        jLabel11.setText("<html>6. Encrypt c=e<sup>m</sup> mod n </html>");

        jLabel12.setText("<html>7. Decrypt m=c<sup>d</sup> mod n</html>");

        GenButton.setText("Gen");
        GenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenButtonActionPerformed(evt);
            }
        });

        ComButton.setText("Com");
        ComButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComButtonActionPerformed(evt);
            }
        });

        CalButton.setText("Cal");
        CalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalButtonActionPerformed(evt);
            }
        });

        EncButton.setText("Enc");
        EncButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncButtonActionPerformed(evt);
            }
        });

        DecButton.setText("Dec");
        DecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecButtonActionPerformed(evt);
            }
        });

        pTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pTextFieldActionPerformed(evt);
            }
        });

        qTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qTextFieldActionPerformed(evt);
            }
        });

        nTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nTextFieldActionPerformed(evt);
            }
        });

        eTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eTextFieldActionPerformed(evt);
            }
        });

        dTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dTextFieldActionPerformed(evt);
            }
        });

        jLabel13.setText("c =");

        jLabel14.setText("m =");

        originalMTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originalMTextFieldActionPerformed(evt);
            }
        });

        cTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTextFieldActionPerformed(evt);
            }
        });

        mDecTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDecTextFieldActionPerformed(evt);
            }
        });

        jLabel15.setText("( 1000 <p,q< 5000 )");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(qTextField)
                                            .addComponent(pTextField)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(nTextField))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eTextField)))
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CalButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(EncButton)
                                                    .addComponent(DecButton))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jLabel14)))
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(originalMTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(mDecTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                                                .addComponent(cTextField))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(GenButton)
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(ComButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(GenButton)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(qTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ComButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(eTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CalButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(originalMTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(EncButton)
                    .addComponent(jLabel13)
                    .addComponent(cTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(DecButton)
                    .addComponent(jLabel14)
                    .addComponent(mDecTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }

    private void GenButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Random rand = new Random();
	int N0=rand.nextInt(2)+11;
	int N1=rand.nextInt(2)+11;
	p = BigInteger.probablePrime(N0, random);
	q = BigInteger.probablePrime(N1, random);
	phi = (p.subtract(one)).multiply(q.subtract(one));
	pTextField.setText(""+p);
	qTextField.setText(""+q);
    }

    private void ComButtonActionPerformed(java.awt.event.ActionEvent evt) {
        n= p.multiply(q);
	nTextField.setText(""+n);
    }

    private void CalButtonActionPerformed(java.awt.event.ActionEvent evt) {
	
        e=new BigInteger(eTextField.getText());
	try{
	d = e.modInverse(phi);
	}
	catch(ArithmeticException e){
		dTextField.setText("NOT invertible. Try another value for e.");
		return;
	}
	dTextField.setText(""+d);
    }

    private void EncButtonActionPerformed(java.awt.event.ActionEvent evt) {
        message= new BigInteger(originalMTextField.getText());
	encrypted=message.modPow(e, n);
	cTextField.setText(""+message.modPow(e, n));
    }

    private void DecButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecButtonActionPerformed
        mDecTextField.setText(""+encrypted.modPow(d, n));
    }
    
    private void pTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pTextFieldActionPerformed

    private void qTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qTextFieldActionPerformed

    private void nTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nTextFieldActionPerformed

    private void eTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eTextFieldActionPerformed

    private void dTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dTextFieldActionPerformed

    private void originalMTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originalMTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_originalMTextFieldActionPerformed

    private void cTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cTextFieldActionPerformed

    private void mDecTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDecTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mDecTextFieldActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RSA dialog = new RSA(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private javax.swing.JButton CalButton;
    private javax.swing.JButton ComButton;
    private javax.swing.JButton DecButton;
    private javax.swing.JButton EncButton;
    private javax.swing.JButton GenButton;
    private javax.swing.JTextField cTextField;
    private javax.swing.JTextField dTextField;
    private javax.swing.JTextField eTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mDecTextField;
    private javax.swing.JTextField nTextField;
    private javax.swing.JTextField originalMTextField;
    private javax.swing.JTextField pTextField;
    private javax.swing.JTextField qTextField;


}

