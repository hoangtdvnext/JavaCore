package javapatterns;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ASUS on 5/12/2017.
 */
public class Claim {

    private int id;
    private String role;
    private Long timestamp;

    public Claim(int id, String role, Long timestamp) {
        this.id = id;
        this.role = role;
        this.timestamp = timestamp;
    }

    public Claim(Map<String, Object> data) {
        id = Integer.parseInt(data.get("id").toString(), 0);
        role = data.get("role").toString();
        timestamp = Long.parseLong(data.get("timestamp").toString(), 0);
    }

    public Map<String, Object> getClaims() {
        HashMap<String, Object> claims = new HashMap<>();
        claims.put("id", id);
        claims.put("role", role);
        claims.put("timestamp", timestamp);

        return claims;
    }
}
