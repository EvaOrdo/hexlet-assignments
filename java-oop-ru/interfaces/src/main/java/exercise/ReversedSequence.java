package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    String str;
    public ReversedSequence(String str) {
        StringBuilder input = new StringBuilder();
        input.append(str);
        input.reverse();
        this.str = input.toString();
    }

    public char charAt(int index) {
        if (index < 0 || index >= str.length()) {
            throw new IndexOutOfBoundsException();
        }
        return str.charAt(index);
    }
    public int length() {
        return str.length();
    }
    public String subSequence(int start, int end) {
        if (start < 0 || end >= str.length()) {
            throw new IndexOutOfBoundsException();
        }
        String substr = "";
        for (int i = start; i < end; i++) {
                substr += str.charAt(i);
        }
        return substr;
    }
    public String toString() {
        return str;
    }

}
// END
