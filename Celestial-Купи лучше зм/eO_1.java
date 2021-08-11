/*
 * Decompiled with CFR 0.150.
 */
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;
import net.minecraft.U.x;
import net.minecraft.ah.t;
import net.minecraft.ar.v;
import net.minecraft.client.D.a;
import net.minecraft.client.I.g;
import net.minecraft.client.I.h;
import net.minecraft.client.I.i;
import net.minecraft.client.I.j;
import net.minecraft.client.I.k;
import net.minecraft.client.I.l;
import net.minecraft.client.I.m;
import net.minecraft.client.I.o;
import net.minecraft.client.I.p;
import net.minecraft.client.I.q;
import net.minecraft.client.Q;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a2;
import net.minecraft.client.b.aV;
import net.minecraft.client.b.ak;
import net.minecraft.client.b.ay;
import net.minecraft.k.n;

public class eO {
    private static /* synthetic */ ep d;
    private static /* synthetic */ go[][] b;
    public static /* synthetic */ boolean a;
    private static final /* synthetic */ Q c;

    private static Exception a(Exception exception) {
        return exception;
    }

    static {
        c = fU.aX();
        d = null;
        b = null;
        a = eO.c();
    }

    private static void a(String string) {
        fU.h("[CustomGuis] " + string);
    }

    public static void a() {
        block3: {
            b = null;
            String string = K.d();
            if (fU.p()) {
                ArrayList<List<go>> arrayList = new ArrayList<List<go>>();
                a[] arra = fU.bf();
                for (int i2 = arra.length - 1; i2 >= 0; --i2) {
                    a a10 = arra[i2];
                    eO.a(a10, arrayList);
                    if (string == null) {
                        if (string == null) continue;
                    }
                    break block3;
                }
                b = eO.a(arrayList);
            }
        }
    }

    public static ep b() {
        return d;
    }

    private static void a(go go2, List<List<go>> list) {
        block7: {
            List<go> list2;
            eU eU2;
            String string;
            block8: {
                block9: {
                    string = K.d();
                    eU2 = go2.a();
                    if (string != null) break block8;
                    if (eU2 != null) break block9;
                    eO.a("Invalid container: " + (Object)((Object)go2.a()));
                    if (string == null) break block7;
                }
                eU2 = go2.a();
            }
            int n2 = eU2.ordinal();
            while (list.size() <= n2) {
                list.add(null);
                if (string == null) {
                    if (string == null) continue;
                }
                break block7;
            }
            List<go> list3 = list2 = list.get(n2);
            if (string == null) {
                if (list3 == null) {
                    list2 = new ArrayList<go>();
                    list.set(n2, list2);
                }
                list3 = list2;
            }
            list3.add(go2);
        }
    }

    private static boolean c() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26;
    }

    private static v a(eU eU2, n n2, t t2, v v2) {
        go[] arrgo = b[eU2.ordinal()];
        String string = K.d();
        if (arrgo == null) {
            return v2;
        }
        int n3 = 0;
        while (n3 < arrgo.length) {
            go go2 = arrgo[n3];
            if (string == null) {
                if (go2.a(eU2, n2, t2)) {
                    return go2.a(v2);
                }
                ++n3;
            }
            if (string == null) continue;
        }
        return v2;
    }

    private static void a(a a10, List<List<go>> list) {
        String string = K.d();
        Object[] arrobject = ci.a(a10, "optifine/gui/container/", ".properties", null);
        Arrays.sort(arrobject);
        String string2 = string;
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            Object object = arrobject[i2];
            fU.b("CustomGuis: " + (String)object);
            try {
                go go2;
                InputStream inputStream;
                block9: {
                    block8: {
                        v v2 = new v((String)object);
                        inputStream = a10.a(v2);
                        if (string2 != null) break block8;
                        if (inputStream != null) break block9;
                        fU.h("CustomGuis file not found: " + (String)object);
                    }
                    if (string2 == null) continue;
                }
                Properties properties = new Properties();
                properties.load(inputStream);
                inputStream.close();
                go go3 = go2 = new go(properties, (String)object);
                if (string2 == null) {
                    if (!go3.g((String)object)) continue;
                    go3 = go2;
                }
                eO.a(go3, list);
                continue;
            }
            catch (FileNotFoundException fileNotFoundException) {
                fU.h("CustomGuis file not found: " + (String)object);
                continue;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            if (string2 == null) continue;
        }
    }

    private static go[][] a(List<List<go>> list) {
        String string = K.d();
        int n2 = list.isEmpty();
        if (string == null) {
            if (n2 != 0) {
                return null;
            }
            n2 = eU.values().length;
        }
        go[][] arrgo = new go[n2][];
        int n3 = 0;
        while (n3 < arrgo.length) {
            block9: {
                block8: {
                    List<List<go>> list2;
                    block7: {
                        List<Object> list3 = list;
                        if (string != null) break block7;
                        if (list3.size() <= n3) break block8;
                        list3 = list2 = list.get(n3);
                    }
                    if (string != null) break block9;
                    if (list2 != null) {
                        go[] arrgo2 = list2.toArray(new go[list2.size()]);
                        arrgo[n3] = arrgo2;
                    }
                }
                ++n3;
            }
            if (string == null) continue;
        }
        return arrgo;
    }

    private static v a(eU eU2, x x2, t t2, v v2) {
        go[] arrgo = b[eU2.ordinal()];
        String string = K.d();
        if (arrgo == null) {
            return v2;
        }
        int n2 = 0;
        while (n2 < arrgo.length) {
            go go2 = arrgo[n2];
            if (string == null) {
                if (go2.a(eU2, x2, t2)) {
                    return go2.a(v2);
                }
                ++n2;
            }
            if (string == null) continue;
        }
        return v2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static v a(v v2) {
        v v3;
        String string = K.d();
        if (b == null) {
            return v2;
        }
        L l2 = eO.c.aO;
        boolean bl2 = l2 instanceof g;
        if (string == null) {
            if (!bl2) {
                return v2;
            }
            v3 = v2;
            if (string != null) return v3;
            bl2 = v3.c().equals("minecraft");
        }
        if (bl2) {
            v3 = v2;
            if (string != null) return v3;
            if (v3.a().startsWith("textures/gui/")) {
                x x2;
                if (d == null) {
                    return v2;
                }
                net.minecraft.client.E.l l3 = eO.c.e;
                if (l3 == null) {
                    return v2;
                }
                boolean bl3 = l2 instanceof p;
                if (string == null) {
                    if (bl3) {
                        return eO.a(eU.CREATIVE, eO.c.s.f(), (t)l3, v2);
                    }
                    bl3 = l2 instanceof q;
                }
                if (bl3) {
                    return eO.a(eU.INVENTORY, eO.c.s.f(), (t)l3, v2);
                }
                n n2 = d.f();
                if (n2 != null) {
                    boolean bl4 = l2 instanceof a2;
                    if (string == null) {
                        if (bl4) {
                            return eO.a(eU.ANVIL, n2, (t)l3, v2);
                        }
                        bl4 = l2 instanceof h;
                    }
                    if (string == null) {
                        if (bl4) {
                            return eO.a(eU.BEACON, n2, (t)l3, v2);
                        }
                        bl4 = l2 instanceof i;
                    }
                    if (string == null) {
                        if (bl4) {
                            return eO.a(eU.BREWING_STAND, n2, (t)l3, v2);
                        }
                        bl4 = l2 instanceof j;
                    }
                    if (string == null) {
                        if (bl4) {
                            return eO.a(eU.CHEST, n2, (t)l3, v2);
                        }
                        bl4 = l2 instanceof k;
                    }
                    if (string == null) {
                        if (bl4) {
                            return eO.a(eU.CRAFTING, n2, (t)l3, v2);
                        }
                        bl4 = l2 instanceof l;
                    }
                    if (string == null) {
                        if (bl4) {
                            return eO.a(eU.DISPENSER, n2, (t)l3, v2);
                        }
                        bl4 = l2 instanceof aV;
                    }
                    if (string == null) {
                        if (bl4) {
                            return eO.a(eU.ENCHANTMENT, n2, (t)l3, v2);
                        }
                        bl4 = l2 instanceof m;
                    }
                    if (string == null) {
                        if (bl4) {
                            return eO.a(eU.FURNACE, n2, (t)l3, v2);
                        }
                        bl4 = l2 instanceof ay;
                    }
                    if (string == null) {
                        if (bl4) {
                            return eO.a(eU.HOPPER, n2, (t)l3, v2);
                        }
                        bl4 = l2 instanceof o;
                    }
                    if (bl4) {
                        return eO.a(eU.SHULKER_BOX, n2, (t)l3, v2);
                    }
                }
                if ((x2 = d.e()) == null) return v2;
                boolean bl5 = l2 instanceof net.minecraft.client.I.n;
                if (string == null) {
                    if (bl5) {
                        return eO.a(eU.HORSE, x2, (t)l3, v2);
                    }
                    bl5 = l2 instanceof ak;
                }
                if (!bl5) return v2;
                return eO.a(eU.VILLAGER, x2, (t)l3, v2);
            }
        }
        v3 = v2;
        return v3;
    }

    public static void a(ep ep2) {
        d = ep2;
    }
}

