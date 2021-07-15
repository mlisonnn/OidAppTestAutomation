package com.bouff.oids;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class StdInOutManager {

    public String StdInOut(String testInput){

        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(testInput.getBytes()));
        System.out.print("Testing, input: "+testInput);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        //Change the absolute path to yours
        OidAppLauncher.main(new String[]{"/Users/Miro/oids-master/snmp.yaml"});

        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String key = "";
        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
        System.out.print("\nTesting, output: "+output+"\n");

        return output;
    }
}
