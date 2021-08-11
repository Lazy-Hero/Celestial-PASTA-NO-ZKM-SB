/*
 * Decompiled with CFR 0.150.
 */
package net;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import net.I;
import net.J;
import net.K;
import net.L;
import net.N;
import net.O;
import net.P;
import net.Q;
import net.R;
import net.S;
import net.T;
import net.U;
import net.V;
import net.W;
import net.X;
import net.Y;
import net.Z;
import net.a0;
import net.a1;
import net.a2;
import net.a3;
import net.a4;
import net.a5;
import net.a6;
import net.a7;
import net.a9;
import net.aA;
import net.aC;
import net.aD;
import net.aE;
import net.aF;
import net.aG;
import net.aH;
import net.aK;
import net.aM;
import net.aN;
import net.aO;
import net.aQ;
import net.aR;
import net.aS;
import net.aT;
import net.aV;
import net.aW;
import net.aX;
import net.aY;
import net.aZ;
import net.a_;
import net.aa;
import net.ab;
import net.ad;
import net.ae;
import net.ag;
import net.ah;
import net.ai;
import net.aj;
import net.ak;
import net.al;
import net.am;
import net.an;
import net.ap;
import net.ar;
import net.as;
import net.at;
import net.au;
import net.av;
import net.aw;
import net.ay;
import net.az;

public class aP {
    private static final /* synthetic */ Map<String, I> a;

    private static Map<String, I> b() {
        LinkedHashMap<String, I> linkedHashMap = new LinkedHashMap<String, I>();
        aP.a(linkedHashMap, new J());
        aP.a(linkedHashMap, new L());
        aP.a(linkedHashMap, new W());
        aP.a(linkedHashMap, new X());
        aP.a(linkedHashMap, new as());
        aP.a(linkedHashMap, new a1());
        aP.a(linkedHashMap, new az());
        aP.a(linkedHashMap, new aw());
        aP.a(linkedHashMap, new av());
        aP.a(linkedHashMap, new an());
        aP.a(linkedHashMap, new aE());
        aP.a(linkedHashMap, new a6());
        aP.a(linkedHashMap, new N());
        aP.a(linkedHashMap, new a9());
        aP.a(linkedHashMap, new aD());
        aP.a(linkedHashMap, new aA());
        aP.a(linkedHashMap, new aC());
        aP.a(linkedHashMap, new aa());
        aP.a(linkedHashMap, new aF());
        aP.a(linkedHashMap, new O());
        aP.a(linkedHashMap, new aV());
        aP.a(linkedHashMap, new ay());
        aP.a(linkedHashMap, new a0());
        aP.a(linkedHashMap, new ak());
        aP.a(linkedHashMap, new a2());
        aP.a(linkedHashMap, new aR());
        aP.a(linkedHashMap, new aW());
        aP.a(linkedHashMap, new a_());
        aP.a(linkedHashMap, new ae());
        aP.a(linkedHashMap, new ah());
        aP.a(linkedHashMap, new a3());
        aP.a(linkedHashMap, new P());
        aP.a(linkedHashMap, new am());
        aP.a(linkedHashMap, new a5());
        aP.a(linkedHashMap, new ab());
        aP.a(linkedHashMap, new a4());
        aP.a(linkedHashMap, new aN());
        aP.a(linkedHashMap, new aZ());
        aP.a(linkedHashMap, new Q());
        aP.a(linkedHashMap, new aG());
        aP.a(linkedHashMap, new ai());
        aP.a(linkedHashMap, new ad());
        aP.a(linkedHashMap, new ap());
        aP.a(linkedHashMap, new aK());
        aP.a(linkedHashMap, new R());
        aP.a(linkedHashMap, new S());
        aP.a(linkedHashMap, new ar());
        aP.a(linkedHashMap, new aT());
        aP.a(linkedHashMap, new aM());
        aP.a(linkedHashMap, new aY());
        aP.a(linkedHashMap, new T());
        aP.a(linkedHashMap, new aj());
        aP.a(linkedHashMap, new aQ());
        aP.a(linkedHashMap, new U());
        aP.a(linkedHashMap, new at());
        aP.a(linkedHashMap, new V());
        aP.a(linkedHashMap, new aS());
        aP.a(linkedHashMap, new K());
        aP.a(linkedHashMap, new Y());
        aP.a(linkedHashMap, new Z());
        aP.a(linkedHashMap, new au());
        aP.a(linkedHashMap, new al());
        aP.a(linkedHashMap, new aH());
        aP.a(linkedHashMap, new a7());
        aP.a(linkedHashMap, new aX());
        aP.a(linkedHashMap, new aO());
        aP.a(linkedHashMap, new ag());
        return linkedHashMap;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static I a(String string) {
        return a.get(string);
    }

    private static void a(Map<String, I> map, I i2) {
        if (map.containsKey(i2.a())) {
            fU.h("Model adapter already registered for id: " + i2.a() + ", class: " + i2.b().getName());
        }
        map.put(i2.a(), i2);
    }

    static {
        a = aP.b();
    }

    public static String[] a() {
        Set<String> set = a.keySet();
        String[] arrstring = set.toArray(new String[set.size()]);
        return arrstring;
    }
}

