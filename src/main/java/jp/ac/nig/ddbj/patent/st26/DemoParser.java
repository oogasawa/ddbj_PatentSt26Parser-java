package jp.ac.nig.ddbj.patent.st26;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.StringJoiner;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.XMLStreamException;
 
public class DemoParser {

    String locus = null;
    StringJoiner seqJoiner = new StringJoiner("");

    
    public void parse(String xmlfile) throws FileNotFoundException, XMLStreamException {

        XMLInputFactory factory = XMLInputFactory.newInstance();
 
        BufferedInputStream stream = new BufferedInputStream(new FileInputStream(xmlfile));
        XMLEventReader reader = factory.createXMLEventReader(stream);


        int status = 0;

        while (reader.hasNext()) {

            XMLEvent event = reader.nextEvent();
            // System.out.println(String.format("%d\t%s", status, event));    
 
            if (event.isStartElement()) {
                StartElement element = (StartElement)event;

                if (status == 0 && element.getName().toString().equals("INSDSet")) {
                    status = 1;
                    continue;
                }

                if (status == 1 && element.getName().toString().equals("INSDSeq")) {
                    status = 2;
                    continue;
                }

                if (status == 2 && element.getName().toString().equals("INSDSeq_locus")) {
                    this.locus = reader.getElementText();
                    System.out.println(this.locus);
                    continue;
                }



                if (status == 2 && element.getName().toString().equals("INSDSeq_sequence")) {
                    status = 3;
                    this.seqJoiner = new StringJoiner("");
                    //this.seqJoiner.add(reader.getElementText());
                    continue;
                }
            }

            if (event.isCharacters()) {
                Characters element = (Characters)event;
                
                if (status == 3) {
                    this.seqJoiner.add(String.format("\n--- chunking demo %d ---\n", this.seqJoiner.length()));
                    this.seqJoiner.add(element.getData());
                    continue;
                }

                
            }


            if (event.isEndElement()) {
                EndElement element = (EndElement)event;

                if (status == 1 && element.getName().toString().equals("INSDSet")) {
                    status = 0;
                    continue;
                }

                if (status == 2 && element.getName().toString().equals("INSDSeq")) {
                    status = 1;
                    continue;
                }

                if (status == 3 && element.getName().toString().equals("INSDSeq_sequence")) {
                    status = 2;
                    System.out.println(this.seqJoiner.toString());
                    continue;
                }

                
            }

            
        }
 
        reader.close();
    }
 
}


