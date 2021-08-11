/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ak;

import javax.annotation.Nullable;
import net.minecraft.U.D;
import net.minecraft.ak.g;
import net.minecraft.ak.h;
import net.minecraft.k.l;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a9
extends h {
    protected /* synthetic */ double d;
    protected /* synthetic */ boolean f;
    protected /* synthetic */ double c;
    protected /* synthetic */ int i;
    protected /* synthetic */ double h;
    protected final /* synthetic */ double g;
    protected final /* synthetic */ D e;

    public a9(D d10, double d11, int n2) {
        this.e = d10;
        this.g = d11;
        this.i = n2;
        this.a(1);
    }

    @Override
    public void a() {
        this.e.l().a(this.c, this.h, this.d, this.g);
    }

    public void c() {
        this.f = true;
    }

    @Nullable
    protected l d() {
        return net.minecraft.ak.g.a(this.e, 10, 7);
    }

    public a9(D d10, double d11) {
        this(d10, d11, 120);
    }

    @Override
    public boolean e() {
        String string = net.minecraft.ak.h.h();
        boolean bl2 = this.e.l().o();
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public void b(int n2) {
        this.i = n2;
    }

    @Override
    public boolean c() {
        a9 a92;
        String string;
        block6: {
            block7: {
                int n2;
                block8: {
                    string = net.minecraft.ak.h.h();
                    a92 = this;
                    if (string != null) break block6;
                    if (a92.f) break block7;
                    n2 = this.e.u();
                    if (string != null) break block8;
                    if (n2 >= 100) {
                        return false;
                    }
                    a92 = this;
                    if (string != null) break block6;
                    n2 = a92.e.f().nextInt(this.i);
                }
                if (n2 != 0) {
                    return false;
                }
            }
            a92 = this;
        }
        l l2 = a92.d();
        if (string == null) {
            if (l2 == null) {
                return false;
            }
            this.c = l2.e;
            this.h = l2.d;
            this.d = l2.b;
            this.f = false;
        }
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

