# Lab: Word Scavenger Hunt

## Description
In this lab, you'll use your Java skills to create a word scavenger hunt. You'll start with a pool of words, read them in from a file, shuffle them, and sort them based on different criteria. The goal is to understand how to manipulate, sort, and filter data in Java.

## Lab Setup
You'll be given a CSV file, `input.txt`, which contains a collection of words. The words follow these criteria:
- 50 are six-letter words.
- 30 start with the letter 'a'.
- 10 are unique because they are misspelled.
- Some words are duplicated three times.

The CSV file is organized in such a way that the words are separated by commas.

## Task

1. **Reading the words**: Write a Java program that reads in all the words from the `input.txt` file. Use Java's `Files.lines()` or `Scanner` class to read the file.

2. **Shuffling the words**: After reading in the words, your program should shuffle them. Use `Collections.shuffle()` for this.

3. **Printing the words**: Print out all the shuffled words on one line, separated by commas. This should give you a scrambled list of words.

4. **Sorting the words**: Now comes the scavenger hunt part. Sort the words based on the following criteria:
    - Separate the six-letter words from the others.
    - Separate the words that start with the letter 'a'.
    - Identify the misspelled words.
    - Identify the words that are duplicated three times.
# JavaMapsDemoJun28
