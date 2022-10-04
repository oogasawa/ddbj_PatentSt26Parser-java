package jp.ac.nig.ddbj.patent.st26;

import java.io.FileNotFoundException;

import javax.xml.stream.XMLStreamException;

/**
 * Hello world!
 *
 */
public class ParserDemoApp 
{
    public static void main( String[] args ) throws FileNotFoundException, XMLStreamException
    {
        String xml = args[0];

        DemoParser parser = new DemoParser();
        parser.parse(xml);
    }
}
