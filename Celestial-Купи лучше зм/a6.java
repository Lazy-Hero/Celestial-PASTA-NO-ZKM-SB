/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;
import net.minecraft.k.m;

public class a6 {
    private final /* synthetic */ ArrayList<fx> a;

    public List a() {
        return this.a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean a(String string) {
        int n2;
        block7: {
            String string2 = string.substring(1);
            String[] arrstring = string2.split(" ");
            String string3 = e2.f();
            n2 = arrstring.length;
            if (string3 == null) {
                if (n2 > 0) {
                    ArrayList<fx> arrayList = this.a;
                    int n3 = 0;
                    int n4 = arrayList.size();
                    block0: while (true) {
                        int n5 = n3;
                        block1: while (n5 < n4) {
                            String[] arrstring2;
                            e2 e22 = (e2)arrayList.get(n3);
                            String[] arrstring3 = arrstring2 = e22.b();
                            int n6 = arrstring3.length;
                            n2 = 0;
                            if (string3 != null) break block7;
                            int n7 = n2;
                            while (n7 < n6) {
                                String string4 = arrstring3[n7];
                                if (string3 == null) {
                                    n5 = arrstring[0].equalsIgnoreCase(string4) ? 1 : 0;
                                    if (string3 != null) continue block1;
                                    if (n5 != 0) {
                                        e22.a(arrstring);
                                        return true;
                                    }
                                    ++n7;
                                }
                                if (string3 == null) continue;
                            }
                            ++n3;
                            if (string3 == null) continue block0;
                        }
                        break;
                    }
                }
                n2 = 0;
            }
        }
        return n2 != 0;
    }

    public a6() {
        String string = e2.f();
        this.a = new ArrayList();
        af.a(new aH(this));
        this.a.add(new eq());
        this.a.add(new eW());
        this.a.add(new eh());
        this.a.add(new ez());
        String string2 = string;
        this.a.add(new e0());
        if (string2 != null) {
            m.b(!m.c());
        }
    }
}

