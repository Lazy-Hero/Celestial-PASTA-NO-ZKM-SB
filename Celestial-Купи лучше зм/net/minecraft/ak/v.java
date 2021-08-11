/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ak;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.B.X;
import net.minecraft.U.D;
import net.minecraft.ah.z;
import net.minecraft.ak.h;
import net.minecraft.k.l;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class v
extends h {
    private final /* synthetic */ double h;
    private /* synthetic */ double e;
    private /* synthetic */ double d;
    private final /* synthetic */ D f;
    private /* synthetic */ double g;
    private final /* synthetic */ z c;

    @Override
    public void a() {
        this.f.l().a(this.e, this.g, this.d, this.h);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean c() {
        v v2;
        String string;
        block12: {
            boolean bl2;
            block11: {
                string = net.minecraft.ak.h.h();
                bl2 = this.c.R();
                if (string == null) {
                    if (!bl2) {
                        return false;
                    }
                    bl2 = this.f.p();
                }
                if (string == null) {
                    if (!bl2) {
                        return false;
                    }
                    bl2 = this.c.w(new n(this.f.a, this.f.m().b, this.f.ax));
                }
                if (string != null) break block11;
                if (!bl2) {
                    return false;
                }
                v2 = this;
                if (string != null) break block12;
                bl2 = v2.f.b(X.HEAD).G();
            }
            if (!bl2) {
                return false;
            }
            v2 = this;
        }
        l l2 = v2.a();
        if (string == null) {
            if (l2 == null) {
                return false;
            }
            this.e = l2.e;
            this.g = l2.d;
            this.d = l2.b;
        }
        return true;
    }

    public v(D d10, double d11) {
        this.f = d10;
        this.h = d11;
        this.c = d10.aG;
        this.a(1);
    }

    @Override
    public boolean e() {
        String string = net.minecraft.ak.h.h();
        boolean bl2 = this.f.l().o();
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Nullable
    private l a() {
        Random random = this.f.f();
        n n2 = new n(this.f.a, this.f.m().b, this.f.ax);
        String string = net.minecraft.ak.h.h();
        int n3 = 0;
        while (n3 < 10) {
            n n4 = n2.a(random.nextInt(20) - 10, random.nextInt(6) - 3, random.nextInt(20) - 10);
            if (string == null) {
                if (!this.c.w(n4) && this.f.b(n4) < 0.0f) {
                    return new l(n4.e(), n4.b(), n4.a());
                }
                ++n3;
            }
            if (string == null) continue;
        }
        return null;
    }
}

