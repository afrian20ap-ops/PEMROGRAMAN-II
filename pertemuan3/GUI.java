package pertemuan3;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GUI extends JFrame {

    private JTextField txtNama, txtNim, txtJurusan;
    private JButton btnSimpan, btnHapus, btnClear;
    private JTable table;
    private DefaultTableModel model;

    public GUI() {
        setTitle("Aplikasi Data Mahasiswa");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Label
        JLabel lblNama = new JLabel("Nama");
        lblNama.setBounds(20, 20, 100, 25);
        add(lblNama);

        JLabel lblNim = new JLabel("NIM");
        lblNim.setBounds(20, 50, 100, 25);
        add(lblNim);

        JLabel lblJurusan = new JLabel("Jurusan");
        lblJurusan.setBounds(20, 80, 100, 25);
        add(lblJurusan);

        // TextField
        txtNama = new JTextField();
        txtNama.setBounds(120, 20, 150, 25);
        add(txtNama);

        txtNim = new JTextField();
        txtNim.setBounds(120, 50, 150, 25);
        add(txtNim);

        txtJurusan = new JTextField();
        txtJurusan.setBounds(120, 80, 150, 25);
        add(txtJurusan);

        // Button
        btnSimpan = new JButton("Simpan");
        btnSimpan.setBounds(300, 20, 100, 25);
        add(btnSimpan);

        btnHapus = new JButton("Hapus");
        btnHapus.setBounds(300, 50, 100, 25);
        add(btnHapus);

        btnClear = new JButton("Clear");
        btnClear.setBounds(300, 80, 100, 25);
        add(btnClear);

        // Table
        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 130, 440, 200);
        add(scrollPane);

        model = new DefaultTableModel();
        table.setModel(model);
        model.addColumn("Nama");
        model.addColumn("NIM");
        model.addColumn("Jurusan");

        // Action Simpan
        btnSimpan.addActionListener(e -> {
            String nama = txtNama.getText();
            String nim = txtNim.getText();
            String jurusan = txtJurusan.getText();

            if (nama.isEmpty() || nim.isEmpty() || jurusan.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Data tidak boleh kosong!");
            } else {
                model.addRow(new Object[]{nama, nim, jurusan});
                clearForm();
            }
        });

        // Action Hapus
        btnHapus.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row != -1) {
                model.removeRow(row);
            } else {
                JOptionPane.showMessageDialog(this, "Pilih data dulu!");
            }
        });

        // Action Clear
        btnClear.addActionListener(e -> clearForm());
    }

    private void clearForm() {
        txtNama.setText("");
        txtNim.setText("");
        txtJurusan.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GUI().setVisible(true));
    }
}
