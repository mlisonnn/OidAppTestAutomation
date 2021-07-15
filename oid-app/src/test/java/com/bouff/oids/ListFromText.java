package com.bouff.oids;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class ListFromText {

    public List<String> ListFromText(String pathName) throws IOException {

        return Files.readAllLines(new File(pathName).toPath(), Charset.defaultCharset() );

    }
}
