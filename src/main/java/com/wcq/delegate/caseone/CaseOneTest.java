package com.wcq.delegate.caseone;

public class CaseOneTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.announce("HEIKE",new Leader());
    }
}
