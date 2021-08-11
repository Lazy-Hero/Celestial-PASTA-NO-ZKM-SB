/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 */
package net.minecraft;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.a0;
import net.minecraft.aG;
import net.minecraft.ar.v;
import net.minecraft.at.k;
import net.minecraft.k.m;
import net.minecraft.w.d;

public class a2 {
    private final /* synthetic */ d e;
    private final /* synthetic */ boolean a;
    private final /* synthetic */ a0 f;
    private final /* synthetic */ k h;
    private final /* synthetic */ boolean j;
    private /* synthetic */ float c;
    private final /* synthetic */ boolean b;
    private /* synthetic */ float g;
    private final /* synthetic */ v i;
    private final /* synthetic */ k d;

    public static a2 b(net.minecraft.C.m m2) throws IOException {
        k k2 = m2.m();
        k k3 = m2.m();
        d d10 = m2.j();
        boolean bl2 = aG.b();
        a0 a02 = m2.a(a0.class);
        int n2 = m2.readInt();
        v v2 = (n2 & 1) != 0 ? m2.e() : null;
        boolean bl3 = n2 & 2;
        if (bl2) {
            bl3 = bl3;
        }
        boolean bl4 = bl3;
        boolean bl5 = n2 & 4;
        if (bl2) {
            bl5 = bl5;
        }
        boolean bl6 = bl5;
        a2 a22 = new a2(d10, k2, k3, v2, a02, bl4, false, bl6);
        a22.a(m2.readFloat(), m2.readFloat());
        return a22;
    }

    public void a(net.minecraft.C.m m2) {
        block10: {
            a2 a22;
            block9: {
                boolean bl2;
                int n2;
                boolean bl3;
                block8: {
                    boolean bl4 = aG.a();
                    m2.a(this.d);
                    m2.a(this.h);
                    bl3 = bl4;
                    m2.a(this.e);
                    m2.a(this.f);
                    n2 = 0;
                    a2 a23 = this;
                    if (!bl3) {
                        if (a23.i != null) {
                            n2 |= 1;
                        }
                        a23 = this;
                    }
                    bl2 = a23.a;
                    if (bl3) break block8;
                    if (bl2) {
                        n2 |= 2;
                    }
                    a22 = this;
                    if (bl3) break block9;
                    bl2 = a22.b;
                }
                if (bl2) {
                    n2 |= 4;
                }
                m2.writeInt(n2);
                if (bl3) break block10;
                a22 = this;
            }
            if (a22.i != null) {
                m2.a(this.i);
            }
            m2.writeFloat(this.c);
            m2.writeFloat(this.g);
        }
    }

    public k i() {
        return this.d;
    }

    public float b() {
        return this.c;
    }

    public float d() {
        return this.g;
    }

    public a0 j() {
        return this.f;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static a2 a(JsonObject var0, JsonDeserializationContext var1_1) {
        var3_2 = net.minecraft.ar.aG.a(var0, "title", var1_1, k.class);
        var2_3 = aG.a();
        var4_4 = net.minecraft.ar.aG.a(var0, "description", var1_1, k.class);
        v0 = var3_2;
        if (!var2_3) {
            if (v0 == null) throw new JsonSyntaxException("Both title and description must be set");
            v0 = var4_4;
        }
        if (v0 == null) throw new JsonSyntaxException("Both title and description must be set");
        var5_5 = a2.a(net.minecraft.ar.aG.l(var0, "icon"));
        var6_6 = var0.has("background") != false ? new v(net.minecraft.ar.aG.f(var0, "background")) : null;
        v1 = var0;
        v2 = "frame";
        if (var2_3) ** GOTO lbl17
        if (v1.has(v2)) {
            v1 = var0;
            v2 = "frame";
lbl17:
            // 2 sources

            v3 = a0.a(net.minecraft.ar.aG.f(v1, v2));
        } else {
            v3 = a0.TASK;
        }
        var7_7 = v3;
        var8_8 = net.minecraft.ar.aG.a(var0, "show_toast", true);
        var9_9 = net.minecraft.ar.aG.a(var0, "announce_to_chat", true);
        var10_10 = net.minecraft.ar.aG.a(var0, "hidden", false);
        v4 = new a2(var5_5, var3_2, var4_4, var6_6, var7_7, var8_8, var9_9, var10_10);
        if (m.d() != false) return v4;
        aG.b(var2_3 == false);
        return v4;
    }

    public a2(d d10, k k2, k k3, @Nullable v v2, a0 a02, boolean bl2, boolean bl3, boolean bl4) {
        this.d = k2;
        this.h = k3;
        this.e = d10;
        this.i = v2;
        this.f = a02;
        this.a = bl2;
        this.j = bl3;
        this.b = bl4;
    }

    private static d a(JsonObject jsonObject) {
        boolean bl2 = aG.b();
        JsonObject jsonObject2 = jsonObject;
        String string = "item";
        if (bl2) {
            if (!jsonObject2.has(string)) {
                throw new JsonSyntaxException("Unsupported icon type, currently only items are supported (add 'item' key)");
            }
            jsonObject2 = jsonObject;
            string = "item";
        }
        net.minecraft.w.k k2 = net.minecraft.ar.aG.b(jsonObject2, string);
        int n2 = net.minecraft.ar.aG.a(jsonObject, "data", 0);
        return new d(k2, 1, n2);
    }

    public boolean c() {
        return this.a;
    }

    public boolean e() {
        return this.b;
    }

    public void a(float f10, float f11) {
        this.c = f10;
        this.g = f11;
    }

    public k h() {
        return this.h;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Nullable
    public v g() {
        return this.i;
    }

    public boolean a() {
        return this.j;
    }

    public d f() {
        return this.e;
    }
}

