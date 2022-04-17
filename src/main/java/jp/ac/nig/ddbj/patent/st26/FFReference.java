package jp.ac.nig.ddbj.patent.st26;

import java.util.List;
import lombok.Data;

@Data
public class FFReference {

    int number;
    int rangeFrom;
    int rangeTo;

    List<Author> authorList;

    String title;
    String journal;


}
