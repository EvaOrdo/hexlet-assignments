package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
   private String content;
   private List<Tag> innerTags;

   public PairedTag(String tag, Map<String, String> atr, String body, List<Tag> children) {
       super(tag, atr);
       this.content = body;
       this.innerTags = children;
   }

   public String toString() {
       StringBuilder builder = new StringBuilder("<");
       builder.append(getTagName());
       for (var pair : getAttributes().entrySet()) {
           var attrib = String.format(" %s=\"%s\"", pair.getKey(), pair.getValue());
           builder.append(attrib);
       }
       builder.append(">");

       builder.append(content);
       innerTags.forEach(tag -> builder.append(tag.toString()));

       var closingTag = String.format("</%s>", getTagName());
       builder.append(closingTag);

       return builder.toString();
   }
}
// END
