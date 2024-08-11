package com.tutorial;

// class tanpa constructor / class polos
class Polos{
  String dataString;
  int dataInteger;
}

// class dengan constructor
class Mahasiswa{
  String Nama;
  String NRP;
  String jurusan;

  // constructor dipanggil saat object pertama kali dibuat
  // Mahasiswa(){
  //   System.out.println("Constructor Mahasiswa dipanggil");
  // }

  // constructor dengan parameter
  Mahasiswa(String Nama, String NRP, String jurusan){
    this.Nama = Nama;
    this.NRP = NRP;
    this.jurusan = jurusan; 

    System.out.printf("Nama: " + this.Nama + "\nNRP: " + this.NRP + "\nJurusan: " + this.jurusan + "\n");
  }
}

public class Main {
  public static void main(String[] args) {

    new Mahasiswa("Wangsa", "3123500007", "Teknik Informatika");

    Polos objectPolos = new Polos();
    objectPolos.dataString = "polos";
    objectPolos.dataInteger = 0;

    System.out.println(objectPolos.dataString);
    System.out.println(objectPolos.dataInteger);

  }
}
