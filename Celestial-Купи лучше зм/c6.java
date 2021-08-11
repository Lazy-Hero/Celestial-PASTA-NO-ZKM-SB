/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import net.minecraft.ag.C;

public class c6
extends bE {
    public static /* synthetic */ float k;

    @cL
    public void a(fn fn2) {
        block3: {
            float f10;
            block2: {
                String[] arrstring = C.f();
                f10 = k += 0.2f;
                if (arrstring != null) break block2;
                if (!(f10 > 255.0f)) break block3;
                f10 = 0.0f;
            }
            k = f10;
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    static {
        k = 0.0f;
    }

    public c6() {
        super("EnchantEffect", a5.Visuals);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Rgb");
        arrayList.add("Custom");
        cj.b.f.b(new hH("Enchant color", (bE)this, "Rgb", arrayList));
    }
}

