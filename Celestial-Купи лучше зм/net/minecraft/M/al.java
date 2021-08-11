/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 */
package net.minecraft.M;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;
import net.minecraft.M.X;
import net.minecraft.M.Z;
import net.minecraft.M.o;
import net.minecraft.M.q;
import net.minecraft.M.t;
import net.minecraft.U.h;
import net.minecraft.U.x;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;
import net.minecraft.i.k;

public class al {
    private final /* synthetic */ X f;
    public static final /* synthetic */ al d;
    private final /* synthetic */ o b;
    private final /* synthetic */ v c;
    private final /* synthetic */ q e;
    private final /* synthetic */ Z a;

    static {
        d = new al(null, q.a, Z.b, X.a, o.a);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(k var1_1, @Nullable x var2_2) {
        var3_3 = t.c();
        if (this == al.d) {
            return true;
        }
        if (var2_2 == null) {
            return false;
        }
        v0 = this;
        if (var3_3 == 0) ** GOTO lbl15
        if (v0.c != null) {
            v1 = h.a(var2_2, this.c);
            if (var3_3 != 0) {
                if (!v1) {
                    return false;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v0 = this;
lbl15:
            // 2 sources

            v1 = v0.e.a(var1_1.a, var1_1.aF, var1_1.ax, var2_2.a, var2_2.aF, var2_2.ax);
        }
        if (var3_3 != 0) {
            if (!v1) {
                return false;
            }
            v1 = this.a.a(var1_1.n(), var2_2.a, var2_2.aF, var2_2.ax);
        }
        if (var3_3 != 0) {
            if (!v1) {
                return false;
            }
            v1 = this.f.a(var2_2);
        }
        if (var3_3 == 0) return v1;
        if (!v1) {
            return false;
        }
        v1 = this.b.a(var2_2);
        return v1;
    }

    private static JsonSyntaxException a(JsonSyntaxException jsonSyntaxException) {
        return jsonSyntaxException;
    }

    public al(@Nullable v v2, q q2, Z z2, X x2, o o2) {
        this.c = v2;
        this.e = q2;
        this.a = z2;
        this.f = x2;
        this.b = o2;
    }

    public static al a(@Nullable JsonElement jsonElement) {
        block5: {
            JsonElement jsonElement2;
            block6: {
                int n2;
                block4: {
                    n2 = t.b();
                    jsonElement2 = jsonElement;
                    if (n2 != 0) break block4;
                    if (jsonElement2 == null) break block5;
                    jsonElement2 = jsonElement;
                }
                if (n2 != 0) break block6;
                if (jsonElement2.isJsonNull()) break block5;
                jsonElement2 = jsonElement;
            }
            JsonObject jsonObject = aG.b(jsonElement2, "entity");
            v v2 = null;
            if (jsonObject.has("type") && !h.b(v2 = new v(aG.f(jsonObject, "type")))) {
                throw new JsonSyntaxException("Unknown entity type '" + v2 + "', valid types are: " + h.a());
            }
            q q2 = q.a(jsonObject.get("distance"));
            Z z2 = Z.a(jsonObject.get("location"));
            X x2 = X.a(jsonObject.get("effects"));
            o o2 = o.a(jsonObject.get("nbt"));
            return new al(v2, q2, z2, x2, o2);
        }
        return d;
    }
}

