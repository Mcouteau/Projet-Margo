/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package margo.view;

import controller.ClasseController;
import controller.EtudiantController;
import controller.FiliereController;
import java.awt.Color;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.Personne;

/**
 *
 * @author Mtomas
 */

//CREATE SEQUENCE SEQ_CLASSE INCREMENT BY 1 MAXVALUE 100000 MINVALUE 1 CACHE 20;
//CREATE SEQUENCE SEQ_FILIERE INCREMENT BY 1 MAXVALUE 100000 MINVALUE 1 CACHE 20;

public class UserPanel extends javax.swing.JPanel {

  /**
   * Creates new form UserPanel
   */
  public UserPanel() {
    initComponents();    
    
  }
  
  public UserPanel(Personne user) {
    initComponents();    
    switch(user.getRole()) {
      case "etudiant":
        HomeTab.remove(etudiantsScroll);
        HomeTab.remove(classesScroll);
        
        break;
      case "prof":
        HomeTab.remove(classesScroll);
          break;
      case "administratif":
        //HomeTab.remove(Accueil);
          break;
      default:
        
    }
    ClasseController tmpClasse=new ClasseController() ;
    classesTable.setModel(tmpClasse.Update());
    
    FiliereController tmpFiliere=new FiliereController() ;
    filieresTable.setModel(tmpFiliere.Update());
    
    ClasseController tmpClasseEtudiant=new ClasseController() ;    
    ListClasseB.setModel(tmpClasseEtudiant.GetListClasse());     
    
    FiliereController tmpFiliereB=new FiliereController() ;    
    listeFiliere.setModel(tmpFiliereB.GetListFiliere());     
    
    EtudiantController tmpEtudiant=new EtudiantController() ;
    etudiantsTable.setModel(tmpEtudiant.Update(ListClasseB.getSelectedItem().toString()));
    
  }
  

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomeTab = new javax.swing.JTabbedPane();
        Accueil = new javax.swing.JScrollPane();
        AccueilTextArea1 = new javax.swing.JTextArea();
        filieres = new javax.swing.JPanel();
        filieresScroll = new javax.swing.JScrollPane();
        filieresTable = new javax.swing.JTable();
        AjoutFiliere = new javax.swing.JButton();
        nouvfiliere = new javax.swing.JTextField();
        LabelInfo = new javax.swing.JLabel();
        MessageAjoutFiliere = new javax.swing.JLabel();
        classes = new javax.swing.JPanel();
        classesScroll = new javax.swing.JScrollPane();
        classesTable = new javax.swing.JTable();
        AjoutClasse = new javax.swing.JButton();
        nouvclasse = new javax.swing.JTextField();
        listeFiliere = new javax.swing.JComboBox();
        etudiants = new javax.swing.JPanel();
        etudiantsScroll = new javax.swing.JScrollPane();
        etudiantsTable = new javax.swing.JTable();
        ListClasseB = new javax.swing.JComboBox();
        professeurs = new javax.swing.JPanel();
        administrateurs = new javax.swing.JPanel();
        account = new javax.swing.JPanel();
        jLabelUsername = new javax.swing.JLabel();
        AccountUserName = new javax.swing.JTextField();
        jLabelUserPassword = new javax.swing.JLabel();
        AccountPassword = new javax.swing.JPasswordField();
        jLabelEmail = new javax.swing.JLabel();
        AccountEmail = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(500, 500));

        HomeTab.setName(""); // NOI18N
        HomeTab.setOpaque(true);
        HomeTab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                HomeTabFocusGained(evt);
            }
        });

        AccueilTextArea1.setColumns(20);
        AccueilTextArea1.setRows(5);
        AccueilTextArea1.setText("Hello!\n\nWelcome to MARGO application.\n\nUse the top tabs to navigate within the app.");
        Accueil.setViewportView(AccueilTextArea1);

        HomeTab.addTab("Home", Accueil);

        filieresTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "(Lib Filiere)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        filieresScroll.setViewportView(filieresTable);

        AjoutFiliere.setText("Ajouter");
        AjoutFiliere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutFiliereActionPerformed(evt);
            }
        });

        nouvfiliere.setToolTipText("entrez le nom de la nouvelle classe");
        nouvfiliere.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nouvfiliereFocusGained(evt);
            }
        });

        LabelInfo.setText("Filiere à ajouter");

        javax.swing.GroupLayout filieresLayout = new javax.swing.GroupLayout(filieres);
        filieres.setLayout(filieresLayout);
        filieresLayout.setHorizontalGroup(
            filieresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filieresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nouvfiliere)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AjoutFiliere)
                .addGap(23, 23, 23))
            .addGroup(filieresLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LabelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(603, Short.MAX_VALUE))
            .addGroup(filieresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MessageAjoutFiliere, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(filieresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filieresLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(filieresScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addGap(57, 57, 57)))
        );
        filieresLayout.setVerticalGroup(
            filieresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filieresLayout.createSequentialGroup()
                .addContainerGap(389, Short.MAX_VALUE)
                .addComponent(LabelInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(filieresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AjoutFiliere)
                    .addComponent(nouvfiliere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MessageAjoutFiliere, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(filieresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filieresLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(filieresScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addGap(109, 109, 109)))
        );

        HomeTab.addTab("Gestion des Filieres", filieres);

        classesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "(Lib Classe)", "(Lib Filiere)"
            }
        ));
        classesScroll.setViewportView(classesTable);

        AjoutClasse.setText("Ajouter");
        AjoutClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutClasseActionPerformed(evt);
            }
        });

        nouvclasse.setToolTipText("entrez le nom de la nouvelle classe");

        listeFiliere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeFiliereActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout classesLayout = new javax.swing.GroupLayout(classes);
        classes.setLayout(classesLayout);
        classesLayout.setHorizontalGroup(
            classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nouvclasse, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(listeFiliere, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(AjoutClasse)
                .addGap(23, 23, 23))
            .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(classesScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addGap(57, 57, 57)))
        );
        classesLayout.setVerticalGroup(
            classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classesLayout.createSequentialGroup()
                .addContainerGap(395, Short.MAX_VALUE)
                .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AjoutClasse)
                    .addComponent(nouvclasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listeFiliere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(classesScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addGap(109, 109, 109)))
        );

        AjoutClasse.getAccessibleContext().setAccessibleName("AjoutClasse");

        HomeTab.addTab("Gestion des Classes", classes);

        etudiantsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "(Nom)", "(Prenom)", "(Situation)", "(Adresse)", "(Classe)"
            }
        ));
        etudiantsScroll.setViewportView(etudiantsTable);

        ListClasseB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListClasseBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout etudiantsLayout = new javax.swing.GroupLayout(etudiants);
        etudiants.setLayout(etudiantsLayout);
        etudiantsLayout.setHorizontalGroup(
            etudiantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(etudiantsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(etudiantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etudiantsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                    .addGroup(etudiantsLayout.createSequentialGroup()
                        .addComponent(ListClasseB, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        etudiantsLayout.setVerticalGroup(
            etudiantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, etudiantsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ListClasseB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(etudiantsScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        HomeTab.addTab("Gestion des Etudiants", etudiants);

        javax.swing.GroupLayout professeursLayout = new javax.swing.GroupLayout(professeurs);
        professeurs.setLayout(professeursLayout);
        professeursLayout.setHorizontalGroup(
            professeursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
        );
        professeursLayout.setVerticalGroup(
            professeursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        HomeTab.addTab("Gestion des Professeurs", professeurs);

        javax.swing.GroupLayout administrateursLayout = new javax.swing.GroupLayout(administrateurs);
        administrateurs.setLayout(administrateursLayout);
        administrateursLayout.setHorizontalGroup(
            administrateursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
        );
        administrateursLayout.setVerticalGroup(
            administrateursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        HomeTab.addTab("Gestion des administrateurs", administrateurs);

        jLabelUsername.setText("Username");

        AccountUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountUserNameActionPerformed(evt);
            }
        });

        jLabelUserPassword.setText("Password");

        jLabelEmail.setText("Email address");

        javax.swing.GroupLayout accountLayout = new javax.swing.GroupLayout(account);
        account.setLayout(accountLayout);
        accountLayout.setHorizontalGroup(
            accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountLayout.createSequentialGroup()
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabelUsername))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelUserPassword)
                            .addComponent(jLabelEmail))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AccountUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(AccountPassword)
                    .addComponent(AccountEmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        accountLayout.setVerticalGroup(
            accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsername)
                    .addComponent(AccountUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUserPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(AccountEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(335, Short.MAX_VALUE))
        );

        HomeTab.addTab("Mon compte", account);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomeTab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomeTab)
        );

        HomeTab.getAccessibleContext().setAccessibleName("Home");
    }// </editor-fold>//GEN-END:initComponents

  private void AccountUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountUserNameActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_AccountUserNameActionPerformed

    private void HomeTabFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HomeTabFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeTabFocusGained

    private void ListClasseBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListClasseBActionPerformed
        // TODO add your handling code here:
        EtudiantController tmpEtudiant=new EtudiantController() ;
        etudiantsTable.setModel(tmpEtudiant.Update(ListClasseB.getSelectedItem().toString()));
    }//GEN-LAST:event_ListClasseBActionPerformed

    private void AjoutClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutClasseActionPerformed
        // TODO add your handling code here:
        ClasseController tmpClasse= new ClasseController ();
        tmpClasse.AddClasse(nouvclasse.getText(), listeFiliere.getSelectedItem().toString());
        
        classesTable.setModel(tmpClasse.Update());
        ListClasseB.setModel(tmpClasse.GetListClasse());     
        
        

    }//GEN-LAST:event_AjoutClasseActionPerformed

    private void listeFiliereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeFiliereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listeFiliereActionPerformed

    private void AjoutFiliereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutFiliereActionPerformed
        // TODO add your handling code here:
        FiliereController tmpFiliere= new FiliereController ();
        int resultatAjoutFiliere=tmpFiliere.AddFiliere(nouvfiliere.getText());
        switch (resultatAjoutFiliere ){
            case -1:
                MessageAjoutFiliere.setForeground(Color.RED);
                MessageAjoutFiliere.setText("Erreur lors de l'ajout de filiere");
                break;
            case -2:
                MessageAjoutFiliere.setForeground(Color.RED);
                MessageAjoutFiliere.setText("Veuillez ajouter une filiere");
                break;
            case -3:
                MessageAjoutFiliere.setForeground(Color.RED);
                MessageAjoutFiliere.setText("Filiere Deja Presente");
                break;
            case -4:
                MessageAjoutFiliere.setForeground(Color.RED);
                MessageAjoutFiliere.setText("Filiere ne doit pas commencer par un espace");
                break;
            case -5:
                MessageAjoutFiliere.setForeground(Color.RED);
                MessageAjoutFiliere.setText("Filiere ne doit pas depasser 32 caractères");
                break;
                
            default:
                MessageAjoutFiliere.setForeground(Color.GREEN);
                MessageAjoutFiliere.setText("Ajout de la filiere Reussie");
        }
        
        filieresTable.setModel(tmpFiliere.Update());
        
        nouvfiliere.setText("");
        
        //FiliereController tmpFiliereB=new FiliereController() ;    
        listeFiliere.setModel(tmpFiliere.GetListFiliere());     
        
    }//GEN-LAST:event_AjoutFiliereActionPerformed

    private void nouvfiliereFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nouvfiliereFocusGained
        // TODO add your handling code here:
        MessageAjoutFiliere.setText("");
    }//GEN-LAST:event_nouvfiliereFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountEmail;
    private javax.swing.JPasswordField AccountPassword;
    private javax.swing.JTextField AccountUserName;
    private javax.swing.JScrollPane Accueil;
    private javax.swing.JTextArea AccueilTextArea1;
    private javax.swing.JButton AjoutClasse;
    private javax.swing.JButton AjoutFiliere;
    private javax.swing.JTabbedPane HomeTab;
    private javax.swing.JLabel LabelInfo;
    private javax.swing.JComboBox ListClasseB;
    private javax.swing.JLabel MessageAjoutFiliere;
    private javax.swing.JPanel account;
    private javax.swing.JPanel administrateurs;
    private javax.swing.JPanel classes;
    private javax.swing.JScrollPane classesScroll;
    private javax.swing.JTable classesTable;
    private javax.swing.JPanel etudiants;
    private javax.swing.JScrollPane etudiantsScroll;
    private javax.swing.JTable etudiantsTable;
    private javax.swing.JPanel filieres;
    private javax.swing.JScrollPane filieresScroll;
    private javax.swing.JTable filieresTable;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelUserPassword;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JComboBox listeFiliere;
    private javax.swing.JTextField nouvclasse;
    private javax.swing.JTextField nouvfiliere;
    private javax.swing.JPanel professeurs;
    // End of variables declaration//GEN-END:variables
}
