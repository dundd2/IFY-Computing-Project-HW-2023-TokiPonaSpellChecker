# Computing-Project-HW-2023-TokiPonaSpellChecker

This is a website project created for the SEP_IFY: Computing Project (COPR) module Assignments - Toki Pona Spell Checker in May 2023. For more information, please check the provided PDF documents.

This project is a spell checker and predictive text system for the Toki Pona language, developed in Java using BlueJ.

## About Toki Pona

Toki Pona is a constructed language created by Sonja Lang in 2001. It has a minimal vocabulary of just 120-130 root words and a simple grammar system. The goal of Toki Pona is to express maximal meaning with minimal complexity.

## Project Features

- **Spell Checking**: Checks if words are spelled correctly based on a list of valid Toki Pona words.
- **Name Recognition**: Recognizes valid names of people and places.
- **Predictive Text**: Suggests valid words based on a given word prefix.
- **Grammar Checking**: Checks if sentences follow basic Toki Pona grammar rules.

## Usage

The main class is `TokiPonaSpellChecker`, which contains the key methods:

- `isSpelledCorrectly(String word)`: Checks if a word is valid.
- `suggestWords(String prefix)`: Returns valid words starting with the prefix.
- `isGrammarCorrect(String sentence)`: Checks if a sentence is grammatically valid.

See the source code for details on how to use these methods.

## Tests

The `TokiPonaSpellCheckerTest` class contains tests for the main methods. Run this to verify that the spell checker is working as expected.

## Toki Pona Language Tools and Java Library Management System

This repository showcases my Java programming skills through two distinct projects: a set of tools for the Toki Pona language and a Library Management System. These projects demonstrate proficiency in object-oriented programming, algorithm design, software testing, and a commitment to delivering functional, well-documented code.

### Toki Pona Spell Checker and Predictive Text System

This project addresses the need for language processing tools for Toki Pona, a minimalist constructed language. I developed a spell checker, predictive text engine, and basic grammar checker using Java within BlueJ. The system leverages separate lists for valid words and proper nouns (names/places) to enhance accuracy.

#### Key Features:

- **Spell Checking**: Accurately identifies misspelled words.
- **Predictive Text**: Suggests words based on prefixes, aiding efficient writing.
- **Grammar Checking**: Checks sentences against basic Toki Pona grammar rules.

#### Strengths:

- **Effective Suggestion Algorithms**: The prefix-based suggestion algorithm provides relevant recommendations, particularly beneficial given Toki Pona's limited vocabulary.
- **Targeted Grammar Rules**: The grammar checker focuses on common sentence structures, providing practical feedback.

#### Areas for Improvement & Future Extensions (Identified during Project Evaluation):

- **Multilingual Support**: Expand to other languages.
- **Advanced Grammar Checking**: Incorporate more complex grammatical rules.
- **Machine Learning Integration**: Utilize machine learning for personalized suggestions.
- **Voice Recognition**: Add voice input capabilities.
- **Graphical User Interface (GUI)**: Develop a user-friendly interface beyond the BlueJ terminal.

**Grade**: 90/100 (Acknowledges minor grammar rule limitations.)

### Java Library Management System

This project comprises two phases, demonstrating progressive development and increasing complexity.

#### Phase 1: Core Library System (Project T1 Week 7)

This phase established a basic library system with `TextBook`, `Library`, and `LibraryCard` classes. It simulates core library functions like borrowing, returning, and managing textbooks.

**Key Functionality & Demonstrated Skills:**

- **Object-Oriented Design**: Modeling real-world entities.
- **Data Structures**: Utilizing arrays (bookshelf).
- **Method Design**: Clear and concise methods.
- **Error Handling**: Robust handling of edge cases (e.g., invalid card, empty shelf).

**Grade**: 100/100

#### Phase 2: Enhanced Library System with Simulation (Project T1 Week 11)

This phase extended the core system by adding `Student` and `College` classes to simulate student library usage.

**Key Enhancements & Demonstrated Skills:**

- **Advanced OOP**: Complex class interactions.
- **Simulation Design**: Modeling student behavior.
- **Software Engineering Practices**: Stand-alone execution, Javadoc documentation, JUnit testing.

**Grade**: 71/100 (Minor deductions for specific requirement details and edge case handling, not core functionality. Significant portions received full credit.)

![ScreenShot](https://github.com/dundd2/IFY-Computing-Project-HW-2023-TokiPonaSpellChecker/blob/main/Screenshot.png)