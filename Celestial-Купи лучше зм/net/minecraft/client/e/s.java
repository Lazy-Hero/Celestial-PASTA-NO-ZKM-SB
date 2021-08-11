/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.e;

import javax.annotation.Nullable;
import net.minecraft.ar.ay;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.client.e.C;
import net.minecraft.client.e.b;
import net.minecraft.client.e.j;
import net.minecraft.client.e.k;
import net.minecraft.client.e.n;
import net.minecraft.k.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class s
implements j {
    private static /* synthetic */ m[] k;
    protected /* synthetic */ n a;
    protected /* synthetic */ boolean c;
    protected /* synthetic */ float e;
    protected /* synthetic */ int g;
    protected /* synthetic */ float f;
    protected /* synthetic */ b j;
    protected /* synthetic */ ay l;
    protected /* synthetic */ float b;
    protected /* synthetic */ float i;
    protected /* synthetic */ v d;
    protected /* synthetic */ float h;
    @Nullable
    private /* synthetic */ k m;

    @Override
    public float c() {
        return this.f * this.j.g();
    }

    @Override
    public float d() {
        return this.e * this.j.e();
    }

    @Override
    public k a(C c10) {
        block4: {
            block2: {
                s s2;
                block3: {
                    this.m = c10.a(this.d);
                    m[] arrm = s.b();
                    s2 = this;
                    if (arrm == null) break block2;
                    if (s2.m != null) break block3;
                    this.j = C.a;
                    if (arrm != null) break block4;
                }
                s2 = this;
            }
            s2.j = this.m.a();
        }
        return this.m;
    }

    public static m[] b() {
        return k;
    }

    @Override
    public int b() {
        return this.g;
    }

    @Override
    public b f() {
        return this.j;
    }

    static {
        if (s.b() == null) {
            s.b(new m[1]);
        }
    }

    @Override
    public v j() {
        return this.d;
    }

    @Override
    public float k() {
        return this.i;
    }

    public static void b(m[] arrm) {
        k = arrm;
    }

    @Override
    public ay g() {
        return this.l;
    }

    protected s(d d10, ay ay2) {
        this(d10.a(), ay2);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    protected s(v v2, ay ay2) {
        this.e = 1.0f;
        this.f = 1.0f;
        this.a = n.LINEAR;
        this.d = v2;
        this.l = ay2;
    }

    @Override
    public boolean h() {
        return this.c;
    }

    @Override
    public float e() {
        return this.b;
    }

    @Override
    public n i() {
        return this.a;
    }

    @Override
    public float a() {
        return this.h;
    }
}

