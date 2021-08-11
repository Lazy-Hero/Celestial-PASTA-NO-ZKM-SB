/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.nio.charset.StandardCharsets;

public class et
implements dl {
    private /* synthetic */ String a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(String string, byte[] arrby, Throwable throwable) {
        String string2 = K.d();
        if (arrby == null) return;
        try {
            fP fP2;
            String string3 = new String(arrby, StandardCharsets.US_ASCII);
            JsonParser jsonParser = new JsonParser();
            JsonElement jsonElement = jsonParser.parse(string3);
            dL dL2 = new dL(this.a);
            fP fP3 = fP2 = dL2.a(jsonElement);
            if (string2 == null) {
                if (fP3 == null) return;
                fP3 = fP2;
            }
            fP3.a(true);
            fB.a(this.a, fP2);
            return;
        }
        catch (Exception exception) {
            fU.b("Error parsing configuration: " + string + ", " + exception.getClass().getName() + ": " + exception.getMessage());
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public et(String string) {
        this.a = null;
        this.a = string;
    }
}

