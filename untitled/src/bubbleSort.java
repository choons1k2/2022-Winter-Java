public class bubbleSort {
    public static void main(String[] args) {

        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {

            System.out.print(
             numArr[i] = (int) (Math.random()*10));

        }

        System.out.println();
        //
        // Bubble Sort: counter-> length -1 - number of iterations
        // (start point: fix end point: <----)
        for(int i=0; i<numArr.length-1; i++)    {
            boolean changed = false;


            for(int j=0; j<numArr.length-1-i; j++){

                if(numArr[j] > numArr[j+1]) {
                    int tmp = numArr[j+1];
                    numArr[j+1] = numArr[j];
                    numArr[j] = tmp;
                    changed = true;

                }

            }//end j

            if(!changed)
                break;//if no changed num -> break iter : prevent overhead

            for(int k=0; k<numArr.length; k++){
                System.out.print(numArr[k]);
            }
            System.out.println();

        }//end i

        }//end main


    }

