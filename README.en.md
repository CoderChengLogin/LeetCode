

# LeetCode Solutions

This project contains Java-based solutions for various LeetCode problems. Each problem includes a corresponding solution class and a test main function, aiming to provide clear and concise reference code for learners of algorithms.

## Project Structure

- **`src/main/java/leetcode/editor/cn/`**: Contains Java solution files for each problem.
  - `_001_TwoSum.java`: Solution for the Two Sum problem.
  - `_020_ValidParentheses.java`: Solution for the Valid Parentheses problem.
- **`src/main/java/leetcode/editor/cn/doc/content/`**: Contains documentation files for each problem.
  - `_001_TwoSum.md`
  - `_020_ValidParentheses.md`
- **`LICENSE`**: Project license file.
- **`pom.xml`**: Maven project configuration file.

## Solution Descriptions

### 1. Two Sum

- **Problem Description**: Given an array of integers and a target value, find the indices of the two numbers that sum up to the target.
- **Implementation Class**: `Solution`
- **Method Signature**: `public int[] twoSum(int[] nums, int target)`
- **Test Entry Point**: The `main` method contains executable test cases.

### 2. Valid Parentheses

- **Problem Description**: Determine whether a given string is a valid parentheses string.
- **Implementation Class**: `Solution`
- **Method Signature**: `public boolean isValid(String s)`
- **Test Entry Point**: The `main` method contains executable test cases.

## Usage Instructions

1. **Prerequisites**: Ensure that JDK and Maven are installed.
2. **Build the Project**:
   ```bash
   mvn clean install
   ```
3. **Run Tests**:
   - Execute the `main` method in each problem's solution class.
   - Alternatively, use an IDE (such as IntelliJ IDEA) to run and debug the code.

## Contribution Guidelines

Pull Requests are welcome to add new problem solutions or improve existing code. Please ensure:
- The code style is consistent with the project.
- Necessary comments and test cases are included.

## License

This project is licensed under the MIT License. For details, see the [LICENSE](LICENSE) file.