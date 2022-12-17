package java_final;

public class ExcelMultiDm {
    public static void main(String[] args) {

        int[] ms = {5,15,25};

        int [][] ma = {{5,15,25},{30,35,40},{45,50,55},{60,65,70}};


        for (int row = 0; row<ma.length; row++){


            for (int column = 0 ; column < ma[row].length;column++){

                System.out.print(ma[row][column ]+ "\t\t");
            }

            System.out.println();
        }
    }
}
