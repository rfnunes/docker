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

/**
 * Created by pt102933 on 17-05-2015.
 */
public class Scanner {
    public static void main(String[] args) {
        String s = "0100 55 3L 62D 127 6f (int)7";
        java.util.Scanner scanner = new java.util.Scanner(s);
        while (scanner.hasNextLong()) {
            System.out.println(scanner.nextLong()+",");
        }
    }
}
