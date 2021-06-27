package ortalama;

 public class harmonikortalama {

    public static void main(String[] args) {
        int i, n;
        int dizi[] = {5, 9, 7, 4, 1};
        double ort = 0;

        for (i = 0; i < dizi.length; i++) {
            ort = ort + (1.0 / dizi[i]);
        }
        ort = dizi.length / ort;
        System.out.println("Harmonik Ortalamasý : " + ort);
    }

}