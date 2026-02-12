class Solution {
    public String solution(String polynomial) {
        String[] tokens = polynomial.split(" ");
        int xSum = 0;
        int numSum = 0;

        for (String token : tokens) {
            if (token.equals("+")) {
                continue;
            }

            if (token.contains("x")) {
                String coef = token.replace("x", "");
                if (coef.equals("")) {
                    xSum += 1;
                } else {
                    xSum += Integer.parseInt(coef);
                }
            } else {
                numSum += Integer.parseInt(token);
            }
        }

        StringBuilder sb = new StringBuilder();

        if (xSum != 0) {
            if (xSum == 1) {
                sb.append("x");
            } else {
                sb.append(xSum).append("x");
            }
        }

        if (numSum != 0) {
            if (sb.length() > 0) {
                sb.append(" + ");
            }
            sb.append(numSum);
        }
        return sb.toString();
    }
}