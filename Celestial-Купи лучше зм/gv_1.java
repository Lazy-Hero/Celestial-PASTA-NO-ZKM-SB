/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.client.Q;
import net.minecraft.k.m;

public class gv
implements ag {
    public /* synthetic */ ArrayList<bE> e;

    public bE a(Class<? extends bE> class_) {
        Iterator<bE> iterator = this.a().iterator();
        String string = a5.c();
        while (iterator.hasNext()) {
            block4: {
                bE bE2;
                block3: {
                    bE bE3;
                    bE2 = bE3 = iterator.next();
                    if (string == null) break block3;
                    if (bE2.getClass() != class_) break block4;
                    bE2 = bE3;
                }
                return bE2;
            }
            if (string != null) continue;
        }
        return null;
    }

    public List<bE> b() {
        return this.a().stream().filter(bE::i).collect(Collectors.toCollection(ArrayList::new));
    }

    public bE a(String string) {
        Iterator<bE> iterator = this.a().iterator();
        String string2 = a5.c();
        while (iterator.hasNext()) {
            block4: {
                bE bE2;
                block3: {
                    bE bE3;
                    bE2 = bE3 = iterator.next();
                    if (string2 == null) break block3;
                    if (!bE2.a().equalsIgnoreCase(string)) break block4;
                    bE2 = bE3;
                }
                return bE2;
            }
            if (string2 != null) continue;
        }
        return null;
    }

    public gv() {
        this.e = new ArrayList();
        this.e.add(new bI());
        this.e.add(new cW());
        this.e.add(new bi());
        this.e.add(new cn());
        this.e.add(new bX());
        this.e.add(new bG());
        this.e.add(new bt());
        this.e.add(new bH());
        this.e.add(new bA());
        this.e.add(new bD());
        this.e.add(new bn());
        this.e.add(new b9());
        this.e.add(new bj());
        this.e.add(new b6());
        this.e.add(new b7());
        this.e.add(new ba());
        this.e.add(new bo());
        this.e.add(new bQ());
        this.e.add(new bb());
        this.e.add(new bs());
        this.e.add(new bC());
        this.e.add(new bF());
        this.e.add(new bM());
        this.e.add(new b3());
        this.e.add(new bq());
        this.e.add(new bR());
        this.e.add(new b0());
        this.e.add(new bc());
        this.e.add(new bW());
        this.e.add(new bS());
        this.e.add(new b_());
        this.e.add(new b4());
        this.e.add(new b5());
        this.e.add(new bh());
        this.e.add(new co());
        this.e.add(new bU());
        String string = a5.c();
        this.e.add(new bP());
        this.e.add(new bZ());
        this.e.add(new bO());
        this.e.add(new be());
        this.e.add(new br());
        this.e.add(new bp());
        this.e.add(new bg());
        this.e.add(new bY());
        this.e.add(new bJ());
        this.e.add(new cD());
        this.e.add(new c2());
        this.e.add(new bL());
        this.e.add(new bm());
        this.e.add(new cE());
        this.e.add(new cV());
        this.e.add(new ck());
        this.e.add(new cG());
        this.e.add(new bd());
        this.e.add(new ce());
        this.e.add(new bN());
        this.e.add(new ch());
        this.e.add(new c7());
        this.e.add(new cH());
        this.e.add(new bx());
        String string2 = string;
        this.e.add(new cX());
        this.e.add(new cw());
        this.e.add(new cC());
        this.e.add(new cA());
        this.e.add(new cF());
        this.e.add(new c6());
        this.e.add(new bz());
        this.e.add(new cv());
        this.e.add(new cR());
        this.e.add(new cy());
        this.e.add(new cT());
        this.e.add(new bK());
        this.e.add(new bf());
        this.e.add(new bB());
        this.e.add(new c1());
        this.e.add(new ca());
        this.e.add(new cl());
        this.e.add(new cu());
        this.e.add(new b8());
        this.e.add(new c9());
        this.e.add(new bT());
        this.e.add(new bV());
        this.e.add(new bk());
        this.e.add(new ct());
        this.e.add(new b2());
        this.e.add(new by());
        this.e.sort(Comparator.comparingInt(gv::lambda$new$0));
        if (string2 == null) {
            m.b(!m.c());
        }
    }

    private static int lambda$new$0(bE bE2) {
        return -Q.P().m.b(bE2.a());
    }

    public ArrayList<bE> a() {
        return this.e;
    }

    public List<bE> a(a5 a52) {
        ArrayList<bE> arrayList = new ArrayList<bE>();
        String string = a5.c();
        for (bE bE2 : this.a()) {
            if (bE2.k() == a52) {
                arrayList.add(bE2);
            }
            if (string != null) continue;
        }
        return arrayList;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

