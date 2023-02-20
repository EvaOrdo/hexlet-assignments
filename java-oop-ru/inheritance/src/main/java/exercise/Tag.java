package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    private String tagName;
    private Map<String, String> attributes;

    public Tag(String tag, Map<String, String> attr) {
        this.tagName = tag;
        this.attributes = attr;
    }
    public String getTagName() {
        return tagName;
    }
    public Map<String, String> getAttributes() {
        return attributes;
    }
}
// END
