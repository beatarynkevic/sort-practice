package projektas1;

 class Projektas1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

int[][] ext = new int[arr.length][arr.length];

int offset = 0;

for (int i = 0; i < ext.length; i++, offset++) {             // Jeigu i kita puse: offset--
    int[] line = ext[i];
    for (int j = 0; j < line.length; j++) {
        int temp = offset;
        if (temp + j > line.length - 1) temp -= line.length ;            //(temp + j < 0) temp += line.length
        line[j] = arr[temp + j];
        System.out.print(line[j]);
    }
    System.out.println("");    
}
    }
    
}

/*
 tikstas yra isrusiuoti nurodyta tvarka:
int[][] mr = {
            {1, 2, 3, 4, 5},
            {2, 3, 4, 5, 1},
            {3, 4, 5, 1, 2},
            {4, 5, 1, 2, 3},
            {5, 1, 2, 3, 4}
        };
 
        int[][] mr1 = {
            {1, 2, 3, 4, 5},
            {5, 1, 2, 3, 4},
            {4, 5, 1, 2, 3},
            {3, 4, 5, 1, 2},
            {2, 3, 4, 5, 1}
        };
*/
