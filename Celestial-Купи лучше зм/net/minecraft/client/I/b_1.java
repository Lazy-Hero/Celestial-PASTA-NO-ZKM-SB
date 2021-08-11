/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.i;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.at.g;
import net.minecraft.at.k;
import net.minecraft.client.D.z;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.b.a5;
import net.minecraft.client.b.q;
import net.minecraft.client.g.a;
import net.minecraft.client.i.c;
import net.minecraft.client.i.e;
import net.minecraft.k.h;
import net.minecraft.k.m;

class b
implements net.minecraft.client.g.b {
    final /* synthetic */ c a;
    private final /* synthetic */ net.minecraft.D.m d;
    private final /* synthetic */ List<net.minecraft.client.o.e> c;
    private final /* synthetic */ net.minecraft.ar.v b;

    @Override
    public boolean a() {
        String string = net.minecraft.client.i.c.b();
        boolean bl2 = this.c.isEmpty();
        if (string != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    public void a(a a10) {
        a10.a(new e(this.c));
    }

    public b(c c10, net.minecraft.D.m m2) {
        block11: {
            block10: {
                net.minecraft.client.o.e e10;
                block7: {
                    Object object;
                    block8: {
                        block9: {
                            this.a = c10;
                            this.d = m2;
                            this.c = Lists.newArrayList();
                            String string = net.minecraft.client.i.c.b();
                            for (String string2 : m2.h()) {
                                net.minecraft.client.o.e e11;
                                e10 = e11 = Q.P().ar().a(string2);
                                if (string != null) {
                                    if (e10 != null) {
                                        this.c.add(e11);
                                    }
                                    if (string != null) continue;
                                }
                                break block7;
                            }
                            object = this.c;
                            if (string == null) break block8;
                            if (!object.isEmpty()) break block9;
                            this.b = z.a();
                            if (string != null) break block10;
                        }
                        object = this.c.get(new Random().nextInt(this.c.size()));
                    }
                    e10 = (net.minecraft.client.o.e)object;
                }
                String string = e10.p().getName();
                this.b = net.minecraft.client.q.a.a(string);
                net.minecraft.client.q.a.a(this.b, string);
            }
            if (m.d()) break block11;
            net.minecraft.client.i.c.b("j3wPPb");
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(float f10, int n2) {
        int n3 = -1;
        String string = net.minecraft.client.i.c.b();
        String string2 = a5.d(this.d.c());
        int n4 = string2.length();
        if (string != null) {
            if (n4 >= 2) {
                n3 = Q.P().a6.e(string2.charAt(1));
            }
            n4 = n3;
        }
        if (string != null) {
            if (n4 >= 0) {
                float f11 = (float)(n3 >> 16 & 0xFF) / 255.0f;
                float f12 = (float)(n3 >> 8 & 0xFF) / 255.0f;
                float f13 = (float)(n3 & 0xFF) / 255.0f;
                q.a(1, 1, 15, 15, h.a(f11 * f10, f12 * f10, f13 * f10) | n2 << 24);
            }
            Q.P().aN().b(this.b);
            v.b(f10, f10, f10, (float)n2 / 255.0f);
            q.a(2, 2, 8.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
            n4 = 2;
        }
        q.a(n4, 2, 40.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
        if (string == null) {
            m.b(!m.c());
        }
    }

    @Override
    public k b() {
        return new g(this.d.a());
    }
}

