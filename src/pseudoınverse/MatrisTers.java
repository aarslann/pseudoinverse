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
public class MatrisTers extends javax.swing.JFrame {
       
    double matrix[][];
    double matrix2[][];
    double matriscarpim[][];
    double tersmatrix[][] = new double[5][5];
    double gecicimatrix[][] = new double[5][5];
    int m;
    int n;
    double det;
    int toplamasayisi;
    int carpmasayisi;
    /**
     * Creates new form MatrisTers
     */
    public MatrisTers() {
        initComponents();
    }
    public MatrisTers(double matrix[][],double matrix2[][],double matriscarpim[][],double det,int m,int n,int toplamasayisi,int carpmasayisi){
        initComponents();
        this.matrix = matrix;
        this.matrix2 = matrix2;
        this.matriscarpim = matriscarpim;
        this.det = det;
        this.m = m;
        this.n = n;
        this.toplamasayisi = toplamasayisi;
        this.carpmasayisi = carpmasayisi;
        matristers();
        matrisduzenle();
        matrisigoruntule();
    }
    
    void matrisduzenle(){
        if(m<n){
        if(m==3){
            tersmatrix[0][1]=-(tersmatrix[0][1]);
            tersmatrix[1][0]=-(tersmatrix[1][0]);
            tersmatrix[1][2]=-(tersmatrix[1][2]);
            tersmatrix[2][1]=-(tersmatrix[2][1]);
        }
        else if(m==4){
            tersmatrix[0][1]=-(tersmatrix[0][1]);
            tersmatrix[0][3]=-(tersmatrix[0][3]);
            tersmatrix[1][0]=-(tersmatrix[1][0]);
            tersmatrix[1][2]=-(tersmatrix[1][2]);
            tersmatrix[2][1]=-(tersmatrix[2][1]);
            tersmatrix[2][3]=-(tersmatrix[2][3]);
            tersmatrix[3][0]=-(tersmatrix[3][0]);
            tersmatrix[3][2]=-(tersmatrix[3][2]);
        }
        }
        else if(m>n){
        if(n==3){
            tersmatrix[0][1]=-(tersmatrix[0][1]);
            tersmatrix[1][0]=-(tersmatrix[1][0]);
            tersmatrix[1][2]=-(tersmatrix[1][2]);
            tersmatrix[2][1]=-(tersmatrix[2][1]);
        }
        else if(n==4){
            tersmatrix[0][1]=-(tersmatrix[0][1]);
            tersmatrix[0][3]=-(tersmatrix[0][3]);
            tersmatrix[1][0]=-(tersmatrix[1][0]);
            tersmatrix[1][2]=-(tersmatrix[1][2]);
            tersmatrix[2][1]=-(tersmatrix[2][1]);
            tersmatrix[2][3]=-(tersmatrix[2][3]);
            tersmatrix[3][0]=-(tersmatrix[3][0]);
            tersmatrix[3][2]=-(tersmatrix[3][2]);
        }
        }
    }
    
    void matristers(){
        int a = 0;
        int b = 0;
        if(m<n){
            if(m==1){
        tersmatrix[0][0] = 1/matriscarpim[0][0];
        carpmasayisi++;
            }
        
        else if(m==2){
            
        tersmatrix[0][0] = matriscarpim[1][1] / det;
        tersmatrix[0][1] = -(matriscarpim[0][1]/ det);
        tersmatrix[1][0] = -(matriscarpim[1][0] / det);
        tersmatrix[1][1] = matriscarpim[0][0] / det;
        carpmasayisi = carpmasayisi + 6;
        }
        else{
            for(int i = 0;i < m;i++){
                for(int j = 0;j < m;j++){
                    for(int x = 0;x < m;x++){
                        for(int y = 0;y < m;y++){
                            if(x!=i && y!=j){
                                gecicimatrix[a][b] = matriscarpim[x][y];
                                if(b<m-2){
                                    b++;
                                }
                                else {
                                    b = 0;
                                    a++;
                                }
                            }
                        }
                    }
                    tersmatrix[i][j] = matrisdeterminant(gecicimatrix,m-1) / det;
                    carpmasayisi++;
                    a = 0;
                    b = 0;
                }
            }
            
        }
        }
        
        else if(m>n){
            if(n==1){
        tersmatrix[0][0] = 1/matriscarpim[0][0];
        carpmasayisi++;
        }
        
        else if(n==2){
            
        tersmatrix[0][0] = matriscarpim[1][1] / det;
        tersmatrix[0][1] = -(matriscarpim[0][1]/ det);
        tersmatrix[1][0] = -(matriscarpim[1][0] / det);
        tersmatrix[1][1] = matriscarpim[0][0] / det;
        carpmasayisi = carpmasayisi + 6;   
        }
        else{
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++){
                    for(int x = 0;x < n;x++){
                        for(int y = 0;y < n;y++){
                            if(x!=i && y!=j){
                                gecicimatrix[a][b] = matriscarpim[x][y];
                                if(b<n-2){
                                    b++;
                                }
                                else {
                                    b = 0;
                                    a++;
                                }
                            }
                        }
                    }
                    tersmatrix[i][j] = matrisdeterminant(gecicimatrix,n-1) / det;
                    carpmasayisi++;
                    a = 0;
                    b = 0;
                }
            }       
        }
        }
    }
    void matrisigoruntule(){
        String matris = null;
        if(m<n){
            for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0){
                    matris = Double.toString(tersmatrix[i][j]) + "     ";
                }
                else{
                    matris = matris + Double.toString(tersmatrix[i][j]) + "     ";
                }
            }
            matris = matris + "\n\n\n";
        }
        }
        else if(m>n){
            for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    matris = Double.toString(tersmatrix[i][j]) + "     ";
                }
                else{
                    matris = matris + Double.toString(tersmatrix[i][j]) + "     ";
                }
            }
            matris = matris + "\n\n\n";
        }
        }
        jTextArea1.setEditable(false);
        jTextArea1.setText(matris);
        jLabel4.setText(Integer.toString(toplamasayisi));
        jLabel5.setText(Integer.toString(carpmasayisi));
    }
    
    double matrisdeterminant(double matriscarpim[][],int m){
        double det=0;
        if(m==1){
            det=matriscarpim[0][0];
        }
        else if(m==2){
            det=(matriscarpim[0][0]*matriscarpim[1][1])-(matriscarpim[0][1]*matriscarpim[1][0]);
            carpmasayisi = carpmasayisi +2;
            toplamasayisi++;
        }
        else if(m==3){
            det=((matriscarpim[0][0]*matriscarpim[1][1]*matriscarpim[2][2])+(matriscarpim[1][0]*matriscarpim[2][1]*matriscarpim[0][2])+(matriscarpim[2][0]*matriscarpim[0][1]*matriscarpim[1][2]))
        -((matriscarpim[0][2]*matriscarpim[1][1]*matriscarpim[2][0])+(matriscarpim[1][2]*matriscarpim[2][1]*matriscarpim[0][0])+(matriscarpim[2][2]*matriscarpim[0][1]*matriscarpim[1][0]));            
            carpmasayisi = carpmasayisi + 12;
            toplamasayisi = toplamasayisi + 5;
        }
        else {
             det=0;
            for(int j1=0;j1<m;j1++)
            {
                double[][] x = new double[m-1][];
                for(int k=0;k<(m-1);k++)
                {
                    x[k] = new double[m-1];
                }
                for(int i=1;i<m;i++)
                {
                    int j2=0;
                    for(int j=0;j<m;j++)
                    {
                        if(j == j1)
                            continue;
                        x[i-1][j2] = matriscarpim[i][j];
                        j2++;
                    }
                }
                carpmasayisi = carpmasayisi + 2;
                toplamasayisi++;
                det += Math.pow(-1.0,1.0+j1+1.0)* matriscarpim[0][j1] * matrisdeterminant(x,m-1);
            }
        }
        return det;
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Bir Sonraki İşlem");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Tersi");

        jLabel2.setText("Toplama Sayısı:");

        jLabel3.setText("Çarpma Sayısı:");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(189, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(60, 60, 60))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MatrisSozdeTers a = new MatrisSozdeTers(matrix,matrix2,tersmatrix,m,n,toplamasayisi,carpmasayisi);
        a.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MatrisTers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatrisTers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatrisTers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatrisTers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatrisTers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
