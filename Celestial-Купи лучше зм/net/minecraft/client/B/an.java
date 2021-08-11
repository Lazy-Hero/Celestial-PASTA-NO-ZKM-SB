/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.b;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import net.minecraft.client.D.h;
import net.minecraft.client.b.L;
import net.minecraft.client.b.b7;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.l.c;
import net.minecraft.client.l.f;

public class an
extends L {
    private /* synthetic */ b7 y;
    private final /* synthetic */ c E;
    private /* synthetic */ String[] A;
    private final /* synthetic */ List<String> F;
    private final /* synthetic */ L z;
    private final /* synthetic */ List<String> D;
    private /* synthetic */ s C;
    private /* synthetic */ String B;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void r() {
        block13: {
            block12: {
                block11: {
                    this.B = net.minecraft.client.D.h.a("options.snooper.title", new Object[0]);
                    var2_1 = net.minecraft.client.D.h.a("options.snooper.desc", new Object[0]);
                    var1_2 = q.b();
                    var3_3 = Lists.newArrayList();
                    for (String var5_6 : this.v.c(var2_1, an.h - 30)) {
                        var3_3.add(var5_6);
                        if (var1_2 != null) {
                            if (var1_2 != null) continue;
                        }
                        break block11;
                    }
                    this.A = var3_3.toArray(new String[var3_3.size()]);
                    this.D.clear();
                    this.F.clear();
                    this.C = this.b(new s(1, an.h / 2 - 152, an.w - 30, 150, 20, this.E.c(net.minecraft.client.l.f.SNOOPER_ENABLED)));
                    this.t.add(new s(2, an.h / 2 + 2, an.w - 30, 150, 20, net.minecraft.client.D.h.a("gui.done", new Object[0])));
                }
                v0 = this.m.ae();
                if (var1_2 == null) break block12;
                if (v0 == null) ** GOTO lbl-1000
                v0 = this.m.ae();
            }
            if (v0.a() != null) {
                v1 = true;
            } else lbl-1000:
            // 2 sources

            {
                v1 = false;
            }
            var4_5 = v1;
            for (Map.Entry var6_10 : new TreeMap<String, String>(this.m.h().c()).entrySet()) {
                v2 = this.D;
                v3 = new StringBuilder();
                if (var1_2 != null) {
                    v2.add(v3.append(var4_5 != false ? "C " : "").append(var6_10.getKey()).toString());
                    this.F.add(this.v.e((String)var6_10.getValue(), an.h - 220));
                    if (var1_2 != null) continue;
                }
                ** GOTO lbl44
            }
            if (!var4_5) break block13;
            var5_8 = new TreeMap<String, String>(this.m.ae().a().c()).entrySet().iterator();
            while (var5_9.hasNext()) {
                var6_10 = (Map.Entry)var5_9.next();
                v2 = this.D;
                v3 = new StringBuilder().append("S ").append((String)var6_10.getKey());
lbl44:
                // 2 sources

                v2.add(v3.toString());
                this.F.add(this.v.e(var6_10.getValue(), an.h - 220));
                if (var1_2 == null) return;
                if (var1_2 != null) continue;
            }
        }
        this.y = new b7(this);
    }

    @Override
    protected void a(s s2) throws IOException {
        block5: {
            block7: {
                s s3;
                int n2;
                int n3;
                block6: {
                    String[] arrstring;
                    block4: {
                        arrstring = q.b();
                        n3 = s2.h;
                        if (arrstring == null) break block4;
                        if (n3 == 0) break block5;
                        n3 = s2.g;
                    }
                    n2 = 2;
                    if (arrstring == null) break block6;
                    if (n3 == n2) {
                        this.E.e();
                        this.E.e();
                        this.m.a(this.z);
                    }
                    s3 = s2;
                    if (arrstring == null) break block7;
                    n3 = s3.g;
                    n2 = 1;
                }
                if (n3 != n2) break block5;
                this.E.b(net.minecraft.client.l.f.SNOOPER_ENABLED, 1);
                s3 = this.C;
            }
            s3.m = this.E.c(net.minecraft.client.l.f.SNOOPER_ENABLED);
        }
    }

    static List b(an an2) {
        return an2.D;
    }

    public an(L l2, c c10) {
        this.D = Lists.newArrayList();
        this.F = Lists.newArrayList();
        this.z = l2;
        this.E = c10;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block2: {
            String[] arrstring = q.b();
            this.n();
            this.y.b(n2, n3, f10);
            this.b(this.v, this.B, h / 2, 8, 0xFFFFFF);
            int n4 = 22;
            String[] arrstring2 = arrstring;
            for (String string : this.A) {
                this.b(this.v, string, h / 2, n4, 0x808080);
                n4 += this.v.p;
                if (arrstring2 != null) {
                    if (arrstring2 != null) continue;
                }
                break block2;
            }
            super.a(n2, n3, f10);
        }
    }

    @Override
    public void k() throws IOException {
        super.k();
        this.y.f();
    }

    static List a(an an2) {
        return an2.F;
    }
}

