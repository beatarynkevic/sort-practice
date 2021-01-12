int[] m = {1, 2, 3, 4, 5};

int[][] rez = new int[m.length][m.length];

for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                rez[i][j] = m[(i + j) % m.length];
//                rez[i][(i + j) % m.length] = m[j];
            }
        }
