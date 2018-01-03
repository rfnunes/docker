/*
 * Copyright (C) Coriant
 * The reproduction, transmission or use of this document or its contents 
 * is not permitted without express written authorization.
 * Offenders will be liable for damages.
 * All rights, including rights created by patent grant or 
 * registration of a utility model or design, are reserved.
 * Modifications made to this document are restricted to authorized personnel only. 
 * Technical specifications and features are binding only when specifically 
 * and expressly agreed upon in a written contract.
 *
 */

package com.ossnms.sandbox;

import java.io.Console;

/**
 * Created by pt102933 on 27-05-2015.
 */
public class ConsoleTest {
    public static void main(String[] args) {
        Console c = System.console();
        char[] pw;
        pw = c.readPassword("%s", "pw: ");
        for(char ch : pw) {
            c.format("%c", ch);
        }
        c.format("\n");
    }
}
