package edu.pingpong.romans.domain;

import java.util.ArrayList;

public class RomanRegex {

    private final ArrayList<String> regexList = new ArrayList<String>();

    public void addRegex(String regex) {
        regexList.add(regex);
    }

    public ArrayList<String> getRegexList() {
        return this.regexList;
    }


}
