import ca.pfv.spmf.algorithms.sequentialpatterns.prefixspan.AlgoPrefixSpan;

import java.io.*;

/**
 * Created by Ansel on 16/11/2017.
 */

public class mainObject {

    public static void main(String[] args) {
        AlgoPrefixSpan algo = new AlgoPrefixSpan();
        algo.setShowSequenceIdentifiers(true);
        algo.setMaximumPatternLength(5);

        try {
            //algo.runAlgorithm("C:\\Users\\Ansel\\Desktop\\hackaton\\ans\\test", 0.20, "C:\\Users\\Ansel\\Desktop\\hackaton\\b.txt");
            System.out.print("Finished mining");

            File patternsFile = new File("C:\\Users\\Ansel\\Desktop\\hackaton\\b.txt");
            FileReader fileReader = new FileReader(patternsFile);
            BufferedReader bfreader = new BufferedReader(fileReader);
            String line;
            String[] firstSplit;
            String[] pattern;

            line = bfreader.readLine();
            line = bfreader.readLine();
            //while ((line = bfreader.readLine()) != null) {
                firstSplit = line.split("( #SUP: )|( #SID: )");

                System.out.println(firstSplit[0]);

                pattern = firstSplit[0].substring(0, firstSplit[0].length()-3).split(" -1 ");

                System.out.println(pattern[0]);
                System.out.println(pattern[pattern.length-1]);
            //}


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

