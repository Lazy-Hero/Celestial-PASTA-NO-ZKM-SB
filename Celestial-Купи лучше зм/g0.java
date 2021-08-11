/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;

public class g0
extends Properties {
    private final /* synthetic */ Set<Object> a;

    @Override
    public synchronized Enumeration<Object> keys() {
        return Collections.enumeration(this.keySet());
    }

    @Override
    public synchronized Object put(Object object, Object object2) {
        this.a.add(object);
        return super.put(object, object2);
    }

    @Override
    public Set<Object> keySet() {
        Set<Object> set = super.keySet();
        this.a.retainAll(set);
        return Collections.unmodifiableSet(this.a);
    }

    public g0() {
        this.a = new LinkedHashSet<Object>();
    }
}

