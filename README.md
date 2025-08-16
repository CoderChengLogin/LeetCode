# LeetCode 解题方案

本项目包含多个 LeetCode 问题的 Java 解题方案，每个问题都有对应的解决方案类和测试主函数，旨在为算法学习者提供清晰、简洁的参考代码。

## 项目结构

- **`src/main/java/leetcode/editor/cn/`**：存放每个问题的 Java 解决方案。
  - `_001_TwoSum.java`：两数之和问题的解决方案。
  - `_020_ValidParentheses.java`：有效括号问题的解决方案。
- **`src/main/java/leetcode/editor/cn/doc/content/`**：存放每个问题的说明文档。
  - `_001_TwoSum.md`
  - `_020_ValidParentheses.md`
- **`LICENSE`**：项目许可证文件。
- **`pom.xml`**：Maven 项目配置文件。

## 解决方案说明

### 1. 两数之和（Two Sum）

- **问题描述**：给定一个整数数组和一个目标值，找出数组中和为目标值的两个数的下标。
- **实现类**：`Solution`
- **方法签名**：`public int[] twoSum(int[] nums, int target)`
- **测试入口**：`main` 方法中可运行测试用例。

### 2. 有效括号（Valid Parentheses）

- **问题描述**：判断一个字符串是否是有效的括号字符串。
- **实现类**：`Solution`
- **方法签名**：`public boolean isValid(String s)`
- **测试入口**：`main` 方法中可运行测试用例。

## 使用说明

1. **环境要求**：确保已安装 JDK 和 Maven。
2. **构建项目**：
   ```bash
   mvn clean install
   ```
3. **运行测试**：
   - 直接运行每个问题类中的 `main` 方法。
   - 或使用 IDE（如 IntelliJ IDEA）运行和调试代码。

## 贡献指南

欢迎提交 Pull Request 来添加新的问题解决方案或优化现有代码。请确保：
- 代码风格与项目保持一致。
- 添加必要的注释和测试用例。

## 许可证

本项目遵循 MIT 许可证。详见 [LICENSE](LICENSE) 文件。