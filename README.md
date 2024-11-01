# Computing-Project-HW-2023-TokiPonaSpellChecker

This repository contains a Java project developed for Foundation SEP_IFY: Computing Project (COPR) module, specifically focusing on a spell checker and predictive text system for the Toki Pona language. The project was completed in May 2023. For additional details, please refer to the accompanying PDF documents.

# Computing Project - Toki Pona Spell Checker

This repository showcases my project for the Computing Project module, where I developed a spell checker and predictive text system for the Toki Pona language using Java and the BlueJ IDE. The project was completed in May 2023 and received a grade of 90%.

## Project Overview

**Project Title:** Toki Pona Spell Checker and Predictive Text System  
**Language:** Java (using BlueJ IDE)  
**Grade:** 90% 

### Core Functionality

- **Spell Checking:** Validates spelling against a comprehensive dictionary of Toki Pona words.
- **Name Recognition:** Identifies valid names of people and places.
- **Predictive Text:** Provides suggestions for valid words based on user input prefixes.
- **Grammar Checking:** Evaluates sentences against the fundamental grammar rules of Toki Pona.

## Key Features

1. **Spell Checker Implementation:**
   - Utilizes a defined list of valid words to determine if input words are spelled correctly.
   - Implements a method `isSpelledCorrectly(String word)` that returns true if the word exists in the dictionary.

2. **Word Suggestion Algorithm:**
   - Suggests possible completions for misspelled words based on a prefix through the `suggestWords(String prefix)` method.

3. **Basic Grammar Validation:**
   - Checks if input sentences adhere to Toki Pona's simple Subject-Verb-Object (SVO) structure using the `isGrammarCorrect(String sentence)` method.

4. **Testing Framework:**
   - The `TokiPonaSpellCheckerTest` class rigorously tests all primary functionalities to ensure reliability and correctness.
   - Outputs are logged to the console, including validation results for various inputs, such as valid and invalid words, and example sentences.

## Development Process

### Project Motivation

I chose to create a spell checker for Toki Pona due to its unique linguistic structure and limited vocabulary, which poses challenges in language processing. This project aimed to simplify the usage of Toki Pona for both native speakers and learners, thus contributing to the accessibility of this constructed language.

### Objectives

- Develop a reliable spell-checking system that accurately identifies correct spellings.
- Create a user-friendly predictive text feature that enhances user input efficiency.
- Implement a grammar checking capability to assist in forming correct sentences.

### Methodology

- Conducted extensive research on Toki Pona vocabulary and grammar.
- Developed separate data structures for valid words and names to streamline checking processes.
- Utilized Java's ArrayList for dynamic storage of words, names, and places.
- Designed and tested algorithms for spelling checks and suggestions, adhering to project timelines.

### Challenges and Solutions

- **Limited Vocabulary:** Navigated the constraints of Toki Pona's minimal word count by focusing on context and suggestion algorithms.
- **Grammar Checking Complexity:** Implemented a straightforward rule-based approach to grammar validation, ensuring adaptability for future enhancements.

## References

- [Toki Pona Official Site](https://tokipona.org/)
- [Toki Pona Word List](https://en.wikibooks.org/wiki/Toki_Pona/Word_list)
- [Java Programming Resources](https://www.w3schools.com/java/default.asp)

## ScreenShot
![ScreenShot](https://github.com/dundd2/IFY-Computing-Project-HW-2023-TokiPonaSpellChecker/blob/main/Screenshot.png)