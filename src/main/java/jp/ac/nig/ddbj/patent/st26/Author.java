package jp.ac.nig.ddbj.patent.st26;

import lombok.Data;

@Data
public class Author {

    String familyName;
    String firstNameInitial;
    String middleNameInitial;


    /**  Default constructor. */
    public Author() {}


    // --- setters and getters ---

    // public String getFamilyName() {
    //     return familyName;
    // }
    // public void setFamilyName(String familyName) {
    //     this.familyName = familyName;
    // }
    // public String getFirstNameInitial() {
    //     return firstNameInitial;
    // }
    // public void setFirstNameInitial(String firstNameInitial) {
    //     this.firstNameInitial = firstNameInitial;
    // }
    // public String getMiddleNameInitial() {
    //     return middleNameInitial;
    // }
    // public void setMiddleNameInitial(String middleNameInitial) {
    //     this.middleNameInitial = middleNameInitial;
    // }


}
