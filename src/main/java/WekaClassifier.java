import iris.Iris;

import java.util.HashMap;
import java.util.Map;

public class WekaClassifier {

    public static void main(String[] args) {
        Iris irisModel =  new Iris();

        Map<String, String> values = new HashMap<String, String>();
        values.put("Sepal.Length", "0.57091678078844");
        values.put("Sepal.Width", "3.09644861465126");
        values.put("Petal.Length", "1.23725924762744");
        values.put("Petal.Width", "0.113236009159561");

        System.out.println("Classification: " + irisModel.classifySpecies(values));
    }
}
