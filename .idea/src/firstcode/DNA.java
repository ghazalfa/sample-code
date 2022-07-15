import java.util.HashMap;
import java.util.HashSet;

public class DNA {
    private String dnaSeq;

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

    private static HashMap<String, Double> chemicals (String chemical, double concentration){
        HashMap<String, Double> chemicals = new HashMap<>();

        //adds the chemical and concentration that was inputted into the parameters as a ..
        // ..new key and value for the HashMap
        chemicals.put(chemical,concentration);

        // below was used to trasnverse through hashmap to ensure method was working properly
        //for (String key : chemicals.keySet()) {
            //System.out.println(key + chemicals.get(key));
        //}
        return chemicals;
    }


    private static HashSet<String> SurroundingMolecules (String molecule){
        HashSet <String> SurroundingMolecules = new HashSet<>();

        //the molecule that was inputted into parameters is added to HashSet named SurroundingMolecules
        SurroundingMolecules.add(molecule);

        //Hashset is returned
        return SurroundingMolecules;

    }





}