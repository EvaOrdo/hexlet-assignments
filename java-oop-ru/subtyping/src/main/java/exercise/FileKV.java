package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class FileKV implements KeyValueStorage {
    private String filepath;
    private final Map<String, String> storage;
    public FileKV(String filepath, Map<String, String> data) {
        this.filepath = filepath;
        storage = new HashMap<>(data);
    }
    public void set(String key, String value) {
        storage.put(key, value);
    }

    public void unset(String key) {
        storage.remove(key);
    }

    public String get(String key, String defaultValue) {
        return storage.getOrDefault(key, defaultValue);
    }

    public Map<String, String> toMap() {
        return new HashMap<>(storage);
    }
}
// END
