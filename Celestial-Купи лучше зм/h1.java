/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.minecraft.ar.aA;
import net.minecraft.client.x.P;
import net.minecraft.client.x.Y;
import net.minecraft.client.x.a;

public class h1 {
    public static void b(Y y2) {
        block5: {
            String string;
            block6: {
                string = K.d();
                if (string != null) break block6;
                if (y2 == null) break block5;
                fU.b("Model: " + y2 + ", ao: " + y2.b() + ", gui3d: " + y2.d() + ", builtIn: " + y2.a() + ", particle: " + y2.f());
            }
            aA[] arraA = aA.VALUES;
            for (int i2 = 0; i2 < arraA.length; ++i2) {
                aA aA2 = arraA[i2];
                List<P> list = y2.a(null, aA2, 0L);
                h1.a(aA2.a(), list, "  ");
                if (string == null) {
                    if (string == null) continue;
                }
                break block5;
            }
            List<P> list = y2.a(null, null, 0L);
            h1.a("General", list, "  ");
        }
    }

    public static void a(int[] arrn, String string) {
        String string2 = K.d();
        int n2 = arrn.length / 4;
        fU.b(string + "Length: " + arrn.length + ", step: " + n2);
        String string3 = string2;
        for (int i2 = 0; i2 < 4; ++i2) {
            int n3 = i2 * n2;
            float f10 = Float.intBitsToFloat(arrn[n3 + 0]);
            float f11 = Float.intBitsToFloat(arrn[n3 + 1]);
            float f12 = Float.intBitsToFloat(arrn[n3 + 2]);
            int n4 = arrn[n3 + 3];
            float f13 = Float.intBitsToFloat(arrn[n3 + 4]);
            float f14 = Float.intBitsToFloat(arrn[n3 + 5]);
            fU.b(string + i2 + " xyz: " + f10 + "," + f11 + "," + f12 + " col: " + n4 + " u,v: " + f13 + "," + f14);
            if (string3 == null) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static P a(P p2) {
        P p3 = new P((int[])p2.d().clone(), p2.q(), p2.b(), p2.p());
        return p3;
    }

    public static Y a(Y y2) {
        List list = h1.a(y2.a(null, null, 0L));
        aA[] arraA = aA.VALUES;
        String string = K.d();
        HashMap<aA, List<P>> hashMap = new HashMap<aA, List<P>>();
        for (int i2 = 0; i2 < arraA.length; ++i2) {
            aA aA2 = arraA[i2];
            List<P> list2 = y2.a(null, aA2, 0L);
            List list3 = h1.a(list2);
            hashMap.put(aA2, list3);
            if (string == null) continue;
        }
        a a10 = new a(list, hashMap, y2.b(), y2.d(), y2.f(), y2.c(), y2.e());
        return a10;
    }

    public static void a(String string, P p2, String string2) {
        fU.b(string2 + "Quad: " + p2.getClass().getName() + ", type: " + string + ", face: " + p2.b() + ", tint: " + p2.q() + ", sprite: " + p2.p());
        h1.a(p2.d(), "  " + string2);
    }

    public static List a(List list) {
        ArrayList<P> arrayList;
        block2: {
            ArrayList<P> arrayList2 = new ArrayList<P>();
            Iterator iterator = list.iterator();
            String string = K.d();
            while (iterator.hasNext()) {
                Object e10 = iterator.next();
                P p2 = h1.a((P)e10);
                arrayList = arrayList2;
                if (string == null) {
                    arrayList.add(p2);
                    if (string == null) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    private static void a(String string, List list, String string2) {
        Iterator iterator = list.iterator();
        String string3 = K.d();
        while (iterator.hasNext()) {
            Object e10 = iterator.next();
            h1.a(string, (P)e10, string2);
            if (string3 == null) continue;
        }
    }
}

