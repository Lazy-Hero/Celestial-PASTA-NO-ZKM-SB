/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import net.minecraft.client.Q;
import net.minecraft.k.k;

public class bQ
extends bE {
    public bQ() {
        super("Clip", a5.Player);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("VClip");
        arrayList.add("-VClip");
        arrayList.add("HClip");
        cj.b.f.b(new hH("Clip Mode", (bE)this, "VClip", arrayList));
        cj.b.f.b(new hH("Clip Power", this, 15.0, 1.0, 100.0, 1.0));
    }

    @Override
    public void d() {
        block12: {
            boolean bl2;
            float f10;
            double d10;
            double d11;
            double d12;
            double d13;
            block13: {
                String string;
                block14: {
                    String string2;
                    block10: {
                        block11: {
                            block9: {
                                Q q2;
                                block8: {
                                    d13 = bQ.c.s.a;
                                    d12 = bQ.c.s.aF;
                                    d11 = bQ.c.s.ax;
                                    string2 = k.b();
                                    d10 = (double)bQ.c.s.e * 0.017453292;
                                    string = cj.b.f.a("Clip Mode").m();
                                    q2 = c;
                                    if (string2 == null) break block8;
                                    if (q2.s != null) break block9;
                                    q2 = c;
                                }
                                if (q2.e == null) {
                                    return;
                                }
                            }
                            f10 = cj.b.f.a("Clip Power").r();
                            bl2 = string.equalsIgnoreCase("VClip");
                            if (string2 == null) break block10;
                            if (!bl2) break block11;
                            bQ.c.s.g(d13, d12 + (double)f10, d11);
                            if (string2 != null) break block12;
                        }
                        bl2 = string.equalsIgnoreCase("-VClip");
                    }
                    if (string2 == null) break block13;
                    if (!bl2) break block14;
                    bQ.c.s.g(d13, d12 - (double)f10, d11);
                    if (string2 != null) break block12;
                }
                bl2 = string.equalsIgnoreCase("HClip");
            }
            if (bl2) {
                bQ.c.s.g(d13 - Math.sin(d10) * (double)f10, d12, d11 + Math.cos(d10) * (double)f10);
            }
        }
        this.e();
        super.d();
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

