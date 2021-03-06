
import javax.swing.JOptionPane;

/**
 * Clase GUI encargada de interactuar con el usuario.
 * @author: Oscar Juárez - 17315; Josue Florian - 17081
 * @version: 19.01.18
 * Algoritmos y Estructura de Datos - seccion: 10
 */
public class Radio extends javax.swing.JFrame {
    
    private boolean AmFm;
    private boolean power;
    private float ultimaF;
    iradio radio = new RadioCongfi();    
    
    public Radio() {        
        initComponents(); 
        power = false;  
        AmFm =  false;
        ultimaF = (float) 87.9;
        
    }        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Emisora1 = new javax.swing.JButton();
        Emisora2 = new javax.swing.JButton();
        Emisora3 = new javax.swing.JButton();
        Emisora4 = new javax.swing.JButton();
        Emisora5 = new javax.swing.JButton();
        Emisora6 = new javax.swing.JButton();
        Emisora7 = new javax.swing.JButton();
        Emisora8 = new javax.swing.JButton();
        Emisora9 = new javax.swing.JButton();
        Emisora10 = new javax.swing.JButton();
        Emisora11 = new javax.swing.JButton();
        Emisora12 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("----");

        jButton1.setText(">");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Emisora1.setText("1");
        Emisora1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Emisora1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Emisora1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Emisora1MousePressed(evt);
            }
        });
        Emisora1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emisora1ActionPerformed(evt);
            }
        });
        Emisora1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Emisora1KeyPressed(evt);
            }
        });

        Emisora2.setText("2");
        Emisora2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Emisora2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Emisora2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Emisora2MousePressed(evt);
            }
        });
        Emisora2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emisora2ActionPerformed(evt);
            }
        });

        Emisora3.setText("3");
        Emisora3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Emisora3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Emisora3MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Emisora3MousePressed(evt);
            }
        });
        Emisora3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emisora3ActionPerformed(evt);
            }
        });

        Emisora4.setText("4");
        Emisora4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Emisora4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Emisora4MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Emisora4MousePressed(evt);
            }
        });
        Emisora4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emisora4ActionPerformed(evt);
            }
        });

        Emisora5.setText("5");
        Emisora5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Emisora5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Emisora5MousePressed(evt);
            }
        });
        Emisora5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emisora5ActionPerformed(evt);
            }
        });

        Emisora6.setText("6");
        Emisora6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Emisora6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Emisora6MousePressed(evt);
            }
        });
        Emisora6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emisora6ActionPerformed(evt);
            }
        });

        Emisora7.setText("7");
        Emisora7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Emisora7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Emisora7MousePressed(evt);
            }
        });
        Emisora7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emisora7ActionPerformed(evt);
            }
        });

        Emisora8.setText("8");
        Emisora8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Emisora8MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Emisora8MousePressed(evt);
            }
        });
        Emisora8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emisora8ActionPerformed(evt);
            }
        });

        Emisora9.setText("9");
        Emisora9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Emisora9MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Emisora9MousePressed(evt);
            }
        });
        Emisora9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emisora9ActionPerformed(evt);
            }
        });

        Emisora10.setText("10");
        Emisora10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Emisora10MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Emisora10MousePressed(evt);
            }
        });
        Emisora10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emisora10ActionPerformed(evt);
            }
        });

        Emisora11.setText("11");
        Emisora11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Emisora11MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Emisora11MousePressed(evt);
            }
        });
        Emisora11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emisora11ActionPerformed(evt);
            }
        });

        Emisora12.setText("12");
        Emisora12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Emisora12MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Emisora12MousePressed(evt);
            }
        });
        Emisora12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emisora12ActionPerformed(evt);
            }
        });

        jButton4.setText("Switch AM/FM");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("NA");

        jButton3.setText("ON");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("*Para guardar: Mantenga presionado shift + el boton en donde quiere guardar la emisora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(87, 87, 87)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Emisora1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Emisora7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Emisora8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Emisora2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Emisora3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Emisora9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Emisora10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Emisora4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Emisora11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Emisora12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Emisora5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Emisora6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton3)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(17, 17, 17)))
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Emisora1)
                    .addComponent(Emisora2)
                    .addComponent(Emisora3)
                    .addComponent(Emisora4)
                    .addComponent(Emisora5)
                    .addComponent(Emisora6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Emisora7)
                    .addComponent(Emisora8)
                    .addComponent(Emisora9)
                    .addComponent(Emisora10)
                    .addComponent(Emisora11)
                    .addComponent(Emisora12))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(32, 32, 32)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
        if (power) {                                                
            
            float frecuencia = Float.parseFloat(jLabel1.getText());                      
            
            frecuencia = radio.siguiente(frecuencia);   
            
            jLabel1.setText(Float.toString(frecuencia));                        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (power) {
            
            float frecuencia = Float.parseFloat(jLabel1.getText());            
            
            frecuencia = radio.anterior(frecuencia);   
            
            jLabel1.setText(Float.toString(frecuencia));                       
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Emisora1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emisora1ActionPerformed
        obtenerGuardada(0);
        
    }//GEN-LAST:event_Emisora1ActionPerformed

    private void Emisora2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emisora2ActionPerformed
        
        obtenerGuardada(1);
    }//GEN-LAST:event_Emisora2ActionPerformed

    private void Emisora3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emisora3ActionPerformed
        
        obtenerGuardada(2);
    }//GEN-LAST:event_Emisora3ActionPerformed

    private void Emisora4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emisora4ActionPerformed
        obtenerGuardada(3);
        
    }//GEN-LAST:event_Emisora4ActionPerformed

    private void Emisora5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emisora5ActionPerformed
        obtenerGuardada(4);
        
    }//GEN-LAST:event_Emisora5ActionPerformed

    private void Emisora6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emisora6ActionPerformed
        obtenerGuardada(5);
        
    }//GEN-LAST:event_Emisora6ActionPerformed

    private void Emisora7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emisora7ActionPerformed
        obtenerGuardada(6);
        
    }//GEN-LAST:event_Emisora7ActionPerformed

    private void Emisora8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emisora8ActionPerformed
        obtenerGuardada(7);        
    }//GEN-LAST:event_Emisora8ActionPerformed

    private void Emisora9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emisora9ActionPerformed
        obtenerGuardada(8);        
    }//GEN-LAST:event_Emisora9ActionPerformed

    private void Emisora10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emisora10ActionPerformed
        obtenerGuardada(9);
    }//GEN-LAST:event_Emisora10ActionPerformed

    private void Emisora11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emisora11ActionPerformed
        obtenerGuardada(10);
    }//GEN-LAST:event_Emisora11ActionPerformed

    private void Emisora12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emisora12ActionPerformed
        obtenerGuardada(11);
    }//GEN-LAST:event_Emisora12ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                      
        if (power) {  
            
            ultimaF = radio.Switch();
            
            if (AmFm) {                
                
                jLabel1.setText(ultimaF+"");
                jLabel2.setText("FM");
                AmFm = false;
               
            } else {
                
                jLabel1.setText(ultimaF+"");
                jLabel2.setText("AM");
                AmFm = true;
                
            }                                   
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
              
        if (power) {
            
            ultimaF = Float.parseFloat(jLabel1.getText());
            jButton3.setText("ON");  
            jLabel1.setText("----");
            jLabel2.setText("NA");             
            power = false;            
            radio.onOff();                        
            
        } else {
            
            jButton3.setText("OFF");    
            
            jLabel1.setText(ultimaF+"");
            
            power = true;   
            
            if (AmFm) {
                jLabel2.setText("AM");
            } else {
                jLabel2.setText("FM");
            }                        
            
            radio.onOff();
                                     
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Emisora1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora1MouseClicked

    }//GEN-LAST:event_Emisora1MouseClicked

    private void Emisora2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora2MouseClicked

    }//GEN-LAST:event_Emisora2MouseClicked

    private void Emisora3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora3MouseClicked

    }//GEN-LAST:event_Emisora3MouseClicked

    private void Emisora1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Emisora1KeyPressed

    }//GEN-LAST:event_Emisora1KeyPressed

    private void Emisora1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora1MousePressed
        if (evt.isShiftDown()) {
            
            guardarEstacion(0);

        }  
    }//GEN-LAST:event_Emisora1MousePressed

    private void Emisora2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora2MouseEntered

    }//GEN-LAST:event_Emisora2MouseEntered

    private void Emisora3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora3MouseEntered

    }//GEN-LAST:event_Emisora3MouseEntered

    private void Emisora4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora4MouseEntered
 
    }//GEN-LAST:event_Emisora4MouseEntered

    private void Emisora5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora5MouseClicked

    }//GEN-LAST:event_Emisora5MouseClicked

    private void Emisora6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora6MouseClicked

    }//GEN-LAST:event_Emisora6MouseClicked

    private void Emisora7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora7MouseClicked

    }//GEN-LAST:event_Emisora7MouseClicked

    private void Emisora8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora8MouseClicked

    }//GEN-LAST:event_Emisora8MouseClicked

    private void Emisora9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora9MouseClicked

    }//GEN-LAST:event_Emisora9MouseClicked

    private void Emisora10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora10MouseClicked

    }//GEN-LAST:event_Emisora10MouseClicked

    private void Emisora11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora11MouseClicked

    }//GEN-LAST:event_Emisora11MouseClicked

    private void Emisora12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora12MouseClicked

    }//GEN-LAST:event_Emisora12MouseClicked

    private void Emisora4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora4MouseClicked

    }//GEN-LAST:event_Emisora4MouseClicked

    private void Emisora1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Emisora1MouseEntered

    private void Emisora2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora2MousePressed
        if (evt.isShiftDown()) {
            
            guardarEstacion(1);

        }  
    }//GEN-LAST:event_Emisora2MousePressed

    private void Emisora3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora3MousePressed
        if (evt.isShiftDown()) {
            
            guardarEstacion(2);

        } 
    }//GEN-LAST:event_Emisora3MousePressed

    private void Emisora4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora4MousePressed
        if (evt.isShiftDown()) {
            
            guardarEstacion(3);

        }
    }//GEN-LAST:event_Emisora4MousePressed

    private void Emisora5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora5MousePressed
        if (evt.isShiftDown()) {
            
            guardarEstacion(4);

        }
    }//GEN-LAST:event_Emisora5MousePressed

    private void Emisora6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora6MousePressed
        if (evt.isShiftDown()) {
            
            guardarEstacion(5);

        }
    }//GEN-LAST:event_Emisora6MousePressed

    private void Emisora7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora7MousePressed
        if (evt.isShiftDown()) {
            
            guardarEstacion(6);

        }
    }//GEN-LAST:event_Emisora7MousePressed

    private void Emisora8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora8MousePressed
        if (evt.isShiftDown()) {
            
            guardarEstacion(7);

        }
    }//GEN-LAST:event_Emisora8MousePressed

    private void Emisora9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora9MousePressed
        if (evt.isShiftDown()) {
            
            guardarEstacion(8);

        }  
    }//GEN-LAST:event_Emisora9MousePressed

    private void Emisora10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora10MousePressed
        if (evt.isShiftDown()) {
            
            guardarEstacion(9);

        }
    }//GEN-LAST:event_Emisora10MousePressed

    private void Emisora11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora11MousePressed
        if (evt.isShiftDown()) {
            
            guardarEstacion(10);

        }
    }//GEN-LAST:event_Emisora11MousePressed

    private void Emisora12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emisora12MousePressed
        if (evt.isShiftDown()) {
            
            guardarEstacion(11);

        } 
    }//GEN-LAST:event_Emisora12MousePressed
    /**
     * esta funcion se encarga de poder ir a la frecuencia guardada en el boton
     * @param boton numero del boton
     */
    public void obtenerGuardada(int boton){
        
        if (power) {
            
            float frecuenciaGuardada = radio.seleccionarFav(boton);
            
            if (frecuenciaGuardada!=0) {
                
                jLabel1.setText(frecuenciaGuardada+"");                
            }
        }
    }
    
 /*
 * Esta linea de comandos funciona mediante la accion de mantener shift y hacer click hacia el boton en donde se quiere guardar la emisora.
 */
    public void guardarEstacion(int boton) {
        
        if (power) {            
                
            float frecuencia = Float.parseFloat(jLabel1.getText());

            radio.guardar(frecuencia, boton);                

            JOptionPane.showMessageDialog(this, "Estacion guardada");                            
        }        
    }
    
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
            java.util.logging.Logger.getLogger(Radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Radio().setVisible(true);
            }            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Emisora1;
    private javax.swing.JButton Emisora10;
    private javax.swing.JButton Emisora11;
    private javax.swing.JButton Emisora12;
    private javax.swing.JButton Emisora2;
    private javax.swing.JButton Emisora3;
    private javax.swing.JButton Emisora4;
    private javax.swing.JButton Emisora5;
    private javax.swing.JButton Emisora6;
    private javax.swing.JButton Emisora7;
    private javax.swing.JButton Emisora8;
    private javax.swing.JButton Emisora9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
