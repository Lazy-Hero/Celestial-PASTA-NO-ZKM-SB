/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.k.m;

public class af {
    private static final /* synthetic */ HashMap<Class<? extends du>, List<av>> c;
    private static /* synthetic */ String b;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(Method method, Class<? extends du> class_) {
        String string = af.b();
        boolean bl2 = af.a(method);
        if (string != null) return bl2;
        if (bl2) return true;
        bl2 = method.getParameterTypes()[0].equals(class_);
        if (string != null) return bl2;
        if (bl2) return false;
        return true;
    }

    public static void a(Object object, Class<? extends du> class_) {
        block3: {
            Method[] arrmethod = object.getClass().getDeclaredMethods();
            int n2 = arrmethod.length;
            String string = af.b();
            int n3 = 0;
            while (n3 < n2) {
                Method method = arrmethod[n3];
                if (string == null) {
                    if (!af.a(method, class_)) {
                        af.a(method, object);
                    }
                    ++n3;
                }
                if (string == null) continue;
            }
            if (m.d()) break block3;
            af.b("oFpZq");
        }
    }

    public static void b(Object object) {
        block4: {
            Iterator<List<av>> iterator = c.values().iterator();
            String string = af.b();
            block0: while (true) {
                boolean bl2 = iterator.hasNext();
                block1: while (bl2) {
                    List<av> list = iterator.next();
                    if (string != null) break block4;
                    for (av av2 : list) {
                        bl2 = av2.b().equals(object);
                        if (string != null) continue block1;
                        if (string == null && bl2) {
                            list.remove(av2);
                        }
                        if (string == null) continue;
                    }
                    if (string == null) continue block0;
                }
                break;
            }
            af.a(true);
        }
    }

    public static void b(String string) {
        b = string;
    }

    public static void b(Object object, Class<? extends du> class_) {
        block6: {
            boolean bl2;
            block4: {
                Class<? extends du> class_2;
                HashMap<Class<? extends du>, List<av>> hashMap;
                String string;
                block5: {
                    string = af.b();
                    hashMap = c;
                    class_2 = class_;
                    if (string != null) break block5;
                    if (!hashMap.containsKey(class_2)) break block6;
                    hashMap = c;
                    class_2 = class_;
                }
                for (av av2 : hashMap.get(class_2)) {
                    bl2 = av2.b().equals(object);
                    if (string == null) {
                        if (string == null && bl2) {
                            c.get(class_).remove(av2);
                        }
                        if (string == null) continue;
                    }
                    break block4;
                }
                bl2 = true;
            }
            af.a(bl2);
        }
    }

    public static void a(Object object) {
        Method[] arrmethod = object.getClass().getDeclaredMethods();
        String string = af.b();
        int n2 = arrmethod.length;
        int n3 = 0;
        while (n3 < n2) {
            Method method = arrmethod[n3];
            if (string == null) {
                if (!af.a(method)) {
                    af.a(method, object);
                }
                ++n3;
            }
            if (string == null) continue;
        }
    }

    private static void a(Method method, Object object) {
        block8: {
            Class<?> class_;
            HashMap<Class<? extends du>, List<av>> hashMap;
            av av2;
            block5: {
                Class<?> class_2;
                block6: {
                    String string;
                    block7: {
                        boolean bl2;
                        block4: {
                            class_2 = method.getParameterTypes()[0];
                            av2 = new av(object, method, method.getAnnotation(cL.class).value());
                            string = af.b();
                            bl2 = av2.c().isAccessible();
                            if (string != null) break block4;
                            if (!bl2) {
                                av2.c().setAccessible(true);
                            }
                            hashMap = c;
                            class_ = class_2;
                            if (string != null) break block5;
                            bl2 = hashMap.containsKey(class_);
                        }
                        if (!bl2) break block6;
                        boolean bl3 = c.get(class_2).contains(av2);
                        if (string != null) break block7;
                        if (bl3) break block8;
                        bl3 = c.get(class_2).add(av2);
                    }
                    af.b(class_2);
                    if (string == null) break block8;
                }
                hashMap = c;
                class_ = class_2;
            }
            hashMap.put(class_, new eJ(av2));
        }
    }

    private static void a(av av2, du du2) {
        try {
            av2.c().invoke(av2.b(), du2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void a(boolean bl2) {
        Iterator<Map.Entry<Class<? extends du>, List<av>>> iterator = c.entrySet().iterator();
        String string = af.b();
        while (iterator.hasNext()) {
            Iterator<Map.Entry<Class<? extends du>, List<av>>> iterator2;
            block5: {
                block4: {
                    boolean bl3;
                    block3: {
                        bl3 = bl2;
                        if (string != null) break block3;
                        if (!bl3) break block4;
                        iterator2 = iterator;
                        if (string != null) break block5;
                        bl3 = iterator2.next().getValue().isEmpty();
                    }
                    if (!bl3) continue;
                }
                iterator2 = iterator;
            }
            iterator2.remove();
            if (string == null) continue;
        }
    }

    public static String b() {
        return b;
    }

    public static du a(du du2) {
        Object object;
        block7: {
            block8: {
                String string;
                List<av> list;
                block10: {
                    du du3;
                    block9: {
                        list = c.get(du2.getClass());
                        string = af.b();
                        if (list == null) break block8;
                        du3 = du2;
                        if (string != null) break block9;
                        if (!(du3 instanceof gG)) break block10;
                        du3 = du2;
                    }
                    gG gG2 = (gG)du3;
                    for (av av2 : list) {
                        af.a(av2, du2);
                        object = gG2;
                        if (string == null) {
                            if ((!((gG)object).b() || string != null) && string == null) continue;
                        }
                        break block7;
                    }
                    if (string == null) break block8;
                }
                for (av av3 : list) {
                    af.a(av3, du2);
                    if (string == null) continue;
                }
            }
            object = du2;
        }
        return object;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void a(Class<? extends du> class_) {
        Iterator<Map.Entry<Class<? extends du>, List<av>>> iterator = c.entrySet().iterator();
        String string = af.b();
        block0: while (iterator.hasNext()) {
            Object object = iterator.next().getKey();
            while (object.equals(class_)) {
                object = iterator;
                if (string != null) continue;
                object.remove();
                break block0;
            }
        }
    }

    static {
        c = new HashMap();
        af.b(null);
    }

    private static void b(Class<? extends du> class_) {
        block5: {
            Object object;
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            byte[] arrby = es.c;
            int n2 = arrby.length;
            String string = af.b();
            int n3 = 0;
            block0: while (true) {
                int n4 = n3;
                int n5 = n2;
                block1: while (n4 < n5) {
                    int n6 = arrby[n3];
                    object = c.get(class_).iterator();
                    if (string != null) break block5;
                    Object object2 = object;
                    while (object2.hasNext()) {
                        av av2 = (av)object2.next();
                        byte by2 = av2.a();
                        if (string == null) {
                            n5 = n6;
                            if (string != null) continue block1;
                            if (by2 == n5) {
                                by2 = (byte)(copyOnWriteArrayList.add(av2) ? 1 : 0);
                            }
                        }
                        if (string == null) continue;
                    }
                    ++n3;
                    if (string == null) continue block0;
                }
                break;
            }
            object = c.put(class_, copyOnWriteArrayList);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(Method method) {
        String string = af.b();
        boolean bl2 = method.getParameterTypes().length;
        if (string != null) return bl2;
        if (!bl2) return true;
        bl2 = method.isAnnotationPresent(cL.class);
        if (string != null) return bl2;
        if (bl2) return false;
        return true;
    }
}

