/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 *
 *
 *
 *
 * 示例 1：
 *
 *
 * 输入：s = "()"
 *
 *
 * 输出：true
 *
 * 示例 2：
 *
 *
 * 输入：s = "()[]{}"
 *
 *
 * 输出：true
 *
 * 示例 3：
 *
 *
 * 输入：s = "(]"
 *
 *
 * 输出：false
 *
 * 示例 4：
 *
 *
 * 输入：s = "([])"
 *
 *
 * 输出：true
 *
 * 示例 5：
 *
 *
 * 输入：s = "([)]"
 *
 *
 * 输出：false
 *
 *
 *
 * 提示：
 *
 *
 * 1 <= s.length <= 10⁴
 * s 仅由括号 '()[]{}' 组成
 *
 *
 * Related Topics 栈 字符串 👍 4780 👎 0
 */

package leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

public class _020_ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new _020_ValidParentheses().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            // 提前处理奇数长度的字符串，直接返回false
            if (s == null || s.length() % 2 != 0) {
                return false;
            }
            int length = s.length();
            // 使用Deque作为栈，ArrayDeque比LinkedList更高效
            Deque<Character> stack = new ArrayDeque<>();

            for (int i = 0; i < length; i++) {
                char charAt = s.charAt(i);
                switch (charAt) {
                    case '(':
                        stack.push(')');
                        break;
                    case '[':
                        stack.push(']');
                        break;
                    case '{':
                        stack.push('}');
                        break;
                    case ')':
                        if (stack.isEmpty() || stack.pop() != ')') {
                            return false;
                        }
                        break;
                    case ']':
                        if (stack.isEmpty() || stack.pop() != ']') {
                            return false;
                        }
                        break;
                    case '}':
                        if (stack.isEmpty() || stack.pop() != '}') {
                            return false;
                        }
                        break;
                }
            }
            // 栈为空说明所有括号都匹配
            return stack.isEmpty();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}