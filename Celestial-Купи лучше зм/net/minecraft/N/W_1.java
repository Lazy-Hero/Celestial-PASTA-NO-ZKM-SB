/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.N;

import javax.annotation.Nullable;
import net.minecraft.E.aS;
import net.minecraft.E.s;
import net.minecraft.I.a;
import net.minecraft.N.e;
import net.minecraft.N.j;
import net.minecraft.N.l;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.Q.ag;
import net.minecraft.ah.z;
import net.minecraft.at.b;
import net.minecraft.at.g;
import net.minecraft.at.k;
import net.minecraft.at.o;
import net.minecraft.k.m;

public class W
extends y {
    public /* synthetic */ int m;
    private final /* synthetic */ aS l;
    private /* synthetic */ boolean j;
    private /* synthetic */ net.minecraft.i.j i;
    public final /* synthetic */ k[] k;

    public W() {
        this.k = new k[]{new g(""), new g(""), new g(""), new g("")};
        this.m = -1;
        this.j = true;
        this.l = new aS();
    }

    @Override
    public void c(r r2) {
        block4: {
            this.j = false;
            m[] arrm = net.minecraft.N.j.f();
            super.c(r2);
            l l2 = new l(this);
            for (int i2 = 0; i2 < 4; ++i2) {
                String string = r2.j("Text" + (i2 + 1));
                k k2 = o.a(string);
                try {
                    this.k[i2] = b.a(l2, k2, null);
                    if (arrm == null) {
                        continue;
                    }
                    break block4;
                }
                catch (s s2) {
                    this.k[i2] = k2;
                }
                if (arrm == null) continue;
            }
            this.l.b(r2);
        }
    }

    public boolean c() {
        return this.j;
    }

    public net.minecraft.i.j a() {
        return this.i;
    }

    public void a(net.minecraft.i.j j2) {
        this.i = j2;
    }

    @Override
    protected void a(z z2) {
        this.b(z2);
    }

    @Override
    @Nullable
    public ag k() {
        return new ag(this.d, 9, this.r());
    }

    @Override
    public r a(r r2) {
        block2: {
            super.a(r2);
            m[] arrm = net.minecraft.N.j.f();
            for (int i2 = 0; i2 < 4; ++i2) {
                String string = o.a(this.k[i2]);
                r2.a("Text" + (i2 + 1), string);
                if (arrm == null) {
                    if (arrm == null) continue;
                }
                break block2;
            }
            this.l.a(r2);
        }
        return r2;
    }

    public void a(boolean bl2) {
        block3: {
            block2: {
                m[] arrm = net.minecraft.N.j.f();
                W w2 = this;
                if (arrm != null) break block2;
                w2.j = bl2;
                if (bl2) break block3;
                w2 = this;
            }
            w2.i = null;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public r r() {
        return this.a(new r());
    }

    @Override
    public boolean n() {
        return true;
    }

    public aS b() {
        return this.l;
    }

    static aS a(W w2) {
        return w2.l;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean b(net.minecraft.i.j var1_1) {
        var3_2 = new e(this, var1_1);
        var4_3 = this.k;
        var2_4 = net.minecraft.N.j.f();
        var5_5 = var4_3.length;
        var6_6 = 0;
        do {
            block7: {
                block8: {
                    if (var6_6 >= var5_5) return true;
                    v0 = var7_7 = var4_3[var6_6];
                    if (var2_4 != null) ** GOTO lbl14
                    if (v0 == null) {
                        v1 = null;
                    } else {
                        v0 = var7_7;
lbl14:
                        // 2 sources

                        v1 = var8_8 = v0.e();
                    }
                    if (var2_4 != null) continue;
                    if (var8_8 == null) break block7;
                    v2 = var8_8.j();
                    if (var2_4 != null) break block8;
                    if (v2 == null) break block7;
                    v2 = var9_9 = var8_8.j();
                }
                if (var2_4 != null) continue;
                if (var9_9.d() == net.minecraft.I.a.RUN_COMMAND) {
                    var1_1.e().u().a(var3_2, var9_9.c());
                }
            }
            ++var6_6;
        } while (var2_4 == null);
        return true;
    }
}

