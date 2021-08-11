/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.util.vector.Matrix4f
 */
package net.minecraft.client.s;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.D.t;
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.v;
import net.minecraft.client.s.a;
import net.minecraft.client.s.b;
import net.minecraft.k.m;
import org.lwjgl.util.vector.Matrix4f;

public class c {
    private final /* synthetic */ a g;
    private final /* synthetic */ List<Object> b;
    private final /* synthetic */ List<Integer> h;
    private /* synthetic */ Matrix4f c;
    private final /* synthetic */ List<String> d;
    public final /* synthetic */ b f;
    private final /* synthetic */ List<Integer> a;
    public final /* synthetic */ b e;

    public void a(String string, Object object, int n2, int n3) {
        this.d.add(this.d.size(), string);
        this.b.add(this.b.size(), object);
        this.a.add(this.a.size(), n2);
        this.h.add(this.h.size(), n3);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void a() {
        v.b(1.0f, 1.0f, 1.0f, 1.0f);
        v.f();
        v.n();
        v.v();
        v.C();
        v.y();
        v.h();
        v.x();
        v.t(0);
    }

    public void a(float f10) {
        int n2;
        float f11;
        float f12;
        block7: {
            this.a();
            this.f.a();
            f12 = this.e.g;
            f11 = this.e.b;
            v.d(0, 0, (int)f12, (int)f11);
            int n3 = net.minecraft.client.s.b.g();
            this.g.a("DiffuseSampler", this.f);
            n2 = n3;
            for (int i2 = 0; i2 < this.b.size(); ++i2) {
                this.g.a(this.d.get(i2), this.b.get(i2));
                this.g.a("AuxSize" + i2).a(this.a.get(i2).intValue(), this.h.get(i2).intValue());
                if (n2 == 0) {
                    if (n2 == 0) continue;
                    m.b(!m.d());
                    break;
                }
                break block7;
            }
            this.g.a("ProjMat").a(this.c);
            this.g.a("InSize").a(this.f.g, this.f.b);
            this.g.a("OutSize").a(f12, f11);
            this.g.a("Time").a(f10);
        }
        Q q2 = Q.P();
        this.g.a("ScreenSize").a(q2.P, q2.aT);
        this.g.c();
        this.e.b();
        this.e.a(false);
        v.a(false);
        v.a(true, true, true, true);
        W w2 = W.c();
        I i3 = w2.b();
        i3.a(7, net.minecraft.client.y.b.i);
        i3.c(0.0, (double)f11, 500.0).b(255, 255, 255, 255).d();
        i3.c((double)f12, (double)f11, 500.0).b(255, 255, 255, 255).d();
        i3.c((double)f12, 0.0, 500.0).b(255, 255, 255, 255).d();
        i3.c(0.0, 0.0, 500.0).b(255, 255, 255, 255).d();
        w2.a();
        v.a(true);
        v.a(true, true, true, true);
        this.g.g();
        this.e.a();
        this.f.d();
        Iterator<Object> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            block9: {
                Object object;
                block8: {
                    Object object2;
                    object = object2 = iterator.next();
                    if (n2 != 0) break block8;
                    if (!(object instanceof b)) break block9;
                    object = object2;
                }
                ((b)object).d();
            }
            if (n2 == 0) continue;
        }
    }

    public void c() {
        this.g.d();
    }

    public void a(Matrix4f matrix4f) {
        this.c = matrix4f;
    }

    public c(t t2, String string, b b10, b b11) throws IOException {
        this.b = Lists.newArrayList();
        this.d = Lists.newArrayList();
        this.a = Lists.newArrayList();
        this.h = Lists.newArrayList();
        this.g = new a(t2, string);
        this.f = b10;
        this.e = b11;
    }

    public a b() {
        return this.g;
    }
}

