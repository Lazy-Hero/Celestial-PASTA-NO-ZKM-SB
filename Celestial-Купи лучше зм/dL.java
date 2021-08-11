/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.imageio.ImageIO;
import net.minecraft.ar.v;
import net.minecraft.client.Q;

public class dL {
    public static final /* synthetic */ String a;
    public static final /* synthetic */ String c;
    private /* synthetic */ String b;
    public static final /* synthetic */ String d;

    private gb b(String string) {
        String string2 = ec.a() + "/" + string;
        try {
            byte[] arrby = gh.b(string2, Q.P().au());
            String string3 = new String(arrby, StandardCharsets.US_ASCII);
            JsonParser jsonParser = new JsonParser();
            JsonObject jsonObject = (JsonObject)jsonParser.parse(string3);
            gb gb2 = a2.b(jsonObject);
            return gb2;
        }
        catch (Exception exception) {
            fU.h("Error loading item model " + string + ": " + exception.getClass().getName() + ": " + exception.getMessage());
            return null;
        }
    }

    static {
        c = "items";
        d = "type";
        a = "active";
    }

    private BufferedImage a(String string) {
        String string2 = ec.a() + "/" + string;
        try {
            byte[] arrby = gh.b(string2, Q.P().au());
            BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(arrby));
            return bufferedImage;
        }
        catch (IOException iOException) {
            fU.h("Error loading item texture " + string + ": " + iOException.getClass().getName() + ": " + iOException.getMessage());
            return null;
        }
    }

    public fP a(JsonElement jsonElement) {
        fP fP2;
        block12: {
            String string = K.d();
            JsonElement jsonElement2 = jsonElement;
            if (string == null) {
                if (jsonElement2 == null) {
                    throw new JsonParseException("JSON object is null, player: " + this.b);
                }
                jsonElement2 = jsonElement;
            }
            JsonObject jsonObject = (JsonObject)jsonElement2;
            fP2 = new fP();
            JsonArray jsonArray = (JsonArray)jsonObject.get("items");
            if (jsonArray == null) break block12;
            int n2 = 0;
            while (n2 < jsonArray.size()) {
                block13: {
                    block14: {
                        gb gb2;
                        block19: {
                            String string2;
                            block22: {
                                block21: {
                                    String string3;
                                    block20: {
                                        String string4;
                                        String string5;
                                        JsonObject jsonObject2;
                                        block18: {
                                            String string6;
                                            block17: {
                                                String string7;
                                                block15: {
                                                    block16: {
                                                        jsonObject2 = (JsonObject)jsonArray.get(n2);
                                                        boolean bl2 = a8.a(jsonObject2, "active", true);
                                                        if (string != null) break block13;
                                                        if (!bl2) break block14;
                                                        string7 = string5 = a8.a(jsonObject2, "type");
                                                        if (string != null) break block15;
                                                        if (string7 != null) break block16;
                                                        fU.h("Item type is null, player: " + this.b);
                                                        if (string == null) break block14;
                                                    }
                                                    string7 = a8.a(jsonObject2, "model");
                                                }
                                                string6 = string4 = string7;
                                                if (string != null) break block17;
                                                if (string6 != null) break block18;
                                                string6 = "items/" + string5 + "/model.cfg";
                                            }
                                            string4 = string6;
                                        }
                                        gb2 = this.b(string4);
                                        if (string != null) break block13;
                                        if (gb2 == null) break block14;
                                        if (gb2.c()) break block19;
                                        string3 = string2 = a8.a(jsonObject2, "texture");
                                        if (string != null) break block20;
                                        if (string3 != null) break block21;
                                        string3 = "items/" + string5 + "/users/" + this.b + ".png";
                                    }
                                    string2 = string3;
                                }
                                BufferedImage bufferedImage = this.a(string2);
                                if (string != null) break block22;
                                if (bufferedImage == null && string == null) break block14;
                                gb2.a(bufferedImage);
                            }
                            v v2 = new v("optifine.net", string2);
                            gb2.a(v2);
                        }
                        fP2.a(gb2);
                    }
                    ++n2;
                }
                if (string == null) continue;
            }
        }
        return fP2;
    }

    public dL(String string) {
        this.b = null;
        this.b = string;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }
}

