# Expression-Evaluator with Command Handling


## Overview

The Expression Evaluator is a Java program that is designed to parse and evaluate mathematical expressions, including arithmetic operations and variables. It also supports commands for accepting input values for variables, printing expression results, storing expression results, and executing sequences of commands. 

## Features

- Parses and evaluates mathematical expressions with support for arithmetic operators (+, -, *, /) and variables.
- Handles commands such as ACCEPT for inputting variables values, PRINT for displaying expression results, LET for storing expression results into variables, and RUN for executing sequences of commands.
- Ensures robustness and error handling by validating variable names and checking for proper syntax in commands.
- Utilizes data structures HashMaps for maintaining a symbol table to store and retrieve variable values during expression evaluation.
- Designed for flexibility and ease of use, allowing users to input expressions and commands interactively or from external sources such as files.

## Usage

1. Accepting Input for Variables:
  - Use the "ACCEPT" command followed by a variable name to prompt the user for a value to be entered into the symbol table. Example: "ACCEPT CAT"
2. Storing Expression Results:
  - Use the "LET" command followed by the variable name, an equal sign, and the expression to evaluate and store its result in the specificed variable. Example: "LET AVERAGE = (CAT + DOG)/2.0"
3. Printing Expression Results:
  - Use the "PRINT" command followed by the expression to evaluate and print its value on the screen, Example: "PRINT AVERAGE"
4. Running Sequences of Commands:
  - Use the "RUN" command followed by the line number to execute each instruction in order of the line numbers as if it had been entered directly from the console. Example: "RUN 10"


