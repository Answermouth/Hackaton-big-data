import ca.pfv.spmf.algorithms.sequentialpatterns.prefixspan.AlgoPrefixSpan;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Ansel on 16/11/2017.
 */

public class mainObject {

    public static String convertToFullName(String code) {
        switch (code) {
            case "225;":
			    return "SISSPO";
            case "225; 225;":
				return "SISSPO";
            case "225; 225; 225;":
				return "SISSPO";
            case "225; 213;":
				return "test";
            case "200;":
				return "test";
            case "200; 213;":
				return "test";
            case "200; 200;":
				return "test";
            case "200; 205;":
				return "Chirurgie";
            case "200; 205; 205;":
				return "Chirurgie";
            case "205;":
				return "test";
            case "205; 212;":
				return "test";
            case "205; 213;":
				return "test";
            case "205; 213; 213;":
				return "test";
            case "205; 213; 213; 213;":
				return "test";
            case "205; 213; 213; 213; 213;":
				return "test";
            case "205; 213; 205;":
				return "test";
            case "205; 200;":
				return "test";
            case "205; 217;":
				return "test";
            case "205; 217; 217;":
				return "test";
            case "205; 205;":
				return "test";
            case "205; 205; 213;":
				return "test";
            case "205; 205; 213; 213;":
				return "test";
            case "205; 205; 205;":
				return "Chirurgie";
            case "205; 205; 205; 205;":
				return "Chirurgie";
            case "205; 205; 205; 205; 205;":
				return "Chirurgie";
            case "212;":
				return "test";
            case "212; 212;":
				return "test";
            case "212; 213;":
				return "test";
            case "212; 213; 213;":
				return "test";
            case "212; 213; 213; 213;":
				return "test";
            case "212; 217;":
				return "test";
            case "212; 217; 217;":
				return "test";
            case "213;":
				return "test";
            case "213; 225;":
				return "test";
            case "213; 225; 225;":
				return "test";
            case "213; 225; 213;":
				return "test";
            case "213; 212;":
				return "test";
            case "213; 212; 213;":
				return "test";
            case "213; 213;":
				return "test";
            case "213; 213; 225;":
				return "test";
            case "213; 213; 212;":
				return "test";
            case "213; 213; 213;":
				return "test";
            case "213; 213; 213; 212;":
				return "test";
            case "213; 213; 213; 213;":
				return "test";
            case "213; 213; 213; 213; 213;":
				return "test";
            case "213; 213; 213; 213; 217;":
				return "test";
            case "213; 213; 213; 217;":
				return "test";
            case "213; 213; 213; 217; 217;":
				return "test";
            case "213; 213; 217;":
				return "test";
            case "213; 213; 217; 213;":
				return "test";
            case "213; 213; 217; 213; 213;":
				return "test";
            case "213; 213; 217; 213; 217;":
				return "test";
            case "213; 213; 217; 217;":
				return "test";
            case "213; 213; 217; 217; 213;":
				return "test";
            case "213; 213; 217; 217; 217;":
				return "test";
            case "213; 213; 205;":
				return "test";
            case "213; 200;":
				return "test";
            case "213; 217;":
				return "test";
            case "213; 217; 213;":
				return "test";
            case "213; 217; 213; 213;":
				return "test";
            case "213; 217; 213; 213; 213;":
				return "test";
            case "213; 217; 213; 213; 217;":
				return "test";
            case "213; 217; 213; 217;":
				return "test";
            case "213; 217; 213; 217; 213;":
				return "test";
            case "213; 217; 213; 217; 217;":
				return "test";
            case "213; 217; 217;":
				return "test";
            case "213; 217; 217; 213;":
				return "test";
            case "213; 217; 217; 213; 213;":
				return "test";
            case "213; 217; 217; 213; 217;":
				return "test";
            case "213; 217; 217; 217;":
				return "test";
            case "213; 217; 217; 217; 213;":
				return "test";
            case "213; 217; 217; 217; 217;":
				return "test";
            case "213; 221;":
				return "test";
            case "213; 205;":
				return "test";
            case "213; 205; 213;":
				return "test";
            case "213; 205; 205;":
				return "test";
            case "217;":
				return "test";
            case "217; 225;":
				return "test";
            case "217; 212;":
				return "test";
            case "217; 212; 212;":
				return "test";
            case "217; 212; 213;":
				return "test";
            case "217; 212; 217;":
				return "test";
            case "217; 212; 217; 217;":
				return "test";
            case "217; 213;":
				return "test";
            case "217; 213; 225;":
				return "test";
            case "217; 213; 212;":
				return "test";
            case "217; 213; 213;":
				return "test";
            case "217; 213; 213; 213;":
				return "test";
            case "217; 213; 213; 213; 213;":
				return "test";
            case "217; 213; 213; 213; 217;":
				return "test";
            case "217; 213; 213; 217;":
				return "test";
            case "217; 213; 213; 217; 213;":
				return "test";
            case "217; 213; 213; 217; 217;":
				return "test";
            case "217; 213; 217;":
				return "test";
            case "217; 213; 217; 213;":
				return "test";
            case "217; 213; 217; 213; 213;":
				return "test";
            case "217; 213; 217; 213; 217;":
				return "test";
            case "217; 213; 217; 217;":
				return "test";
            case "217; 213; 217; 217; 213;":
				return "test";
            case "217; 213; 217; 217; 217;":
				return "test";
            case "217; 200;":
				return "test";
            case "217; 217;":
				return "test";
            case "217; 217; 212;":
				return "test";
            case "217; 217; 213;":
				return "test";
            case "217; 217; 213; 213;":
				return "test";
            case "217; 217; 213; 213; 213;":
				return "test";
            case "217; 217; 213; 213; 217;":
				return "test";
            case "217; 217; 213; 217;":
				return "test";
            case "217; 217; 213; 217; 213;":
				return "test";
            case "217; 217; 213; 217; 217;":
				return "test";
            case "217; 217; 217;":
				return "test";
            case "217; 217; 217; 212;":
				return "test";
            case "217; 217; 217; 213;":
				return "test";
            case "217; 217; 217; 213; 213;":
				return "test";
            case "217; 217; 217; 213; 217;":
				return "test";
            case "217; 217; 217; 217;":
				return "test";
            case "217; 217; 217; 217; 213;":
				return "test";
            case "217; 217; 217; 217; 217;":
				return "test";
            case "217; 221;":
				return "test";
            case "217; 205;":
				return "test";
            case "217; 205; 205;":
				return "test";
            case "221;":
				return "test";
            case "221; 213;":
				return "test";
            case "221; 213; 213;":
				return "test";
            case "221; 221;":
				return "test";
            case "221; 221; 213;":
				return "test";
            case "221; 221; 221;":
				return "test";
            case "221; 221; 221; 221;":
				return "test";
            case "221; 221; 221; 221; 221;":
				return "test";
            case "223;":
				return "test";
        }
        return "Unknown";
    }

    public static String convertToName(int code) {
        switch (code) {
            case 200:
                return "Anesthesie";
            case 201:
                return "Antibiologie";
            case 202:
                return "Bloc operatoire";
            case 203:
                return "Brancardage";
            case 204:
                return "Cardiologie";
            case 205:
                return "Chirurgie";
            case 206:
                return "Curietherapie";
            case 207:
                return "Dermatologie";
            case 208:
                return "Diabetologie";
            case 209:
                return "Dietetique";
            case 210:
                return "Education Therapeutique";
            case 211:
                return "Endoscopie";
            case 212:
                return "Exterieur";
            case 213:
                return "Imagerie";
            case 214:
                return "Kine";
            case 215:
                return "Labo";
            case 216:
                return "Oncogenetique";
            case 217:
                return "Oncologie";
            case 218:
                return "Onco-Senologie";
            case 219:
                return "Ophtalmologie";
            case 220:
                return "Pharmacie";
            case 221:
                return "Radiotherapie";
            case 222:
                return "Radiotherapie";
            case 223:
                return "RCP";
            case 224:
                return "Recherche Clinique";
            case 225:
                return "SISSPO";
            case 226:
                return "Stomathérapie";
            case 227:
                return "Tete et Cou";
            case 228:
                return "xxxRDG";
        }
        return "Unknown";
    }


    public static void writeToFile(int i, Sequence sequence) throws IOException {
        File file = new File("C:\\Apache24\\htdocs\\hackaton-big-data\\xmls\\" + i + ".xml");
        //File file = new File("html/xmls/" + i + ".xml");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        writer.write("<data>");
        writer.newLine();

        for (Event event : sequence.getEvents()) {
            String str = event.toXml();
            writer.write(str);
        }
        writer.write("</data>");
        writer.flush();
    }

    public static ArrayList<Event> replacePattern(Pattern pattern, Sequence sequence) {
        ArrayList<Event> rst = new ArrayList<Event>();
        boolean found;
        int i = 0;
        while (i < sequence.getEvents().size() - pattern.getItems().size() + 1) {
            found = true;
            for (int j = 0; j < pattern.getItems().size(); j ++) {
                if (Integer.parseInt(sequence.getEvent(i+j).getName().trim()) != pattern.getItems().get(j)) {
                    found = false;
                    break;
                }
            }
            if (found == true) {
                Event event;
                if (pattern.getItems().size() > 1) {
                    long start = sequence.getEvent(i).getDatetime();
                    long end = sequence.getEvent(i+pattern.getItems().size()-1).getDatetime();
                    if (start > end) {
                        end = sequence.getEvent(i).getDatetime();
                        start = sequence.getEvent(i+pattern.getItems().size()-1).getDatetime();
                    }

                    if (!(start == 1184709600L)) {
                        event = new DurationEvent(pattern.toString(), start, end);
                        ((DurationEvent) event).setPattern(pattern);
                        rst.add(event);

                        for (int j = 0; j < pattern.getItems().size(); j ++) {
                            sequence.getEvents().remove(i);
                        }
                    }
                }// else {
                   // event = new PunctualEvent(pattern.toString(), sequence.getEvent(i).getDatetime());
                //}
            }
            i++;
        }

        return rst;
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
            File patternsFile = new File("data/patterns2");
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
            Sequence splicedSequence = new Sequence();

            while ((line = bfreader.readLine()) != null && (line2 = bfreader2.readLine()) != null) {
                sequenceRaw = line.substring(0, line.length() - 5).split(" -1 ");
                timestampsRaw = line2.split(" ");

                for (int j = 0; j < sequenceRaw.length; j++) {
                    sequence.addEvent(new PunctualEvent(sequenceRaw[j], timestampsRaw[j]));
                }

                Collections.reverse(patterns);// reverse to start with longest patterns
                for(Pattern pattern : patterns) {
                    if (pattern.getFoundIn().contains(i)) {
                        ArrayList<Event> events = replacePattern(pattern, sequence);
                        if (events.size() > 0)
                            splicedSequence.addEvents(events);
                    }
                }
                if (splicedSequence.getEvents().size() > 0)
                    writeToFile(i, splicedSequence);
                else
                    writeToFile(i, sequence);
                i++;
            }
            System.out.println("Finished pattern matching");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


