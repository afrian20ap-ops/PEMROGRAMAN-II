/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author lusia
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TabelMahasiswa extends JFrame {

    private JTable table;
    private DefaultTableModel model;

    public TabelMahasiswa() {
        setTitle("Pertemuan 4 - JTable");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Inisialisasi tabel
        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        // Model tabel
        model = new DefaultTableModel();
        table.setModel(model);

        // Tambah kolom
        model.addColumn("Nama");
        model.addColumn("NIM");
        model.addColumn("Jurusan");

        // Tambah data contoh
        model.addRow(new Object[]{"Andi", "221011", "Informatika"});
        model.addRow(new Object[]{"Budi", "221012", "Sistem Informasi"});
        model.addRow(new Object[]{"Citra", "221013", "Teknik Komputer"});
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TabelMahasiswa().setVisible(true));
    }
}