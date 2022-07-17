import java.util.HashMap;
import java.util.HashSet;

public class DNA {


    private String dnaSeq;
    HashMap<String, Double> chemicals;
    public DNA(String seq){
        this.dnaSeq = seq;
    }


    private boolean isProtein(){

        // Check if seq contains start and stop codons
        if(this.dnaSeq.contains("ATG") && ( this.dnaSeq.contains("UAA") || this.dnaSeq.contains("UAG") || this.dnaSeq.contains("UGA") ) ){

            // Check if start codon at start of seq
            if(this.dnaSeq.indexOf("ATG") == 0){

                return true;

            }
        }

        return false;

    }

    private static String mutate(String dnaSeq, String codon, String mutation){
        //create a new string called mutated to replace with the altered dnaSeq
        String mutated = dnaSeq.replaceAll(codon, mutation);

        return mutated;
    }

    DNA () {
        chemicals = new HashMap<>();

    }

    public void addToMap (String chem, double conc) {
        chemicals.put(chem,conc);
        System.out.println(chemicals);

    }






    public static void main (String[] args) {

        DNA hashmap = new DNA();
        String chem1 = "lactate";
        String chem2 = "glucose";
        Double conc1 = 5.2;
        Double conc2 = 3.2;

        addToMap(chem1, conc1);








    }





}