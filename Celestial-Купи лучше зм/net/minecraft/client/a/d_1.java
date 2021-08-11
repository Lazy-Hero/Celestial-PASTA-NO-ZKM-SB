/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.ah.L;
import net.minecraft.ah.t;
import net.minecraft.ar.Z;
import net.minecraft.ar.aW;
import net.minecraft.c.f;
import net.minecraft.c.l;
import net.minecraft.client.D.x;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.X;
import net.minecraft.client.a.ah;
import net.minecraft.client.a.aw;
import net.minecraft.client.a.i;
import net.minecraft.client.a.y;
import net.minecraft.client.j.c;
import net.minecraft.client.x.Y;
import net.minecraft.client.x.h;
import net.minecraft.client.z.m;
import net.minecraft.k.n;

public class d
implements x {
    private final /* synthetic */ y b;
    private final /* synthetic */ ah c;
    private final /* synthetic */ X d;
    private final /* synthetic */ i a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(net.minecraft.Z.i i2, n n2, t t2, I i3) {
        String string = I.j();
        try {
            aW aW2 = i2.n();
            if (aW2 == aW.INVISIBLE) {
                return false;
            }
            if (t2.a() != L.e) {
                try {
                    i2 = i2.c(t2, n2);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            boolean bl2 = aw.a[aW2.ordinal()];
            if (string != null) return bl2;
            switch (bl2) {
                case 1: {
                    return this.b.a(t2, this.a(i2), i2, n2, i3, true);
                }
                case 2: {
                    return false;
                }
                case 3: {
                    return this.c.a(t2, i2, n2, i3);
                }
            }
            return false;
        }
        catch (Throwable throwable) {
            f f10 = f.a(throwable, "Tesselating block in world");
            l l2 = f10.a("Block being tesselated");
            l.a(l2, n2, i2.b(), i2.b().d(i2));
            throw new Z(f10);
        }
    }

    public void a(net.minecraft.Z.i i2, float f10) {
        aW aW2 = i2.n();
        String string = I.j();
        if (aW2 != aW.INVISIBLE) {
            switch (aW2) {
                case MODEL: {
                    Y y2 = this.a(i2);
                    this.b.a(y2, i2, f10, true);
                    if (string == null) break;
                }
                case ENTITYBLOCK_ANIMATED: {
                    this.a.a(i2.b(), f10);
                    break;
                }
            }
        }
    }

    public Y a(net.minecraft.Z.i i2) {
        return this.d.b(i2);
    }

    @Override
    public void b(net.minecraft.client.D.t t2) {
        this.c.a();
    }

    public X b() {
        return this.d;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public y a() {
        return this.b;
    }

    public void a(net.minecraft.Z.i i2, n n2, c c10, t t2) {
        block3: {
            net.minecraft.Z.i i3;
            block2: {
                String string = I.j();
                i3 = i2;
                if (string != null) break block2;
                if (i3.n() != aW.MODEL) break block3;
                i3 = i2.c(t2, n2);
            }
            i2 = i3;
            Y y2 = this.d.b(i2);
            Y y3 = new h(i2, y2, c10, n2).a();
            this.b.a(t2, y3, i2, n2, W.c().b(), true);
        }
    }

    public d(X x2, m m2) {
        this.a = new i();
        this.d = x2;
        this.b = new y(m2);
        this.c = new ah(m2);
    }
}

