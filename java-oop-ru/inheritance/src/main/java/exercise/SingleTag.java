package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(String tagName, Map<String, String> attributes) {
        super(tagName, attributes);

    }

    public String toString() {
        StringBuilder builder = new StringBuilder("<");
        builder.append(getTagName());
        for (var pair : getAttributes().entrySet()) {
            var attrib = String.format(" %s=\"%s\"", pair.getKey(), pair.getValue());
            builder.append(attrib);
        }
        builder.append(">");
        return builder.toString();
    }
}
// END
