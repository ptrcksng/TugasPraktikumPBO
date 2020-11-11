package com.pertemuan4Praktikum;

import javax.swing.table.DefaultTableModel;

public class Tabel {

    private DefaultTableModel tabel = new DefaultTableModel();
    public Tabel(){
        getTabel().addColumn("Kode");
        getTabel().addColumn("Nama Buku");
    }

    public DefaultTableModel getTabel(){
        return tabel;
    }

    public void setTabel(DefaultTableModel tabel){
        this.tabel = tabel;
    }

}
