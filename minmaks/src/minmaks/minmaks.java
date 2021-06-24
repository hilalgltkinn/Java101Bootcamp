package minmaks;

public class minmaks {
public static void main(String[] args) {double[] arrVeriler = {10, 11, 88, 99, 100};
double[] arrMinMax = new double[arrVeriler.length];
double max = arrVeriler[0];
double min = arrVeriler[0];
for (int i = 0; i < arrVeriler.length; i++) {
if (arrVeriler[i] < min) {
min = arrVeriler[i];
}
if (arrVeriler[i] > max) {
max = arrVeriler[i];
}
}
System.out.println("Max : " + max);
System.out.println("Min : " + min);
//Tum tablo icin min max normalizasyonu yap
double sonuc;
for (int i = 0; i < arrVeriler.length; i++) {
sonuc = (arrVeriler[i] - min) / (max - min);
arrMinMax[i] = sonuc;
}
for (int i = 0; i < arrVeriler.length; i++) {
System.out.println(arrVeriler[i] + " " + arrMinMax[i]);}}
}