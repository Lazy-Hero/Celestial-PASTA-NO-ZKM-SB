/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.a.x;
import net.minecraft.client.b.L;
import net.minecraft.client.b.l;
import net.minecraft.client.b.s;
import net.minecraft.k.m;
import org.lwjgl.input.Mouse;

public class dR
extends L {
    public static /* synthetic */ dv C;
    public static /* synthetic */ double y;
    private final /* synthetic */ ArrayList<eb> z;
    private /* synthetic */ float B;
    /* synthetic */ int A;

    @Override
    protected void b(int n2, int n3, int n4) {
        boolean bl2;
        block3: {
            Iterator<eb> iterator = this.z.iterator();
            bl2 = s.d();
            while (iterator.hasNext()) {
                eb eb2 = iterator.next();
                eb2.a(n2, n3, n4);
                if (bl2) {
                    if (bl2) continue;
                }
                break block3;
            }
            super.b(n2, n3, n4);
        }
        if (!net.minecraft.k.m.d()) {
            s.b(!bl2);
        }
    }

    public void a() {
        int n2 = Mouse.getDWheel();
        Iterator<eb> iterator = this.z.iterator();
        boolean bl2 = s.d();
        while (iterator.hasNext()) {
            block9: {
                int n3;
                eb eb2;
                block10: {
                    block11: {
                        block5: {
                            block6: {
                                int n4;
                                block7: {
                                    block8: {
                                        eb2 = iterator.next();
                                        n3 = bV.m.l();
                                        if (!bl2) break block5;
                                        if (n3 == 0) break block6;
                                        n4 = n2;
                                        if (!bl2) break block7;
                                        if (n4 >= 0) break block8;
                                        eb2.b(eb2.e() - 15);
                                        if (bl2) break block9;
                                    }
                                    n4 = n2;
                                }
                                if (n4 <= 0) break block9;
                                eb2.b(eb2.e() + 15);
                                if (bl2) break block9;
                            }
                            n3 = n2;
                        }
                        if (!bl2) break block10;
                        if (n3 <= 0) break block11;
                        eb2.b(eb2.e() - 15);
                        if (bl2) break block9;
                    }
                    n3 = n2;
                }
                if (n3 < 0) {
                    eb2.b(eb2.e() + 15);
                }
            }
            if (bl2) continue;
        }
    }

    @Override
    public void r() {
        block6: {
            dR dR2;
            boolean bl2;
            block5: {
                bl2 = s.f();
                dR2 = this;
                if (bl2) break block5;
                dR2.B = 0.0f;
                if (!bV.l.l()) break block6;
                dR2 = this;
            }
            x x2 = dR2.m.Y;
            if (!bl2) {
                if (x2.ai != null) {
                    this.m.Y.ai.c();
                }
                x2 = this.m.Y;
            }
            x2.a(new v("shaders/post/blur.json"));
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        block2: {
            Iterator<eb> iterator = this.z.iterator();
            boolean bl2 = s.f();
            while (iterator.hasNext()) {
                eb eb2 = iterator.next();
                eb2.b(n2, n3, n4);
                if (!bl2) {
                    if (!bl2) continue;
                }
                break block2;
            }
            super.a(n2, n3, n4);
        }
    }

    @Override
    public void h() {
        block7: {
            dN dN2;
            block6: {
                boolean bl2;
                block5: {
                    block4: {
                        bl2 = s.f();
                        x x2 = this.m.Y;
                        if (bl2) break block4;
                        if (!x2.e()) break block5;
                        x2 = this.m.Y;
                    }
                    x2.ai = null;
                }
                dN2 = cj.b.m;
                if (bl2) break block6;
                if (dN2 == null) break block7;
                dN2 = cj.b.m;
            }
            dN2.b();
        }
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block7: {
            float f11;
            boolean bl2;
            block13: {
                block10: {
                    float f12;
                    block11: {
                        float f13;
                        block12: {
                            block8: {
                                float f14;
                                int n4;
                                block9: {
                                    Q q2;
                                    block6: {
                                        l l2 = new l(this.m);
                                        bl2 = s.f();
                                        q2 = this.m;
                                        if (bl2) break block6;
                                        if (q2.s == null) break block7;
                                        q2 = this.m;
                                    }
                                    if (q2.e == null) break block7;
                                    f12 = 130.0f;
                                    n4 = (int)(f12 / 100.0f);
                                    float f15 = this.B - (f12 - (float)n4);
                                    f11 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                                    if (bl2) break block8;
                                    if (f11 >= 0) break block9;
                                    this.B += (float)n4;
                                    if (!bl2) break block10;
                                }
                                f11 = (f14 = this.B - (f12 - (float)n4)) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                            }
                            if (bl2) break block11;
                            if (f11 <= 0) break block12;
                            float f16 = this.B - f12;
                            f11 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                            if (bl2) break block11;
                            if (f11 == false) break block12;
                            this.B = (int)f12;
                            if (!bl2) break block10;
                        }
                        f11 = (f13 = this.B - f12) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                    }
                    if (bl2) break block13;
                    if (f11 != false) {
                        this.B = (int)f12;
                    }
                }
                f11 = (float)bV.k.l();
            }
            if (f11 != false) {
                C.a(n2, n3);
            }
            for (eb eb2 : this.z) {
                eb2.a(n2, n3);
                this.a();
                if (!bl2) continue;
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public dR() {
        this.z = new ArrayList();
        this.A = 10;
        boolean bl2 = s.d();
        for (a5 a52 : a5.values()) {
            this.z.add(new eb(a52, this.A, 10));
            this.A += 113;
            if (bl2) continue;
            net.minecraft.k.m.b(!net.minecraft.k.m.c());
            break;
        }
    }

    static {
        C = new dv();
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        block2: {
            Iterator<eb> iterator = this.z.iterator();
            boolean bl2 = s.f();
            while (iterator.hasNext()) {
                eb eb2 = iterator.next();
                eb2.a(c10, n2);
                if (!bl2) {
                    if (!bl2) continue;
                }
                break block2;
            }
            super.a(c10, n2);
        }
    }
}

