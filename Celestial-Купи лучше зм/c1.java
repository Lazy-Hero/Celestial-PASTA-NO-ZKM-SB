/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import net.minecraft.N.A;
import net.minecraft.N.H;
import net.minecraft.N.O;
import net.minecraft.N.S;
import net.minecraft.N.T;
import net.minecraft.N.y;
import net.minecraft.ag.C;
import net.minecraft.client.E.l;
import net.minecraft.client.Q;
import net.minecraft.k.m;
import net.minecraft.k.n;

public class c1
extends bE {
    private final /* synthetic */ hH q;
    public static /* synthetic */ hH k;
    public static /* synthetic */ hH t;
    public static /* synthetic */ hH o;
    private final /* synthetic */ hH v;
    public static /* synthetic */ hH l;
    public static /* synthetic */ hH n;
    public static /* synthetic */ hH p;
    public static /* synthetic */ hH s;
    public static /* synthetic */ hH r;
    public static /* synthetic */ hH m;
    private final /* synthetic */ hH u;

    @cL
    public void a(dS dS2) {
        block8: {
            l l2;
            Color color;
            Color color2;
            Color color3;
            Color color4;
            Color color5;
            String[] arrstring;
            block7: {
                Q q2;
                block5: {
                    block6: {
                        arrstring = C.f();
                        color5 = l.l() ? cj.h() : new Color(k.o());
                        color4 = l.l() ? cj.h() : new Color(r.o());
                        color3 = l.l() ? cj.h() : new Color(o.o());
                        color2 = l.l() ? cj.h() : new Color(p.o());
                        color = l.l() ? cj.h() : new Color(m.o());
                        q2 = c;
                        if (arrstring != null) break block5;
                        if (q2.s != null) break block6;
                        l2 = c1.c.e;
                        if (arrstring != null) break block7;
                        if (l2 == null) break block8;
                    }
                    q2 = c;
                }
                l2 = q2.e;
            }
            for (y y2 : l2.e) {
                block11: {
                    boolean bl2;
                    n n2;
                    block18: {
                        block16: {
                            block17: {
                                block14: {
                                    block15: {
                                        block12: {
                                            block13: {
                                                block9: {
                                                    block10: {
                                                        n2 = y2.j();
                                                        bl2 = y2 instanceof O;
                                                        if (arrstring != null) break block9;
                                                        if (!bl2) break block10;
                                                        bl2 = t.l();
                                                        if (arrstring != null) break block9;
                                                        if (!bl2) break block10;
                                                        dJ.a(n2, new Color(color5.getRGB()), 1.0, 1.0);
                                                        if (arrstring == null) break block11;
                                                    }
                                                    bl2 = y2 instanceof H;
                                                }
                                                if (arrstring != null) break block12;
                                                if (!bl2) break block13;
                                                bl2 = n.l();
                                                if (arrstring != null) break block12;
                                                if (!bl2) break block13;
                                                dJ.a(n2, new Color(color4.getRGB()), 1.0, 1.0);
                                                if (arrstring == null) break block11;
                                            }
                                            bl2 = y2 instanceof A;
                                        }
                                        if (arrstring != null) break block14;
                                        if (!bl2) break block15;
                                        bl2 = this.v.l();
                                        if (arrstring != null) break block14;
                                        if (!bl2) break block15;
                                        dJ.a(n2, new Color(color2.getRGB()), 1.0, 1.0);
                                        if (arrstring == null) break block11;
                                    }
                                    bl2 = y2 instanceof S;
                                }
                                if (arrstring != null) break block16;
                                if (!bl2) break block17;
                                bl2 = this.q.l();
                                if (arrstring != null) break block16;
                                if (!bl2) break block17;
                                dJ.a(n2, new Color(color3.getRGB()), 1.0, 1.0);
                                if (arrstring == null) break block11;
                            }
                            bl2 = y2 instanceof T;
                        }
                        if (arrstring != null) break block18;
                        if (!bl2) break block11;
                        bl2 = this.u.l();
                    }
                    if (bl2) {
                        dJ.a(n2, new Color(color.getRGB()), 1.0, 1.0);
                    }
                }
                if (arrstring == null) continue;
            }
        }
    }

    public c1() {
        super("BlockESP", a5.Visuals);
        t = new hH("Chest", this, true);
        cj.b.f.b(t);
        n = new hH("EnderChest", this, false);
        cj.b.f.b(n);
        this.u = new hH("Spawner", this, false);
        cj.b.f.b(this.u);
        this.q = new hH("Shulker", this, false);
        cj.b.f.b(this.q);
        String[] arrstring = C.f();
        this.v = new hH("Bed", this, true);
        cj.b.f.b(this.v);
        k = new hH("Chest Color", (bE)this, new Color(0xFFFFFF).getRGB(), true);
        cj.b.f.b(k);
        r = new hH("EnderChest Color", (bE)this, new Color(0xFFFFFF).getRGB(), true);
        cj.b.f.b(r);
        o = new hH("Shulker Color", (bE)this, new Color(0xFFFFFF).getRGB(), true);
        cj.b.f.b(o);
        String[] arrstring2 = arrstring;
        m = new hH("Spawner Color", (bE)this, new Color(0xFFFFFF).getRGB(), true);
        cj.b.f.b(m);
        p = new hH("Bed Color", (bE)this, new Color(0xFFFFFF).getRGB(), true);
        cj.b.f.b(p);
        s = new hH("ESP Outline", this, false);
        cj.b.f.b(s);
        l = new hH("Client Colors", this, false);
        cj.b.f.b(l);
        if (arrstring2 != null) {
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

