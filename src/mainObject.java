import ca.pfv.spmf.algorithms.sequentialpatterns.prefixspan.AlgoPrefixSpan;

/**
 * Created by Ansel on 16/11/2017.
 */

public class mainObject {

    public static void main(String[] args) {
        AlgoPrefixSpan algo = new AlgoPrefixSpan();
        algo.setShowSequenceIdentifiers(true);
        algo.setMaximumPatternLength(5);

        try {
            algo.runAlgorithm("C:\\Users\\Ansel\\Desktop\\hackaton\\ans\\test", 0.20, "C:\\Users\\Ansel\\Desktop\\hackaton\\b.txt");
            System.out.print("Finished mining");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
