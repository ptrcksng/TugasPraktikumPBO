package com.pertemuan4Praktikum;
import java.awt.*;
import javax.swing.*;

class GUI extends JFrame {
    JLabel lnama = new JLabel("Nama Lengkap");
    final JTextField fnama = new JTextField(10);

    JLabel ljeniskelamin = new JLabel("Jenis Kelamin");
    JRadioButton rblaki = new JRadioButton("Laki-laki");
    JRadioButton rbperempuan = new JRadioButton("Perempuan");

    JLabel lkodebuku = new JLabel("Kode Buku");
    String[] kodeBuku = {"001","002","003","004","005"};
    JComboBox cmbkodeBuku = new JComboBox(kodeBuku);

    JLabel ltanggalpinjam = new JLabel("Tanggal Pinjam");
    //max peminjaman hanya tanggal 1-10
    String[] tanggal = {"1","2","3","4","5","6","7","8","9","10"};
    JComboBox cmbtanggal = new JComboBox(tanggal);
    String[] bulan = {"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
    JComboBox cmbbulan = new JComboBox(bulan);



    JButton bsave = new JButton("Save");
    JButton bexit = new JButton("Exit");

    public GUI() {
        setTitle("DATA PINJAM BUKU");
        setSize(500,500);

        ButtonGroup group = new ButtonGroup();
        group.add(rblaki);
        group.add(rbperempuan);

        setLayout(null);
        add(lnama);
        add(fnama);
        add(ljeniskelamin);
        add(rblaki);
        add(rbperempuan);
        add(lkodebuku);
        add(cmbkodeBuku);
        add(ltanggalpinjam);
        add(cmbtanggal);
        add(cmbbulan);
        add(bsave);
        add(bexit);

        lnama.setBounds(10,10,120,20);
        fnama.setBounds(130,10,150,20);
        ljeniskelamin.setBounds(10,35,120,20);
        rblaki.setBounds(130,35,100,20);
        rbperempuan.setBounds(230,35,100,20);
        lkodebuku.setBounds(10,60,150,20);
        cmbkodeBuku.setBounds(130,60,150,20);
        ltanggalpinjam.setBounds(10,80,120,20);
        cmbtanggal.setBounds(130,85,100,20);
        cmbbulan.setBounds(130,105,100,20);
        bsave.setBounds(100,130,120,20);
        bexit.setBounds(100,155,120,20);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null) ;
    }
}
