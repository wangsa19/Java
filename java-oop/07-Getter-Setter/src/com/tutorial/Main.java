package com.tutorial;

class Data{
  public int intPublic;
  private int intPrivate;
  private double doublePrivate;

  public Data() {
    this.intPublic = 0;
    this.intPrivate = 20;
  }

  void display(){
    System.out.println(this.intPublic);
    System.out.println(this.intPrivate);
    System.out.println(this.doublePrivate);
  }

  // getter
  public int getIntPrivate() {
    return this.intPrivate;
  }

  // setter
  public void setDoublePrivate(double value) {
    this.doublePrivate = value;
  }
}

class Lingkaran{
  private double diameter;

  Lingkaran(double diameter){
    this.diameter = diameter;
  }

  // setter
  public void setJari2(double jari2){
    this.diameter = jari2*2;
  }

  // getter
  public double getDiameter(){
    return this.diameter / 2;
  }

  // getter
  public double getLuas(){
    return 3.14 * (this.diameter / 2) * (this.diameter / 2);
  }
}

public class Main {
  public static void main(String[] args) {
    Data object = new Data();

    // read and write with public
    object.intPublic = 10; // Write
    System.out.println(object.intPublic); // Read

    // read only (kita bisa menggunakan GETTER)
    int angka = object.getIntPrivate();
    System.out.println("getter: " + angka);

    // write only (kita bisa menggunakan SETTER)
    object.setDoublePrivate(0.05);

    // show data
    object.display();

    // gabungkan read dan write dengan getter dan setter
    Lingkaran object2 = new Lingkaran(5);
    System.out.println("jari-jari: " + object2.getDiameter());
    object2.setJari2(7);
    System.out.println("jari-jari: " + object2.getDiameter());
    System.out.println("luas: " + object2.getLuas());
  }
}
