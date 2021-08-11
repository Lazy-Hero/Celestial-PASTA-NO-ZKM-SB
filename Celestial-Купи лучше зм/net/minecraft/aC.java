/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSyntaxException
 */
package net.minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.minecraft.C.m;
import net.minecraft.aG;
import net.minecraft.aS;

public class aC {
    private static final /* synthetic */ SimpleDateFormat a;
    private final /* synthetic */ aS c;
    private /* synthetic */ Date b;

    public JsonElement b() {
        return this.b != null ? new JsonPrimitive(a.format(this.b)) : JsonNull.INSTANCE;
    }

    public static aC a(aS aS2, String string) {
        aC aC2 = new aC(aS2);
        try {
            aC2.b = a.parse(string);
            return aC2;
        }
        catch (ParseException parseException) {
            throw new JsonSyntaxException("Invalid datetime: " + string, (Throwable)parseException);
        }
    }

    static {
        a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    }

    public Date d() {
        return this.b;
    }

    public aC(aS aS2) {
        this.c = aS2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        Object object;
        boolean bl2 = aG.a();
        StringBuilder stringBuilder = new StringBuilder().append("CriterionProgress{obtained=");
        aC aC2 = this;
        if (!bl2) {
            if (aC2.b == null) {
                object = "false";
                return stringBuilder.append(object).append('}').toString();
            }
            aC2 = this;
        }
        object = aC2.b;
        return stringBuilder.append(object).append('}').toString();
    }

    private static JsonSyntaxException a(JsonSyntaxException jsonSyntaxException) {
        return jsonSyntaxException;
    }

    public void a() {
        this.b = new Date();
    }

    public static aC a(m m2, aS aS2) {
        aC aC2;
        block0: {
            aC2 = new aC(aS2);
            if (!m2.readBoolean()) break block0;
            aC2.b = m2.i();
        }
        return aC2;
    }

    public boolean c() {
        return this.b != null;
    }

    public void e() {
        this.b = null;
    }

    public void a(m m2) {
        block0: {
            m2.writeBoolean(this.b != null);
            if (this.b == null) break block0;
            m2.a(this.b);
        }
    }
}

