# Computing-Project-HW-2023-TokiPonaSpellChecker

This is a website project created for the Computing Project Homework-TokiPonaSpellChecker in May 2023. For more information please check that 2 docx.

This is a spell checker and predictive text system for the Toki Pona language, developed in Java using BlueJ.

About Toki Pona
Toki Pona is a constructed language created by Sonja Lang in 2001. It has a minimal vocabulary of just 120-130 root words and a simple grammar system. The goal of Toki Pona is to express maximal meaning with minimal complexity.

Project Features
Checks if words are spelled correctly based on a list of valid Toki Pona words
Recognizes valid names of people and places
Suggests valid words based on a given word prefix
Checks if sentences follow basic Toki Pona grammar rules
Usage
The main class is TokiPonaSpellChecker. It contains the key methods:

isSpelledCorrectly(String word) - Checks if a word is valid
suggestWords(String prefix) - Returns valid words starting with the prefix
isGrammarCorrect(String sentence) - Checks if a sentence is grammatically valid
See the source code for details on how to use these methods.

Tests
The TokiPonaSpellCheckerTest class contains tests for the main methods. Run this to verify the spell checker is working as expected.

