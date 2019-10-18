package iris;

import weka.classifiers.Classifier;
import weka.core.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Stream;

public class Iris {
    private Classifier classModel;
    private Instances dataModel;
    private String classModelFile = "classifiers/irisesNBClassifier.model";

    /**
     *  Class constructor
     */
    public Iris() throws Exception {
        Stream<String> stream = Files.lines(Paths.get(classModelFile));
        InputStream classModelStream = new FileInputStream(classModelFile);
        classModel = (Classifier) SerializationHelper.read(classModelStream);
    }

    public void close() {
        classModel = null;
        classModelFile = null;
    }

    /**
     * @param measures object with petal and sepal measurements
     * @return string with the species name
     * @throws Exception
     */
    public String classifySpecies(Map<String, String> measures) throws Exception {
        ArrayList dataClasses = new ArrayList();
        ArrayList dataAttribs = new ArrayList();
        Attribute species;
        double values[] = new double[measures.size() + 1];
        int i = 0, maxIndex = 0;

        //  Assemble the potential species options.
        dataClasses.add("setosa");
        dataClasses.add("versicolor");
        dataClasses.add("virginica");
        species = new Attribute("species", dataClasses);

        //  Create the object to classify on.
        for (Map.Entry<String, String> element : measures.entrySet()) {
            double val = Double.parseDouble(element.getValue());
            dataAttribs.add(new Attribute(element.getKey()));
            values[i++] = val;
        }
        dataAttribs.add(species);
        dataModel = new Instances("classify", dataAttribs, 0);
        dataModel.setClass(species);
        dataModel.add(new DenseInstance(1, values));
        dataModel.instance(0).setClassMissing();

        //  Find the class
        double cl[] = classModel.distributionForInstance(dataModel.instance(0));
        for(i = 0; i < cl.length; i++)
            if(cl[i] > cl[maxIndex])
                maxIndex = i;

        return dataModel.classAttribute().value(maxIndex);
    }
}
