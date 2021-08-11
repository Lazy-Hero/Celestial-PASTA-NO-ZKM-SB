/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import java.io.IOException;
import net.minecraft.client.D.h;
import net.minecraft.client.b.B;
import net.minecraft.client.b.L;
import net.minecraft.client.b.l;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.l.c;
import net.minecraft.client.l.f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aW
extends d2 {
    private final /* synthetic */ c D;
    private static final /* synthetic */ f[] z;
    private final /* synthetic */ fN C;
    private final /* synthetic */ L A;
    private static final /* synthetic */ String B;
    protected /* synthetic */ String y;

    private void a(s s2, int n2) {
        block28: {
            c c10;
            Object object;
            block39: {
                int n3;
                block38: {
                    String[] arrstring;
                    block36: {
                        block37: {
                            block35: {
                                block34: {
                                    block33: {
                                        int n4;
                                        block32: {
                                            int n5;
                                            block29: {
                                                block31: {
                                                    block30: {
                                                        int n6;
                                                        block27: {
                                                            arrstring = q.b();
                                                            n6 = s2.h;
                                                            if (arrstring == null) break block27;
                                                            if (n6 == 0) break block28;
                                                            n6 = this.D.b7;
                                                        }
                                                        n5 = n6;
                                                        n3 = s2.g;
                                                        n4 = 200;
                                                        if (arrstring == null) break block29;
                                                        if (n3 >= n4) break block30;
                                                        n3 = s2 instanceof B;
                                                        if (arrstring == null) break block31;
                                                        if (n3 != 0) {
                                                            this.D.b(((B)s2).b(), n2);
                                                            s2.m = this.D.c(net.minecraft.client.l.f.a(s2.g));
                                                        }
                                                    }
                                                    n3 = s2.g;
                                                }
                                                n4 = 200;
                                            }
                                            if (arrstring != null) {
                                                if (n3 == n4) {
                                                    this.m.ac.e();
                                                    this.m.a(this.A);
                                                }
                                                n3 = this.D.b7;
                                                n4 = n5;
                                            }
                                            if (arrstring != null) {
                                                if (n3 != n4) {
                                                    object = new l(this.m);
                                                    int n7 = ((l)object).e();
                                                    int n8 = ((l)object).a();
                                                    this.a(this.m, n7, n8);
                                                }
                                                n3 = s2.g;
                                                n4 = 201;
                                            }
                                            if (arrstring != null) {
                                                if (n3 == n4) {
                                                    this.m.ac.e();
                                                    object = new dD(this, this.D);
                                                    this.m.a((L)object);
                                                }
                                                n3 = s2.g;
                                                n4 = 202;
                                            }
                                            if (arrstring != null) {
                                                if (n3 == n4) {
                                                    this.m.ac.e();
                                                    object = new dk(this, this.D);
                                                    this.m.a((L)object);
                                                }
                                                n3 = s2.g;
                                                n4 = 211;
                                            }
                                            if (arrstring != null) {
                                                if (n3 == n4) {
                                                    this.m.ac.e();
                                                    object = new dt(this, this.D);
                                                    this.m.a((L)object);
                                                }
                                                n3 = s2.g;
                                                n4 = 212;
                                            }
                                            if (arrstring != null) {
                                                if (n3 == n4) {
                                                    this.m.ac.e();
                                                    object = new dy(this, this.D);
                                                    this.m.a((L)object);
                                                }
                                                n3 = s2.g;
                                                n4 = 222;
                                            }
                                            if (arrstring == null) break block32;
                                            if (n3 == n4) {
                                                this.m.ac.e();
                                                object = new dV(this, this.D);
                                                this.m.a((L)object);
                                            }
                                            n3 = s2.g;
                                            if (arrstring == null) break block33;
                                            n4 = 231;
                                        }
                                        if (n3 != n4) break block28;
                                        n3 = fU.m() ? 1 : 0;
                                    }
                                    if (arrstring == null) break block34;
                                    if (n3 != 0) break block35;
                                    n3 = fU.aS() ? 1 : 0;
                                }
                                if (arrstring == null) break block36;
                                if (n3 == 0) break block37;
                            }
                            fU.a(gl.a("of.message.shaders.aa1"), gl.a("of.message.shaders.aa2"));
                            return;
                        }
                        n3 = fU.az() ? 1 : 0;
                    }
                    if (arrstring != null) {
                        if (n3 != 0) {
                            fU.a(gl.a("of.message.shaders.af1"), gl.a("of.message.shaders.af2"));
                            return;
                        }
                        n3 = fU.aw() ? 1 : 0;
                    }
                    if (arrstring == null) break block38;
                    if (n3 != 0) {
                        fU.a(gl.a("of.message.shaders.fr1"), gl.a("of.message.shaders.fr2"));
                        return;
                    }
                    c10 = fU.a();
                    if (arrstring == null) break block39;
                    n3 = c10.aD ? 1 : 0;
                }
                if (n3 != 0) {
                    fU.a(gl.a("of.message.shaders.an1"), gl.a("of.message.shaders.an2"));
                    return;
                }
                c10 = this.m.ac;
            }
            c10.e();
            object = new dm(this, this.D);
            this.m.a((L)object);
        }
    }

    public aW(L l2, c c10) {
        this.y = "Video Settings";
        this.C = new fN(this);
        this.A = l2;
        this.D = c10;
    }

    public static void a(L l2, int n2, int n3, int n4, int n5, int n6, int n7) {
        l2.a(n2, n3, (double)n4, (double)n5, n6, n7);
    }

    static {
        B = "CL_00000718";
        z = new f[]{net.minecraft.client.l.f.GRAPHICS, net.minecraft.client.l.f.RENDER_DISTANCE, net.minecraft.client.l.f.AMBIENT_OCCLUSION, net.minecraft.client.l.f.FRAMERATE_LIMIT, net.minecraft.client.l.f.AO_LEVEL, net.minecraft.client.l.f.VIEW_BOBBING, net.minecraft.client.l.f.GUI_SCALE, net.minecraft.client.l.f.USE_VBO, net.minecraft.client.l.f.GAMMA, net.minecraft.client.l.f.ATTACK_INDICATOR, net.minecraft.client.l.f.DYNAMIC_LIGHTS, net.minecraft.client.l.f.DYNAMIC_FOV};
    }

    @Override
    protected void b(s s2) {
        block0: {
            if (s2.g != net.minecraft.client.l.f.GUI_SCALE.ordinal()) break block0;
            this.a(s2, -1);
        }
    }

    public static int b(s s2) {
        return s2.n;
    }

    @Override
    protected void a(s s2) throws IOException {
        this.a(s2, 1);
    }

    @Override
    public void a(int n2, int n3, float f10) {
        String string;
        block8: {
            boolean bl2;
            String string2;
            block7: {
                String[] arrstring = q.b();
                this.n();
                this.b(this.v, this.y, h / 2, 15, 0xFFFFFF);
                string2 = fU.z();
                String[] arrstring2 = arrstring;
                String string3 = "HD_U";
                bl2 = string3.equals("HD");
                if (arrstring2 != null) {
                    if (bl2) {
                        string2 = "OptiFine HD C6";
                    }
                    bl2 = string3.equals("HD_U");
                }
                if (arrstring2 == null) break block7;
                if (bl2) {
                    string2 = "OptiFine HD C6 Ultra";
                }
                string = string3;
                if (arrstring2 == null) break block8;
                bl2 = string.equals("L");
            }
            if (bl2) {
                string2 = "OptiFine C6 Light";
            }
            this.a(this.v, string2, 2, w - 10, 0x808080);
            string = "Minecraft 1.12.2";
        }
        String string4 = string;
        int n4 = this.v.e(string4);
        this.a(this.v, string4, h - n4 - 2, w - 10, 0x808080);
        super.a(n2, n3, f10);
        this.C.b(n2, n3, this.t);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void r() {
        int n2;
        block3: {
            this.y = net.minecraft.client.D.h.a("options.videoTitle", new Object[0]);
            String[] arrstring = q.b();
            this.t.clear();
            String[] arrstring2 = arrstring;
            n2 = 0;
            while (n2 < z.length) {
                block4: {
                    block5: {
                        boolean bl2;
                        int n3;
                        int n4;
                        f f10;
                        block6: {
                            f10 = z[n2];
                            if (arrstring2 == null) break block3;
                            if (arrstring2 == null) break block4;
                            if (f10 == null) break block5;
                            n4 = h / 2 - 155 + n2 % 2 * 160;
                            n3 = w / 6 + 21 * (n2 / 2) - 12;
                            bl2 = f10.f();
                            if (arrstring2 == null) break block5;
                            if (!bl2) break block6;
                            this.t.add(new d7(f10.e(), n4, n3, f10));
                            if (arrstring2 != null) break block5;
                        }
                        bl2 = this.t.add(new dH(f10.e(), n4, n3, f10, this.D.c(f10)));
                    }
                    ++n2;
                }
                if (arrstring2 != null) continue;
            }
            n2 = w / 6 + 21 * (z.length / 2) - 12;
        }
        int n5 = 0;
        n5 = h / 2 - 155 + 0;
        this.t.add(new B(231, n5, n2, gl.a("of.options.shaders")));
        n5 = h / 2 - 155 + 160;
        this.t.add(new B(202, n5, n2, gl.a("of.options.quality")));
        n5 = h / 2 - 155 + 0;
        this.t.add(new B(201, n5, n2 += 21, gl.a("of.options.details")));
        n5 = h / 2 - 155 + 160;
        this.t.add(new B(212, n5, n2, gl.a("of.options.performance")));
        n5 = h / 2 - 155 + 0;
        this.t.add(new B(211, n5, n2 += 21, gl.a("of.options.animations")));
        n5 = h / 2 - 155 + 160;
        this.t.add(new B(222, n5, n2, gl.a("of.options.other")));
        n2 += 21;
        this.t.add(new s(200, h / 2 - 100, w / 6 + 168 + 11, net.minecraft.client.D.h.a("gui.done", new Object[0])));
    }

    public static int a(s s2) {
        return s2.i;
    }
}

