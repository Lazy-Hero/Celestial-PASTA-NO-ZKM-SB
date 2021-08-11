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
import net.minecraft.client.b.q;
import net.minecraft.client.n.b;
import net.minecraft.client.n.d;
import net.minecraft.client.n.e;
import net.minecraft.client.n.h;

public class i
implements b {
    private /* synthetic */ h j;
    private /* synthetic */ float h;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private /* synthetic */ long i;
    private /* synthetic */ float f;
    private final /* synthetic */ d g;

    public void a() {
        this.j = net.minecraft.client.n.h.HIDE;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public i(d var1_1, k var2_2, @Nullable k var3_3, boolean var4_4) {
        v0 = net.minecraft.client.n.d.b();
        super();
        this.j = net.minecraft.client.n.h.SHOW;
        var5_5 = v0;
        this.g = var1_1;
        this.e = var2_2.a();
        v1 = var3_3;
        if (var5_5 == null) ** GOTO lbl13
        if (v1 == null) {
            v2 = null;
        } else {
            v1 = var3_3;
lbl13:
            // 2 sources

            v2 = v1.a();
        }
        this.d = v2;
        this.c = var4_4;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public h a(e e10, long l2) {
        i i2;
        block7: {
            block8: {
                float f10;
                float f11;
                block11: {
                    float f12;
                    block9: {
                        block10: {
                            String[] arrstring;
                            block6: {
                                block4: {
                                    block5: {
                                        String[] arrstring2 = net.minecraft.client.n.d.b();
                                        e10.a().aN().b(a);
                                        arrstring = arrstring2;
                                        v.c(1.0f, 1.0f, 1.0f);
                                        e10.a(0, 0, 0, 96, 160, 32);
                                        this.g.a(e10, 6, 6);
                                        if (arrstring == null) break block4;
                                        if (this.d != null) break block5;
                                        e10.a().a6.b(this.e, 30.0f, 12.0f, -11534256);
                                        if (arrstring != null) break block6;
                                    }
                                    e10.a().a6.b(this.e, 30.0f, 7.0f, -11534256);
                                }
                                e10.a().a6.b(this.d, 30.0f, 18.0f, -16777216);
                            }
                            i2 = this;
                            if (arrstring == null) break block7;
                            if (!i2.c) break block8;
                            q.a(3, 28, 157, 29, -1);
                            f11 = (float)net.minecraft.k.h.a((double)this.h, (double)this.f, (double)((float)(l2 - this.i) / 100.0f));
                            float f13 = this.f - this.h;
                            f12 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                            if (arrstring == null) break block9;
                            if (f12 < 0) break block10;
                            f10 = -16755456;
                            if (arrstring != null) break block11;
                        }
                        f12 = -11206656;
                    }
                    f10 = f12;
                }
                q.a(3, 28, (int)(3.0f + 154.0f * f11), 29, (int)f10);
                this.h = f11;
                this.i = l2;
            }
            i2 = this;
        }
        return i2.j;
    }

    public void a(float f10) {
        this.f = f10;
    }
}

