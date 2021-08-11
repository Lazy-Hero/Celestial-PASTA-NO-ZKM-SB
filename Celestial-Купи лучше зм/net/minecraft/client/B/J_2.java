/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  org.lwjgl.opengl.Display
 */
package net.minecraft.client.b;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import net.minecraft.U.x;
import net.minecraft.ae.a;
import net.minecraft.af.c;
import net.minecraft.ah.L;
import net.minecraft.ah.t;
import net.minecraft.ar.aA;
import net.minecraft.client.K;
import net.minecraft.client.Q;
import net.minecraft.client.a.as;
import net.minecraft.client.a.v;
import net.minecraft.client.b.a5;
import net.minecraft.client.b.l;
import net.minecraft.client.b.o;
import net.minecraft.client.b.q;
import net.minecraft.i.k;
import net.minecraft.k.h;
import net.minecraft.k.i;
import net.minecraft.k.j;
import net.minecraft.k.m;
import net.minecraft.k.n;
import org.lwjgl.opengl.Display;

public class J
extends q {
    private final /* synthetic */ a5 a;
    private final /* synthetic */ Q g;

    public J(Q q2) {
        this.g = q2;
        this.a = q2.a6;
    }

    private int a(int n2, int n3, int n4, int n5) {
        String[] arrstring = q.b();
        int n6 = n2;
        if (arrstring != null) {
            n6 = n6 < n4 ? this.a(-16711936, -256, (float)n2 / (float)n4) : this.a(-256, -65536, (float)(n2 - n4) / (float)(n5 - n4));
        }
        return n6;
    }

    protected <T extends Comparable<T>> List<String> a() {
        ArrayList arrayList;
        block16: {
            n n2;
            Object object;
            String[] arrstring;
            block18: {
                i i2;
                block17: {
                    block15: {
                        Q q2;
                        block14: {
                            boolean bl2;
                            block13: {
                                long l2 = Runtime.getRuntime().maxMemory();
                                long l3 = Runtime.getRuntime().totalMemory();
                                long l4 = Runtime.getRuntime().freeMemory();
                                long l5 = l3 - l4;
                                arrstring = q.b();
                                Object[] arrobject = new String[9];
                                Object[] arrobject2 = new Object[2];
                                arrobject2[0] = System.getProperty("java.version");
                                int n3 = this.g.x();
                                if (arrstring != null) {
                                    n3 = n3 != 0 ? 64 : 32;
                                }
                                arrobject2[1] = n3;
                                arrobject[0] = String.format("Java: %s %dbit", arrobject2);
                                arrobject[1] = String.format("Mem: % 2d%% %03d/%03dMB", l5 * 100L / l2, J.a(l5), J.a(l2));
                                arrobject[2] = String.format("Allocated: % 2d%% %03dMB", l3 * 100L / l2, J.a(l3));
                                arrobject[3] = "";
                                arrobject[4] = String.format("CPU: %s", as.j());
                                arrobject[5] = "";
                                arrobject[6] = String.format("Display: %dx%d (%s)", Display.getWidth(), Display.getHeight(), v.c(7936));
                                arrobject[7] = v.c(7937);
                                arrobject[8] = v.c(7938);
                                arrayList = Lists.newArrayList((Object[])arrobject);
                                bl2 = cq.bp.b();
                                if (arrstring == null) break block13;
                                if (bl2) {
                                    object = cq.d(cq.a2, new Object[0]);
                                    arrayList.add("");
                                    arrayList.addAll((Collection)cq.d(object, cq.bp, false));
                                }
                                q2 = this.g;
                                if (arrstring == null) break block14;
                                bl2 = q2.E();
                            }
                            if (bl2) {
                                return arrayList;
                            }
                            q2 = this.g;
                        }
                        i2 = q2.ao;
                        if (arrstring == null) break block15;
                        if (i2 == null) break block16;
                        i2 = this.g.ao;
                    }
                    if (arrstring == null) break block17;
                    if (i2.d != j.BLOCK) break block16;
                    i2 = this.g.ao;
                }
                n2 = i2.a();
                if (arrstring == null) break block18;
                if (n2 == null) break block16;
                n2 = this.g.ao.a();
            }
            object = n2;
            net.minecraft.Z.i i3 = this.g.e.d((n)object);
            if (arrstring != null) {
                if (this.g.e.a() != L.e) {
                    i3 = i3.c((t)this.g.e, (n)object);
                }
                arrayList.add("");
                arrayList.add(String.valueOf(net.minecraft.W.K.h.b(i3.b())));
            }
            for (Map.Entry entry : i3.a().entrySet()) {
                block22: {
                    boolean bl3;
                    String string;
                    a a10;
                    block21: {
                        block19: {
                            Comparable comparable;
                            block20: {
                                a10 = (a)entry.getKey();
                                comparable = (Comparable)entry.getValue();
                                string = a10.a(comparable);
                                bl3 = Boolean.TRUE.equals(comparable);
                                if (arrstring == null) break block19;
                                if (!bl3) break block20;
                                string = (Object)((Object)net.minecraft.at.l.GREEN) + string;
                                if (arrstring != null) break block21;
                            }
                            bl3 = Boolean.FALSE.equals(comparable);
                        }
                        if (arrstring == null) break block22;
                        if (bl3) {
                            string = (Object)((Object)net.minecraft.at.l.RED) + string;
                        }
                    }
                    bl3 = arrayList.add(a10.c() + ": " + string);
                }
                if (arrstring != null) continue;
            }
        }
        return arrayList;
    }

    protected void c() {
        List<String> list = this.b();
        String[] arrstring = q.b();
        list.add("");
        StringBuilder stringBuilder = new StringBuilder();
        String string = "Debug: Pie [shift]: ";
        if (arrstring != null) {
            stringBuilder = stringBuilder.append(string);
            string = this.g.ac.bK ? "visible" : "hidden";
        }
        StringBuilder stringBuilder2 = stringBuilder.append(string);
        String string2 = " FPS [alt]: ";
        if (arrstring != null) {
            stringBuilder2 = stringBuilder2.append(string2);
            string2 = this.g.ac.P ? "visible" : "hidden";
        }
        list.add(stringBuilder2.append(string2).toString());
        list.add("For help: press F3 + Q");
        int n2 = 0;
        while (n2 < list.size()) {
            String string3 = list.get(n2);
            if (arrstring != null) {
                if (!Strings.isNullOrEmpty((String)string3)) {
                    int n3 = this.a.p;
                    int n4 = this.a.e(string3);
                    int n5 = 2;
                    int n6 = 2 + n3 * n2;
                    J.a(1, n6 - 1, 2 + n4 + 1, n6 + n3 - 1, -1873784752);
                    this.a.b(string3, 2.0f, n6, 0xE0E0E0);
                }
                ++n2;
            }
            if (arrstring != null) continue;
        }
    }

    protected void a(l l2) {
        List<String> list = this.a();
        int n2 = 0;
        String[] arrstring = q.b();
        while (n2 < list.size()) {
            String string = list.get(n2);
            if (arrstring != null) {
                if (!Strings.isNullOrEmpty((String)string)) {
                    int n3 = this.a.p;
                    int n4 = this.a.e(string);
                    int n5 = l2.e() - 2 - n4;
                    int n6 = 2 + n3 * n2;
                    J.a(n5 - 1, n6 - 1, n5 + n4 + 1, n6 + n3 - 1, -1873784752);
                    this.a.b(string, n5, n6, 0xE0E0E0);
                }
                ++n2;
            }
            if (arrstring != null) continue;
        }
    }

    private int a(int n2, int n3, float f10) {
        int n4 = n2 >> 24 & 0xFF;
        int n5 = n2 >> 16 & 0xFF;
        int n6 = n2 >> 8 & 0xFF;
        int n7 = n2 & 0xFF;
        int n8 = n3 >> 24 & 0xFF;
        int n9 = n3 >> 16 & 0xFF;
        int n10 = n3 >> 8 & 0xFF;
        int n11 = n3 & 0xFF;
        int n12 = h.c((int)((float)n4 + (float)(n8 - n4) * f10), 0, 255);
        int n13 = h.c((int)((float)n5 + (float)(n9 - n5) * f10), 0, 255);
        int n14 = h.c((int)((float)n6 + (float)(n10 - n6) * f10), 0, 255);
        int n15 = h.c((int)((float)n7 + (float)(n11 - n7) * f10), 0, 255);
        return n12 << 24 | n13 << 16 | n14 << 8 | n15;
    }

    private void d() {
    }

    protected List<String> b() {
        ArrayList arrayList;
        block35: {
            n n2;
            Object object;
            block37: {
                i i2;
                String[] arrstring;
                block36: {
                    block34: {
                        Q q2;
                        block32: {
                            block33: {
                                block24: {
                                    block25: {
                                        int n3;
                                        block26: {
                                            block27: {
                                                boolean bl2;
                                                block28: {
                                                    block29: {
                                                        boolean bl3;
                                                        net.minecraft.ah.h h2;
                                                        block30: {
                                                            c c10;
                                                            block31: {
                                                                n n4 = new n(this.g.Z().a, this.g.Z().m().b, this.g.Z().ax);
                                                                arrstring = q.b();
                                                                Q q3 = this.g;
                                                                if (arrstring != null) {
                                                                    if (q3.E()) {
                                                                        return Lists.newArrayList((Object[])new String[]{"Minecraft 1.12.2 (" + this.g.N() + "/" + K.a() + ")", this.g.j, this.g.a2.a(), this.g.a2.u(), "P: " + this.g.au.a() + ". T: " + this.g.e.q(), this.g.e.m(), "", String.format("Chunk-relative: %d %d %d", n4.e() & 0xF, n4.b() & 0xF, n4.a() & 0xF)});
                                                                    }
                                                                    q3 = this.g;
                                                                }
                                                                x x2 = q3.Z();
                                                                aA aA2 = x2.K();
                                                                String string = "Invalid";
                                                                int n5 = o.a[aA2.ordinal()];
                                                                if (arrstring != null) {
                                                                    switch (n5) {
                                                                        case 1: {
                                                                            string = "Towards negative Z";
                                                                            if (arrstring != null) break;
                                                                        }
                                                                        case 2: {
                                                                            string = "Towards positive Z";
                                                                            if (arrstring != null) break;
                                                                        }
                                                                        case 3: {
                                                                            string = "Towards negative X";
                                                                            if (arrstring != null) break;
                                                                        }
                                                                        case 4: {
                                                                            string = "Towards positive X";
                                                                        }
                                                                    }
                                                                    n5 = 11;
                                                                }
                                                                Object[] arrobject = new String[n5];
                                                                StringBuilder stringBuilder = new StringBuilder().append("Minecraft 1.12.2 (").append(this.g.N()).append("/").append(K.a());
                                                                String string2 = "release";
                                                                if (arrstring != null) {
                                                                    string2 = string2.equalsIgnoreCase(this.g.l()) ? "" : "/" + this.g.l();
                                                                }
                                                                arrobject[0] = stringBuilder.append(string2).append(")").toString();
                                                                arrobject[1] = this.g.j;
                                                                arrobject[2] = this.g.a2.a();
                                                                arrobject[3] = this.g.a2.u();
                                                                arrobject[4] = "P: " + this.g.au.a() + ". T: " + this.g.e.q();
                                                                arrobject[5] = this.g.e.m();
                                                                arrobject[6] = "";
                                                                arrobject[7] = String.format("XYZ: %.3f / %.5f / %.3f", this.g.Z().a, this.g.Z().m().b, this.g.Z().ax);
                                                                arrobject[8] = String.format("Block: %d %d %d", n4.e(), n4.b(), n4.a());
                                                                arrobject[9] = String.format("Chunk: %d %d %d in %d %d %d", n4.e() & 0xF, n4.b() & 0xF, n4.a() & 0xF, n4.e() >> 4, n4.b() >> 4, n4.a() >> 4);
                                                                arrobject[10] = String.format("Facing: %s (%s) (%.1f / %.1f)", aA2, string, Float.valueOf(h.b(x2.e)), Float.valueOf(h.b(x2.at)));
                                                                arrayList = Lists.newArrayList((Object[])arrobject);
                                                                q2 = this.g;
                                                                if (arrstring == null) break block24;
                                                                if (q2.e == null) break block25;
                                                                object = this.g.e.b(n4);
                                                                n3 = this.g.e.n(n4);
                                                                if (arrstring == null) break block25;
                                                                if (n3 == 0) break block26;
                                                                n3 = n4.b();
                                                                if (arrstring == null) break block25;
                                                                if (n3 < 0) break block26;
                                                                n3 = n4.b();
                                                                if (arrstring == null) break block25;
                                                                if (n3 >= 256) break block26;
                                                                bl2 = ((net.minecraft.o.a)object).y();
                                                                if (arrstring == null) break block27;
                                                                if (bl2) break block28;
                                                                arrayList.add("Biome: " + ((net.minecraft.o.a)object).a(n4, this.g.e.B()).n());
                                                                arrayList.add("Light: " + ((net.minecraft.o.a)object).a(n4, 0) + " (" + ((net.minecraft.o.a)object).a(net.minecraft.ah.c.SKY, n4) + " sky, " + ((net.minecraft.o.a)object).a(net.minecraft.ah.c.BLOCK, n4) + " block)");
                                                                h2 = this.g.e.h(n4);
                                                                bl3 = this.g.n();
                                                                if (arrstring == null) break block29;
                                                                if (!bl3) break block30;
                                                                c10 = this.g.ae();
                                                                if (arrstring == null) break block31;
                                                                if (c10 == null) break block30;
                                                                c10 = this.g.ae();
                                                            }
                                                            k k2 = c10.O().a(this.g.s.u());
                                                            if (arrstring == null) break block29;
                                                            if (k2 != null) {
                                                                h2 = k2.aG.h(new n(k2));
                                                            }
                                                        }
                                                        bl3 = arrayList.add(String.format("Local Difficulty: %.2f // %.2f (Day %d)", Float.valueOf(h2.a()), Float.valueOf(h2.b()), this.g.e.s() / 24000L));
                                                    }
                                                    if (arrstring != null) break block25;
                                                }
                                                bl2 = arrayList.add("Waiting for chunk...");
                                            }
                                            if (arrstring != null) break block25;
                                        }
                                        n3 = arrayList.add("Outside of world...") ? 1 : 0;
                                    }
                                    q2 = this.g;
                                }
                                if (arrstring == null) break block32;
                                if (q2.Y == null) break block33;
                                q2 = this.g;
                                if (arrstring == null) break block32;
                                if (q2.Y.e()) {
                                    arrayList.add("Shader: " + this.g.Y.a().b());
                                }
                            }
                            q2 = this.g;
                        }
                        i2 = q2.ao;
                        if (arrstring == null) break block34;
                        if (i2 == null) break block35;
                        i2 = this.g.ao;
                    }
                    if (arrstring == null) break block36;
                    if (i2.d != j.BLOCK) break block35;
                    i2 = this.g.ao;
                }
                n2 = i2.a();
                if (arrstring == null) break block37;
                if (n2 == null) break block35;
                n2 = this.g.ao.a();
            }
            object = n2;
            arrayList.add(String.format("Looking at: %d %d %d", ((m)object).e(), ((m)object).b(), ((m)object).a()));
        }
        return arrayList;
    }

    private static long a(long l2) {
        return l2 / 1024L / 1024L;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void b(l l2) {
        this.g.an.b("debug");
        v.M();
        String[] arrstring = q.b();
        this.c();
        String[] arrstring2 = arrstring;
        this.a(l2);
        v.B();
        Q q2 = this.g;
        if (arrstring2 != null) {
            if (q2.ac.P) {
                this.d();
            }
            q2 = this.g;
        }
        q2.an.c();
    }
}

