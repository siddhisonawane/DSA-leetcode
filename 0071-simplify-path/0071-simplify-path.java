import java.util.*;

class Solution {
    public static String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> s1 = new Stack<>();

        for (int i = 0; i < parts.length; i++) {
            if (parts[i].equals("") || parts[i].equals(".")) {
                continue;
            } else if (parts[i].equals("..")) {
                if (!s1.isEmpty()) {
                    s1.pop();
                }
            } else {
                s1.push(parts[i]);
            }
        }
        if (s1.isEmpty()) {
            return "/";
        }
        // List<String> list = new ArrayList<>(s1);
        // Collections.reverse(list);

        StringBuilder simplifiedPath = new StringBuilder();
        for (String dir : s1) {
            simplifiedPath.append("/");
            simplifiedPath.append(dir);
        }

        return simplifiedPath.toString();
    }

}