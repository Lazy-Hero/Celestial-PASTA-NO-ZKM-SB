/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.D.h;
import net.minecraft.client.b.B;
import net.minecraft.client.b.L;
import net.minecraft.client.b.ai;
import net.minecraft.client.b.ao;
import net.minecraft.client.b.s;
import net.minecraft.client.l.c;
import net.minecraft.client.l.f;

public class dV
extends L
implements ai {
    private final /* synthetic */ fN y;
    private final /* synthetic */ c A;
    private static final /* synthetic */ f[] B;
    protected /* synthetic */ String C;
    private final /* synthetic */ L z;

    public dV(L l2, c c10) {
        this.y = new fN(this);
        this.z = l2;
        this.A = c10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void r() {
        block3: {
            boolean bl2;
            this.C = net.minecraft.client.D.h.a("of.options.otherTitle", new Object[0]);
            String string = K.d();
            this.t.clear();
            String string2 = string;
            for (int i2 = 0; i2 < B.length; ++i2) {
                f f10 = B[i2];
                int n2 = h / 2 - 155 + i2 % 2 * 160;
                int n3 = w / 6 + 21 * (i2 / 2) - 12;
                bl2 = f10.f();
                if (string2 == null) {
                    if (string2 != null) continue;
                    if (!bl2) {
                        this.t.add(new dH(f10.e(), n2, n3, f10, this.A.c(f10)));
                        if (string2 == null) continue;
                    }
                    this.t.add(new d7(f10.e(), n2, n3, f10));
                    if (string2 == null) continue;
                }
                break block3;
            }
            this.t.add(new s(210, h / 2 - 100, w / 6 + 168 + 11 - 44, net.minecraft.client.D.h.a("of.options.other.reset", new Object[0])));
            bl2 = this.t.add(new s(200, h / 2 - 100, w / 6 + 168 + 11, net.minecraft.client.D.h.a("gui.done", new Object[0])));
        }
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        this.b(this.v, this.C, h / 2, 15, 0xFFFFFF);
        super.a(n2, n3, f10);
        this.y.b(n2, n3, this.t);
    }

    @Override
    protected void a(s s2) {
        block8: {
            int n2;
            int n3;
            String string;
            block9: {
                block11: {
                    block10: {
                        block7: {
                            string = K.d();
                            n3 = s2.h;
                            if (string != null) break block7;
                            if (n3 == 0) break block8;
                            n3 = s2.g;
                        }
                        n2 = 200;
                        if (string != null) break block9;
                        if (n3 >= n2) break block10;
                        n3 = s2 instanceof B;
                        if (string != null) break block11;
                        if (n3 != 0) {
                            this.A.b(((B)s2).b(), 1);
                            s2.m = this.A.c(net.minecraft.client.l.f.a(s2.g));
                        }
                    }
                    n3 = s2.g;
                }
                n2 = 200;
            }
            if (string == null) {
                if (n3 == n2) {
                    this.m.ac.e();
                    this.m.a(this.z);
                }
                n3 = s2.g;
                n2 = 210;
            }
            if (n3 == n2) {
                this.m.ac.e();
                ao ao2 = new ao(this, net.minecraft.client.D.h.a("of.message.other.reset", new Object[0]), "", 9999);
                this.m.a(ao2);
            }
        }
    }

    static {
        B = new f[]{net.minecraft.client.l.f.LAGOMETER, net.minecraft.client.l.f.PROFILER, net.minecraft.client.l.f.SHOW_FPS, net.minecraft.client.l.f.ADVANCED_TOOLTIPS, net.minecraft.client.l.f.WEATHER, net.minecraft.client.l.f.TIME, net.minecraft.client.l.f.USE_FULLSCREEN, net.minecraft.client.l.f.FULLSCREEN_MODE, net.minecraft.client.l.f.ANAGLYPH, net.minecraft.client.l.f.AUTOSAVE_TICKS, net.minecraft.client.l.f.SCREENSHOT_SIZE};
    }

    @Override
    public void a(boolean bl2, int n2) {
        String string = K.d();
        if (string == null) {
            if (bl2) {
                this.m.ac.j();
            }
            this.m.a(this);
        }
    }
}

