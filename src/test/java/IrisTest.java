//import iris.Iris;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class IrisTest {
//    Iris test;
//
//    /**
//     * @throws java.lang.Exception
//     */
//    @Before
//    public void setUp() throws Exception {
//        try {
//            test = new Iris();
//        } catch (Exception e){
//            fail("Iris class creation failed: " + e.getMessage());
//        }
//    }
//
//    /**
//     * @throws java.lang.Exception
//     */
//    @After
//    public void tearDown() throws Exception {
//        test.close();
//    }
//
//    /**
//     * Test method for {@link us.jameshoward.iristypes.Iris#classifySpecies(java.util.Dictionary)}.
//     * @throws Exception
//     */
//    @Test
//    public void testClassifySpecies() throws Exception {
//        Map<String, String> testValues = new HashMap<String, String>();
//
//        testValues.put("Sepal.Length", "5.57091678078844");
//        testValues.put("Sepal.Width", "3.09644861465126");
//        testValues.put("Petal.Length", "1.23725924762744");
//        testValues.put("Petal.Width", "0.113236009159561");
//        if(test.classifySpecies(testValues) != "setosa")
//            fail("setosa Test A failed.");
//        testValues.clear();
//
//        testValues.put("Sepal.Length", "4.77691762776391");
//        testValues.put("Sepal.Width", "3.77865948462588");
//        testValues.put("Petal.Length", "1.59390335312276");
//        testValues.put("Petal.Width", "0.151398435020841");
//        if(test.classifySpecies(testValues) != "setosa")
//            fail("setosa Test B failed.");
//        testValues.clear();
//
//        testValues.put("Sepal.Length", "6.8432895741882");
//        testValues.put("Sepal.Width", "3.17436555918227");
//        testValues.put("Petal.Length", "4.25657322635841");
//        testValues.put("Petal.Width", "1.50311077472507");
//        if(test.classifySpecies(testValues) != "versicolor")
//            fail("versicolor Test A failed.");
//        testValues.clear();
//
//        testValues.put("Sepal.Length", "6.23057539842681");
//        testValues.put("Sepal.Width", "3.03298741883935");
//        testValues.put("Petal.Length", "4.88482355399702");
//        testValues.put("Petal.Width", "1.52102228144702");
//        if(test.classifySpecies(testValues) != "versicolor")
//            fail("versicolor Test B failed.");
//        testValues.clear();
//
//        testValues.put("Sepal.Length", "6.85295094185716");
//        testValues.put("Sepal.Width", "2.51646353971598");
//        testValues.put("Petal.Length", "4.21432509213448");
//        testValues.put("Petal.Width", "1.74441756575054");
//        if(test.classifySpecies(testValues) != "virginica")
//            fail("virginica Test A failed.");
//        testValues.clear();
//
//        testValues.put("Sepal.Length", "6.49528665967672");
//        testValues.put("Sepal.Width", "3.35602021055031");
//        testValues.put("Petal.Length", "5.84872081384769");
//        testValues.put("Petal.Width", "2.01056615251337");
//        if(test.classifySpecies(testValues) != "virginica")
//            fail("virginica Test B failed.");
//        testValues.clear();
//    }
//}
