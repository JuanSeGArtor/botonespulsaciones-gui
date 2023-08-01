import java.awt.Color;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    LogicaBotones botonA;
    LogicaBotones botonB;
    LogicaBotones botonC;
    
    LogicaBotones botonReiniciarA;
    LogicaBotones botonMostrarA;
    LogicaBotones botonReiniciarB;
    LogicaBotones botonMostrarB;
    LogicaBotones botonReiniciarC;
    LogicaBotones botonMostrarC;
    
    JTextField txtIniciar;
    LogicaBotones botonIniciar;
    
    LogicaBotones botonTotales;
    LogicaBotones botonReiniciarTodo;
    
    public VentanaPrincipal() {
        initComponents();
        creacionVentana();
    }
    
    public void creacionVentana() {
        this.setTitle("Herencia");
        this.setSize(1350, 700);
        
        botonA = new LogicaBotones();
        botonA.setText("Incrementar A");
        botonA.setBounds(450, 40, 120, 40);
        botonA.setBackground(Color.BLACK);
        botonA.setForeground(Color.WHITE);
        botonA.setBorder(new LineBorder(Color.RED, 2));
        botonA.setBorder(new RoundedBorder(20));
        botonA.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.getContentPane().add(botonA);
                
        botonB = new LogicaBotones();
        botonB.setText("Incrementar B");
        botonB.setBounds(590, 40, 120, 40);
        botonB.setBackground(Color.BLACK);
        botonB.setForeground(Color.WHITE);
        botonB.setBorder(new LineBorder(Color.RED, 2));
        botonB.setBorder(new RoundedBorder(20));
        botonB.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.getContentPane().add(botonB);
        
        botonC = new LogicaBotones();
        botonC.setText("Incrementar C");
        botonC.setBounds(730, 40, 120, 40);
        botonC.setBackground(Color.BLACK);
        botonC.setForeground(Color.WHITE);
        botonC.setBorder(new LineBorder(Color.RED, 2));
        botonC.setBorder(new RoundedBorder(20));
        botonC.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.getContentPane().add(botonC);
        
        
        botonA.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                clickBotonA(evt);
            }

            public void clickBotonA(ActionEvent evt) {
                botonA.incrementar();
            }
        });
        
        botonMostrarA = new LogicaBotones();
        botonMostrarA.setText("Mostrar A");
        botonMostrarA.setBounds(460, 120, 100, 40);
        botonMostrarA.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.getContentPane().add(botonMostrarA);
        
        botonMostrarA.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                clickBotonMostrarA(evt);
            }

            public void clickBotonMostrarA(ActionEvent evt) {
                int cant = botonA.getClick();
                
                JOptionPane.showMessageDialog(null, "La cantidad de clicks es de: " + cant);
            }
        });
                
        botonReiniciarA = new LogicaBotones();
        botonReiniciarA.setText("Reiniciar A");
        botonReiniciarA.setBounds(460, 200, 100, 40);
        botonReiniciarA.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.getContentPane().add(botonReiniciarA);
        
        botonReiniciarA.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                clickBotonReiniciarA(evt);
            }

            public void clickBotonReiniciarA(ActionEvent evt) {
                botonA.reiniciar();
            }
        });
        
        
        botonB.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                clickBotonB(evt);
            }

            public void clickBotonB(ActionEvent evt) {
                botonB.incrementar();
            }
        });
        
        botonMostrarB = new LogicaBotones();
        botonMostrarB.setText("Mostrar B");
        botonMostrarB.setBounds(600, 120, 100, 40);
        botonMostrarB.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.getContentPane().add(botonMostrarB);
        
        botonMostrarB.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                clickBotonMostrarB(evt);
            }

            public void clickBotonMostrarB(ActionEvent evt) {
                int cant = botonB.getClick();
                
                JOptionPane.showMessageDialog(null, "La cantidad de clicks es de: " + cant);
            }
        });
                
        botonReiniciarB = new LogicaBotones();
        botonReiniciarB.setText("Reiniciar B");
        botonReiniciarB.setBounds(600, 200, 100, 40);
        botonReiniciarB.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.getContentPane().add(botonReiniciarB);
        
        botonReiniciarB.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                clickBotonReiniciarB(evt);
            }

            public void clickBotonReiniciarB(ActionEvent evt) {
                botonB.reiniciar();
            }
        });

                
        botonC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                clickBotonC(evt);
            }

            public void clickBotonC(ActionEvent evt) {
                botonC.incrementar();
                botonC.incrementar();
            }
        });
        
        botonMostrarC = new LogicaBotones();
        botonMostrarC.setText("Mostrar C");
        botonMostrarC.setBounds(740, 120, 100, 40);
        botonMostrarC.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.getContentPane().add(botonMostrarC);
        
        botonMostrarC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                clickBotonMostrarC(evt);
            }

            public void clickBotonMostrarC(ActionEvent evt) {
                int cant = botonC.getClick();   
                
                JOptionPane.showMessageDialog(null, "La cantidad de clicks es de: " + cant);
            }
        });
                
        botonReiniciarC = new LogicaBotones();
        botonReiniciarC.setText("Reiniciar C");
        botonReiniciarC.setBounds(740, 200, 100, 40);
        botonReiniciarC.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.getContentPane().add(botonReiniciarC);
        
        botonReiniciarC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                clickBotonReiniciarC(evt);
            }

            public void clickBotonReiniciarC(ActionEvent evt) {
                botonC.reiniciar();
            }
        });
        
        
        txtIniciar = new JTextField();
        txtIniciar.setText("Ingrese la cantidad de pulsaciones inicial");
        txtIniciar.setBounds(510, 300, 280, 30);
        txtIniciar.setHorizontalAlignment(SwingConstants.CENTER);
        txtIniciar.setBackground(Color.WHITE);
        txtIniciar.setForeground(Color.GRAY);
        txtIniciar.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.getContentPane().add(txtIniciar);
        
        txtIniciar.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (txtIniciar.getText().equals("Ingrese la cantidad de pulsaciones inicial")) {
                    txtIniciar.setText("");
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (txtIniciar.getText().isEmpty()) {
                    txtIniciar.setText("Ingrese la cantidad de pulsaciones inicial");
                }
            }
        });
        
        botonIniciar = new LogicaBotones();
        botonIniciar.setText("Iniciar");
        botonIniciar.setBounds(590, 340, 120, 50);
        botonIniciar.setBackground(Color.BLACK);
        botonIniciar.setForeground(Color.WHITE);
        botonIniciar.setBorder(new LineBorder(Color.RED, 2));
        botonIniciar.setBorder(new RoundedBorder(20));
        botonIniciar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.getContentPane().add(botonIniciar);
                        
        botonIniciar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                clickBotonIniciar(evt);
            }

            public void clickBotonIniciar(ActionEvent evt) {
                try {
                    int cant = Integer.parseInt(txtIniciar.getText());
                    
                    botonA.setClick(cant);
                    botonB.setClick(cant);
                    botonC.setClick(cant);
                    
                    JOptionPane.showMessageDialog(null, "Ahora la cantidad de pulsaciones de cada botón inicia en: " + cant);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido en el campo de inicio.");
                }
            }
        });
        
        
        botonTotales = new LogicaBotones();
        botonTotales.setText("TOTAL DE PULSACIONES");
        botonTotales.setBounds(530, 400, 240, 40);
        botonTotales.setBackground(Color.BLACK);
        botonTotales.setForeground(Color.WHITE);
        botonTotales.setBorder(new LineBorder(Color.RED, 2));
        botonTotales.setBorder(new RoundedBorder(20));
        botonTotales.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.getContentPane().add(botonTotales);
                
        botonTotales.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                clickBotonTotales(evt);
            }

            public void clickBotonTotales(ActionEvent evt) {
                int cantA = botonA.getClick();
                int cantB = botonB.getClick();
                int cantC = botonC.getClick();
                
                int total = cantA + cantB + cantC;   
                
                JOptionPane.showMessageDialog(null, "La cantidad de pulsaciones en TOTAL es de: " + total);
            }
        }); 
        
                
        botonReiniciarTodo = new LogicaBotones();
        botonReiniciarTodo.setText("REINICIAR TODO");
        botonReiniciarTodo.setBounds(880, 200, 140, 40);
        botonReiniciarTodo.setBackground(Color.BLACK);
        botonReiniciarTodo.setForeground(Color.WHITE);
        botonReiniciarTodo.setBorder(new LineBorder(Color.RED, 2));
        botonReiniciarTodo.setBorder(new RoundedBorder(20));
        botonReiniciarTodo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.getContentPane().add(botonReiniciarTodo);
                
        botonReiniciarTodo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                clickBotonTotales(evt);
            }

            public void clickBotonTotales(ActionEvent evt) {
                botonA.reiniciar();
                botonB.reiniciar();
                botonC.reiniciar(); 
                
                JOptionPane.showMessageDialog(null, "Ahora la cantidad de pulsaciones de cada botón se ha reiniciado (0)");
            }
        }); 
    }

        // Clase para crear un borde redondeado personalizado
    class RoundedBorder implements Border {

        private int radio;

        public RoundedBorder(int radio) {
            this.radio = radio;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.setColor(c.getForeground());
            g.drawRoundRect(x, y, width - 1, height - 1, radio, radio);
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(this.radio, this.radio, this.radio, this.radio);
        }

        public boolean isBorderOpaque() {
            return true;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
