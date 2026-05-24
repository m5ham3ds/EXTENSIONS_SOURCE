package eu.kanade.tachiyomi.extension.ar.mangapro;

import eu.kanade.tachiyomi.source.model.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Filters.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\u0004\b\b\u0010\tR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/SelectFilter;", "T", "Leu/kanade/tachiyomi/source/model/Filter$Select;", "", "name", "options", "", "Lkotlin/Pair;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "selected", "getSelected", "()Ljava/lang/Object;", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class SelectFilter<T> extends Filter.Select<String> {
    private final List<Pair<String, T>> options;

    public SelectFilter(String str, List<? extends Pair<String, ? extends T>> list) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(list, "options");
        List<? extends Pair<String, ? extends T>> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Pair) it.next()).getFirst());
        }
        super(str, arrayList.toArray(new String[0]), 0, 4, (DefaultConstructorMarker) null);
        this.options = list;
    }

    public final T getSelected() {
        return (T) this.options.get(((Number) getState()).intValue()).getSecond();
    }
}
