/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.C.K;
import net.minecraft.Q.W;
import net.minecraft.Q.a1;
import net.minecraft.Q.a4;
import net.minecraft.Z.i;
import net.minecraft.ar.aA;
import net.minecraft.client.a.v;
import net.minecraft.client.b.l;
import net.minecraft.d.F;
import net.minecraft.d.r;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.n.a;

public class bd
extends bE {
    private final /* synthetic */ hH m;
    private final /* synthetic */ hH n;
    private final /* synthetic */ hH t;
    /* synthetic */ ArrayList<n> q;
    private final /* synthetic */ hH u;
    private final /* synthetic */ hH l;
    public static /* synthetic */ int k;
    private final /* synthetic */ hH v;
    private final /* synthetic */ hH o;
    /* synthetic */ ArrayList<n> p;
    private final /* synthetic */ hH r;
    public static /* synthetic */ int s;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        block42: {
            block43: {
                block40: {
                    block41: {
                        block38: {
                            block39: {
                                block36: {
                                    block37: {
                                        block34: {
                                            block35: {
                                                block32: {
                                                    block33: {
                                                        block30: {
                                                            block31: {
                                                                n11 = 0;
                                                                n10 = 0;
                                                                n9 = 0;
                                                                n8 = bE.l();
                                                                n7 = 0;
                                                                n6 = 0;
                                                                n5 = 0;
                                                                n4 = 0;
                                                                n3 = this.t.l();
                                                                if (n8 != 0) break block30;
                                                                if (n3 == 0) break block31;
                                                                n3 = n2;
                                                                if (n8 != 0) break block30;
                                                                if (n3 != 0) {
                                                                    n11 = 56;
                                                                }
                                                            }
                                                            n3 = this.m.l() ? 1 : 0;
                                                        }
                                                        if (n8 != 0) break block32;
                                                        if (n3 == 0) break block33;
                                                        n3 = n2;
                                                        if (n8 != 0) break block32;
                                                        if (n3 != 0) {
                                                            n10 = 14;
                                                        }
                                                    }
                                                    n3 = this.o.l() ? 1 : 0;
                                                }
                                                if (n8 != 0) break block34;
                                                if (n3 == 0) break block35;
                                                n3 = n2;
                                                if (n8 != 0) break block34;
                                                if (n3 != 0) {
                                                    n9 = 15;
                                                }
                                            }
                                            n3 = this.u.l() ? 1 : 0;
                                        }
                                        if (n8 != 0) break block36;
                                        if (n3 == 0) break block37;
                                        n3 = n2;
                                        if (n8 != 0) break block36;
                                        if (n3 != 0) {
                                            n7 = 129;
                                        }
                                    }
                                    n3 = this.r.l() ? 1 : 0;
                                }
                                if (n8 != 0) break block38;
                                if (n3 == 0) break block39;
                                n3 = n2;
                                if (n8 != 0) break block38;
                                if (n3 != 0) {
                                    n6 = 73;
                                }
                            }
                            n3 = this.l.l() ? 1 : 0;
                        }
                        if (n8 != 0) break block40;
                        if (n3 == 0) break block41;
                        n3 = n2;
                        if (n8 != 0) break block40;
                        if (n3 != 0) {
                            n5 = 16;
                        }
                    }
                    n3 = this.n.l() ? 1 : 0;
                }
                if (n8 != 0) break block42;
                if (n3 == 0) break block43;
                n3 = n2;
                if (n8 != 0) break block42;
                if (n3 != 0) {
                    n4 = 21;
                }
            }
            n3 = n2;
        }
        if (n8 == 0) {
            if (n3 == 0) {
                return false;
            }
            n3 = n2;
        }
        if (n8 != 0) return n3 != 0;
        if (n3 == n11) return 1 != 0;
        n3 = n2;
        if (n8 != 0) return n3 != 0;
        if (n3 == n10) return 1 != 0;
        n3 = n2;
        if (n8 != 0) return n3 != 0;
        if (n3 == n9) return 1 != 0;
        n3 = n2;
        if (n8 != 0) return n3 != 0;
        if (n3 == n7) return 1 != 0;
        n3 = n2;
        if (n8 != 0) return n3 != 0;
        if (n3 == n6) return 1 != 0;
        n3 = n2;
        if (n8 != 0) return n3 != 0;
        if (n3 == n5) return 1 != 0;
        n3 = n2;
        if (n8 != 0) return n3 != 0;
        if (n3 != n4) return 0 != 0;
        return 1 != 0;
    }

    public bd() {
        super("XrayBypass", a5.World);
        this.q = new ArrayList();
        int n2 = bE.j();
        this.p = new ArrayList();
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("FullBox");
        arrayList.add("Frame");
        cj.b.f.a(new hH("BlockOutline Mode", (bE)this, "FullBox", arrayList));
        this.t = new hH("Diamond", this, true);
        cj.b.f.a(this.t);
        this.m = new hH("Gold", this, false);
        cj.b.f.a(this.m);
        this.o = new hH("Iron", this, false);
        cj.b.f.a(this.o);
        this.u = new hH("Emerald", this, false);
        cj.b.f.a(this.u);
        this.r = new hH("Redstone", this, false);
        cj.b.f.a(this.r);
        this.n = new hH("Lapis", this, false);
        cj.b.f.a(this.n);
        this.l = new hH("Coal", this, false);
        cj.b.f.a(this.l);
        this.v = new hH("CheckSpeed", this, 4.0, 1.0, 5.0, 1.0);
        cj.b.f.a(this.v);
        cj.b.f.a(new hH("Radius XZ", this, 20.0, 5.0, 200.0, 1.0));
        int n3 = n2;
        cj.b.f.a(new hH("Radius Y", this, 6.0, 2.0, 50.0, 1.0));
        if (n3 == 0) {
            net.minecraft.k.m.b(!net.minecraft.k.m.c());
        }
    }

    @Override
    public void m() {
        bd.c.a2.d();
        super.m();
    }

    @cL
    public void a(dS dS2) {
        Iterator<n> iterator = this.q.iterator();
        int n2 = bE.l();
        while (iterator.hasNext()) {
            block68: {
                int n3;
                n n4;
                block86: {
                    net.minecraft.W.K k2;
                    block85: {
                        block84: {
                            block82: {
                                block83: {
                                    block80: {
                                        block81: {
                                            block78: {
                                                block79: {
                                                    block76: {
                                                        block77: {
                                                            block74: {
                                                                block75: {
                                                                    block72: {
                                                                        block73: {
                                                                            block71: {
                                                                                block53: {
                                                                                    String string;
                                                                                    block54: {
                                                                                        int n5;
                                                                                        block70: {
                                                                                            block69: {
                                                                                                block67: {
                                                                                                    block65: {
                                                                                                        block66: {
                                                                                                            block63: {
                                                                                                                block64: {
                                                                                                                    block61: {
                                                                                                                        block62: {
                                                                                                                            block59: {
                                                                                                                                block60: {
                                                                                                                                    block57: {
                                                                                                                                        block58: {
                                                                                                                                            block55: {
                                                                                                                                                block56: {
                                                                                                                                                    n4 = iterator.next();
                                                                                                                                                    i i2 = fs.b(n4);
                                                                                                                                                    k2 = i2.b();
                                                                                                                                                    string = cj.b.f.a("BlockOutline Mode").m();
                                                                                                                                                    n3 = string.equalsIgnoreCase("FullBox");
                                                                                                                                                    if (n2 != 0) break block53;
                                                                                                                                                    if (n3 == 0) break block54;
                                                                                                                                                    n5 = net.minecraft.W.K.b(k2);
                                                                                                                                                    if (n2 != 0) break block55;
                                                                                                                                                    if (n5 == 0) break block56;
                                                                                                                                                    n5 = net.minecraft.W.K.b(k2);
                                                                                                                                                    if (n2 != 0) break block55;
                                                                                                                                                    if (n5 != 56) break block56;
                                                                                                                                                    n5 = this.t.l() ? 1 : 0;
                                                                                                                                                    if (n2 != 0) break block55;
                                                                                                                                                    if (n5 == 0) break block56;
                                                                                                                                                    n5 = net.minecraft.W.K.b(k2);
                                                                                                                                                    if (n2 != 0) break block55;
                                                                                                                                                    if (n5 == 56) {
                                                                                                                                                        dJ.a(n4, new Color(0, 255, 255, 50), 1.0, 1.0);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                n5 = net.minecraft.W.K.b(k2);
                                                                                                                                            }
                                                                                                                                            if (n2 != 0) break block57;
                                                                                                                                            if (n5 == 0) break block58;
                                                                                                                                            n5 = net.minecraft.W.K.b(k2);
                                                                                                                                            if (n2 != 0) break block57;
                                                                                                                                            if (n5 != 14) break block58;
                                                                                                                                            n5 = this.m.l() ? 1 : 0;
                                                                                                                                            if (n2 != 0) break block57;
                                                                                                                                            if (n5 == 0) break block58;
                                                                                                                                            n5 = net.minecraft.W.K.b(k2);
                                                                                                                                            if (n2 != 0) break block57;
                                                                                                                                            if (n5 == 14) {
                                                                                                                                                dJ.a(n4, new Color(255, 215, 0, 100), 1.0, 1.0);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        n5 = net.minecraft.W.K.b(k2);
                                                                                                                                    }
                                                                                                                                    if (n2 != 0) break block59;
                                                                                                                                    if (n5 == 0) break block60;
                                                                                                                                    n5 = net.minecraft.W.K.b(k2);
                                                                                                                                    if (n2 != 0) break block59;
                                                                                                                                    if (n5 != 15) break block60;
                                                                                                                                    n5 = this.o.l() ? 1 : 0;
                                                                                                                                    if (n2 != 0) break block59;
                                                                                                                                    if (n5 == 0) break block60;
                                                                                                                                    n5 = net.minecraft.W.K.b(k2);
                                                                                                                                    if (n2 != 0) break block59;
                                                                                                                                    if (n5 == 15) {
                                                                                                                                        dJ.a(n4, new Color(213, 213, 213, 100), 1.0, 1.0);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                n5 = net.minecraft.W.K.b(k2);
                                                                                                                            }
                                                                                                                            if (n2 != 0) break block61;
                                                                                                                            if (n5 == 0) break block62;
                                                                                                                            n5 = net.minecraft.W.K.b(k2);
                                                                                                                            if (n2 != 0) break block61;
                                                                                                                            if (n5 != 129) break block62;
                                                                                                                            n5 = this.u.l() ? 1 : 0;
                                                                                                                            if (n2 != 0) break block61;
                                                                                                                            if (n5 == 0) break block62;
                                                                                                                            n5 = net.minecraft.W.K.b(k2);
                                                                                                                            if (n2 != 0) break block61;
                                                                                                                            if (n5 == 129) {
                                                                                                                                dJ.a(n4, new Color(0, 255, 77, 100), 1.0, 1.0);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        n5 = net.minecraft.W.K.b(k2);
                                                                                                                    }
                                                                                                                    if (n2 != 0) break block63;
                                                                                                                    if (n5 == 0) break block64;
                                                                                                                    n5 = net.minecraft.W.K.b(k2);
                                                                                                                    if (n2 != 0) break block63;
                                                                                                                    if (n5 != 73) break block64;
                                                                                                                    n5 = this.r.l() ? 1 : 0;
                                                                                                                    if (n2 != 0) break block63;
                                                                                                                    if (n5 == 0) break block64;
                                                                                                                    n5 = net.minecraft.W.K.b(k2);
                                                                                                                    if (n2 != 0) break block63;
                                                                                                                    if (n5 == 73) {
                                                                                                                        dJ.a(n4, new Color(255, 0, 0, 100), 1.0, 1.0);
                                                                                                                    }
                                                                                                                }
                                                                                                                n5 = net.minecraft.W.K.b(k2);
                                                                                                            }
                                                                                                            if (n2 != 0) break block65;
                                                                                                            if (n5 == 0) break block66;
                                                                                                            n5 = net.minecraft.W.K.b(k2);
                                                                                                            if (n2 != 0) break block65;
                                                                                                            if (n5 != 16) break block66;
                                                                                                            n5 = this.l.l() ? 1 : 0;
                                                                                                            if (n2 != 0) break block65;
                                                                                                            if (n5 == 0) break block66;
                                                                                                            n5 = net.minecraft.W.K.b(k2);
                                                                                                            if (n2 != 0) break block65;
                                                                                                            if (n5 == 16) {
                                                                                                                dJ.a(n4, new Color(0, 0, 0, 100), 1.0, 1.0);
                                                                                                            }
                                                                                                        }
                                                                                                        n5 = net.minecraft.W.K.b(k2);
                                                                                                    }
                                                                                                    if (n2 != 0) break block67;
                                                                                                    if (n5 == 0) break block68;
                                                                                                    n5 = net.minecraft.W.K.b(k2);
                                                                                                }
                                                                                                if (n2 != 0) break block69;
                                                                                                if (n5 != 21) break block68;
                                                                                                n5 = this.n.l() ? 1 : 0;
                                                                                            }
                                                                                            if (n2 != 0) break block70;
                                                                                            if (n5 == 0) break block68;
                                                                                            n5 = net.minecraft.W.K.b(k2);
                                                                                        }
                                                                                        if (n5 != 21) break block68;
                                                                                        dJ.a(n4, new Color(38, 97, 156, 100), 1.0, 1.0);
                                                                                        if (n2 == 0) break block68;
                                                                                    }
                                                                                    n3 = string.equalsIgnoreCase("Frame");
                                                                                }
                                                                                if (n2 != 0) break block71;
                                                                                if (n3 == 0) break block68;
                                                                                n3 = net.minecraft.W.K.b(k2);
                                                                            }
                                                                            if (n2 != 0) break block72;
                                                                            if (n3 == 0) break block73;
                                                                            n3 = net.minecraft.W.K.b(k2);
                                                                            if (n2 != 0) break block72;
                                                                            if (n3 != 56) break block73;
                                                                            n3 = this.t.l() ? 1 : 0;
                                                                            if (n2 != 0) break block72;
                                                                            if (n3 == 0) break block73;
                                                                            n3 = net.minecraft.W.K.b(k2);
                                                                            if (n2 != 0) break block72;
                                                                            if (n3 == 56) {
                                                                                dJ.a(n4, 0.0, 255.0, 255.0);
                                                                            }
                                                                        }
                                                                        n3 = net.minecraft.W.K.b(k2);
                                                                    }
                                                                    if (n2 != 0) break block74;
                                                                    if (n3 == 0) break block75;
                                                                    n3 = net.minecraft.W.K.b(k2);
                                                                    if (n2 != 0) break block74;
                                                                    if (n3 != 14) break block75;
                                                                    n3 = this.m.l() ? 1 : 0;
                                                                    if (n2 != 0) break block74;
                                                                    if (n3 == 0) break block75;
                                                                    n3 = net.minecraft.W.K.b(k2);
                                                                    if (n2 != 0) break block74;
                                                                    if (n3 == 14) {
                                                                        dJ.a(n4, 255.0, 215.0, 0.0);
                                                                    }
                                                                }
                                                                n3 = net.minecraft.W.K.b(k2);
                                                            }
                                                            if (n2 != 0) break block76;
                                                            if (n3 == 0) break block77;
                                                            n3 = net.minecraft.W.K.b(k2);
                                                            if (n2 != 0) break block76;
                                                            if (n3 != 15) break block77;
                                                            n3 = this.o.l() ? 1 : 0;
                                                            if (n2 != 0) break block76;
                                                            if (n3 == 0) break block77;
                                                            n3 = net.minecraft.W.K.b(k2);
                                                            if (n2 != 0) break block76;
                                                            if (n3 == 15) {
                                                                dJ.a(n4, 213.0, 213.0, 213.0);
                                                            }
                                                        }
                                                        n3 = net.minecraft.W.K.b(k2);
                                                    }
                                                    if (n2 != 0) break block78;
                                                    if (n3 == 0) break block79;
                                                    n3 = net.minecraft.W.K.b(k2);
                                                    if (n2 != 0) break block78;
                                                    if (n3 != 129) break block79;
                                                    n3 = this.u.l() ? 1 : 0;
                                                    if (n2 != 0) break block78;
                                                    if (n3 == 0) break block79;
                                                    n3 = net.minecraft.W.K.b(k2);
                                                    if (n2 != 0) break block78;
                                                    if (n3 == 129) {
                                                        dJ.a(n4, 0.0, 255.0, 77.0);
                                                    }
                                                }
                                                n3 = net.minecraft.W.K.b(k2);
                                            }
                                            if (n2 != 0) break block80;
                                            if (n3 == 0) break block81;
                                            n3 = net.minecraft.W.K.b(k2);
                                            if (n2 != 0) break block80;
                                            if (n3 != 73) break block81;
                                            n3 = this.r.l() ? 1 : 0;
                                            if (n2 != 0) break block80;
                                            if (n3 == 0) break block81;
                                            n3 = net.minecraft.W.K.b(k2);
                                            if (n2 != 0) break block80;
                                            if (n3 == 73) {
                                                dJ.a(n4, 255.0, 0.0, 0.0);
                                            }
                                        }
                                        n3 = net.minecraft.W.K.b(k2);
                                    }
                                    if (n2 != 0) break block82;
                                    if (n3 == 0) break block83;
                                    n3 = net.minecraft.W.K.b(k2);
                                    if (n2 != 0) break block82;
                                    if (n3 != 16) break block83;
                                    n3 = this.l.l() ? 1 : 0;
                                    if (n2 != 0) break block82;
                                    if (n3 == 0) break block83;
                                    n3 = net.minecraft.W.K.b(k2);
                                    if (n2 != 0) break block82;
                                    if (n3 == 16) {
                                        dJ.a(n4, 0.0, 0.0, 0.0);
                                    }
                                }
                                n3 = net.minecraft.W.K.b(k2);
                            }
                            if (n2 != 0) break block84;
                            if (n3 == 0) break block68;
                            n3 = net.minecraft.W.K.b(k2);
                        }
                        if (n2 != 0) break block85;
                        if (n3 != 21) break block68;
                        n3 = this.n.l() ? 1 : 0;
                    }
                    if (n2 != 0) break block86;
                    if (n3 == 0) break block68;
                    n3 = net.minecraft.W.K.b(k2);
                }
                if (n3 == 21) {
                    dJ.a(n4, 38.0, 97.0, 156.0);
                }
            }
            if (n2 == 0) continue;
        }
    }

    private ArrayList<n> a(int n2, int n3, int n4) {
        n n5 = new n(bd.c.s.a - (double)n2, bd.c.s.aF - (double)n3, bd.c.s.ax - (double)n4);
        n n6 = new n(bd.c.s.a + (double)n2, bd.c.s.aF + (double)n3, bd.c.s.ax + (double)n4);
        return fs.a(n5, n6);
    }

    @Override
    public void d() {
        int n2;
        block3: {
            int n3 = bE.l();
            this.q.clear();
            int n4 = n3;
            this.p.clear();
            int n5 = cj.b.f.a("Radius XZ").c();
            int n6 = cj.b.f.a("Radius Y").c();
            ArrayList<n> arrayList = this.a(n5, n6, n5);
            for (n n7 : arrayList) {
                i i2 = fs.b(n7);
                n2 = this.a(net.minecraft.W.K.b(i2.b())) ? 1 : 0;
                if (n4 == 0) {
                    if (n4 == 0 && n2 != 0) {
                        this.p.add(n7);
                    }
                    if (n4 == 0) continue;
                }
                break block3;
            }
            s = this.p.size();
            n2 = 0;
        }
        k = n2;
        super.d();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        block42: {
            block43: {
                block40: {
                    block41: {
                        block38: {
                            block39: {
                                block36: {
                                    block37: {
                                        block34: {
                                            block35: {
                                                block32: {
                                                    block33: {
                                                        block30: {
                                                            block31: {
                                                                n11 = 0;
                                                                n10 = 0;
                                                                n9 = 0;
                                                                n8 = 0;
                                                                n7 = 0;
                                                                n6 = 0;
                                                                n5 = 0;
                                                                n4 = bE.j();
                                                                n3 = this.t.l();
                                                                if (n4 == 0) break block30;
                                                                if (n3 == 0) break block31;
                                                                n3 = n2;
                                                                if (n4 == 0) break block30;
                                                                if (n3 != 0) {
                                                                    n11 = 56;
                                                                }
                                                            }
                                                            n3 = this.m.l() ? 1 : 0;
                                                        }
                                                        if (n4 == 0) break block32;
                                                        if (n3 == 0) break block33;
                                                        n3 = n2;
                                                        if (n4 == 0) break block32;
                                                        if (n3 != 0) {
                                                            n10 = 14;
                                                        }
                                                    }
                                                    n3 = this.o.l() ? 1 : 0;
                                                }
                                                if (n4 == 0) break block34;
                                                if (n3 == 0) break block35;
                                                n3 = n2;
                                                if (n4 == 0) break block34;
                                                if (n3 != 0) {
                                                    n9 = 15;
                                                }
                                            }
                                            n3 = this.u.l() ? 1 : 0;
                                        }
                                        if (n4 == 0) break block36;
                                        if (n3 == 0) break block37;
                                        n3 = n2;
                                        if (n4 == 0) break block36;
                                        if (n3 != 0) {
                                            n8 = 129;
                                        }
                                    }
                                    n3 = this.r.l() ? 1 : 0;
                                }
                                if (n4 == 0) break block38;
                                if (n3 == 0) break block39;
                                n3 = n2;
                                if (n4 == 0) break block38;
                                if (n3 != 0) {
                                    n7 = 73;
                                }
                            }
                            n3 = this.l.l() ? 1 : 0;
                        }
                        if (n4 == 0) break block40;
                        if (n3 == 0) break block41;
                        n3 = n2;
                        if (n4 == 0) break block40;
                        if (n3 != 0) {
                            n6 = 16;
                        }
                    }
                    n3 = this.n.l() ? 1 : 0;
                }
                if (n4 == 0) break block42;
                if (n3 == 0) break block43;
                n3 = n2;
                if (n4 == 0) break block42;
                if (n3 != 0) {
                    n5 = 21;
                }
            }
            n3 = n2;
        }
        if (n4 != 0) {
            if (n3 == 0) {
                return false;
            }
            n3 = n2;
        }
        if (n4 == 0) return n3 != 0;
        if (n3 == n11) return 1 != 0;
        n3 = n2;
        if (n4 == 0) return n3 != 0;
        if (n3 == n10) return 1 != 0;
        n3 = n2;
        if (n4 == 0) return n3 != 0;
        if (n3 == n9) return 1 != 0;
        n3 = n2;
        if (n4 == 0) return n3 != 0;
        if (n3 == n8) return 1 != 0;
        n3 = n2;
        if (n4 == 0) return n3 != 0;
        if (n3 == n7) return 1 != 0;
        n3 = n2;
        if (n4 == 0) return n3 != 0;
        if (n3 == n6) return 1 != 0;
        n3 = n2;
        if (n4 == 0) return n3 != 0;
        if (n3 != n5) return 0 != 0;
        return 1 != 0;
    }

    @cL
    public void a(fn fn2) {
        block0: {
            l l2 = new l(c);
            gu gu2 = bd.c.q;
            int n2 = 125;
            float f10 = (float)l2.e() / 2.0f - (float)n2 / 2.0f;
            int n3 = bE.l();
            float f11 = 5.0f;
            cj.g().c("Done: " + k + " / All: " + s, (double)(f10 + 30.0f), (double)(f11 + (float)gu2.c() + 4.0f), -1);
            net.minecraft.client.a.v.f();
            if (!net.minecraft.k.m.c()) break block0;
            bE.b(++n3);
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @cL
    public void a(fR fR2) {
        int n2 = bE.l();
        String string = k == s ? "Done: " + s : "" + k;
        String string2 = cj.b.f.a("BlockOutline Mode").m();
        this.b(string2 + ", " + string);
        for (int i2 = 0; i2 < this.v.c(); ++i2) {
            Object object = this.p;
            if (n2 == 0) {
                if (((ArrayList)object).size() < 1) {
                    return;
                }
                object = this.p.remove(0);
            }
            n n3 = (n)object;
            ++k;
            c.ar().a(new F(net.minecraft.d.r.START_DESTROY_BLOCK, n3, aA.UP));
            if (n2 == 0) continue;
        }
    }

    @cL
    public void a(fz fz2) {
        block9: {
            K k2;
            K<a> k3;
            int n2;
            block10: {
                boolean bl2;
                block7: {
                    block8: {
                        n2 = bE.j();
                        bl2 = fz2.a() instanceof a4;
                        if (n2 == 0) break block7;
                        if (!bl2) break block8;
                        k3 = (a4)fz2.a();
                        boolean bl3 = this.b(net.minecraft.W.K.b(((a4)k3).a().b()));
                        if (n2 != 0 && bl3) {
                            bl3 = this.q.add(((a4)k3).b());
                        }
                        if (n2 != 0) break block9;
                    }
                    k2 = fz2.a();
                    if (n2 == 0) break block10;
                    bl2 = k2 instanceof W;
                }
                if (!bl2) break block9;
                k2 = fz2.a();
            }
            k3 = (W)k2;
            a1[] arra1 = ((W)k3).a();
            int n3 = arra1.length;
            int n4 = 0;
            while (n4 < n3) {
                a1 a12 = arra1[n4];
                if (n2 != 0) {
                    if (this.b(net.minecraft.W.K.b(a12.c().b()))) {
                        this.q.add(a12.a());
                    }
                    ++n4;
                }
                if (n2 != 0) continue;
            }
        }
    }
}

