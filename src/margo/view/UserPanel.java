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
    
    initialiseAccountpage(user);
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
        jTxtFieldNom = new javax.swing.JTextField();
        jLabelUserPassword = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelUserPassword1 = new javax.swing.JLabel();
        jLabelUserPassword2 = new javax.swing.JLabel();
        jCmbRole = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jCmbSituation = new javax.swing.JComboBox();
        jBtnChangeMdp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTxtFieldLogin = new javax.swing.JTextField();
        jLblOldMdp = new javax.swing.JLabel();
        jLblNewMdp = new javax.swing.JLabel();
        jPwdFieldOldMdp = new javax.swing.JPasswordField();
        jPwdFieldNewMdp = new javax.swing.JPasswordField();
        jBtnValider = new javax.swing.JButton();
        jBtnAnnuler = new javax.swing.JButton();
        jTxtFieldPrenom = new javax.swing.JTextField();
        jTxtFieldMail = new javax.swing.JTextField();
        jTxtFieldAdresse = new javax.swing.JTextField();

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
                .addContainerGap(412, Short.MAX_VALUE)
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
                    .addComponent(filieresScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
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
                .addContainerGap(416, Short.MAX_VALUE)
                .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AjoutClasse)
                    .addComponent(nouvclasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listeFiliere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(classesScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
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
            .addGap(0, 498, Short.MAX_VALUE)
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
            .addGap(0, 498, Short.MAX_VALUE)
        );

        HomeTab.addTab("Gestion des administrateurs", administrateurs);

        account.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                accountFocusGained(evt);
            }
        });

        jLabelUsername.setText("Nom");

        jTxtFieldNom.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTxtFieldNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFieldNomActionPerformed(evt);
            }
        });

        jLabelUserPassword.setText("Prénom");

        jLabelEmail.setText("Situation");

        jLabelUserPassword1.setText("Adresse");

        jLabelUserPassword2.setText("Mail");

        jCmbRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administration", "Etudiant", "Professeur", "Intervenant", "Technicien", "Enfant" }));
        jCmbRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbRoleActionPerformed(evt);
            }
        });

        jLabel1.setText("Rôle");

        jCmbSituation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CELIBATAIRE", "MARIE", "NON DEFINI" }));
        jCmbSituation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbSituationActionPerformed(evt);
            }
        });

        jBtnChangeMdp.setText("Changer le mot de passe");
        jBtnChangeMdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnChangeMdpActionPerformed(evt);
            }
        });

        jLabel2.setText("Login");

        jTxtFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFieldLoginActionPerformed(evt);
            }
        });

        jLblOldMdp.setText("Ancien mot de passe");

        jLblNewMdp.setText("Nouveau mot de passe");

        jPwdFieldOldMdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPwdFieldOldMdpActionPerformed(evt);
            }
        });

        jBtnValider.setText("Valider changements");
        jBtnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnValiderActionPerformed(evt);
            }
        });

        jBtnAnnuler.setText("Annuler");
        jBtnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAnnulerActionPerformed(evt);
            }
        });

        jTxtFieldPrenom.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jTxtFieldMail.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jTxtFieldAdresse.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout accountLayout = new javax.swing.GroupLayout(account);
        account.setLayout(accountLayout);
        accountLayout.setHorizontalGroup(
            accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountLayout.createSequentialGroup()
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(accountLayout.createSequentialGroup()
                        .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(accountLayout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabelUsername))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelUserPassword1)
                                        .addComponent(jLabelUserPassword))
                                    .addComponent(jLabelUserPassword2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtFieldPrenom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(jTxtFieldMail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTxtFieldAdresse)))
                    .addGroup(accountLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(accountLayout.createSequentialGroup()
                                .addComponent(jLabelEmail)
                                .addGap(10, 10, 10)
                                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCmbRole, 0, 163, Short.MAX_VALUE)
                                    .addComponent(jCmbSituation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jTxtFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLblOldMdp)
                    .addComponent(jLblNewMdp)
                    .addComponent(jBtnValider))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountLayout.createSequentialGroup()
                        .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPwdFieldOldMdp)
                            .addComponent(jTxtFieldLogin)
                            .addComponent(jPwdFieldNewMdp, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                        .addComponent(jBtnChangeMdp)
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(accountLayout.createSequentialGroup()
                        .addComponent(jBtnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        accountLayout.setVerticalGroup(
            accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsername)
                    .addComponent(jTxtFieldNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnChangeMdp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUserPassword)
                    .addComponent(jLblOldMdp)
                    .addComponent(jPwdFieldOldMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUserPassword1)
                    .addComponent(jLblNewMdp)
                    .addComponent(jPwdFieldNewMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFieldAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUserPassword2)
                    .addComponent(jTxtFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCmbSituation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail)
                    .addComponent(jBtnValider)
                    .addComponent(jBtnAnnuler))
                .addContainerGap(220, Short.MAX_VALUE))
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

    private void HomeTabFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HomeTabFocusGained
        
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

    private void jCmbRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbRoleActionPerformed

    private void jTxtFieldNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFieldNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFieldNomActionPerformed

    private void jCmbSituationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbSituationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbSituationActionPerformed

    private void jTxtFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFieldLoginActionPerformed

    private void jBtnChangeMdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnChangeMdpActionPerformed
        jPwdFieldOldMdp.setVisible(true);
        jLblOldMdp.setVisible(true);
        jPwdFieldNewMdp.setVisible(true);
        jLblNewMdp.setVisible(true);
    }//GEN-LAST:event_jBtnChangeMdpActionPerformed

    private void jPwdFieldOldMdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPwdFieldOldMdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPwdFieldOldMdpActionPerformed

    private void jBtnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAnnulerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAnnulerActionPerformed

    private void jBtnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnValiderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnValiderActionPerformed

    private void accountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accountFocusGained
        
    }//GEN-LAST:event_accountFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton jBtnAnnuler;
    private javax.swing.JButton jBtnChangeMdp;
    private javax.swing.JButton jBtnValider;
    private javax.swing.JComboBox jCmbRole;
    private javax.swing.JComboBox jCmbSituation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelUserPassword;
    private javax.swing.JLabel jLabelUserPassword1;
    private javax.swing.JLabel jLabelUserPassword2;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JLabel jLblNewMdp;
    private javax.swing.JLabel jLblOldMdp;
    private javax.swing.JPasswordField jPwdFieldNewMdp;
    private javax.swing.JPasswordField jPwdFieldOldMdp;
    private javax.swing.JTextField jTxtFieldAdresse;
    private javax.swing.JTextField jTxtFieldLogin;
    private javax.swing.JTextField jTxtFieldMail;
    private javax.swing.JTextField jTxtFieldNom;
    private javax.swing.JTextField jTxtFieldPrenom;
    private javax.swing.JComboBox listeFiliere;
    private javax.swing.JTextField nouvclasse;
    private javax.swing.JTextField nouvfiliere;
    private javax.swing.JPanel professeurs;
    // End of variables declaration//GEN-END:variables

    private void initialiseAccountpage(Personne user) {
        jPwdFieldOldMdp.setVisible(false);
        jLblOldMdp.setVisible(false);
        jPwdFieldNewMdp.setVisible(false);
        jLblNewMdp.setVisible(false);
        
        jTxtFieldNom.setText(user.getNom());
        jTxtFieldPrenom.setText(user.getPrenom());
        jTxtFieldAdresse.setText(user.getAdresse());
        jTxtFieldMail.setText(user.getMail());
        jTxtFieldLogin.setText(user.getLogin());
        jCmbRole.setSelectedIndex(user.getType()-1);
        
        switch(user.getSituationFamilial()){
            case "CELIBATAIRE":
                jCmbSituation.setSelectedIndex(0);
                break;
            case "MARIE":
                jCmbSituation.setSelectedIndex(1);
                break;
            default:
                jCmbSituation.setSelectedIndex(2);
        }
    }
}
