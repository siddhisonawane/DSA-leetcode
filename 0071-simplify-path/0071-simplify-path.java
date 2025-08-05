import java.util.*;

class Solution {
    public static String simplifyPath(String path) {
        String[] parts = path.split("/");
        Deque<String> stack = new LinkedList<>();

        for (int i = 0; i < parts.length; i++) {
            if (parts[i].equals("") || parts[i].equals(".")) {
                continue;
            } else if (parts[i].equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(parts[i]);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        List<String> list = new ArrayList<>(stack);
        Collections.reverse(list);

        StringBuilder simplifiedPath = new StringBuilder();
        for (String dir : list) {
            simplifiedPath.append("/");
            simplifiedPath.append(dir);
        }

        return simplifiedPath.toString();
    }

}