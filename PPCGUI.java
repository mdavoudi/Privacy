import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class PPCGUI extends javax.swing.JFrame {
        int k1,k2,k3,k4,n,q,A=0,B=0;
    	BigInteger C[];
    	BigInteger Di[];
    	BigInteger c[];
    	BigInteger p,s,alpha,inverse_s,ri,E,alphasquare,D=BigInteger.ZERO;
    	double ab,Cosine;
    	int a[],b[];
    	public PPCGUI(){
    		initComponents();
    		a=new int[n+2];
    		b=new int[1000+2];
    		C= new BigInteger[n+2];
    		c=new BigInteger[n+2];
    		Di=new BigInteger[n+2];
    		
    		for(int i=0;i<n;i++) {
    			a[i]=new Random().nextInt(q);
    		}
    		a[n]=0;
    		a[n+1]=0;
    		
    		p=new BigInteger(k1,new SecureRandom());
    		alpha=new BigInteger(k2,new SecureRandom());
    		ri=new BigInteger(k4, new SecureRandom());
            
            do
            {
                s = new BigInteger(p.bitLength(), new SecureRandom());
            }
            while (s.compareTo(p)>= 0 || s.gcd(p).intValue()!= 1);
            
            inverse_s= s.modInverse(p);
            
            for(int i=0;i<n+2;i++) {
            	c[i]=new BigInteger(k3,new SecureRandom());
            }
            
            
            for(int i=0;i<n+2;i++) {
            	if(a[i]!=0) {
            		C[i]=s.multiply(BigInteger.valueOf(a[i]).multiply(alpha).add(c[i])).mod(p);
            		
            	}
            	else if(a[i]==0) {
            		C[i]=s.multiply(c[i]).mod(p);
            		
            	}
            }
            
            for(int i=0;i<n;i++) {
    			A+=Math.pow(a[i], 2);
    			
    		}
            for(int i=0;i<n;i++) { 
            	b[i]=new Random().nextInt(2);
            }
            b[n]=0;
            b[n+1]=0;
            
    		for(int i=0;i<n+2;i++)
    		{
    			if(b[i]==0)
    			{
    				Di[i]=ri.multiply(C[i]).mod(p);
    				
    			}
    			else
    			{
    				Di[i]=BigInteger.valueOf(b[i]).multiply(alpha).multiply(C[i]).mod(p);
    				
    			}
    		}
    		
    		for(int i=0;i<n;i++) {
    			B+=Math.pow(b[i], 2);
    			
    		}
    		
    		for(int i=0;i<n+2;i++) {
    			D=D.add(Di[i]);
    			
    		}
    		D=D.mod(p);

    		
    		
    		
    		E=inverse_s.multiply(D).mod(p);
    		
    		alphasquare=alpha.multiply(alpha);
    		ab=E.subtract(E.mod(alphasquare)).divide(alphasquare).doubleValue();
    		
    		Cosine=ab/(Math.sqrt(A)*Math.sqrt(B));
    		
    	}
    	
    	

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        k1TextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        k2TextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        k3TextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        k4TextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        qTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        sTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ATextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        a_iTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        BTextField = new javax.swing.JTextField();
        biTextField = new javax.swing.JTextField();
        ETextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cosTextField = new javax.swing.JTextField();
        cosButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("An Efficient and Privacy-Preserving Cosine Similarity Computing Protocol");

        jLabel2.setText("k1=");

        k1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k1TextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("k2=");

        k2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k2TextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("k3=");

        k3TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k3TextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("k4=");

        k4TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k4TextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("n=");

        nTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("q=");

        qTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Security Parameters:");

        jLabel9.setText("Compute p,s,A,a[]:");

        jLabel10.setText("P=");

        PTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PTextFieldActionPerformed(evt);
            }
        });

        jLabel11.setText("S=");

        sTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setText("A=");

        ATextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATextFieldActionPerformed(evt);
            }
        });

        jButton1.setText("Comp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setText("a[]=");

        a_iTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_iTextField1ActionPerformed(evt);
            }
        });

        jLabel14.setText("Compute B,E,b[]:");

        jLabel15.setText("B=");

        jLabel16.setText("b[]=");

        jLabel17.setText("E=");

        BTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTextFieldActionPerformed(evt);
            }
        });

        biTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biTextFieldActionPerformed(evt);
            }
        });

        ETextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ETextFieldActionPerformed(evt);
            }
        });

        jLabel18.setText("Cos(a,b)=");

        cosTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosTextFieldActionPerformed(evt);
            }
        });

        cosButton.setText("Compute Cos(a,b)");
        cosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Comp");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(250, 250, 250)
                                .addComponent(jButton2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(PTextField))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(k1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel6))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(k3TextField)
                                                .addComponent(nTextField))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(k2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel11))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(k4TextField)
                                                .addComponent(qTextField)
                                                .addComponent(sTextField)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(252, 252, 252)
                                    .addComponent(jButton1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(ATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel15)
                                                .addComponent(jLabel17))
                                            .addGap(26, 26, 26)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(BTextField)
                                                .addComponent(ETextField))))
                                    .addGap(39, 39, 39)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(biTextField))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(a_iTextField1))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(cosButton)
                                            .addGap(0, 0, Short.MAX_VALUE))))))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(k1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(k2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(k3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(k4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(qTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(PTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(sTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(a_iTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(BTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(biTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(ETextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cosButton))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }//GEN-END:initComponents

    private void k1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k1TextFieldActionPerformed

    private void k2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k2TextFieldActionPerformed

    private void k3TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k3TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k3TextFieldActionPerformed

    private void k4TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k4TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k4TextFieldActionPerformed

    private void nTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nTextFieldActionPerformed

    private void qTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PTextFieldActionPerformed

    private void sTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sTextFieldActionPerformed

    private void ATextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ATextFieldActionPerformed

    private void a_iTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_iTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_iTextField1ActionPerformed

    private void BTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTextFieldActionPerformed

    private void biTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_biTextFieldActionPerformed

    private void ETextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ETextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ETextFieldActionPerformed

    private void cosTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cosTextFieldActionPerformed

    private void cosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cosButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PPCGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                                                                               ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PPCGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                                                                               ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PPCGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                                                                               ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PPCGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                                                                               ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PPCGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ATextField;
    private javax.swing.JTextField BTextField;
    private javax.swing.JTextField ETextField;
    private javax.swing.JTextField PTextField;
    private javax.swing.JTextField a_iTextField1;
    private javax.swing.JTextField biTextField;
    private javax.swing.JButton cosButton;
    private javax.swing.JTextField cosTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField k1TextField;
    private javax.swing.JTextField k2TextField;
    private javax.swing.JTextField k3TextField;
    private javax.swing.JTextField k4TextField;
    private javax.swing.JTextField nTextField;
    private javax.swing.JTextField qTextField;
    private javax.swing.JTextField sTextField;
    // End of variables declaration//GEN-END:variables

}


