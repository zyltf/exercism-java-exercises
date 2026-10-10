import java.util.HashMap;
import java.util.Map;

public class DialingCodes {
    Map<Integer, String> dialMap = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return dialMap;
    }

    public void setDialingCode(Integer code, String country) {
        dialMap.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialMap.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!dialMap.containsKey(code) && !dialMap.containsValue(country)) dialMap.put(code, country);
    }

    public Integer findDialingCode(String country) {
        for (Map.Entry<Integer, String> en : dialMap.entrySet()) {
            if (country.equals(en.getValue())) return en.getKey();
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if (dialMap.containsValue(country)) {
            dialMap.remove(findDialingCode(country));
            dialMap.put(code, country);
        }
    }
}
