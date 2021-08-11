/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class N {
    private static /* synthetic */ ArrayList<hH> a;

    public void b(hH hH2) {
        a.add(hH2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(hH hH2) {
        a.add(hH2);
    }

    public ArrayList<hH> a(bE bE2) {
        ArrayList<hH> arrayList;
        block9: {
            boolean bl2;
            ArrayList<hH> arrayList2;
            block8: {
                arrayList2 = new ArrayList<hH>();
                Iterator<hH> iterator = N.a().iterator();
                String[] arrstring = hH.t();
                while (iterator.hasNext()) {
                    hH hH2 = iterator.next();
                    bl2 = hH2.j().equals(bE2);
                    if (arrstring == null) {
                        if (arrstring == null && bl2) {
                            arrayList2.add(hH2);
                        }
                        if (arrstring == null) continue;
                    }
                    break block8;
                }
                arrayList = arrayList2;
                if (arrstring != null) break block9;
                bl2 = arrayList.isEmpty();
            }
            if (bl2) {
                return null;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public N() {
        a = new ArrayList();
    }

    public hH a(String string) {
        block3: {
            Iterator<hH> iterator = N.a().iterator();
            String[] arrstring = hH.t();
            while (iterator.hasNext()) {
                block5: {
                    hH hH2;
                    block4: {
                        hH hH3 = iterator.next();
                        if (arrstring != null) break block3;
                        hH2 = hH3;
                        if (arrstring != null) break block4;
                        if (!hH2.a().equalsIgnoreCase(string)) break block5;
                        hH2 = hH3;
                    }
                    return hH2;
                }
                if (arrstring == null) continue;
            }
            System.err.println("[] Error Setting NOT found: '" + string + "'!");
        }
        return null;
    }

    public static ArrayList<hH> a() {
        return a;
    }
}

