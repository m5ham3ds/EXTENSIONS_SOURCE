package eu.kanade.tachiyomi.extension.ar.mangapro;

import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Filters.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/YearFilter;", "Leu/kanade/tachiyomi/extension/ar/mangapro/SelectFilter;", "", "<init>", "()V", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class YearFilter extends SelectFilter<String> {
    /* JADX WARN: Illegal instructions before constructor call */
    public YearFilter() {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(TuplesKt.to("جميع السنوات", (Object) null));
        List list = listCreateListBuilder;
        IntIterator it = RangesKt.downTo(FiltersKt.currentYear, 1970).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            list.add(TuplesKt.to(String.valueOf(iNextInt), String.valueOf(iNextInt)));
        }
        Unit unit = Unit.INSTANCE;
        super("السنة", CollectionsKt.build(listCreateListBuilder));
    }
}
