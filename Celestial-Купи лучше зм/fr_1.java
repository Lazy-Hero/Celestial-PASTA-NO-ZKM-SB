/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Field;
import java.util.ArrayList;
import net.minecraft.o.a;

public class fr {
    private static /* synthetic */ K a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(a a10) {
        Boolean bl2;
        String string = K.d();
        Object object = a;
        if (string == null) {
            if (object == null) {
                a = fr.b(a10);
            }
            object = a;
        }
        if (string == null) {
            if (!((K)object).c()) {
                return true;
            }
            object = cq.a(a10, a);
        }
        Boolean bl3 = bl2 = (Boolean)object;
        if (string == null) {
            if (bl3 == null) return true;
            bl3 = bl2;
        }
        boolean bl4 = bl3;
        if (string != null) return bl4;
        if (!bl4) return false;
        return true;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    static {
        a = null;
    }

    /*
     * WARNING - void declaration
     */
    private static K b(a a10) {
        block20: {
            block22: {
                String string = K.d();
                try {
                    ArrayList<Field> arrayList;
                    block26: {
                        int n2;
                        ArrayList<Field> arrayList2;
                        block21: {
                            void var8_14;
                            ArrayList<Object> arrayList3;
                            ArrayList<Object> arrayList22;
                            ArrayList<Object> arrayList32;
                            ArrayList arrayList4;
                            block19: {
                                block18: {
                                    arrayList4 = new ArrayList();
                                    arrayList32 = new ArrayList<Object>();
                                    Field[] arrfield = a.class.getDeclaredFields();
                                    int n3 = 0;
                                    while (n3 < arrfield.length) {
                                        arrayList22 = arrfield[n3];
                                        if (string == null) {
                                            if (string == null) {
                                                if (((Field)((Object)arrayList22)).getType() == Boolean.TYPE) {
                                                    ((Field)((Object)arrayList22)).setAccessible(true);
                                                    arrayList4.add(arrayList22);
                                                    arrayList32.add(((Field)((Object)arrayList22)).get(a10));
                                                }
                                                ++n3;
                                            }
                                            if (string == null) continue;
                                        }
                                        break block18;
                                    }
                                    a10.d(false);
                                }
                                arrayList3 = new ArrayList<Object>();
                                for (Object object22 : arrayList4) {
                                    arrayList3.add(((Field)object22).get(a10));
                                    if (string == null) {
                                        if (string == null) continue;
                                    }
                                    break block19;
                                }
                                a10.d(true);
                            }
                            arrayList22 = new ArrayList<Object>();
                            for (Object field : arrayList4) {
                                arrayList22.add(((Field)field).get(a10));
                                if (string == null) {
                                    if (string == null) continue;
                                }
                                break block20;
                            }
                            arrayList2 = new ArrayList<Field>();
                            boolean bl2 = false;
                            while (var8_14 < arrayList4.size()) {
                                block23: {
                                    block24: {
                                        Field field;
                                        block25: {
                                            field = (Field)arrayList4.get((int)var8_14);
                                            Boolean bl3 = (Boolean)arrayList3.get((int)var8_14);
                                            Boolean bl4 = (Boolean)arrayList22.get((int)var8_14);
                                            if (string != null) break block23;
                                            n2 = bl3.booleanValue() ? 1 : 0;
                                            if (string != null) break block21;
                                            if (n2 != 0) break block24;
                                            boolean bl5 = bl4;
                                            if (string != null) break block25;
                                            if (!bl5) break block24;
                                            bl5 = arrayList2.add(field);
                                        }
                                        Boolean bl6 = (Boolean)arrayList32.get((int)var8_14);
                                        field.set(a10, bl6);
                                    }
                                    ++var8_14;
                                }
                                if (string == null) continue;
                            }
                            arrayList = arrayList2;
                            if (string != null) break block26;
                            n2 = arrayList.size();
                        }
                        if (n2 != 1) break block22;
                        arrayList = arrayList2.get(0);
                    }
                    Field field = (Field)((Object)arrayList);
                    return new K(field);
                }
                catch (Exception exception) {
                    fU.h(exception.getClass().getName() + " " + exception.getMessage());
                }
            }
            fU.h("Error finding Chunk.hasEntities");
        }
        return new K(new aI(a.class), "hasEntities");
    }
}

