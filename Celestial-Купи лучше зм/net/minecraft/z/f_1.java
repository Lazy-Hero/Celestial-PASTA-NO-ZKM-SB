/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.Z;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.N.y;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.Z.k;
import net.minecraft.ah.z;
import net.minecraft.k.n;

public class f {
    private final /* synthetic */ boolean d;
    private /* synthetic */ boolean b;
    private /* synthetic */ i a;
    private final /* synthetic */ n e;
    private final /* synthetic */ z c;
    private /* synthetic */ y f;

    public i b() {
        i i2;
        block2: {
            f f10;
            block6: {
                block3: {
                    block4: {
                        f f11;
                        block5: {
                            String string = net.minecraft.Z.c.c();
                            i2 = this.a;
                            if (string == null) break block2;
                            if (i2 != null) break block3;
                            f11 = this;
                            if (string == null) break block4;
                            if (f11.d) break block5;
                            f10 = this;
                            if (string == null) break block6;
                            if (!f10.c.n(this.e)) break block3;
                        }
                        f11 = this;
                    }
                    f11.a = this.c.d(this.e);
                }
                f10 = this;
            }
            i2 = f10.a;
        }
        return i2;
    }

    public f(z z2, n n2, boolean bl2) {
        this.c = z2;
        this.e = n2;
        this.d = bl2;
    }

    public static Predicate<f> a(Predicate<i> predicate) {
        return new k(predicate);
    }

    @Nullable
    public y a() {
        y y2;
        block4: {
            f f10;
            block6: {
                block5: {
                    String string = net.minecraft.Z.c.c();
                    y2 = this.f;
                    if (string == null) break block4;
                    if (y2 != null) break block5;
                    f10 = this;
                    if (string == null) break block6;
                    if (!f10.b) {
                        this.f = this.c.b(this.e);
                        this.b = true;
                    }
                }
                f10 = this;
            }
            y2 = f10.f;
        }
        return y2;
    }

    public n c() {
        return this.e;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

