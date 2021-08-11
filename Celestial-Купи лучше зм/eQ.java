/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import net.minecraft.client.Q;

public class eQ
implements hE {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Field b() {
        Field[] arrfield;
        Q q2 = Q.P();
        boolean bl2 = q2.a4;
        Field[] arrfield2 = Q.class.getDeclaredFields();
        q2.a4 = true;
        Field[] arrfield3 = a4.a((Object)q2, arrfield2, Boolean.TYPE, (Object)Boolean.TRUE);
        q2.a4 = false;
        Field[] arrfield4 = a4.a((Object)q2, arrfield2, Boolean.TYPE, (Object)Boolean.FALSE);
        q2.a4 = bl2;
        HashSet<Field> hashSet = new HashSet<Field>(Arrays.asList(arrfield3));
        HashSet<Field> hashSet2 = new HashSet<Field>(Arrays.asList(arrfield4));
        HashSet<Field> hashSet3 = new HashSet<Field>(hashSet);
        String string = K.d();
        hashSet3.retainAll(hashSet2);
        Field[] arrfield5 = arrfield = hashSet3.toArray(new Field[hashSet3.size()]);
        if (string == null) {
            if (arrfield5.length != 1) {
                return null;
            }
            arrfield5 = arrfield;
        }
        Field field = arrfield5[0];
        return field;
    }

    @Override
    public Field a() {
        Class<Q> class_ = Q.class;
        Field field = this.b();
        String string = K.d();
        Field field2 = field;
        if (string == null) {
            if (field2 == null) {
                return null;
            }
            field2 = a4.a(Q.class, field, Boolean.TYPE, 0);
        }
        Field field3 = field2;
        return field3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

