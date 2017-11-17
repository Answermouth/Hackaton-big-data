import ca.pfv.spmf.algorithms.sequentialpatterns.prefixspan.AlgoPrefixSpan;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Ansel on 16/11/2017.
 */

public class mainObject {

    public static Sequence spliceSequence(Pattern pattern, Sequence sequence) {
        return null;
    }

    public static void main(String[] args) {
        AlgoPrefixSpan algo = new AlgoPrefixSpan();
        algo.setShowSequenceIdentifiers(true);
        algo.setMaximumPatternLength(5);

        try {
            // extract data from query result (in csv form)
            //File queryResult = new File("Rncode/good code.R");
            //Runtime.getRuntime().exec("Rscript " + queryResult.getAbsolutePath());

            System.out.println("Starting mining");
            algo.runAlgorithm("data/prepared_data", 0.20, "data/patterns");
            System.out.println("Finished mining");

            // load patterns
            System.out.println("Loading patterns");
            File patternsFile = new File("data/patterns");
            FileReader fileReader = new FileReader(patternsFile);
            BufferedReader bfreader = new BufferedReader(fileReader);
            String line;
            String[] firstSplit;
            String[] patternRaw;
            String[] foundIn;

            ArrayList<Pattern> patterns = new ArrayList<Pattern>();

            while ((line = bfreader.readLine()) != null) {
                firstSplit = line.split("( #SUP: )|( #SID: )");

                patternRaw = firstSplit[0].substring(0, firstSplit[0].length()-3).split(" -1 ");
                foundIn = firstSplit[2].split(" ");

                patterns.add(new Pattern(patternRaw, foundIn));
            }
            System.out.println("Finished loading patterns");


            // Pattern matching
            System.out.println("Starting pattern matching");
            File sequencesFile = new File("data/prepared_data");
            File timestampsFile = new File("data/datetimes");
            fileReader = new FileReader(sequencesFile);
            bfreader = new BufferedReader(fileReader);
            FileReader fileReader2 = new FileReader(timestampsFile);
            BufferedReader bfreader2 = new BufferedReader(fileReader2);
            String line2;
            String[] sequenceRaw;
            String[] timestampsRaw;

            Integer i = 0;

            Sequence sequence = new Sequence();

            while ((line = bfreader.readLine()) != null && (line2 = bfreader2.readLine()) != null) {
                sequenceRaw = line.substring(0, line.length() - 5).split(" -1 ");
                timestampsRaw = line2.split(" ");

                for (int j = 0; j < sequenceRaw.length; j++) {
                    sequence.addEvent(new PunctualEvent(sequenceRaw[j], timestampsRaw[j]));
                }

                for(Pattern pattern : patterns) {
                    if (pattern.getFoundIn().contains(i)) {
                        spliceSequence(pattern, sequence);
                    }
                }
                i++;
            }
            System.out.println("Finished pattern matching");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


