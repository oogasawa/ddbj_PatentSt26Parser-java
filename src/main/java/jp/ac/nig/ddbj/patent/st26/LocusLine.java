package jp.ac.nig.ddbj.patent.st26;

import java.time.LocalDate;
import java.util.StringJoiner;

import lombok.Data;

/**
　The first line of a trad FF entry.

<ul>
<li>an example.</li>
<li>another example.</li>
</ul>

 */
@Data
public class LocusLine {

    String    locus;
    int       length; // bp
    String    molecularType; // linear
    String    division;
    LocalDate date;


    public String toString() {
        var joiner = new StringJoiner("");
        joiner.add("LOCUS       ");

        return joiner.toString();
    }

    // public String getLocus() {
    //     return locus;
    // }

    // public void setLocus(String locus) {
    //     this.locus = locus;
    // }


    // public int getBp() {
    //     return bp;
    // }
    // public void setBp(int bp) {
    //     this.bp = bp;
    // }

    // public String getMolecularType() {
    //     return molecularType;
    // }
    // public void setMolecularType(String molecularType) {
    //     this.molecularType = molecularType;
    // }

    // public String getDivision() {
    //     return division;
    // }

    // public void setDivision(String division) {
    //     this.division = division;
    // }
    // public LocalDate getDate() {
    //     return date;
    // }
    // public void setDate(LocalDate date) {
    //     this.date = date;
    // }

}
