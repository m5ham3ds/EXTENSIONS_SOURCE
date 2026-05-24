package eu.kanade.tachiyomi.extension.ar.mangapro;

import eu.kanade.tachiyomi.source.model.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Filters.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/TriStateGroupFilter;", "Leu/kanade/tachiyomi/source/model/Filter$Group;", "Leu/kanade/tachiyomi/extension/ar/mangapro/TriStateFilter;", "name", "", "options", "", "Lkotlin/Pair;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "included", "getIncluded", "()Ljava/util/List;", "excluded", "getExcluded", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class TriStateGroupFilter extends Filter.Group<TriStateFilter> {
    public TriStateGroupFilter(String str, List<Pair<String, String>> list) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(list, "options");
        List<Pair<String, String>> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(new TriStateFilter((String) pair.getFirst(), (String) pair.getSecond()));
        }
        super(str, arrayList);
    }

    public final List<String> getIncluded() {
        Iterable iterable = (Iterable) getState();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((TriStateFilter) obj).isIncluded()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((TriStateFilter) it.next()).getValue());
        }
        return arrayList3;
    }

    public final List<String> getExcluded() {
        Iterable iterable = (Iterable) getState();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((TriStateFilter) obj).isExcluded()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((TriStateFilter) it.next()).getValue());
        }
        return arrayList3;
    }
}
