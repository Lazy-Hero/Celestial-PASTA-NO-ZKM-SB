/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Vector3f
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.minecraft.W.cI;
import net.minecraft.ar.aA;
import net.minecraft.client.j.c;
import net.minecraft.client.j.j;
import net.minecraft.client.x.N;
import net.minecraft.client.x.P;
import net.minecraft.client.x.Q;
import net.minecraft.client.x.Y;
import net.minecraft.client.x.a;
import net.minecraft.client.x.a1;
import net.minecraft.client.x.au;
import net.minecraft.client.x.b;
import net.minecraft.client.x.g;
import net.minecraft.client.x.w;
import net.minecraft.client.x.x;
import net.minecraft.client.x.y;
import net.minecraft.client.x.z;
import net.minecraft.k.k;
import net.minecraft.k.n;
import org.lwjgl.util.vector.Vector3f;

public class fM {
    private static final /* synthetic */ float a = 1.0E-6f;

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void a(Vector3f vector3f) {
        vector3f.setX(fM.a(vector3f.getX()));
        vector3f.setY(fM.a(vector3f.getY()));
        vector3f.setZ(fM.a(vector3f.getZ()));
    }

    public static P a(aA aA2, c c10, int n2) {
        Vector3f vector3f = new Vector3f(0.0f, 0.0f, 0.0f);
        Vector3f vector3f2 = new Vector3f(16.0f, 16.0f, 16.0f);
        au au2 = new au(new float[]{0.0f, 0.0f, 16.0f, 16.0f}, 0);
        z z2 = new z(aA2, n2, "#" + aA2.a(), au2);
        g g10 = g.X0_Y0;
        w w2 = null;
        boolean bl2 = false;
        boolean bl3 = true;
        N n3 = new N();
        P p2 = n3.a(vector3f, vector3f2, z2, c10, aA2, g10, w2, bl2, bl3);
        return p2;
    }

    public static Y a(String string, String string2, String string3) {
        j j2 = fU.aX().an();
        c c10 = j2.d(string2);
        c c11 = j2.d(string3);
        return fM.a(string, c10, c11);
    }

    private static void a(List<P> list, c c10, c c11) {
        block3: {
            ArrayList<P> arrayList = new ArrayList<P>();
            String string = K.d();
            for (P p2 : list) {
                block5: {
                    block4: {
                        if (string != null) break block3;
                        if (string != null) break block4;
                        if (p2.p() == c10) break block5;
                        arrayList.add(p2);
                    }
                    if (string == null) break;
                }
                Q q2 = new Q(p2, c11);
                arrayList.add(q2);
                if (string == null) continue;
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static float a(float var0) {
        block11: {
            block10: {
                var1_1 = K.d();
                cfr_temp_0 = var0 - -1.0E-6f;
                v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                if (var1_1 == null) {
                    if (v0 > 0) {
                        cfr_temp_1 = var0 - 1.0E-6f;
                        v0 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                        if (var1_1 == null) {
                            if (v0 < 0) {
                                return 0.0f;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = (cfr_temp_2 = var0 - 0.999999f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                    }
                }
                if (var1_1 != null) break block10;
                if (v0 <= 0) break block11;
                v1 = var0;
                if (var1_1 != null) return v1;
                cfr_temp_3 = v1 - 1.000001f;
                v0 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1);
            }
            if (v0 < 0) {
                return 1.0f;
            }
        }
        v1 = var0;
        return v1;
    }

    public static Y a(Y y2, Y y3) {
        Object object;
        int n2;
        HashMap<aA, List<P>> hashMap;
        ArrayList<P> arrayList;
        block2: {
            arrayList = new ArrayList<P>();
            arrayList.addAll(y2.a(null, null, 0L));
            arrayList.addAll(y3.a(null, null, 0L));
            aA[] arraA = aA.VALUES;
            String string = K.d();
            hashMap = new HashMap<aA, List<P>>();
            for (n2 = 0; n2 < arraA.length; ++n2) {
                aA aA2 = arraA[n2];
                object = new ArrayList<P>();
                object.addAll(y2.a(null, aA2, 0L));
                object.addAll(y3.a(null, aA2, 0L));
                hashMap.put(aA2, (List<P>)object);
                if (string == null) {
                    if (string == null) continue;
                }
                break block2;
            }
            n2 = y2.b() ? 1 : 0;
        }
        boolean bl2 = y2.a();
        object = y2.f();
        y y4 = y2.c();
        a1 a12 = y2.e();
        a a10 = new a(arrayList, hashMap, n2 != 0, bl2, (c)object, y4, a12);
        return a10;
    }

    public static Y a(String string, int n2) {
        c c10 = fU.aX().an().b(string);
        return fM.a(c10, n2);
    }

    public static k a(k k2, cI cI2, n n2) {
        int n3 = n2.e();
        int n4 = n2.a();
        long l2 = (long)(n3 * 3129871) ^ (long)n4 * 116129781L;
        l2 = l2 * l2 * 42317861L + l2 * 11L;
        double d10 = ((double)((float)(l2 >> 16 & 0xFL) / 15.0f) - 0.5) * 0.5;
        double d11 = ((double)((float)(l2 >> 24 & 0xFL) / 15.0f) - 0.5) * 0.5;
        double d12 = 0.0;
        if (cI2 == cI.XYZ) {
            d12 = ((double)((float)(l2 >> 20 & 0xFL) / 15.0f) - 1.0) * 0.2;
        }
        return k2.c(d10, d12, d11);
    }

    public static Y a(String string, c c10, c c11) {
        block6: {
            block8: {
                List<P> list;
                Y y2;
                block4: {
                    Y y3;
                    String string2;
                    block9: {
                        Y y4;
                        x x2;
                        block7: {
                            c c12;
                            block5: {
                                string2 = K.d();
                                c12 = c10;
                                if (string2 != null) break block5;
                                if (c12 == null) break block6;
                                c12 = c11;
                            }
                            if (c12 == null) break block6;
                            x2 = fU.a2();
                            if (x2 == null) {
                                return null;
                            }
                            net.minecraft.client.x.n n2 = new net.minecraft.client.x.n(string, "normal");
                            y3 = y4 = x2.a(n2);
                            if (string2 != null) break block7;
                            if (y3 == null) break block8;
                            y3 = y4;
                        }
                        if (string2 != null) break block9;
                        if (y3 == x2.c()) break block8;
                        y3 = h1.a(y4);
                    }
                    y2 = y3;
                    aA[] arraA = aA.VALUES;
                    for (int i2 = 0; i2 < arraA.length; ++i2) {
                        List<P> list2;
                        aA aA2 = arraA[i2];
                        list = list2 = y2.a(null, aA2, 0L);
                        if (string2 == null) {
                            fM.a(list, c10, c11);
                            if (string2 == null) continue;
                        }
                        break block4;
                    }
                    list = y2.a(null, null, 0L);
                }
                List<P> list3 = list;
                fM.a(list3, c10, c11);
                return y2;
            }
            return null;
        }
        return null;
    }

    public static Y a(c c10, int n2) {
        Object object;
        ArrayList<P> arrayList = new ArrayList<P>();
        aA[] arraA = aA.VALUES;
        String string = K.d();
        HashMap<aA, List<P>> hashMap = new HashMap<aA, List<P>>();
        for (int i2 = 0; i2 < arraA.length; ++i2) {
            object = arraA[i2];
            ArrayList<P> arrayList2 = new ArrayList<P>();
            arrayList2.add(fM.a((aA)object, c10, n2));
            hashMap.put((aA)object, arrayList2);
            if (string == null) continue;
        }
        a1 a12 = new a1(new ArrayList<b>());
        object = new a(arrayList, hashMap, true, true, c10, y.e, a12);
        return object;
    }
}

