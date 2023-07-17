package org.example;

public class Karyawan {
    private String nik;
    private String nama;
    private String alamat;
    private String jabatan;

    public Karyawan(String nik, String nama, String alamat, String jabatan) {
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
        this.jabatan = jabatan;
    }

    public void getProfil() {
        System.out.println("Nama: " + nama + " alamat: " + alamat + " nik: " + nik + " jabatan: " + jabatan);
    }
}
