/*
Freeware License, some rights reserved

Copyright (c) 2021 Iuliana Cosmina

Permission is hereby granted, free of charge, to anyone obtaining a copy 
of this software and associated documentation files (the "Software"), 
to work with the Software within the limits of freeware distribution and fair use. 
This includes the rights to use, copy, and modify the Software for personal use. 
Users are also allowed and encouraged to submit corrections and modifications 
to the Software for the benefit of other users.

It is not allowed to reuse,  modify, or redistribute the Software for 
commercial use in any way, or for a user's educational materials such as books 
or blog articles without prior permission from the copyright holder. 

The above copyright notice and this permission notice need to be included 
in all copies or substantial portions of the software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS OR APRESS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package com.apress.bgn.five;

import java.util.Arrays;

/**
 * Created by iuliana.cosmina on 18/04/2021
 */
public class ArrayUtilitiesDemo {
    public static void main(String... args) {

        // simplified creation, compile can figure out the type and size for the value
        int[] array =  {4, 2};
        // Print array elements
        System.out.println(Arrays.toString(array));
        // or
        Arrays.stream(array).forEach(ai -> System.out.println(ai));
        // using method reference
        Arrays.stream(array).forEach(System.out::println);

        // sorting
        Arrays.sort(array);

        // re-initialization
        array = new int[]{4, 2, 1, 5, 7};
        array = new int[10];
        // searching
        int foundAt = Arrays.binarySearch(array, 5);
        System.out.println("Key found at: " + foundAt);
    }
}
