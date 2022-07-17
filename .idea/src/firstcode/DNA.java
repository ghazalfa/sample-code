import java.util.HashMap;
import java.util.HashSet;

public class DNA {


    private String dnaSeq;
    static HashMap<String, Double> chemicals;
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

    DNA(String chem, double conc){
        chemicals = new HashMap<>();
        chemicals.put(chem,conc);

    }

    public static void fillMap(String chem, double conc){
        chemicals.put(chem,conc);
    }




    public static void main (String[] args) {

        String chem1 = "lactate";
        String chem2 = "glucose";
        Double conc1 = 5.2;
        Double conc2 = 3.2;

        DNA stats = new DNA (chem1, conc1);
        fillMap(chem2,conc2);


    }





}