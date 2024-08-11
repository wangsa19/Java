package com.tutorial;

class Mahasiswa{
  // data member
  String nama = "nama asli";
  String NRP;
  // constructor
  Mahasiswa(String nama, String inputNRP){
    this.nama = nama;
    this.NRP = inputNRP;
  }
  // method tanpa return dan tanpa parameter
  void show(){
    System.out.println("Nama : " + this.nama);
    System.out.println("NRP : " + this.NRP);
  }
  // method tanpa return dan dengan parameter
  void setNama(String nama){
    this.nama = nama;
  }
  // method dengan return tapi tidak ada parameter
  String getNama(){
    return this.nama;
  }
  String getNRP(){
    return this.NRP;
  }
  // method dengan return dan parameter
  String sayHi(String message){
    return message + " juga, nama saya adalah " + this.nama;
  }
}

class Dosen{
  String nama;

  Dosen(String nama){
    this.nama = nama;
  }
}

public class Main {

  public static void main(String[] args) {

    Mahasiswa mhs = new Mahasiswa("Udin", "123");
    // method
    mhs.show();
    mhs.setNama("Wangsa");
    mhs.show();

    System.out.println(mhs.getNama());
    System.out.println(mhs.getNRP());

    String data = mhs.sayHi("Halo");
    System.out.println(data);

  }

}