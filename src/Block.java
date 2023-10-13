import java.util.Arrays;

public class Block {
    
    private int previousHash;     //For storing Previous Hash.
    private String[] transaction; //For storing any format String data.
    private String name;          //Fpr storing Name.
    private int amount;           //For storing the transaction amount.
    private int blockHash;        //For storing currrent Hash.
    
    public Block(int previousHash, String[] transaction, int amount) {  //Block Constructor.
        this.previousHash = previousHash;
        this.transaction = transaction;
        this.amount = amount;


        //The Hash is Generated using hashcode Method from Arrays Library.
        Object[] contens = {Arrays.hashCode(transaction), previousHash, amount};
        this.blockHash = Arrays.hashCode(contens);
    }

    public int getPreviousHash() {        //Getter method for Previous Hash.
        return previousHash;
    }
    public String getName() {             //Getter method for Name. 
        return name;        
    }
    public int getBlockHash() {           //Getter method for current Hash.
        return blockHash;
    }
    public int getAmount() {              //Getter method for Transaction Amount.
        return amount;
    }
    public String[] getTransaction() {    //Getter method for Format String data.
        return transaction;
    }

}
