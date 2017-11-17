import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Ansel on 17/11/2017.
 */
public class Pattern {

    ArrayList<Integer> items;
    ArrayList<Integer> foundIn;

    public Pattern(ArrayList<Integer> items, ArrayList<Integer> foundIn) {
        this.items = items;
        this.foundIn = foundIn;
    }

    public Pattern(String[] items, String[]  foundIn) {
        ArrayList<Integer> itemsArray = new ArrayList<Integer>();
        ArrayList<Integer> foundInArray = new ArrayList<Integer>();

        for (int i = 0; i < items.length; i++) {
            itemsArray.add(Integer.parseInt(items[i]));
        }
        for (int i = 0; i < foundIn.length; i++) {
            foundInArray.add(Integer.parseInt(foundIn[i]));
        }

        this.items = itemsArray;
        this.foundIn = foundInArray;
    }

    public ArrayList<Integer> getItems() {
        return items;
    }

    public void setItems(ArrayList<Integer> items) {
        this.items = items;
    }

    public ArrayList<Integer> getFoundIn() {
        return foundIn;
    }

    public void setFoundIn(ArrayList<Integer> foundIn) {
        this.foundIn = foundIn;
    }

    @Override
    public String toString() {
        String output = "";
        for (int i : this.items) {
            output += i + " ";
        }
        return output.trim();
    }
}
