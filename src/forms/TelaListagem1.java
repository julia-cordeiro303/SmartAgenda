package forms;

import beans.Agendamento;
import javax.swing.table.DefaultTableModel;
import dao.AgendamentoDAO;
import java.util.List;
import javax.swing.table.TableRowSorter;


public class TelaListagem1 extends javax.swing.JFrame {


    public TelaListagem1() {
        initComponents();
        preencherTabela();
    }
    
                
     private void preencherTabela() {
       
        
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        
        String data = txtData.getText();
        List<Agendamento> listaAgendamento = agendamentoDAO.getAgendamento1(data);
        
        DefaultTableModel tabelaAgendamento = (DefaultTableModel) tblAgenda.getModel();
        tabelaAgendamento.setNumRows(0);
        tblAgenda.setRowSorter(new TableRowSorter(tabelaAgendamento));
        
        for (Agendamento a : listaAgendamento) {
        
        Object[] o = new Object[] {
            a.getData(),
            a.getHorario(),
            a.getFuncionarioAgendamento(),
            a.getNomeAluno(),
            a.getNomeResponsavel(),
            a.getId()
        };
            tabelaAgendamento.addRow(o);
            
            
        }
    }
  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            new TelaListagem1().setVisible(true);
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAgenda = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Relatório de agendamentos");

        tblAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Horário", "Funcionário", "Nome do Aluno", "Nome do Responsável", "Id"
            }
        ));
        jScrollPane2.setViewportView(tblAgenda);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Buscar por data de agendamento:");

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        preencherTabela();
    }//GEN-LAST:event_txtDataActionPerformed
            
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAgenda;
    private javax.swing.JTextField txtData;
    // End of variables declaration//GEN-END:variables
        }
