/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;
import net.minecraft.k.m;

public class dp {
    public /* synthetic */ List<aN> a;

    private static boolean lambda$getMacroByKey$0(int n2, aN aN2) {
        int n3 = aN.a();
        int n4 = aN2.e();
        if (n3 == 0) {
            n4 = n4 == n2 ? 1 : 0;
        }
        return n4 != 0;
    }

    public void a(aN aN2) {
        this.a.remove(aN2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public aN b(int n2) {
        aN aN2;
        block0: {
            int n3 = aN.a();
            aN2 = this.a().stream().filter(arg_0 -> dp.lambda$getMacroByKey$0(n2, arg_0)).findFirst().orElse(null);
            if (!m.c()) break block0;
            aN.b(++n3);
        }
        return aN2;
    }

    public void a(int n2) {
        this.a.removeIf(arg_0 -> dp.lambda$deleteMacroByKey$1(n2, arg_0));
    }

    public void b(aN aN2) {
        this.a.add(aN2);
    }

    public dp() {
        this.a = new ArrayList<aN>();
    }

    private static boolean lambda$deleteMacroByKey$1(int n2, aN aN2) {
        int n3 = aN.a();
        int n4 = aN2.e();
        if (n3 == 0) {
            n4 = n4 == n2 ? 1 : 0;
        }
        return n4 != 0;
    }

    public List<aN> a() {
        return this.a;
    }
}

