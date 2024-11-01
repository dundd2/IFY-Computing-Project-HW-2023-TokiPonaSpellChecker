# Computing-Project-HW-2023-TokiPonaSpellChecker

This repository showcases my Java project developed for the Foundation SEP_IFY: Computing Project (COPR) module. The project focuses on creating a spell checker and predictive text system tailored for the Toki Pona language, demonstrating my skills in software development and language processing. Completed in May 2023, this project received a grade of **90%**. For further details, please refer to the accompanying PDF documentation.

## Project Overview

**Project Title:** Toki Pona Spell Checker and Predictive Text System  
**Language:** Java (developed using BlueJ IDE)  
**Grade:** 90%

### Core Functionality

- **Spell Checking:** Validates user input against a comprehensive dictionary of Toki Pona words.
- **Name Recognition:** Identifies valid names of people and places within the Toki Pona context.
- **Predictive Text Suggestions:** Provides word completions based on user input prefixes.
- **Grammar Checking:** Evaluates sentences against the fundamental grammar rules of Toki Pona.

## Key Features

1. **Robust Spell Checker:**
   - Implements a method `isSpelledCorrectly(String word)` to verify the accuracy of user input against the dictionary.

2. **Dynamic Word Suggestion:**
   - Suggests possible completions for misspelled words using the `suggestWords(String prefix)` method, enhancing user experience.

3. **Grammar Validation:**
   - Checks adherence to Toki Pona's Subject-Verb-Object (SVO) structure with the `isGrammarCorrect(String sentence)` method.

4. **Comprehensive Testing:**
   - The `TokiPonaSpellCheckerTest` class contains extensive tests for all primary functionalities, ensuring reliability. Results are logged for validation checks.

## Development Insights

### Motivation

The project was inspired by the unique structure and limited vocabulary of Toki Pona, aiming to simplify language processing for both native speakers and learners.

### Objectives

- Develop an efficient spell-checking system that accurately identifies correct spellings.
- Create an intuitive predictive text feature to improve user input efficiency.
- Implement a grammar-checking capability to assist in constructing grammatically correct sentences.

### Methodology

- Conducted in-depth research on Toki Pona vocabulary and grammar.
- Designed separate data structures for words and names to streamline checking processes.
- Leveraged Java's ArrayList for dynamic word storage and implemented efficient algorithms for spelling and suggestion checks.

### Challenges Faced

- **Limited Vocabulary:** Addressed the challenge of Toki Pona’s minimal word count by focusing on contextual suggestions.
- **Grammar Complexity:** Utilized a straightforward rule-based approach for grammar validation, allowing for future enhancements.

## References

- [Toki Pona Official Site](https://tokipona.org/)
- [Toki Pona Word List](https://en.wikibooks.org/wiki/Toki_Pona/Word_list)
- [Java Programming Resources](https://www.w3schools.com/java/default.asp)

## Screenshot
![Screenshot](https://github.com/dundd2/IFY-Computing-Project-HW-2023-TokiPonaSpellChecker/blob/main/Screenshot.png)
