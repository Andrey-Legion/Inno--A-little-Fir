

public class Main {
    public static void print1(){

        for(int i=0;i<4;i++){
            System.out.println("5 5 5 5 5");

        }
    }
    //Task-Ёлочка (A Little Fir)
    public static void print2(int num,int rows,int columns){
            int counter=1;
            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++) {
                    columns=counter;
                    System.out.print(num + " ");
                }
                counter++;
                System.out.println();
            }
    }
    public static void print(int num, int rows, int columns){

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(7,10,3);
        System.out.println("Hello world!");
        print1();
        print2(5,5,5);
    }
}