/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonObject
 */
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.util.logging.Logger;
import net.minecraft.k.m;

public class dO
extends d4 {
    private final /* synthetic */ String a;
    private static /* synthetic */ int[] f;
    private final /* synthetic */ Gson c;
    private final /* synthetic */ String e = "http://api.thealtening.com/v1/";
    private final /* synthetic */ Logger d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(String string) {
        boolean bl2;
        int[] arrn;
        block10: {
            arrn = dO.c();
            try {
                JsonObject jsonObject;
                String string2 = this.a("http://api.thealtening.com/v1/favorite?acctoken=" + string + "&token=" + this.a);
                JsonObject jsonObject2 = jsonObject = (JsonObject)this.c.fromJson(string2, JsonObject.class);
                if (arrn != null) {
                    if (jsonObject2 == null) return false;
                    jsonObject2 = jsonObject;
                }
                bl2 = jsonObject2.has("success");
                if (arrn == null) break block10;
                if (!bl2) return false;
                bl2 = jsonObject.get("success").getAsBoolean();
            }
            catch (IOException iOException) {
                block13: {
                    block12: {
                        block11: {
                            if (arrn == null) break block11;
                            if (!iOException.getMessage().contains("401")) break block12;
                            this.d.info("Invalid API Key provided");
                        }
                        if (arrn != null) break block13;
                    }
                    this.d.info("Failed to communicate with the website. Try again later");
                }
                if (m.d()) return false;
                dO.a(new int[3]);
                return false;
            }
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public hA b() {
        int[] arrn = dO.c();
        try {
            String string = this.a(String.format("http://api.thealtening.com/v1/generate?info=true&token=%s", this.a));
            return (hA)this.c.fromJson(string, hA.class);
        }
        catch (IOException iOException) {
            block4: {
                block3: {
                    block2: {
                        if (arrn == null) break block2;
                        if (!iOException.getMessage().contains("401")) break block3;
                        this.d.info("Invalid API Key provided");
                    }
                    if (arrn != null) break block4;
                }
                this.d.info("Failed to communicate with the website. Try again later");
            }
            return null;
        }
    }

    static {
        if (dO.c() == null) {
            dO.a(new int[4]);
        }
    }

    public aU a() {
        int[] arrn = dO.c();
        try {
            System.setProperty("http.agent", "chrome");
            String string = this.a(String.format("http://api.thealtening.com/v1/license?token=%s", this.a));
            return (aU)this.c.fromJson(string, aU.class);
        }
        catch (IOException iOException) {
            block4: {
                block3: {
                    block2: {
                        if (arrn == null) break block2;
                        if (!iOException.getMessage().contains("401")) break block3;
                        this.d.info("Invalid API Key provided");
                    }
                    if (arrn != null) break block4;
                }
                this.d.info("Failed to communicate with the website. Try again later");
            }
            return null;
        }
    }

    public static void a(int[] arrn) {
        f = arrn;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean b(String string) {
        boolean bl2;
        int[] arrn;
        block10: {
            arrn = dO.c();
            try {
                JsonObject jsonObject;
                String string2 = this.a("http://api.thealtening.com/v1/private?acctoken=" + string + "&token=" + this.a);
                JsonObject jsonObject2 = jsonObject = (JsonObject)this.c.fromJson(string2, JsonObject.class);
                if (arrn != null) {
                    if (jsonObject2 == null) return false;
                    jsonObject2 = jsonObject;
                }
                bl2 = jsonObject2.has("success");
                if (arrn == null) break block10;
                if (!bl2) return false;
                bl2 = jsonObject.get("success").getAsBoolean();
            }
            catch (IOException iOException) {
                block12: {
                    block11: {
                        if (arrn == null) break block11;
                        if (!iOException.getMessage().contains("401")) break block12;
                        this.d.info("Invalid API Key provided");
                    }
                    if (arrn != null) return false;
                }
                this.d.info("Failed to communicate with the website. Try again later");
                return false;
            }
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public dO(String string) {
        this.e = "http://api.thealtening.com/v1/";
        int[] arrn = dO.c();
        this.d = Logger.getLogger("TheAltening");
        this.c = new Gson();
        this.a = string;
        if (arrn == null) {
            m.b(!m.d());
        }
    }

    public static int[] c() {
        return f;
    }
}

