/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.n;

import javax.annotation.Nullable;
import net.minecraft.at.k;
import net.minecraft.client.a.v;
import net.minecraft.client.n.b;
import net.minecraft.client.n.d;
import net.minecraft.client.n.e;
import net.minecraft.client.n.g;
import net.minecraft.client.n.h;
import net.minecraft.k.m;

public class c
implements b {
    private /* synthetic */ String e;
    private /* synthetic */ long g;
    private /* synthetic */ boolean c;
    private final /* synthetic */ g d;
    private /* synthetic */ String f;

    public static void a(e e10, g g10, k k2, @Nullable k k3) {
        block4: {
            c c10;
            block2: {
                c c11;
                block3: {
                    c11 = e10.a(c.class, (Object)g10);
                    String[] arrstring = net.minecraft.client.n.d.b();
                    c10 = c11;
                    if (arrstring == null) break block2;
                    if (c10 != null) break block3;
                    e10.a(new c(g10, k2, k3));
                    if (arrstring != null) break block4;
                }
                c10 = c11;
            }
            c10.a(k2, k3);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public c(g var1_1, k var2_2, @Nullable k var3_3) {
        v0 = net.minecraft.client.n.d.b();
        super();
        var4_4 = v0;
        this.d = var1_1;
        this.f = var2_2.f();
        v1 = var3_3;
        if (var4_4 == null) ** GOTO lbl12
        if (v1 == null) {
            v2 = null;
        } else {
            v1 = var3_3;
lbl12:
            // 2 sources

            v2 = v1.f();
        }
        this.e = v2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(k var1_1, @Nullable k var2_2) {
        this.f = var1_1.f();
        var3_3 = net.minecraft.client.n.d.b();
        v0 = var2_2;
        if (var3_3 == null) ** GOTO lbl9
        if (v0 == null) {
            v1 = null;
        } else {
            v0 = var2_2;
lbl9:
            // 2 sources

            v1 = v0.f();
        }
        this.e = v1;
        this.c = true;
    }

    public g a() {
        return this.d;
    }

    @Override
    public h a(e e10, long l2) {
        h h2;
        block8: {
            block7: {
                block5: {
                    block6: {
                        c c10;
                        String[] arrstring;
                        block4: {
                            arrstring = net.minecraft.client.n.d.b();
                            c10 = this;
                            if (arrstring == null) break block4;
                            if (c10.c) {
                                this.g = l2;
                                this.c = false;
                            }
                            e10.a().aN().b(a);
                            v.c(1.0f, 1.0f, 1.0f);
                            e10.a(0, 0, 0, 64, 160, 32);
                            if (arrstring == null) break block5;
                            c10 = this;
                        }
                        if (c10.e != null) break block6;
                        e10.a().a6.b(this.f, 18.0f, 12.0f, -256);
                        if (arrstring != null) break block7;
                    }
                    e10.a().a6.b(this.f, 18.0f, 7.0f, -256);
                }
                e10.a().a6.b(this.e, 18.0f, 18.0f, -1);
            }
            h2 = l2 - this.g < 5000L ? h.SHOW : h.HIDE;
            if (!m.c()) break block8;
            net.minecraft.client.n.d.b(new String[3]);
        }
        return h2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

