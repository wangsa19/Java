package com.tutorial;

// membuat class sebagai template
class Mahasiswa{
  String nama;
  String NRP;
  String jurusan;
  double IPK;
  int umur;
}


public class Main {
  public static void main(String[] args) {

    // instansiasi membuat objek Mahasiswa
    Mahasiswa mhs = new Mahasiswa();
    mhs.nama = "Wangsa";
    mhs.NRP = "3123500007";
    mhs.jurusan = "Teknik Informatika";
    mhs.IPK = 4.0;
    mhs.umur = 19;

    System.out.println(mhs.nama);
    System.out.println(mhs.NRP);
    System.out.println(mhs.jurusan);
    System.out.println(mhs.IPK);
    System.out.println(mhs.umur);

    System.out.printf("\n");
    
    Mahasiswa mhs2 = new Mahasiswa();
    mhs2.nama = "Otong";
    mhs2.NRP = "3123500016";
    mhs2.jurusan = "Teknik Informatika";
    mhs2.IPK = 3.5;
    mhs2.umur = 19;

    System.out.println(mhs2.nama);
    System.out.println(mhs2.NRP);
    System.out.println(mhs2.jurusan);
    System.out.println(mhs2.IPK);
    System.out.println(mhs2.umur);

  }
}
