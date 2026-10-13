# Java Exception and Programming Exercises

This project contains introductory Java exercises focused on exception handling, custom exceptions, recursion, file input/output, and compound interest calculations.

## Requirements

- Java Development Kit (JDK) 8 or newer
- IntelliJ IDEA or another Java-compatible IDE

## Project structure

All Java source files are located in the `src` directory:

| File | Description |
| --- | --- |
| `Main.java` | Reads two integers and demonstrates exception handling for invalid input, division by zero, and unexpected errors. |
| `TempAndHumidity.java` | Reads temperature and humidity values and uses custom exceptions to determine whether the weather is suitable for golf. |
| `HotAndHumidException.java` | Defines the custom `HotAndHumidException`, `TooHotException`, and `TooHumidException` classes. |
| `Recursive.java` | Demonstrates a recursive method that prints `Moved` a specified number of times. |
| `Io.java` | Creates, writes to, appends to, and reads from `afile.txt`. |
| `BankInterest.java` | Calculates compound interest hourly when the balance is above the `$100,000,000` threshold. |

## Running the project

### IntelliJ IDEA

1. Open the project folder in IntelliJ IDEA.
2. Mark `src` as the source folder if IntelliJ does not detect it automatically.
3. Open the Java file containing the exercise you want to run.
4. Click the green **Run** button next to its `main` method.

Each class with a `main` method is an independent program.

### Command line

From the project root, compile the source files:

```bash
javac -d out src/*.java
```

Run an individual exercise using its class name:

```bash
java -cp out Main
java -cp out TempAndHumidity
java -cp out Recursive
java -cp out Io
java -cp out BankInterest
```

## Exercise details

### Exception handling — `Main.java`

The program asks the user for two integers and divides the first by the second. It demonstrates:

- `ArithmeticException` when dividing by zero
- `InputMismatchException` when the user enters a non-integer
- A general `Exception` catch block for other unexpected errors
- A `finally` block that always executes

### Custom exceptions — `TempAndHumidity.java`

The program repeatedly asks for temperature and humidity values. Enter `X` at either prompt to exit.

The following rules are applied:

- Temperature above `85` causes a `TooHotException`
- Humidity above `90` causes a `TooHumidException`
- Otherwise, the program reports that the conditions are suitable for golf

Invalid numeric input is handled with `NumberFormatException`.

### Recursion — `Recursive.java`

`Recursive.move(int n)` prints `Moved`, then calls itself with `n - 1` until `n` reaches `1` or lower. The current program calls `move(5)`, so it prints `Moved` five times.

### File I/O — `Io.java`

This exercise uses Java file classes to:

1. Create `afile.txt`
2. Write text to the file
3. Append additional text
4. Read and print the file contents

The file is created relative to the directory from which the program is run. The program declares `IOException` because file operations can fail.

### Bank interest — `BankInterest.java`

The program starts with a deposit of `$125,000,000` and calculates interest for five hours.

Interest is credited only when the balance is greater than `$100,000,000`. The hourly rate is based on 2% annual interest over a 360-day financial year:

```text
hourly rate = 0.02 / (360 × 24)
```

The method uses recursion to process each hour. Interest is added to the balance before the next hour, producing compound interest.

Example output:

```text
Initial Deposit: $125,000,000.00

Hour 1: Interest Credited = $289.35 | New Balance = $125,000,289.35
Hour 2: Interest Credited = $289.35 | New Balance = $125,000,578.70
...
```

## Notes

- The source files use the default Java package, so no package declaration is required.
- Compiled files are written to `out` when using the command-line instructions.
- `out` and IDE-specific files are excluded through `.gitignore`.
