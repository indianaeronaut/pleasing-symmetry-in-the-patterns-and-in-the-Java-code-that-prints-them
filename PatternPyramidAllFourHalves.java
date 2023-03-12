//                         (y)
//                          |
//       Quadrant 2 (- , +) | (+ , +) Quadrant 1
//                          |
//                       *  |  *
//                      **  |  **
//                     ***  |  ***
//                    ****  |  ****
//          ----------------|---------------- (x)
//                    ****  |  ****
//                     ***  |  ***
//                      **  |  **
//                       *  |  *
//                          |
//       Quadrant 3 (- , -) | (+ , -) Quadrant 4
//                          |
//                          |

public class PatternPyramidAllFourHalves {
    public static void main(String[] args){
        int n = 8;

        // Right Half of Pyramid in Quadrant 1 (x/j = +ve & y/i = +ve)
        // *
        // **
        // ***
        // ****

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (j >=1 && j <= i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        // Left Half of Inverted Pyramid in Quadrant 4 (x/j = +ve & y/i = -ve)
        // ****
        // ***
        // **
        // *

        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= n; j++){
                if (j >=1 && j <= i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        // Left Half of Pyramid in Quadrant 2 (x/j = -ve & y/i = +ve)
        //    *
        //   **
        //  ***
        // ****

        for (int i = 1; i <= n; i++){
            for (int j = n; j >= 1; j--){
                if (j >=1 && j <= i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

       // Left Half of Inverted Pyramid in Quadrant 3  (x/j = -ve & y/i = -ve)
       // ****
       //  ***
       //   **
       //    *

        for (int i = n; i >= 1; i--){
            for (int j = n; j >= 1; j--){
                if (j >=1 && j <= i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}

