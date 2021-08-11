/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.j.d;
import net.minecraft.client.j.f;
import net.minecraft.client.j.u;
import net.minecraft.client.q.a;
import net.minecraft.client.w.c;
import net.minecraft.client.w.n;

public class gb {
    public static final /* synthetic */ int j;
    public static final /* synthetic */ int i;
    public static final /* synthetic */ int m;
    private final /* synthetic */ v f;
    private /* synthetic */ v c;
    private /* synthetic */ BufferedImage d;
    private /* synthetic */ g[] a;
    private /* synthetic */ f g;
    public static final /* synthetic */ int e;
    private /* synthetic */ boolean h;
    public static final /* synthetic */ int l;
    private /* synthetic */ Dimension n;
    public static final /* synthetic */ int k;
    public static final /* synthetic */ int b;

    public BufferedImage a() {
        return this.d;
    }

    public void a(BufferedImage bufferedImage) {
        this.d = bufferedImage;
    }

    public boolean c() {
        return this.h;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        k = 1;
        l = 5;
        e = 6;
        m = 0;
        i = 2;
        b = 3;
        j = 4;
    }

    public void a(n n2, a a10, float f10, float f11) {
        String string;
        block11: {
            u u2;
            block13: {
                block15: {
                    block16: {
                        gb gb2;
                        block14: {
                            block12: {
                                block9: {
                                    block10: {
                                        u2 = fU.o();
                                        string = K.d();
                                        gb2 = this;
                                        if (string != null) break block9;
                                        if (!gb2.h) break block10;
                                        u2.b(a10.e());
                                        if (string == null) break block11;
                                    }
                                    gb2 = this;
                                }
                                if (string != null) break block12;
                                if (gb2.c == null) break block13;
                                gb2 = this;
                            }
                            if (string != null) break block14;
                            if (gb2.g != null) break block15;
                            gb2 = this;
                        }
                        if (string != null) break block16;
                        if (gb2.d == null) break block15;
                        gb2 = this;
                    }
                    gb2.g = new f(this.d);
                    Q.P().aN().a(this.c, (d)this.g);
                }
                u2.b(this.c);
                if (string == null) break block11;
            }
            u2.b(this.f);
        }
        int n3 = 0;
        while (n3 < this.a.length) {
            g g10 = this.a[n3];
            net.minecraft.client.a.v.M();
            if (string == null) {
                if (a10.a4()) {
                    net.minecraft.client.a.v.b(0.0f, 0.2f, 0.0f);
                }
                g10.a(n2, f10);
                net.minecraft.client.a.v.B();
                ++n3;
            }
            if (string == null) continue;
        }
    }

    public f d() {
        return this.g;
    }

    public v b() {
        return this.c;
    }

    public void a(v v2) {
        this.c = v2;
    }

    public static c a(n n2, int n3) {
        switch (n3) {
            case 0: {
                return n2.j;
            }
            case 1: {
                return n2.n;
            }
            case 2: {
                return n2.k;
            }
            case 3: {
                return n2.o;
            }
            case 4: {
                return n2.m;
            }
            case 5: {
                return n2.i;
            }
        }
        return null;
    }

    public gb(Dimension dimension, boolean bl2, g[] arrg) {
        this.n = null;
        this.h = false;
        this.a = new g[0];
        this.c = null;
        this.d = null;
        this.g = null;
        this.f = new v("textures/blocks/wool_colored_red.png");
        this.n = dimension;
        this.h = bl2;
        this.a = arrg;
    }
}

