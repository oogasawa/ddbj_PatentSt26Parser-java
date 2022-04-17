package jp.ac.nig.ddbj.patent.st26;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        var locusLine = new LocusLine();
        locusLine.setLocus("ZZ000001");

        System.out.println(locusLine.toString());
    }
}
