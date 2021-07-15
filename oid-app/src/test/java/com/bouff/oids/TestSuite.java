package com.bouff.oids;

import org.junit.*;
import java.io.*;
import java.util.List;

public class TestSuite {

    long start;
    @Before
    public void start() {
        start = System.currentTimeMillis();
    }

    @After
    public void end() {
        System.out.println("Test finished in: "+(System.currentTimeMillis() - start)+" ms.");
    }
    @Test
    public void ShouldBeTrue(){

        String testInput = ".1.3.6.1.6.3.1.1.5";
        String testOutput = ".1.3.6.1.6.3.1.1.5: true";

        StdInOutManager stdInOutManager = new StdInOutManager();
        String output = stdInOutManager.StdInOut(testInput);

        Assert.assertEquals(output, testOutput);
    }

    @Test
    public void ShouldBeFalse(){

        String testInput = ".1.3.61.13.6.1.1.2221.5";
        String testOutput = ".1.3.61.13.6.1.1.2221.5: false";

        StdInOutManager stdInOutManager = new StdInOutManager();
        String output = stdInOutManager.StdInOut(testInput);

        Assert.assertEquals(output, testOutput);
    }

    @Test
    public void ShouldBeInvalidEntry(){

        String testInput = "snmp";
        String testOutput = "Error: OID 'snmp' is invalid.";

        StdInOutManager stdInOutManager = new StdInOutManager();
        String output = stdInOutManager.StdInOut(testInput);

        Assert.assertEquals(output, testOutput);
    }

    @Test
    public void ShouldBeTrueMultiple() throws IOException {

        ListFromText listFromText = new ListFromText();
        //Change the absolute path to yours
        List<String> list = listFromText.ListFromText("/Users/Miro/oids-master/testInputData.txt");

        for (String oid:list) {
            String testOutput = oid+": true";

            StdInOutManager stdInOutManager = new StdInOutManager();
            String output = stdInOutManager.StdInOut(oid);

            Assert.assertEquals(output, testOutput);
        }
        System.out.print("Test validaded: "+list.size()+" traps.\n");
    }

    @Test
    public void ShouldBeTrueMultipleWithSuffix() throws IOException {

        ListFromText listFromText = new ListFromText();
        //Change the absolute path to yours
        List<String> list = listFromText.ListFromText("/Users/Miro/oids-master/testInputData2.txt");

        for (String oid:list) {
            String testOutput = oid+": true";

            StdInOutManager stdInOutManager = new StdInOutManager();
            String output = stdInOutManager.StdInOut(oid);

            Assert.assertEquals(output, testOutput);
        }
        System.out.print("Test validaded: "+list.size()+" traps.\n");
    }

    @Test
    public void ShouldBeFalseMultipleWithSuffix() throws IOException {

        ListFromText listFromText = new ListFromText();
        //Change the absolute path to yours
        List<String> list = listFromText.ListFromText("/Users/Miro/oids-master/testInputData3.txt");

        for (String oid:list) {
            String testOutput = oid+": false";

            StdInOutManager stdInOutManager = new StdInOutManager();
            String output = stdInOutManager.StdInOut(oid);

            Assert.assertEquals(output, testOutput);
        }
        System.out.print("Test validaded: "+list.size()+" traps.\n");
    }
}




