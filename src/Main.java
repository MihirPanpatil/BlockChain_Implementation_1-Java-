import java.util.*;

public class Main {
    
    ArrayList<Block> blockchain = new ArrayList<>(); //Using Dynamic array for storing Blocks.


    //The following procedure does not involve a Method to Generate a Block.
    //Each Block needs to be generated Manually.
    //Hence, decreasing Code Optimisation and Efficiency.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] Transaction1 = {"Genesis Block Generated!"};
        System.out.println("Enter value of Genesis Block : ");
        int amount1 = sc.nextInt();
        Block genesisBlock = new Block(0, Transaction1, amount1);

        
        String[] Transaction2 = {"2nd Block Generated"};
        System.out.println("Enter value of 2nd Block     : ");
        int amount2 = sc.nextInt();
        Block block2 = new Block(genesisBlock.getBlockHash(), Transaction2, amount2);


        String[] Transaction3 = {"Block 3 Transaction", "Transaction Verified..."};
        System.out.println("Enter value of 3rd Block     : ");
        int amount3 = sc.nextInt();
        Block block3 = new Block(block2.getBlockHash(), Transaction3, amount3);


        String[] Transaction4 = {"Block 4 Transaction", "Transaction Verified..."};
        System.out.println("Enter value of 4th Block     : ");
        int amount4 = sc.nextInt();
        Block block4 = new Block(block3.getBlockHash(), Transaction4, amount4);


        String[] Transaction5 = {"Block 5 Transaction", "Transaction Verified..."};
        System.out.println("Enter value of 5th Block     : ");
        int amount5 = sc.nextInt();
        Block block5 = new Block(block4.getBlockHash(), Transaction5, amount5);


        String[] Transaction6 = {"Block 6 Transaction", "Transaction Verified..."};
        System.out.println("Enter value of 6th Block     : ");
        int amount6 = sc.nextInt();
        Block block6 = new Block(block5.getBlockHash(), Transaction6, amount6);


        String[] Transaction7 = {"Block 7 Transaction", "Transaction Verified..."};
        System.out.println("Enter value of 7th Block     : ");
        int amount7 = sc.nextInt();
        Block block7 = new Block(block6.getBlockHash(), Transaction7, amount7);


        String[] Transaction8 = {"Block 8 Transaction", "Transaction Verified..."};
        System.out.println("Enter value of 8th Block     : ");
        int amount8 = sc.nextInt();
        Block block8 = new Block(block7.getBlockHash(), Transaction8, amount8);

        
        String[] Transaction9 = {"Block 9 Transaction", "Transaction Verified..."};
        System.out.println("Enter value of 9th Block     : ");
        int amount9 = sc.nextInt();
        Block block9 = new Block(block8.getBlockHash(), Transaction9, amount9);


        String[] Transaction10 = {"Block 10 Transaction", "Transaction Verified..."};
        System.out.println("Enter value of 10th Block     : ");
        int amount10 = sc.nextInt();
        Block block10 = new Block(block9.getBlockHash(), Transaction10, amount10);


        System.out.println("Hash of Genesis block : " + genesisBlock.getBlockHash());
        System.out.println("Hash of Block 2       : " + block2.getBlockHash());
        System.out.println("Hash of Block 3       : " + block3.getBlockHash());
        System.out.println("Hash of Block 4       : " + block4.getBlockHash());
        System.out.println("Hash of Block 5       : " + block5.getBlockHash());
        System.out.println("Hash of Block 6       : " + block6.getBlockHash());
        System.out.println("Hash of Block 7       : " + block7.getBlockHash());
        System.out.println("Hash of Block 8       : " + block8.getBlockHash());
        System.out.println("Hash of Block 9       : " + block9.getBlockHash());
        System.out.println("Hash of Block 10      : " + block10.getBlockHash());
        sc.close();
    }
}