public class maksmin{
    public static void main(String[] args) {
        int[] list = {6, 34, 78, 101, -9, -33};
      
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Deðer " + min);
        System.out.println("Maximum Deðer " + max);

    }
}

