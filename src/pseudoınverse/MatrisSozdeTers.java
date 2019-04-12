/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pseudoınverse;

/**
 *
 * @author aarslan
 */
public class MatrisSozdeTers extends javax.swing.JFrame {
    double[][] matrix;
    double[][] matrix2;
    double[][] tersmatrix;
    double[][] sozdematrix = new double[5][5];
    int m;
    int n;
    int toplamasayisi;
    int carpmasayisi;
    /**
     * Creates new form MatrisSozdeTers
     */
    public MatrisSozdeTers() {
        initComponents();
    }
    public MatrisSozdeTers(double matrix[][],double matrix2[][],double[][] tersmatrix,int m,int n,int toplamasayisi,int carpmasayisi){
        initComponents();
        this.matrix = matrix;
        this.matrix2 = matrix2;
        this.tersmatrix = tersmatrix;
        this.m = m;
        this.n = n;
        this.toplamasayisi = toplamasayisi;
        this.carpmasayisi = carpmasayisi;
        MatrisCarpim();
        initialize();
    }
    
    void MatrisCarpim(){
    String matris = null;
    if(m<n){ 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) { // 
                for (int k = 0; k < m; k++) {
                    sozdematrix[i][j] += matrix2[i][k] * tersmatrix[k][j];
                    toplamasayisi++;
                    carpmasayisi++;
                }
            }
        } 
    }
    else if(m>n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) { // 
                for (int k = 0; k < n; k++) {
                    sozdematrix[i][j] += tersmatrix[i][k] * matrix2[k][j];
                    toplamasayisi++;
                    carpmasayisi++;
                }
            }
        }
    }
    if(m<n){ //Matris(4x5)  Transpoz(5x4)   Matris x Transpoz (4x4)  (Matris x Transpoz Tersi) (4x4)  Transpoz(5x4) x (Matris x Transpoz Tersi)(4x4) = 5x4
        
        for(int i = 0;i < this.n;i++){
            for(int j = 0;j < this.m;j++){
                if(i == 0 && j==0){
                    matris = Double.toString(sozdematrix[i][j]) + "     ";
                }
                else{
                matris = matris + Double.toString(sozdematrix[i][j]) + "     ";
                }
            }
            matris = matris + "\n\n\n";
        }
        jTextArea3.setEditable(false);
        jTextArea3.setText(matris);    
    }
    
    else if(m>n){
       
        for(int i = 0;i < this.n;i++){
            for(int j = 0;j < this.m;j++){
                if(i == 0 && j==0){
                    matris = Double.toString(sozdematrix[i][j]) + "     ";
                }
                else{
                matris = matris + Double.toString(sozdematrix[i][j]) + "     ";
                }
            }
            matris = matris + "\n\n\n";
        }
        jTextArea3.setEditable(false);
        jTextArea3.setText(matris);    
    }
    
    }
    void initialize(){
        String matris = null;
        if(m<n){
            jLabel1.setText("A^T");
            jLabel2.setText("(A x A^T)^(-1)");
            for(int i = 0;i < this.n;i++){
            for(int j = 0;j < this.m;j++){
                if(i == 0 && j==0){
                    matris = Double.toString(matrix2[i][j]) + "     ";
                }
                else{
                matris = matris + Double.toString(matrix2[i][j]) + "     ";
                }
            }
            matris = matris + "\n\n\n";
        }
        jTextArea1.setEditable(false);
        jTextArea1.setText(matris);
        for(int i = 0;i < this.m;i++){
            for(int j = 0;j < this.m;j++){
                if(i == 0 && j==0){
                    matris = Double.toString(tersmatrix[i][j]) + "     ";
                }
                else{
                matris = matris + Double.toString(tersmatrix[i][j]) + "     ";
                }
            }
            matris = matris + "\n\n\n";
        }
        jTextArea2.setEditable(false);
        jTextArea2.setText(matris);  
        }
        else if(m>n){
            jLabel1.setText("(A^T x A)^(-1)");
            jLabel2.setText("A^T");
            for(int i = 0;i < this.n;i++){
            for(int j = 0;j < this.n;j++){
                if(i == 0 && j==0){
                    matris = Double.toString(tersmatrix[i][j]) + "     ";
                }
                else{
                matris = matris + Double.toString(tersmatrix[i][j]) + "     ";
                }
            }
            matris = matris + "\n\n\n";
        }
        jTextArea1.setEditable(false);
        jTextArea1.setText(matris);
        for(int i = 0;i < this.n;i++){
            for(int j = 0;j < this.m;j++){
                if(i == 0 && j==0){
                    matris = Double.toString(matrix2[i][j]) + "     ";
                }
                else{
                matris = matris + Double.toString(matrix2[i][j]) + "     ";
                }
            }
            matris = matris + "\n\n\n";
        }
        jTextArea2.setEditable(false);
        jTextArea2.setText(matris);  
        }
        jLabel8.setText(Integer.toString(toplamasayisi));
        jLabel9.setText(Integer.toString(carpmasayisi));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Sözde Ters Matrisi");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setText("X");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setText("=");

        jLabel6.setText("Toplama Sayısı:");

        jLabel7.setText("Çarpma Sayısı:");

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(211, 211, 211))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(222, 222, 222))))
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
            java.util.logging.Logger.getLogger(MatrisSozdeTers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatrisSozdeTers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatrisSozdeTers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatrisSozdeTers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatrisSozdeTers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
