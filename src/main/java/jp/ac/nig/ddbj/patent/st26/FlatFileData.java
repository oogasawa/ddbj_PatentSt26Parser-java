package jp.ac.nig.ddbj.patent.st26;

import java.util.List;

import lombok.Data;

@Data
public class FlatFileData {

    LocusLine locusline;

    String definition;
    String accession;
    String version;
    String keywords;

    String source;
    String organism;
    String lineage;

    List<FFReference> references;

}
