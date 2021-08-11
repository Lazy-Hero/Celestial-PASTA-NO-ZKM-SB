/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 */
package net.minecraft.M;

import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;
import net.minecraft.E.K;
import net.minecraft.M.t;
import net.minecraft.P.a;
import net.minecraft.P.c;
import net.minecraft.P.d;
import net.minecraft.P.i;
import net.minecraft.P.r;
import net.minecraft.U.x;
import net.minecraft.ar.aG;

public class o {
    @Nullable
    private final /* synthetic */ r b;
    public static final /* synthetic */ o a;

    static {
        a = new o(null);
    }

    public o(@Nullable r r2) {
        this.b = r2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(net.minecraft.w.d d10) {
        int n2 = t.b();
        o o2 = this;
        if (n2 == 0) {
            if (o2 == a) return true;
            o2 = this;
        }
        boolean bl2 = o2.a(d10.v());
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static o a(@Nullable JsonElement var0) {
        var1_1 = t.c();
        v0 = var0;
        if (var1_1 != 0) {
            if (v0 == null) return o.a;
            v0 = var0;
        }
        if (var1_1 == 0) ** GOTO lbl10
        if (v0.isJsonNull() != false) return o.a;
        try {
            v0 = var0;
lbl10:
            // 2 sources

            var2_2 = d.c(aG.e(v0, "nbt"));
            return new o(var2_2);
        }
        catch (a var3_3) {
            throw new JsonSyntaxException("Invalid nbt tag: " + var3_3.getMessage());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(x x2) {
        int n2 = t.b();
        o o2 = this;
        if (n2 == 0) {
            if (o2 == a) return true;
            o2 = this;
        }
        boolean bl2 = o2.a(K.a(x2));
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable i i2) {
        int n2 = t.c();
        if (i2 == null) {
            if (this != a) return false;
            return true;
        }
        r r2 = this.b;
        if (n2 != 0) {
            if (r2 == null) return true;
            r2 = this.b;
        }
        boolean bl2 = c.a(r2, i2, true);
        if (n2 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }
}

