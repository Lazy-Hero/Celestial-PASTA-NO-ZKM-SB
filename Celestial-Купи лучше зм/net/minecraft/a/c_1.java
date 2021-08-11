/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net.minecraft.a;

import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.minecraft.a.b;
import net.minecraft.a.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class c<T>
extends b<T> {
    public static final /* synthetic */ SimpleDateFormat e;
    protected final /* synthetic */ Date f;
    protected final /* synthetic */ String c;
    protected final /* synthetic */ Date b;
    protected final /* synthetic */ String d;

    public Date b() {
        return this.f;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(JsonObject var1_1) {
        var2_2 = k.q();
        v0 = var1_1;
        v1 = "created";
        v2 = net.minecraft.a.c.e;
        v3 = this.b;
        if (var2_2) ** GOTO lbl16
        v0.addProperty(v1, v2.format(v3));
        var1_1.addProperty("source", this.d);
        v0 = var1_1;
        v1 = "expires";
        if (this.f == null) {
            v4 = "forever";
        } else {
            v2 = net.minecraft.a.c.e;
            v3 = this.f;
lbl16:
            // 2 sources

            v4 = v2.format(v3);
        }
        v0.addProperty(v1, v4);
        var1_1.addProperty("reason", this.c);
    }

    public c(T t2, Date date, String string, Date date2, String string2) {
        boolean bl2 = k.t();
        super(t2);
        boolean bl3 = bl2;
        Date date3 = date;
        if (bl3) {
            date3 = date3 == null ? new Date() : date;
        }
        this.b = date3;
        String string3 = string;
        if (bl3) {
            string3 = string3 == null ? "(Unknown)" : string;
        }
        this.d = string3;
        this.f = date2;
        String string4 = string2;
        if (bl3) {
            string4 = string4 == null ? "Banned by an operator." : string2;
        }
        this.c = string4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    boolean b() {
        boolean bl2 = k.q();
        Date date = this.f;
        if (!bl2) {
            if (date == null) return false;
            date = this.f;
        }
        boolean bl3 = date.before(new Date());
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    protected c(T var1_1, JsonObject var2_2) {
        v0 = k.t();
        super(var1_1, var2_2);
        var3_3 = v0;
        try {
            var4_4 = var2_2.has("created") != false ? net.minecraft.a.c.e.parse(var2_2.get("created").getAsString()) : new Date();
        }
        catch (ParseException var5_5) {
            var4_4 = new Date();
        }
        this.b = var4_4;
        v1 = var2_2;
        v2 = "source";
        if (!var3_3) ** GOTO lbl16
        if (v1.has(v2)) {
            v1 = var2_2;
            v2 = "source";
lbl16:
            // 2 sources

            v3 = v1.get(v2).getAsString();
        } else {
            v3 = "(Unknown)";
        }
        this.d = v3;
        try {
            var5_6 = var2_2.has("expires") != false ? net.minecraft.a.c.e.parse(var2_2.get("expires").getAsString()) : null;
        }
        catch (ParseException var6_7) {
            var5_6 = null;
        }
        this.f = var5_6;
        v4 = var2_2;
        v5 = "reason";
        if (!var3_3) ** GOTO lbl32
        if (v4.has(v5)) {
            v4 = var2_2;
            v5 = "reason";
lbl32:
            // 2 sources

            v6 = v4.get(v5).getAsString();
        } else {
            v6 = "Banned by an operator.";
        }
        this.c = v6;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    static {
        e = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    }

    @Override
    public String a() {
        return this.c;
    }
}

