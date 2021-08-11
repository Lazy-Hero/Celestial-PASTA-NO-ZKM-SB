/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import com.google.common.base.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.D.l;
import net.minecraft.P.r;
import net.minecraft.U.B;
import net.minecraft.U.p;
import net.minecraft.U.x;
import net.minecraft.a.m;
import net.minecraft.a6;
import net.minecraft.ag.A;
import net.minecraft.ag.C;
import net.minecraft.ah.z;
import net.minecraft.ak.U;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.i.j;
import net.minecraft.i.k;
import net.minecraft.q.h;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class R
extends C
implements p {
    protected static final /* synthetic */ net.minecraft.q.r<Optional<UUID>> cJ;
    protected static final /* synthetic */ net.minecraft.q.r<Byte> cI;
    protected /* synthetic */ U cH;

    public boolean D() {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = this.ap.b(cI) & 1;
        if (arrstring != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    @Override
    public void a(byte n2) {
        block2: {
            block3: {
                int n3;
                int n4;
                String[] arrstring;
                block0: {
                    block1: {
                        arrstring = net.minecraft.ag.A.b();
                        n4 = n2;
                        n3 = 7;
                        if (arrstring == null) break block0;
                        if (n4 != n3) break block1;
                        this.a(true);
                        if (arrstring != null) break block2;
                    }
                    n4 = n2;
                    n3 = 6;
                }
                if (n4 != n3) break block3;
                this.a(false);
                if (arrstring != null) break block2;
            }
            super.a((byte)n2);
        }
    }

    public void r(boolean bl2) {
        block2: {
            byte by2;
            block1: {
                String[] arrstring;
                block0: {
                    by2 = this.ap.b(cI);
                    arrstring = net.minecraft.ag.A.b();
                    if (arrstring == null) break block0;
                    if (!bl2) break block1;
                    this.ap.b(cI, (byte)(by2 | 1));
                }
                if (arrstring != null) break block2;
            }
            this.ap.b(cI, (byte)(by2 & 0xFFFFFFFE));
        }
    }

    @Override
    public void a(G g10) {
        R r2;
        block4: {
            block5: {
                String[] arrstring = net.minecraft.ag.A.b();
                r2 = this;
                if (arrstring == null) break block4;
                if (r2.aG.C) break block5;
                r2 = this;
                if (arrstring == null) break block4;
                if (!r2.aG.M().c("showDeathMessages")) break block5;
                r2 = this;
                if (arrstring == null) break block4;
                if (r2.a() instanceof k) {
                    this.a().a(this.aC().h());
                }
            }
            r2 = this;
        }
        super.a(g10);
    }

    @Override
    public boolean e(x x2) {
        boolean bl2;
        block4: {
            block5: {
                x x3;
                block6: {
                    String[] arrstring = net.minecraft.ag.A.b();
                    bl2 = this.U();
                    if (arrstring == null) break block4;
                    if (!bl2) break block5;
                    x x4 = this.a();
                    if (x2 == x4) {
                        return true;
                    }
                    x3 = x4;
                    if (arrstring == null) break block6;
                    if (x3 == null) break block5;
                    x3 = x4;
                }
                return x3.e(x2);
            }
            bl2 = super.e(x2);
        }
        return bl2;
    }

    public void b(j j2) {
        block0: {
            this.s(true);
            this.b(j2.u());
            if (!(j2 instanceof k)) break block0;
            a6.g.a((k)j2, this);
        }
    }

    protected void P() {
    }

    public boolean a(B b10, B b11) {
        return true;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public void a(r r2) {
        String string;
        String[] arrstring;
        block10: {
            String string2;
            r r3;
            block8: {
                block9: {
                    String[] arrstring2 = net.minecraft.ag.A.b();
                    super.a(r2);
                    arrstring = arrstring2;
                    r3 = r2;
                    string2 = "OwnerUUID";
                    if (arrstring == null) break block8;
                    if (!r3.a(string2, 8)) break block9;
                    string = r2.j("OwnerUUID");
                    if (arrstring != null) break block10;
                }
                r3 = r2;
                string2 = "Owner";
            }
            String string3 = r3.j(string2);
            string = net.minecraft.a.m.a(this.e(), string3);
        }
        if (!string.isEmpty()) {
            try {
                this.b(UUID.fromString(string));
                this.s(true);
            }
            catch (Throwable throwable) {
                this.s(false);
            }
        }
        R r4 = this;
        if (arrstring != null) {
            if (r4.cH != null) {
                this.cH.a(r2.f("Sitting"));
            }
            r4 = this;
        }
        r4.r(r2.f("Sitting"));
    }

    public R(z z2) {
        super(z2);
        this.P();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public l aM() {
        String[] arrstring = net.minecraft.ag.A.b();
        R r2 = this;
        if (arrstring == null) return super.aM();
        if (r2.U()) {
            r2 = this;
            if (arrstring == null) return super.aM();
            x x2 = r2.a();
            if (x2 != null) {
                return x2.aM();
            }
        }
        r2 = this;
        return super.aM();
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cI, (byte)0);
        this.ap.c(cJ, Optional.absent());
    }

    public boolean a(B b10) {
        return b10 == this.a();
    }

    @Override
    public boolean a(j j2) {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = this.O();
        if (arrstring != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public void s(boolean bl2) {
        block4: {
            byte by2;
            block3: {
                String[] arrstring;
                block2: {
                    by2 = this.ap.b(cI);
                    arrstring = net.minecraft.ag.A.b();
                    if (arrstring == null) break block2;
                    if (!bl2) break block3;
                    this.ap.b(cI, (byte)(by2 | 4));
                }
                if (arrstring != null) break block4;
            }
            this.ap.b(cI, (byte)(by2 & 0xFFFFFFFB));
        }
        this.P();
    }

    protected void a(boolean n2) {
        int n3;
        aH aH2 = net.minecraft.ar.aH.HEART;
        String[] arrstring = net.minecraft.ag.A.b();
        int n4 = n2;
        if (arrstring != null) {
            if (n4 == 0) {
                aH2 = net.minecraft.ar.aH.SMOKE_NORMAL;
            }
            n4 = n3 = 0;
        }
        while (n3 < 7) {
            double d10 = this.g.nextGaussian() * 0.02;
            double d11 = this.g.nextGaussian() * 0.02;
            double d12 = this.g.nextGaussian() * 0.02;
            this.aG.a(aH2, this.a + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, this.aF + 0.5 + (double)(this.g.nextFloat() * this.aD), this.ax + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, d10, d11, d12, new int[0]);
            ++n3;
            if (arrstring != null) continue;
        }
    }

    @Override
    @Nullable
    public B a() {
        try {
            UUID uUID = this.b();
            return uUID == null ? null : this.aG.a(uUID);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public U b() {
        return this.cH;
    }

    @Override
    @Nullable
    public UUID b() {
        return (UUID)this.ap.b(cJ).orNull();
    }

    @Override
    public void f(r r2) {
        block4: {
            block3: {
                String[] arrstring;
                block2: {
                    String[] arrstring2 = net.minecraft.ag.A.b();
                    super.f(r2);
                    arrstring = arrstring2;
                    if (arrstring == null) break block2;
                    if (this.b() != null) break block3;
                    r2.a("OwnerUUID", "");
                }
                if (arrstring != null) break block4;
            }
            r2.a("OwnerUUID", this.b().toString());
        }
        r2.a("Sitting", this.D());
    }

    static {
        cI = net.minecraft.q.m.a(R.class, h.m);
        cJ = net.minecraft.q.m.a(R.class, h.c);
    }

    public void b(@Nullable UUID uUID) {
        this.ap.b(cJ, Optional.fromNullable((Object)uUID));
    }

    public boolean U() {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = this.ap.b(cI) & 4;
        if (arrstring != null) {
            bl2 = bl2;
        }
        return bl2;
    }
}

