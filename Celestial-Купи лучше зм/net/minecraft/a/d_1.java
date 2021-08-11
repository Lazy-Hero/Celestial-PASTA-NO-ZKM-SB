/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.a;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.UUID;
import net.minecraft.a.c;
import net.minecraft.a.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class d
extends c<GameProfile> {
    private static GameProfile a(JsonObject jsonObject) {
        block4: {
            UUID uUID;
            String string;
            JsonObject jsonObject2;
            block5: {
                boolean bl2;
                block3: {
                    boolean bl3 = k.q();
                    bl2 = jsonObject.has("uuid");
                    if (bl3) break block3;
                    if (!bl2) break block4;
                    jsonObject2 = jsonObject;
                    string = "name";
                    if (bl3) break block5;
                    bl2 = jsonObject2.has(string);
                }
                if (!bl2) break block4;
                jsonObject2 = jsonObject;
                string = "uuid";
            }
            String string2 = jsonObject2.get(string).getAsString();
            try {
                uUID = UUID.fromString(string2);
            }
            catch (Throwable throwable) {
                return null;
            }
            return new GameProfile(uUID, jsonObject.get("name").getAsString());
        }
        return null;
    }

    public d(GameProfile gameProfile) {
        this(gameProfile, null, null, null, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(JsonObject var1_1) {
        var2_2 = k.t();
        if (this.a() == null) return;
        v0 = ((GameProfile)this.a()).getId();
        if (!var2_2) ** GOTO lbl9
        if (v0 == null) {
            v1 = "";
        } else {
            v0 = ((GameProfile)this.a()).getId();
lbl9:
            // 2 sources

            v1 = v0.toString();
        }
        var1_1.addProperty("uuid", v1);
        var1_1.addProperty("name", ((GameProfile)this.a()).getName());
        super.a(var1_1);
    }

    public d(GameProfile gameProfile, Date date, String string, Date date2, String string2) {
        super(gameProfile, date2, string, date2, string2);
    }

    public d(JsonObject jsonObject) {
        super(net.minecraft.a.d.a(jsonObject), jsonObject);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

