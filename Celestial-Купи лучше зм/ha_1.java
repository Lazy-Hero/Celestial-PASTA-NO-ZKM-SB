/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.A.h;
import net.minecraft.W.af;
import net.minecraft.W.al;
import net.minecraft.Z.i;
import net.minecraft.ae.a;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.p;
import net.minecraft.ar.v;
import net.minecraft.u.d;
import net.minecraft.u.g;

public class ha {
    private /* synthetic */ String a;

    public aC a(String string, aC aC2) {
        aC aC3;
        block6: {
            String string2 = K.d();
            String string3 = string;
            if (string2 == null) {
                if (string3 == null) {
                    return aC2;
                }
                string3 = string.toLowerCase().trim();
            }
            string = string3;
            aC[] arraC = aC.values();
            int n2 = 0;
            while (n2 < arraC.length) {
                aC3 = arraC[n2];
                if (string2 == null) {
                    aC aC4 = aC3;
                    if (string2 == null) {
                        if (string.equals(aC4.name().toLowerCase())) {
                            return aC4;
                        }
                        ++n2;
                    }
                    if (string2 == null) continue;
                }
                break block6;
            }
            aC3 = aC2;
        }
        return aC3;
    }

    public int[] k(String string) {
        int[] arrn;
        block13: {
            int n2;
            ArrayList<Integer> arrayList;
            String string2;
            block11: {
                string2 = K.d();
                if (string == null) {
                    return null;
                }
                arrayList = new ArrayList<Integer>();
                String[] arrstring = fU.c(string, " ,");
                for (int i2 = 0; i2 < arrstring.length; ++i2) {
                    int n3;
                    String string3;
                    block14: {
                        block15: {
                            block12: {
                                block19: {
                                    int n4;
                                    int n5;
                                    block21: {
                                        int n6;
                                        int n7;
                                        block20: {
                                            block18: {
                                                int n8;
                                                String[] arrstring2;
                                                block16: {
                                                    block17: {
                                                        string3 = arrstring[i2];
                                                        n2 = (int)((string3.contains("-") ? true : false) ? true : false);
                                                        if (string2 != null) break block11;
                                                        if (string2 != null) break block14;
                                                        if (n2 == 0) break block15;
                                                        arrstring2 = fU.c(string3, "-");
                                                        n8 = arrstring2.length;
                                                        if (string2 != null) break block16;
                                                        if (n8 == 2) break block17;
                                                        this.g("Invalid interval: " + string3 + ", when parsing: " + string);
                                                        if (string2 == null) break block12;
                                                    }
                                                    n8 = fU.b(arrstring2[0], -1);
                                                }
                                                n7 = n8;
                                                n5 = fU.b(arrstring2[1], -1);
                                                n6 = n7;
                                                if (string2 != null) break block18;
                                                if (n6 < 0) break block19;
                                                n6 = n5;
                                            }
                                            if (string2 != null) break block20;
                                            if (n6 < 0) break block19;
                                            n6 = n7;
                                        }
                                        if (string2 != null) break block21;
                                        if (n6 > n5) break block19;
                                        n6 = n4 = n7;
                                    }
                                    while (n4 <= n5) {
                                        arrayList.add(n4);
                                        ++n4;
                                        if (string2 == null) {
                                            if (string2 == null) continue;
                                        }
                                        break block12;
                                    }
                                    if (string2 == null) break block12;
                                }
                                this.g("Invalid interval: " + string3 + ", when parsing: " + string);
                            }
                            if (string2 == null) continue;
                        }
                        n3 = fU.b(string3, -1);
                    }
                    void var7_10 = n3;
                    int n9 = var7_10;
                    if (string2 != null) continue;
                    if (n9 < 0) {
                        this.g("Invalid number: " + string3 + ", when parsing: " + string);
                        if (string2 == null) continue;
                    }
                    n9 = arrayList.add((int)var7_10);
                    if (string2 == null) continue;
                }
                n2 = arrayList.size();
            }
            int[] arrn2 = new int[n2];
            for (int i3 = 0; i3 < arrn2.length; ++i3) {
                arrn = arrn2;
                if (string2 == null) {
                    arrn[i3] = (Integer)arrayList.get(i3);
                    if (string2 == null) continue;
                }
                break block13;
            }
            arrn = arrn2;
        }
        return arrn;
    }

    public R[] l(String string) {
        net.minecraft.W.K[] arrk;
        int n2;
        String string2;
        String[] arrstring;
        String string3;
        block13: {
            int n3;
            block11: {
                block12: {
                    string3 = K.d();
                    String string4 = string;
                    if (string3 == null) {
                        if (string4 == null) {
                            return null;
                        }
                        string4 = string = string.trim();
                    }
                    if (string3 == null) {
                        if (string4.length() <= 0) {
                            return null;
                        }
                        string4 = string;
                    }
                    arrstring = fU.c(string4, ":");
                    string2 = "minecraft";
                    n2 = 0;
                    n3 = arrstring.length;
                    if (string3 != null) break block11;
                    if (n3 <= 1) break block12;
                    n3 = (int)((this.a(arrstring) ? true : false) ? true : false);
                    if (string3 != null) break block11;
                    if (n3 == 0) break block12;
                    string2 = arrstring[0];
                    n2 = 1;
                    if (string3 == null) break block13;
                }
                string2 = "minecraft";
                n3 = 0;
            }
            n2 = n3;
        }
        String string5 = arrstring[n2];
        String[] arrstring2 = Arrays.copyOfRange(arrstring, n2 + 1, arrstring.length);
        net.minecraft.W.K[] arrk2 = arrk = this.a(string2, string5);
        if (string3 == null) {
            if (arrk2 == null) {
                return null;
            }
            arrk2 = arrk;
        }
        R[] arrr = new R[arrk2.length];
        for (int i2 = 0; i2 < arrk.length; ++i2) {
            R r2;
            net.minecraft.W.K k2 = arrk[i2];
            int n4 = net.minecraft.W.K.b(k2);
            int[] arrn = null;
            if (arrstring2.length > 0 && (arrn = this.a(k2, arrstring2)) == null) {
                return null;
            }
            arrr[i2] = r2 = new R(n4, arrn);
            if (string3 == null) continue;
        }
        return arrr;
    }

    public void g(String string) {
        fU.h("" + this.a + ": " + string);
    }

    private i a(net.minecraft.W.K k2, int n2) {
        String string = K.d();
        try {
            i i2 = k2.c(n2);
            net.minecraft.W.K k3 = k2;
            net.minecraft.W.K k4 = g.bW;
            if (string == null) {
                if (k3 == k4 && n2 > 7) {
                    i i3 = k2.c(n2 & 7);
                    i2 = i2.a(al.B, i3.b(al.B));
                }
                k3 = k2;
                k4 = g.ce;
            }
            if (k3 == k4 && (n2 & 8) != 0) {
                i2 = i2.a(af.A, true);
            }
            return i2;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return k2.d();
        }
    }

    public boolean a(String string) {
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return false;
            }
            string3 = string;
        }
        char c10 = string3.length();
        if (string2 == null) {
            if (c10 < '\u0001') {
                return false;
            }
            c10 = string.charAt(0);
        }
        char c11 = c10;
        return Character.isDigit(c11);
    }

    public int b(String string, int n2) {
        int n3;
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return n2;
            }
            string3 = string = string.trim();
        }
        int n4 = n3 = fU.b(string3, -1);
        if (string2 == null) {
            if (n4 < 0) {
                this.g("Invalid number: " + string);
                return n2;
            }
            n4 = n3;
        }
        return n4;
    }

    public i a(String string, i i2) {
        R[] arrr = this.l(string);
        String string2 = K.d();
        R[] arrr2 = arrr;
        if (string2 == null) {
            if (arrr2 == null) {
                return i2;
            }
            arrr2 = arrr;
        }
        if (string2 == null) {
            if (arrr2.length != 1) {
                return i2;
            }
            arrr2 = arrr;
        }
        R r2 = arrr2[0];
        int n2 = r2.a();
        net.minecraft.W.K k2 = net.minecraft.W.K.b(n2);
        return k2.d();
    }

    public static Comparable a(String string, Collection collection) {
        Iterator iterator = collection.iterator();
        String string2 = K.d();
        while (iterator.hasNext()) {
            block4: {
                Object object;
                block3: {
                    Object e10 = iterator.next();
                    object = ha.a((Comparable)e10);
                    if (string2 != null) break block3;
                    if (!object.equals(string)) break block4;
                    object = e10;
                }
                return (Comparable)object;
            }
            if (string2 == null) continue;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int c(String string, int n2) {
        String string2 = K.d();
        String string3 = string;
        if (string2 != null) return (int)(Long.parseLong(string3, 16) & 0xFFFFFFFFFFFFFFFFL);
        if (string3 == null) {
            return n2;
        }
        string = string.trim();
        try {
            string3 = string;
            return (int)(Long.parseLong(string3, 16) & 0xFFFFFFFFFFFFFFFFL);
        }
        catch (NumberFormatException numberFormatException) {
            return n2;
        }
    }

    public aA p(String string) {
        block10: {
            block13: {
                String string2;
                block16: {
                    boolean bl2;
                    block15: {
                        String string3;
                        block14: {
                            block12: {
                                block11: {
                                    block9: {
                                        string = string.toLowerCase();
                                        string3 = K.d();
                                        bl2 = string.equals("bottom");
                                        if (string3 != null) break block9;
                                        if (bl2) break block10;
                                        bl2 = string.equals("down");
                                    }
                                    if (string3 != null) break block11;
                                    if (bl2) break block10;
                                    bl2 = string.equals("top");
                                }
                                if (string3 != null) break block12;
                                if (bl2) break block13;
                                bl2 = string.equals("up");
                            }
                            if (string3 != null) break block14;
                            if (bl2) break block13;
                            bl2 = string.equals("north");
                        }
                        if (string3 == null) {
                            if (bl2) {
                                return aA.NORTH;
                            }
                            bl2 = string.equals("south");
                        }
                        if (string3 == null) {
                            if (bl2) {
                                return aA.SOUTH;
                            }
                            bl2 = string.equals("east");
                        }
                        if (string3 != null) break block15;
                        if (bl2) {
                            return aA.EAST;
                        }
                        string2 = string;
                        if (string3 != null) break block16;
                        bl2 = string2.equals("west");
                    }
                    if (bl2) {
                        return aA.WEST;
                    }
                    string2 = "Unknown face: " + string;
                }
                fU.h(string2);
                return null;
            }
            return aA.UP;
        }
        return aA.DOWN;
    }

    private e3 n(String string) {
        int n2;
        block12: {
            block11: {
                String string2 = K.d();
                String string3 = string;
                if (string2 == null) {
                    if (string3 == null) {
                        return null;
                    }
                    string3 = string;
                }
                int n3 = string3.indexOf(45);
                if (string2 == null) {
                    if (n3 >= 0) {
                        String[] arrstring = fU.c(string, "-");
                        int n4 = arrstring.length;
                        if (string2 == null) {
                            if (n4 != 2) {
                                this.g("Invalid range: " + string);
                                return null;
                            }
                            n4 = fU.b(arrstring[0], -1);
                        }
                        int n5 = n4;
                        int n6 = fU.b(arrstring[1], -1);
                        if (string2 == null) {
                            if (n5 >= 0 && n6 >= 0) {
                                return new e3(n5, n6);
                            }
                            this.g("Invalid range: " + string);
                        }
                        return null;
                    }
                    n3 = n2 = fU.b(string, -1);
                }
                if (string2 != null) break block11;
                if (n2 >= 0) break block12;
                this.g("Invalid integer: " + string);
            }
            return null;
        }
        return new e3(n2, n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean b(String string) {
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) return false;
            string3 = string.trim();
        }
        boolean bl2 = string3.equalsIgnoreCase("true");
        if (string2 != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public String h(String string) {
        int n2 = string.lastIndexOf(47);
        return n2 < 0 ? "" : string.substring(0, n2);
    }

    public Enum[] a(String string, Enum[] arrenum, String string2, Enum[] arrenum2) {
        String string3 = K.d();
        String string4 = string;
        if (string3 == null) {
            if (string4 == null) {
                return null;
            }
            string4 = string = string.toLowerCase().trim();
        }
        String[] arrstring = fU.c(string4, " ");
        Enum[] arrenum3 = (Enum[])Array.newInstance(arrenum.getClass().getComponentType(), arrstring.length);
        int n2 = 0;
        while (n2 < arrstring.length) {
            String string5 = arrstring[n2];
            Enum enum_ = this.a(string5, arrenum, string2);
            if (string3 == null) {
                if (enum_ == null) {
                    return arrenum2;
                }
                arrenum3[n2] = enum_;
                ++n2;
            }
            if (string3 == null) continue;
        }
        return arrenum3;
    }

    public boolean a(String[] arrstring) {
        String string = K.d();
        String[] arrstring2 = arrstring;
        if (string == null) {
            if (arrstring2.length < 2) {
                return false;
            }
            arrstring2 = arrstring;
        }
        String string2 = arrstring2[1];
        boolean bl2 = string2.length();
        if (string == null) {
            if (bl2 < true) {
                return false;
            }
            bl2 = this.a(string2);
        }
        if (string == null) {
            if (bl2) {
                return false;
            }
            bl2 = string2.contains("=");
        }
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    private static Object a(Comparable comparable) {
        String string = K.d();
        Comparable comparable2 = comparable;
        if (string == null) {
            if (comparable2 instanceof p) {
                p p2 = (p)((Object)comparable);
                return p2.a();
            }
            comparable2 = comparable;
        }
        return comparable2.toString();
    }

    public h[] f(String string) {
        ArrayList arrayList;
        block9: {
            String string2 = K.d();
            String string3 = string;
            if (string2 == null) {
                if (string3 == null) {
                    return null;
                }
                string3 = string.trim();
            }
            string = string3;
            boolean bl2 = false;
            String string4 = string;
            String string5 = "!";
            if (string2 == null) {
                if (string4.startsWith(string5)) {
                    bl2 = true;
                    string = string.substring(1);
                }
                string4 = string;
                string5 = " ";
            }
            String[] arrstring = fU.c(string4, string5);
            arrayList = new ArrayList();
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                h h2;
                block11: {
                    block10: {
                        String string6 = arrstring[i2];
                        h2 = this.o(string6);
                        if (string2 != null) break block9;
                        if (string2 != null) break block10;
                        if (h2 != null) break block11;
                        this.g("Biome not found: " + string6);
                    }
                    if (string2 == null) continue;
                }
                arrayList.add(h2);
                if (string2 == null) continue;
            }
            if (bl2) {
                ArrayList arrayList2 = Lists.newArrayList(h.x.iterator());
                arrayList2.removeAll(arrayList);
                arrayList = arrayList2;
            }
        }
        h[] arrh = arrayList.toArray(new h[arrayList.size()]);
        return arrh;
    }

    public boolean[] a(String string, boolean[] arrbl) {
        boolean[] arrbl2;
        block10: {
            int n2;
            EnumSet<aA> enumSet;
            String string2;
            block9: {
                string2 = K.d();
                if (string == null) {
                    return arrbl;
                }
                enumSet = EnumSet.allOf(aA.class);
                String[] arrstring = fU.c(string, " ,");
                int n3 = 0;
                while (n3 < arrstring.length) {
                    block16: {
                        block13: {
                            String string3;
                            block15: {
                                block14: {
                                    boolean bl2;
                                    block11: {
                                        block12: {
                                            string3 = arrstring[n3];
                                            n2 = (int)((string3.equals("sides") ? true : false) ? true : false);
                                            if (string2 != null) break block9;
                                            if (string2 != null) break block11;
                                            if (n2 == 0) break block12;
                                            enumSet.add(aA.NORTH);
                                            enumSet.add(aA.SOUTH);
                                            enumSet.add(aA.WEST);
                                            enumSet.add(aA.EAST);
                                            if (string2 == null) break block13;
                                        }
                                        bl2 = string3.equals("all");
                                    }
                                    if (string2 != null) break block14;
                                    if (!bl2) break block15;
                                    bl2 = enumSet.addAll(Arrays.asList(aA.VALUES));
                                }
                                if (string2 == null) break block13;
                            }
                            aA aA2 = this.p(string3);
                            if (string2 != null) break block16;
                            if (aA2 != null) {
                                enumSet.add(aA2);
                            }
                        }
                        ++n3;
                    }
                    if (string2 == null) continue;
                }
                n2 = aA.VALUES.length;
            }
            boolean[] arrbl3 = new boolean[n2];
            for (int i2 = 0; i2 < arrbl3.length; ++i2) {
                arrbl2 = arrbl3;
                if (string2 == null) {
                    arrbl2[i2] = enumSet.contains(aA.VALUES[i2]);
                    if (string2 == null) continue;
                }
                break block10;
            }
            arrbl2 = arrbl3;
        }
        return arrbl2;
    }

    public static Comparable a(String string, Class class_) {
        String string2 = K.d();
        Class class_2 = class_;
        Class class_3 = String.class;
        if (string2 == null) {
            if (class_2 == class_3) {
                return string;
            }
            class_2 = class_;
            class_3 = Boolean.class;
        }
        if (string2 == null) {
            if (class_2 == class_3) {
                return Boolean.valueOf(string);
            }
            class_2 = class_;
            class_3 = Float.class;
        }
        if (string2 == null) {
            if (class_2 == class_3) {
                return Float.valueOf(string);
            }
            class_2 = class_;
            class_3 = Double.class;
        }
        if (string2 == null) {
            if (class_2 == class_3) {
                return Double.valueOf(string);
            }
            class_2 = class_;
            class_3 = Integer.class;
        }
        if (string2 == null) {
            if (class_2 == class_3) {
                return Integer.valueOf(string);
            }
            class_2 = class_;
            class_3 = Long.class;
        }
        return class_2 == class_3 ? Long.valueOf(string) : null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(String string, int n2) {
        String string2 = K.d();
        String string3 = string;
        if (string2 != null) return Integer.parseInt(string3, 16) & 0xFFFFFF;
        if (string3 == null) {
            return n2;
        }
        string = string.trim();
        try {
            string3 = string;
            return Integer.parseInt(string3, 16) & 0xFFFFFF;
        }
        catch (NumberFormatException numberFormatException) {
            return n2;
        }
    }

    public int i(String string) {
        int n2;
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return -1;
            }
            string3 = string = string.trim();
        }
        int n3 = n2 = fU.b(string3, -1);
        if (string2 == null) {
            if (n3 < 0) {
                this.g("Invalid number: " + string);
            }
            n3 = n2;
        }
        return n3;
    }

    public boolean a(i i2, Map<a, List<Comparable>> map) {
        Iterator<a> iterator = map.keySet().iterator();
        String string = K.d();
        while (iterator.hasNext()) {
            block6: {
                boolean bl2;
                block5: {
                    a a10 = iterator.next();
                    List<Comparable> list = map.get(a10);
                    Object t2 = i2.b(a10);
                    if (t2 == null) {
                        return false;
                    }
                    bl2 = list.contains(t2);
                    if (string != null) break block5;
                    if (bl2) break block6;
                    bl2 = false;
                }
                return bl2;
            }
            if (string == null) continue;
        }
        return true;
    }

    public static Comparable a(a a10, String string) {
        Class class_ = a10.b();
        Comparable comparable = ha.a(string, class_);
        String string2 = K.d();
        Comparable comparable2 = comparable;
        if (string2 == null) {
            if (comparable2 == null) {
                Collection collection = a10.a();
                comparable = ha.a(string, collection);
            }
            comparable2 = comparable;
        }
        return comparable2;
    }

    public String m(String string) {
        int n2;
        int n3;
        String string2 = string;
        String string3 = K.d();
        int n4 = n3 = string.lastIndexOf(47);
        if (string3 == null) {
            if (n4 >= 0) {
                string2 = string.substring(n3 + 1);
            }
            n4 = string2.lastIndexOf(46);
        }
        if ((n2 = n4) >= 0) {
            string2 = string2.substring(0, n2);
        }
        return string2;
    }

    public R[] j(String string) {
        R[] arrr;
        block5: {
            String string2 = K.d();
            if (string == null) {
                return null;
            }
            ArrayList<R> arrayList = new ArrayList<R>();
            String[] arrstring = fU.c(string, " ");
            int n2 = 0;
            while (n2 < arrstring.length) {
                String string3 = arrstring[n2];
                R[] arrr2 = this.l(string3);
                if (string2 == null) {
                    arrr = arrr2;
                    if (string2 != null) break block5;
                    if (arrr != null) {
                        arrayList.addAll(Arrays.asList(arrr2));
                    }
                    ++n2;
                }
                if (string2 == null) continue;
            }
            arrr = arrayList.toArray(new R[arrayList.size()]);
        }
        R[] arrr3 = arrr;
        return arrr3;
    }

    public h o(String string) {
        string = string.toLowerCase();
        String string2 = K.d();
        if (string.equals("nether")) {
            return d.R;
        }
        for (v v2 : h.x.a()) {
            block7: {
                String string3;
                h h2;
                h h3;
                block6: {
                    h2 = h3 = h.x.a(v2);
                    if (string2 != null) break block6;
                    if (h2 == null) break block7;
                    h2 = h3;
                }
                if ((string3 = h2.n().replace(" ", "").toLowerCase()).equals(string)) {
                    return h3;
                }
            }
            if (string2 == null) continue;
        }
        return null;
    }

    public void e(String string) {
        fU.b("" + this.a + ": " + string);
    }

    public net.minecraft.W.K[] a(String string, String string2) {
        net.minecraft.W.K k2;
        block14: {
            block13: {
                String string3;
                block12: {
                    int[] arrn;
                    String string4;
                    ha ha2;
                    block11: {
                        string3 = K.d();
                        ha2 = this;
                        string4 = string2;
                        if (string3 != null) break block11;
                        if (!ha2.a(string4)) break block12;
                        ha2 = this;
                        string4 = string2;
                    }
                    int[] arrn2 = arrn = ha2.k(string4);
                    if (string3 == null) {
                        if (arrn2 == null) {
                            return null;
                        }
                        arrn2 = arrn;
                    }
                    net.minecraft.W.K[] arrk = new net.minecraft.W.K[arrn2.length];
                    int n2 = 0;
                    while (n2 < arrn.length) {
                        int n3 = arrn[n2];
                        net.minecraft.W.K k3 = net.minecraft.W.K.b(n3);
                        if (string3 == null) {
                            if (k3 == null) {
                                this.g("Block not found for id: " + n3);
                                return null;
                            }
                            arrk[n2] = k3;
                            ++n2;
                        }
                        if (string3 == null) continue;
                    }
                    return arrk;
                }
                String string5 = string + ":" + string2;
                k2 = net.minecraft.W.K.d(string5);
                if (string3 != null) break block13;
                if (k2 != null) break block14;
                this.g("Block not found for name: " + string5);
            }
            return null;
        }
        net.minecraft.W.K[] arrk = new net.minecraft.W.K[]{k2};
        return arrk;
    }

    public int[] a(net.minecraft.W.K k2, String[] arrstring) {
        int[] arrn;
        block32: {
            int n2;
            ArrayList<Integer> arrayList;
            String string;
            block31: {
                Object object;
                int n3;
                HashMap<a, List<Comparable>> hashMap;
                block30: {
                    block34: {
                        String string2;
                        ha ha2;
                        block33: {
                            string = K.d();
                            String[] arrstring2 = arrstring;
                            if (string == null) {
                                if (arrstring2.length <= 0) {
                                    return null;
                                }
                                arrstring2 = arrstring;
                            }
                            String string3 = arrstring2[0];
                            ha2 = this;
                            string2 = string3;
                            if (string != null) break block33;
                            if (!ha2.a(string2)) break block34;
                            ha2 = this;
                            string2 = string3;
                        }
                        int[] arrn2 = ha2.k(string2);
                        return arrn2;
                    }
                    i i2 = k2.d();
                    Collection<a<?>> collection = i2.c();
                    hashMap = new HashMap<a, List<Comparable>>();
                    int n4 = 0;
                    while (n4 < arrstring.length) {
                        String string4 = arrstring[n4];
                        if (string == null) {
                            n3 = string4.length();
                            if (string != null) break block30;
                            if (n3 > 0) {
                                String[] arrstring3;
                                String[] arrstring4 = arrstring3 = fU.c(string4, "=");
                                if (string == null) {
                                    if (arrstring4.length != 2) {
                                        this.g("Invalid block property: " + string4);
                                        return null;
                                    }
                                    arrstring4 = arrstring3;
                                }
                                object = arrstring4[0];
                                String string5 = arrstring3[1];
                                a a10 = gf.a((String)object, collection);
                                Object object2 = a10;
                                if (string == null) {
                                    if (object2 == null) {
                                        this.g("Property not found: " + (String)object + ", block: " + k2);
                                        return null;
                                    }
                                    object2 = hashMap.get(object);
                                }
                                block3: while (true) {
                                    ArrayList<Comparable> arrayList2;
                                    if ((arrayList2 = (ArrayList<Comparable>)object2) == null) {
                                        arrayList2 = new ArrayList<Comparable>();
                                        hashMap.put(a10, arrayList2);
                                    }
                                    String[] arrstring5 = fU.c(string5, ",");
                                    int n5 = 0;
                                    while (n5 < arrstring5.length) {
                                        String string6 = arrstring5[n5];
                                        Comparable comparable = ha.a(a10, string6);
                                        if (string == null) {
                                            object2 = comparable;
                                            if (string != null) continue block3;
                                            if (object2 == null) {
                                                this.g("Property value not found: " + string6 + ", property: " + (String)object + ", block: " + k2);
                                                return null;
                                            }
                                            arrayList2.add(comparable);
                                            ++n5;
                                        }
                                        if (string == null) continue;
                                    }
                                    break;
                                }
                            }
                            ++n4;
                        }
                        if (string == null) continue;
                    }
                    n3 = hashMap.isEmpty();
                }
                if (n3 != 0) {
                    return null;
                }
                arrayList = new ArrayList<Integer>();
                for (int i3 = 0; i3 < 16; ++i3) {
                    int n6 = i3;
                    try {
                        object = this.a(k2, n6);
                        n2 = (int)((this.a((i)object, hashMap) ? true : false) ? true : false);
                        if (string == null) {
                            if (string != null || n2 == 0) continue;
                            arrayList.add(n6);
                            continue;
                        }
                        break block31;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        // empty catch block
                    }
                    if (string == null) continue;
                }
                n2 = arrayList.size();
            }
            if (string == null) {
                if (n2 == 16) {
                    return null;
                }
                n2 = arrayList.size();
            }
            int[] arrn3 = new int[n2];
            for (int i4 = 0; i4 < arrn3.length; ++i4) {
                arrn = arrn3;
                if (string == null) {
                    arrn[i4] = (Integer)arrayList.get(i4);
                    if (string == null) continue;
                }
                break block32;
            }
            arrn = arrn3;
        }
        return arrn;
    }

    public Boolean d(String string) {
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return null;
            }
            string3 = string.toLowerCase().trim();
        }
        String string4 = string3;
        boolean bl2 = string4.equals("true");
        if (string2 == null) {
            if (bl2) {
                return Boolean.TRUE;
            }
            bl2 = string4.equals("false");
        }
        if (bl2) {
            return Boolean.FALSE;
        }
        this.g("Invalid boolean: " + string);
        return null;
    }

    public Enum a(String string, Enum[] arrenum, String string2) {
        block6: {
            String string3 = K.d();
            String string4 = string;
            if (string3 == null) {
                if (string4 == null) {
                    return null;
                }
                string4 = string.toLowerCase().trim();
            }
            String string5 = string4;
            int n2 = 0;
            while (n2 < arrenum.length) {
                Enum enum_ = arrenum[n2];
                if (string3 == null) {
                    if (string3 == null) {
                        if (enum_.name().toLowerCase().equals(string5)) {
                            return enum_;
                        }
                        ++n2;
                    }
                    if (string3 == null) continue;
                }
                break block6;
            }
            this.g("Invalid " + string2 + ": " + string);
        }
        return null;
    }

    public ha(String string) {
        this.a = null;
        this.a = string;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public cZ c(String string) {
        String string2 = K.d();
        if (string == null) {
            return null;
        }
        cZ cZ2 = new cZ();
        String[] arrstring = fU.c(string, " ,");
        int n2 = 0;
        while (n2 < arrstring.length) {
            String string3 = arrstring[n2];
            e3 e32 = this.n(string3);
            if (string2 == null) {
                if (e32 == null) {
                    return null;
                }
                cZ2.a(e32);
                ++n2;
            }
            if (string2 == null) continue;
        }
        return cZ2;
    }
}

