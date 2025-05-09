public class array_de {
/* 
    public static void main(String[] args) {

        int[][] arr = {{1, 2}, {3, 4}, {5, 6}}; 
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j&&arr[i][j]!=0){ {
                    c=1;
                }
                }else if(i!=j&&arr[i][j]!=0){
                    c=0;
                }


            }
            if(c==1){
                System.out.println("The matrix is a diagonal matrix.");
            }else{
                System.out.println("The matrix is not a diagonal matrix.");
            }
        }
    }
    
}

public static void main(String[] args) {
    int[][] arr = {{1, 0, 0}, {0, 2, 0}, {0, 0, 3}}; 
    boolean isDiagonal = true;
    
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if (i != j && arr[i][j] != 0) {
                isDiagonal = false;
                break;
            }
        }
    }
    
    if (isDiagonal) {
        System.out.println("The matrix is a diagonal matrix.");
    } else {
        System.out.println("The matrix is not a diagonal matrix.");
    }
}
}

public static void main(String[] args) {
    int[][] arr = {{1, 0, 0}, {5, 2, 0}, {4, 2, 3}}; 
    boolean islowerTriangular = true;   
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if (i < j && arr[i][j] != 0) {
                islowerTriangular = false;
                break;
            }
        }
    }
    if (islowerTriangular) {
        System.out.println("The matrix is a lower triangular matrix.");
    } else {
        System.out.println("The matrix is not a lower triangular matrix.");
    }

}
}
*/
public static void main(String[] args) {
    int[][] arr = {{2, 3, 6}, {3, 4, 5, 6}, {6, 5, 9}};
    boolean isSymmetric = true;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if (i < arr[i].length && j < arr.length && arr[i][j] != arr[j][i]) {
                isSymmetric = false;
                break;
            }
        }
        if (!isSymmetric) break;
    }

    if (isSymmetric) {
        System.out.println("The matrix is a symmetric matrix.");
    } else {
        System.out.println("The matrix is not a symmetric matrix.");
    }
}
}