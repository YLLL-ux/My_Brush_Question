package string;

/**
 * @Description 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * <p>
 * 示例 1：
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * @Author Phil
 * @CreateTime 2022/7/7
 **/

public class ReplaceSpace {

    // 遍历添加
    public String replaceSpace(String s) {
        if (s == null) return s;

        StringBuilder strBuilder = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') strBuilder.append("%20");
            else strBuilder.append(c);
        }

        return strBuilder.toString();
    }
}
