/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a4 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Field[] a(Field[] arrfield, Class class_) {
        String string = K.d();
        try {
            Field[] arrfield2;
            ArrayList<Field> arrayList = new ArrayList<Field>();
            int n2 = 0;
            while (n2 < arrfield.length) {
                arrfield2 = arrfield;
                if (string != null) return arrfield2;
                Field field = arrfield2[n2];
                if (string == null) {
                    if (field.getType() == class_) {
                        field.setAccessible(true);
                        arrayList.add(field);
                    }
                    ++n2;
                }
                if (string == null) continue;
            }
            arrfield2 = arrayList.toArray(new Field[arrayList.size()]);
            return arrfield2;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Field[] b(Class class_, Class class_2) {
        try {
            Field[] arrfield = class_.getDeclaredFields();
            return a4.a(arrfield, class_2);
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object a(Object object, Class class_, Class class_2) {
        K k2 = a4.a(class_, class_2);
        String string = K.d();
        Object object2 = k2;
        if (string == null) {
            if (object2 == null) {
                return null;
            }
            object2 = k2;
        }
        if (string == null) {
            if (!((K)object2).c()) {
                return null;
            }
            object2 = object;
        }
        Object object3 = cq.a(object2, k2);
        return object3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(Object object, Class class_, Class class_2, Object object2) {
        K k2 = a4.a(class_, class_2);
        String string = K.d();
        K k3 = k2;
        if (string == null) {
            if (k3 == null) {
                return false;
            }
            k3 = k2;
        }
        boolean bl2 = k3.c();
        if (string == null) {
            if (!bl2) return false;
            bl2 = cq.a(object, k2, object2);
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Field a(Class class_, Field field, Class class_2, int n2) {
        Field[] arrfield = a4.a(class_, field, class_2);
        String string = K.d();
        int n3 = n2;
        if (string == null) {
            if (n3 < 0) return null;
            n3 = n2;
        }
        if (n3 >= arrfield.length) return null;
        Field field2 = arrfield[n2];
        return field2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Field[] a(Class class_, Field field, Class class_2) {
        String string = K.d();
        try {
            int n2;
            List<Field> list;
            block6: {
                int n3;
                block5: {
                    Field[] arrfield = class_.getDeclaredFields();
                    list = Arrays.asList(arrfield);
                    n3 = n2 = list.indexOf(field);
                    if (string != null) break block5;
                    if (n3 >= 0) break block6;
                    n3 = 0;
                }
                return new Field[n3];
            }
            List<Field> list2 = list.subList(n2 + 1, list.size());
            Field[] arrfield = list2.toArray(new Field[list2.size()]);
            return a4.a(arrfield, class_2);
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Field a(Class class_, Class class_2, int n2) {
        Field[] arrfield = a4.b(class_, class_2);
        String string = K.d();
        int n3 = n2;
        if (string == null) {
            if (n3 < 0) return null;
            n3 = n2;
        }
        if (n3 >= arrfield.length) return null;
        Field field = arrfield[n2];
        return field;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Field[] a(Object var0, Field[] var1_1, Class var2_2, Object var3_3) {
        var4_4 = K.d();
        try {
            var5_5 = new ArrayList<Field>();
            var6_7 = 0;
lbl5:
            // 2 sources

            while (var6_7 < var1_1.length) {
                v0 = var1_1;
                if (var4_4 != null) return v0;
                var7_9 = v0[var6_7];
                if (var4_4 != null) ** GOTO lbl41
                if (var7_9.getType() != var2_2) ** GOTO lbl-1000
                ** GOTO lbl-1000
            }
            ** GOTO lbl42
        }
        catch (Exception var5_6) {
            return null;
        }
lbl-1000:
        // 1 sources

        {
            var8_10 = Modifier.isStatic(var7_9.getModifiers());
            v1 = var0;
            if (var4_4 != null) ** GOTO lbl-1000
        }
        {
            if (v1 == null && !var8_10) ** GOTO lbl-1000
        }
        {
            v1 = var0;
        }
lbl-1000:
        // 2 sources

        {
            if (var4_4 != null) ** GOTO lbl-1000
        }
        {
            if (v1 != null && var8_10) ** GOTO lbl-1000
        }
        {
            var7_9.setAccessible(true);
            v1 = var7_9.get(var0);
        }
lbl-1000:
        // 2 sources

        {
            v2 = var9_11 = v1;
            if (var4_4 != null) ** GOTO lbl-1000
            if (v2 != var3_3) ** GOTO lbl-1000
        }
        {
            var5_5.add(var7_9);
            if (var4_4 == null) ** GOTO lbl-1000
        }
lbl-1000:
        // 2 sources

        {
            v2 = var9_11;
        }
lbl-1000:
        // 2 sources

        {
            if (var4_4 != null) ** GOTO lbl34
            if (v2 == null) ** GOTO lbl-1000
        }
        {
            v2 = var3_3;
lbl34:
            // 2 sources

            if (var4_4 != null) ** GOTO lbl37
            if (v2 == null) ** GOTO lbl-1000
        }
        {
            v2 = var9_11;
lbl37:
            // 2 sources

            v3 = v2.equals(var3_3);
            if (var4_4 != null || !v3) ** GOTO lbl-1000
        }
        {
            v3 = var5_5.add(var7_9);
        }
lbl-1000:
        // 8 sources

        {
            ++var6_7;
lbl41:
            // 2 sources

            if (var4_4 == null) ** GOTO lbl5
lbl42:
            // 2 sources

            v0 = var5_5.toArray(new Field[var5_5.size()]);
            return v0;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Field c(Class class_, Class class_2) {
        String string = K.d();
        try {
            Field[] arrfield = class_.getDeclaredFields();
            int n2 = 0;
            while (n2 < arrfield.length) {
                Field field = arrfield[n2];
                if (string == null) {
                    if (field.getType() == class_2) {
                        field.setAccessible(true);
                        return field;
                    }
                    ++n2;
                }
                if (string == null) continue;
            }
            return null;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static K a(Class class_, Class class_2) {
        Field field = a4.c(class_, class_2);
        if (field == null) {
            return null;
        }
        aI aI2 = new aI(class_);
        return new K(aI2, field.getName());
    }

    public static K b(Class class_, Class class_2, int n2) {
        Field field = a4.a(class_, class_2, n2);
        if (field == null) {
            return null;
        }
        aI aI2 = new aI(class_);
        return new K(aI2, field.getName());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(Object object, Class class_, Class class_2, int n2, Object object2) {
        K k2 = a4.b(class_, class_2, n2);
        String string = K.d();
        K k3 = k2;
        if (string == null) {
            if (k3 == null) {
                return false;
            }
            k3 = k2;
        }
        boolean bl2 = k3.c();
        if (string == null) {
            if (!bl2) return false;
            bl2 = cq.a(object, k2, object2);
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object a(Object object, Class class_, Class class_2, int n2) {
        K k2 = a4.b(class_, class_2, n2);
        String string = K.d();
        Object object2 = k2;
        if (string == null) {
            if (object2 == null) {
                return null;
            }
            object2 = k2;
        }
        if (string == null) {
            if (!((K)object2).c()) {
                return null;
            }
            object2 = object;
        }
        Object object3 = cq.a(object2, k2);
        return object3;
    }
}

