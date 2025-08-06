//patterns
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        for(int i =0; i<5; i++){
            for (int j = 0 ; j<5-i-1; j++){
                
                System.out.print(" ");
            }
            
            for(int k = 0 ; k<=2*i+1; k++){
                System.out.print("*");
            }
            
            for (int j = 0 ; j<5-i-1; j++){
                
                System.out.print(" ");
            }
            
            
            System.out.print("\n");
        }
    }
}

//pattern2:
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        for(int i =0; i<5; i++){
            for (int j = 1 ; j<5-i+1; j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}

//pattern 3:
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        for(int i =0; i<5; i++){
            for (int j = 0 ; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

//pattern4:
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        for(int i =0; i<5; i++){
            for (int j = 0 ; j<5; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
