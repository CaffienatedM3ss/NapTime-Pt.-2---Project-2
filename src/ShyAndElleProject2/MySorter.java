public class MySorter {

    /*
     * Returns the authors' names.
     *  @return The names of the authors of this file.
     */
    public static String getAuthors() {
        return "Shy Daniell and Elle Spivey";
    }

    public static void sort(int[] a){
        if (a == null || a.length <=1){
            return;
        }
        mergeSort(a);
    }

    public static void mergeSort(int[] a){
        if (a.length > 1){
            int mid = a.length/2;
            int[] b = new int[mid];
            int[] c = new int[a.length - mid];

            for (int i = 0; i < b.length; i++){
                b[i] = a[i];
            }

            for (int i = 0; i < c.length; i++){
                c[i] = a[i + mid];
            }

            mergeSort(b);

            mergeSort(c);


            int j = 0;
            int k = 0;

            for (int i = 0; i < a.length; i++){
                if (j == b.length || (k < c.length && c[k] < b[j])){
                    a[i] = c[k];
                    k++;
                }
                else {
                    a[i] = b[j];
                    j++;
                }
            }
        }
    }

}