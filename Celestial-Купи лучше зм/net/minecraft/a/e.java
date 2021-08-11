/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net.minecraft.a;

import com.google.gson.JsonObject;
import java.util.Date;
import net.minecraft.a.c;
import net.minecraft.a.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class e
extends c<String> {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String a(JsonObject jsonObject) {
        boolean bl2 = k.q();
        JsonObject jsonObject2 = jsonObject;
        String string = "ip";
        if (!bl2) {
            if (!jsonObject2.has(string)) return null;
            jsonObject2 = jsonObject;
            string = "ip";
        }
        String string2 = jsonObject2.get(string).getAsString();
        return string2;
    }

    @Override
    protected void a(JsonObject jsonObject) {
        block3: {
            e e10;
            block2: {
                boolean bl2 = k.q();
                e10 = this;
                if (bl2) break block2;
                if (e10.a() == null) break block3;
                jsonObject.addProperty("ip", (String)this.a());
                e10 = this;
            }
            super.a(jsonObject);
        }
    }

    public e(String string, Date date, String string2, Date date2, String string3) {
        super(string, date, string2, date2, string3);
    }

    public e(String string) {
        this(string, (Date)null, (String)null, (Date)null, (String)null);
    }

    public e(JsonObject jsonObject) {
        super(net.minecraft.a.e.a(jsonObject), jsonObject);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

