/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.a.v;
import net.minecraft.client.j.d;
import net.minecraft.client.j.p;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class e
implements d {
    protected /* synthetic */ boolean a;
    protected /* synthetic */ int c;
    public /* synthetic */ u e;
    protected /* synthetic */ boolean d;
    protected /* synthetic */ boolean f;
    protected /* synthetic */ boolean b;

    public void c() {
        block3: {
            int n2;
            block2: {
                boolean bl2 = net.minecraft.client.j.u.c();
                s.a(this, this.c);
                boolean bl3 = bl2;
                n2 = this.c;
                if (bl3) break block2;
                if (n2 == -1) break block3;
                n2 = this.c;
            }
            p.c(n2);
            this.c = -1;
        }
    }

    @Override
    public int c() {
        block0: {
            if (this.c != -1) break block0;
            this.c = p.a();
        }
        return this.c;
    }

    @Override
    public u a() {
        return s.a(this);
    }

    @Override
    public void b() {
        this.b(this.f, this.d);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(boolean bl2, boolean bl3) {
        this.f = this.a;
        this.d = this.b;
        this.b(bl2, bl3);
    }

    public void b(boolean n2, boolean n3) {
        int n4;
        int n5;
        block7: {
            int n6;
            boolean bl2;
            block5: {
                block6: {
                    this.a = n2;
                    this.b = n3;
                    bl2 = net.minecraft.client.j.u.c();
                    n6 = n2;
                    if (bl2) break block5;
                    if (n6 == 0) break block6;
                    int n7 = n3;
                    if (!bl2) {
                        n7 = n7 != 0 ? 9987 : 9729;
                    }
                    n5 = n7;
                    n4 = 9729;
                    if (!bl2) break block7;
                }
                n6 = n3;
            }
            if (!bl2) {
                n6 = n6 != 0 ? 9986 : 9728;
            }
            n5 = n6;
            n4 = 9728;
        }
        v.t(this.c());
        v.c(3553, 10241, n5);
        v.c(3553, 10240, n4);
    }

    public e() {
        this.c = -1;
    }
}

