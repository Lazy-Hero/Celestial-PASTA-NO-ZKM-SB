/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Q;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a5;
import net.minecraft.client.b.aW;
import net.minecraft.client.b.s;
import net.minecraft.client.l.f;

public class fN {
    private /* synthetic */ long d;
    private /* synthetic */ L a;
    private /* synthetic */ int c;
    private /* synthetic */ int b;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String[] a(String string) {
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        block4: {
            arrayList2 = new ArrayList<String>();
            int n2 = 0;
            String string2 = K.d();
            while (n2 < 10) {
                String string3 = string + ".tooltip." + (n2 + 1);
                String string4 = gl.a(string3, null);
                if (string2 == null) {
                    if (string2 == null) {
                        if (string4 == null && string2 == null) break;
                        arrayList2.add(string4);
                        ++n2;
                    }
                    if (string2 == null) continue;
                }
                break block4;
            }
            arrayList = arrayList2;
            if (string2 != null) return arrayList.toArray(new String[arrayList2.size()]);
            if (arrayList.size() <= 0) {
                return null;
            }
        }
        arrayList = arrayList2;
        return arrayList.toArray(new String[arrayList2.size()]);
    }

    public fN(L l2) {
        this.a = null;
        this.c = 0;
        this.b = 0;
        this.d = 0L;
        this.a = l2;
    }

    public void b(int n2, int n3, List list) {
        block11: {
            block12: {
                block13: {
                    String string;
                    block16: {
                        s s2;
                        int n4;
                        int n5;
                        int n6;
                        long l2;
                        block17: {
                            s s3;
                            long l3;
                            block15: {
                                int n7;
                                block14: {
                                    string = K.d();
                                    if (string != null) break block12;
                                    if (Math.abs(n2 - this.c) > 5) break block13;
                                    n7 = Math.abs(n3 - this.b);
                                    if (string != null) break block14;
                                    if (n7 > 5) break block13;
                                    n7 = 700;
                                }
                                int n8 = n7;
                                long l4 = System.currentTimeMillis() - (this.d + (long)n8);
                                l3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                                if (string != null) break block15;
                                if (l3 < 0) break block16;
                                l3 = L.h / 2 - 150;
                            }
                            l2 = l3;
                            n6 = L.w / 6 - 7;
                            int n9 = n3;
                            int n10 = n6 + 98;
                            if (string == null) {
                                if (n9 <= n10) {
                                    n6 += 105;
                                }
                                n9 = (int)(l2 + 150);
                                n10 = 150;
                            }
                            n5 = n9 + n10;
                            n4 = n6 + 84 + 10;
                            s2 = s3 = this.a(n2, n3, list);
                            if (string != null) break block17;
                            if (!(s2 instanceof gA)) break block16;
                            s2 = s3;
                        }
                        gA gA2 = (gA)((Object)s2);
                        f f10 = gA2.a();
                        String[] arrstring = fN.a(f10);
                        if (string == null) {
                            if (arrstring == null) {
                                return;
                            }
                            aW.a((int)l2, n6, n5, n4, -536870912);
                        }
                        for (int i2 = 0; i2 < arrstring.length; ++i2) {
                            int n11;
                            String string2;
                            block19: {
                                int n12;
                                block18: {
                                    string2 = arrstring[i2];
                                    n11 = 0xDDDDDD;
                                    if (string != null) break block11;
                                    n12 = string2.endsWith("!");
                                    if (string != null) break block18;
                                    if (n12 == 0) break block19;
                                    n12 = 0xFF2020;
                                }
                                n11 = n12;
                            }
                            a5 a52 = Q.P().a6;
                            a52.c(string2, l2 + 5, n6 + 5 + i2 * 11, n11);
                            if (string == null) continue;
                        }
                    }
                    if (string == null) break block11;
                }
                this.c = n2;
                this.b = n3;
            }
            this.d = System.currentTimeMillis();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private static String[] a(f f10) {
        return fN.a(f10.d());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private s a(int var1_1, int var2_2, List var3_3) {
        var5_4 = 0;
        var4_5 = K.d();
        do {
            block9: {
                block8: {
                    block7: {
                        block6: {
                            if (var5_4 >= var3_3.size()) return null;
                            var6_6 = (s)var3_3.get(var5_4);
                            var7_7 = aW.a(var6_6);
                            var8_8 = aW.b(var6_6);
                            v0 = var1_1;
                            v1 = var6_6.o;
                            if (var4_5 != null) break block6;
                            if (v0 < v1) ** GOTO lbl-1000
                            v0 = var2_2;
                            v1 = var6_6.r;
                        }
                        if (var4_5 != null) break block7;
                        if (v0 < v1) ** GOTO lbl-1000
                        v0 = var1_1;
                        v1 = var6_6.o + var7_7;
                    }
                    if (var4_5 != null) break block8;
                    if (v0 >= v1) ** GOTO lbl-1000
                    v0 = var2_2;
                    if (var4_5 != null) break block9;
                    v1 = var6_6.r + var8_8;
                }
                ** if (v0 >= v1) goto lbl-1000
lbl-1000:
                // 1 sources

                {
                    v0 = 1;
                    ** GOTO lbl31
                }
lbl-1000:
                // 4 sources

                {
                    v0 = var9_9 = 0;
                }
            }
            if (var4_5 != null) continue;
            if (var9_9 != 0) {
                return var6_6;
            }
            ++var5_4;
        } while (var4_5 == null);
        return null;
    }
}

