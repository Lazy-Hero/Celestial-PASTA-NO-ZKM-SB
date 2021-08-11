/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.ac.c;
import net.minecraft.ag.C;
import net.minecraft.client.Q;
import net.minecraft.client.a.p;
import net.minecraft.client.a.v;
import net.minecraft.client.b.l;
import net.minecraft.w.d;

public class cu
extends bE {
    private final /* synthetic */ hH l;
    private final /* synthetic */ p k;

    private static gP b(gP gP2) {
        return gP2;
    }

    public cu() {
        super("ArmorHUD", a5.Visuals);
        this.k = Q.P().Y();
        this.l = new hH("Show Durability", this, true);
        cj.b.f.b(this.l);
    }

    public void a() {
        block5: {
            v.x();
            l l2 = new l(c);
            String[] arrstring = C.f();
            int n2 = l2.e() / 2;
            int n3 = 0;
            int n4 = (int)((float)(l2.a() - 65) - (cu.c.s.a(net.minecraft.ac.c.L) ? bk.n : bk.n - 9.0f));
            for (d d10 : cu.c.s.cB.e) {
                ++n3;
                if (arrstring == null) {
                    int n5 = d10.G();
                    if (arrstring == null) {
                        if (n5 != 0 && arrstring == null) continue;
                        n5 = n2 - 90 + (9 - n3) * 20 + 2;
                    }
                    int n6 = n5;
                    v.t();
                    this.k.g = 200.0f;
                    this.k.a(d10, n6, n4);
                    int n7 = this.l.l();
                    if (arrstring == null) {
                        if (n7 != 0) {
                            this.k.a(cu.c.a6, d10, n6, n4, "");
                        }
                        this.k.g = 0.0f;
                        v.x();
                        v.y();
                        v.n();
                        n7 = d10.t();
                    }
                    String string = n7 > 1 ? d10.t() + "" : "";
                    cu.c.aC.c(string, n6 + 19 - 2 - cu.c.ax.b(string), n4 + 20, 0xFFFFFF);
                    if (arrstring == null) continue;
                }
                break block5;
            }
            v.t();
            v.y();
        }
    }

    @cL
    public void a(fn fn2) {
        block2: {
            Q q2;
            block1: {
                String[] arrstring = C.f();
                q2 = c;
                if (arrstring != null) break block1;
                if (q2.s == null) break block2;
                q2 = c;
            }
            if (q2.e != null) {
                this.a();
            }
        }
    }
}

