class CaesarsCipher1stQuestion {

    public static String specialCipher(String text, int rotation) {
        StringBuilder caesar = new StringBuilder();
        for (char ch : text.toCharArray()) {
            char newChar = (char) (ch + rotation);
            caesar.append(newChar);
        }
        StringBuilder result = new StringBuilder();
        char prev = caesar.charAt(0);
        int count = 1;

        for (int i = 1; i < caesar.length(); i++) {
            if (caesar.charAt(i) == prev) {
                count++;
            } else {
                result.append(prev);
                if (count > 1) result.append(count);
                prev = caesar.charAt(i);
                count = 1;
            }
        }
        result.append(prev);
        if (count > 1) result.append(count);

        return result.toString();
    }

    public static void main(String[] args) {
        int rotation = 3;
        String input = "AABCCC";
        System.out.println(specialCipher(input, rotation));
    }
}
