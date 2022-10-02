package Content2_OOP.WordSet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordSet {
    private ArrayList<String>result = new ArrayList<>();

    public WordSet(String str) {
        StringTokenizer splitChar = new StringTokenizer(str, " ");
        result = new ArrayList<>();
        while(splitChar.hasMoreTokens()){
            this.result.add(splitChar.nextToken().toLowerCase().trim());
        }
    }

    public ArrayList<String> getResult() {
        return result;
    }

    public void setResult(ArrayList<String> result) {
        this.result = result;
    }

    public String union(WordSet s1){
        ArrayList<String> fake = new ArrayList<>(this.result);
        s1.result.forEach(item -> {
            fake.add(item);
        });
        StringBuilder answer = new StringBuilder("");
        TreeSet<String>treeSet = new TreeSet<>();
        fake.forEach(item -> treeSet.add(item));
        treeSet.forEach(item -> answer.append(item + " "));
        return answer.toString().trim();
    }

    @Override
    public String toString() {
        StringBuilder answer = new StringBuilder("");
        this.result.forEach(item -> answer.append(item + " "));
        return answer.toString().trim();
    }

    public String intersection(WordSet s2) {
        ArrayList<String>fake = new ArrayList<>(this.result);
        fake.retainAll(s2.result);
        StringBuilder str = new StringBuilder("");
        TreeSet<String>result = new TreeSet<>();
        fake.forEach(item -> result.add(item));
        result.forEach(item -> str.append(item + " "));
        return str.toString().trim();
    }
}
