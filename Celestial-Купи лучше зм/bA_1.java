/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.ac.c;
import net.minecraft.w.av;
import net.minecraft.w.d;

public class bA
extends bE {
    public /* synthetic */ boolean l;
    /* synthetic */ hH k;

    private static gP b(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(d d10) {
        int[] arrn = net.minecraft.ac.c.i();
        boolean bl2 = bA.b(d10);
        if (arrn != null) {
            if (bl2) return false;
            bl2 = d10.w() instanceof av;
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public bA() {
        super("AutoGApple", a5.Combat);
        this.k = new hH("Health Amount", this, 15.0, 1.0, 20.0, 1.0);
        cj.b.f.b(this.k);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean b(d d10) {
        int[] arrn = net.minecraft.ac.c.i();
        d d11 = d10;
        if (arrn != null) {
            if (d11 == null) return true;
            d11 = d10;
        }
        boolean bl2 = d11.G();
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @cL
    public void a(fb fb2) {
        block4: {
            block5: {
                bA bA2;
                int n2;
                block2: {
                    int[] arrn;
                    block3: {
                        int[] arrn2 = net.minecraft.ac.c.i();
                        this.b("" + this.k.c());
                        arrn = arrn2;
                        n2 = this.a(bA.c.s.b());
                        if (arrn == null) break block2;
                        if (n2 == 0) break block3;
                        float f10 = bA.c.s.V() - (float)this.k.c();
                        n2 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                        if (arrn == null) break block2;
                        if (n2 > 0) break block3;
                        this.l = true;
                        bA.c.ac.aM.d = true;
                        if (arrn != null) break block4;
                    }
                    bA2 = this;
                    if (arrn == null) break block5;
                    n2 = bA2.l;
                }
                if (n2 == 0) break block4;
                bA.c.ac.aM.d = false;
                bA2 = this;
            }
            bA2.l = false;
        }
    }
}

